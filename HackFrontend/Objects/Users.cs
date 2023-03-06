using System.ComponentModel.DataAnnotations;
using System.ComponentModel.DataAnnotations.Schema;

namespace HackFrontend.Objects
{
    /// <summary>
    /// Movies Object 
    /// </summary>
    public class Users
    {
        [DatabaseGenerated(DatabaseGeneratedOption.Identity)]
        public int Id { get; set; }

        [Display(Name ="Username")]
        public string Username { get; set; }

        [Display(Name = "Password")]
        public string Password { get; set; }
       
    }
   
}
