using Microsoft.AspNetCore.Http;
using Microsoft.AspNetCore.Mvc.RazorPages;
using Microsoft.Extensions.Configuration;
using Microsoft.Extensions.Logging;
using System;
using System.Threading.Tasks;

namespace HackFrontend.Pages
{
    public class IndexModel : PageModel
    {
        private readonly ILogger<IndexModel> _logger;
        private readonly IConfiguration _configuration;
        public string Username { get; set; }
        public bool IsLoggedIn { get; set; }    
        public IndexModel(ILogger<IndexModel> logger, IConfiguration configuration)
        {
            _logger = logger;
            _configuration = configuration;


        }

        public Task OnGetAsync()
        {


            IsLoggedIn = Convert.ToBoolean(HttpContext.Session.GetString("Logged_in"));
            if (IsLoggedIn)
            {
                Username = HttpContext.Session.GetString("Username");
            }

            return Task.CompletedTask;
        }
    }
}
