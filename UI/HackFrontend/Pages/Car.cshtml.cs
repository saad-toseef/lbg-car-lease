using HackFrontend.Objects;
using Microsoft.AspNetCore.Http;
using Microsoft.AspNetCore.Mvc.RazorPages;
using Microsoft.Extensions.Configuration;
using Microsoft.Extensions.Logging;
using Newtonsoft.Json;
using RestSharp;
using System;
using System.Threading.Tasks;

namespace HackFrontend.Pages
{
    public class CarModel : PageModel
    {
        private readonly ILogger<IndexModel> _logger;
        private readonly IConfiguration _configuration;
        public Cars Car { get; set; }
        public string sortItem { get; set; }
        public CarModel(ILogger<IndexModel> logger, IConfiguration configuration)
        {
            _logger = logger;
            _configuration = configuration;


        }

        public Task OnGetAsync(int ID)
        {
            var par = new Dictionary<string, string>();
            par.Add("ID", ID.ToString());
            var aPiHelper = new ApiHelper(_configuration);
            var url = aPiHelper.GetUri("Cars");
            var response = aPiHelper.SendApIrequest(url, Method.Get, par);
            Car = JsonConvert.DeserializeObject<Cars>(response);


            return Task.CompletedTask;
        }
       
    }
}
