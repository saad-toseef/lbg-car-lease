using Microsoft.Extensions.Configuration;
using Newtonsoft.Json.Linq;
using RestSharp;
using System;
using System.Net;

namespace HackFrontend
{

    public class ApiHelper
    {
        private readonly IConfiguration _configuration;
        public ApiHelper(IConfiguration configuration)
        {
            _configuration = configuration;
        }

        public string GetUri(string serviceName)
        {
         return  _configuration.GetConnectionString(serviceName);
        }

        public string SendApIrequest(string url, Method method, Object @object = null, Dictionary<string,string> paremter = null)
        {
            Uri baseUrl = new Uri( url);
            RestClient client = new RestClient(baseUrl);
            RestRequest request = new RestRequest() { Method = method};
            if (@object != null)
            {
                request.AddHeader("Content-type", "application/json");
                request.AddJsonBody(@object);


            }
            if (paremter != null)
            {
                foreach (var pair in paremter)
                {
                    request.AddQueryParameter(pair.Key,pair.Value);

                }
            }
            RestResponse response = client.Execute(request);
            if (response.IsSuccessful())
            {

                return response.Content;

            }
            else
            {
                if (response.StatusCode == HttpStatusCode.Unauthorized)
                {
                    return response.Content;
                }
                else
                {
                    return "Error in API request " + response.Content;

                }
            }
        }

    }
    public static class RestSharpExtensionMethods
    {
        public static bool IsSuccessful(this RestResponse response)
        {
            return response.StatusCode.IsSuccessStatusCode()
                && response.ResponseStatus == ResponseStatus.Completed;
        }

        public static bool IsSuccessStatusCode(this HttpStatusCode responseCode)
        {
            int numericResponse = (int)responseCode;
            return numericResponse is >= 200 and <= 399;
        }
    }
}
