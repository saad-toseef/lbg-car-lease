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
    public class CarsModel : PageModel
    {
        private readonly ILogger<IndexModel> _logger;
        private readonly IConfiguration _configuration;
        public IEnumerable<Cars> CarsIE { get; set;}
        public CarsModel(ILogger<IndexModel> logger, IConfiguration configuration)
        {
            _logger = logger;
            _configuration = configuration;


        }

        public Task OnGetAsync()
        {
            var aPiHelper = new ApiHelper(_configuration);
            var url = aPiHelper.GetUri("AuthenticationService");
            var response = aPiHelper.SendApIrequest(url, Method.Post, User);
            CarsIE =  JsonConvert.DeserializeObject <IEnumerable<Cars>>(response);


            return Task.CompletedTask;
        }
    }
}
