using HackFrontend.Objects;
using Microsoft.AspNetCore.Http;
using Microsoft.AspNetCore.Mvc.RazorPages;
using Microsoft.Extensions.Configuration;
using Microsoft.Extensions.Logging;
using Newtonsoft.Json;
using RestSharp;
using System;
using System.Collections.Generic;
using System.Threading.Tasks;

namespace HackFrontend.Pages
{
    public class CarsModel : PageModel
    {
        private readonly ILogger<IndexModel> _logger;
        private readonly IConfiguration _configuration;
        public List<Cars> CarsIE { get; set; }
        public string sortItem { get; set; }
        public CarsModel(ILogger<IndexModel> logger, IConfiguration configuration)
        {
            _logger = logger;
            _configuration = configuration;


        }

        public Task OnGetAsync()
        {
            var aPiHelper = new ApiHelper(_configuration);
            var url = aPiHelper.GetUri("Cars");
            var response = aPiHelper.SendApIrequest(url, Method.Get );
            CarsIE = JsonConvert.DeserializeObject<List<Cars>>(response);


            return Task.CompletedTask;
        }
        public Task OnPostType()
        {
            var par = new Dictionary<string, string>();
            par.Add("Manufacturer", Request.Form["Manufacturer"]);
            
            var aPiHelper = new ApiHelper(_configuration);
            var url = aPiHelper.GetUri("AuthenticationService");
            var response = aPiHelper.SendApIrequest(url, Method.Post,par  );
            CarsIE = JsonConvert.DeserializeObject<List<Cars>>(response);

            return Task.CompletedTask;
        }
    }
}
