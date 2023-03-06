using System.ComponentModel.DataAnnotations;
using HackFrontend.Objects;
using Microsoft.AspNetCore.Mvc;
using Microsoft.AspNetCore.Mvc.RazorPages;
using Newtonsoft.Json;
using RestSharp;

namespace HackFrontend.Pages
{
    public class LoginModel : PageModel
    {
        private readonly IConfiguration _configuration;
        private readonly ILogger<IndexModel> _logger;

        public LoginModel(ILogger<IndexModel> logger, IConfiguration configuration)
        {
            _logger = logger;
            _configuration = configuration;
        }

        public bool IsLoggedIn { get; set; }

        [BindProperty]
        [Required]
        [Display(Name = "Username")]
        public string Username { get; set; }

        [BindProperty]
        [Required]
        [Display(Name = "Password")]
        public string Password { get; set; }

        private Users User { get; set; }
        public string Error { get; set; }
        public string Message { get; set; }

        public bool Login { get; set; }

        public void OnGet()
        {
            IsLoggedIn = Convert.ToBoolean(HttpContext.Session.GetString("Logged_in"));
            if (IsLoggedIn) Username = HttpContext.Session.GetString("Username");
        }

        public void OnPost(string action)
        {
            Login = action != "Register";
        }

        public IActionResult OnPostLogin()
        {
            if (!ModelState.IsValid) return null;
            User = new Users
            {
                Username = Username,
                Password = Password
            };
            //call service using registered alias
            var aPiHelper = new ApiHelper(_configuration);
            var url = aPiHelper.GetUri("AuthenticationService");
            var response = aPiHelper.SendApIrequest(url + "/Users/api/auth-user", Method.Post, User);
            if (response == "\"Username or Password is incorrect\"")
            {
                Error = response.Replace("\"", "");
            }
            else
            {
                User = JsonConvert.DeserializeObject<Users>(response);
                HttpContext.Session.SetString("Logged_in", "True");
                HttpContext.Session.SetString("Username", User.Username);
                HttpContext.Session.SetString("UserID", User.Id.ToString());
                return Redirect("/login");
            }

            return null;
        }

        public void OnPostRegister()
        {
            if (ModelState.IsValid)
            {
                User = new Users
                {
                    Username = Username,
                    Password = Password
                };
                //call service using registered alias
                var aPiHelper = new ApiHelper(_configuration);
                var url = aPiHelper.GetUri("AuthenticationService");
                var response = aPiHelper.SendApIrequest(url + "/Users/api", Method.Post, User);
                if (response.Contains("Error"))
                    Error = response.Replace("\"", "");
                else
                    Message = response.Replace("\"", "");
            }
        }
    }
}