using System.ComponentModel.DataAnnotations;
using System.ComponentModel.DataAnnotations.Schema;

namespace HackFrontend.Objects
{
    /// <summary>
    /// Movies Object 
    /// </summary>
    public class Cars
    {
       
            public object Id { get; set; }
            public object manufacturer { get; set; }
            public object model { get; set; }
            public object year { get; set; }
            public object description { get; set; }
            public object registration { get; set; }
            public string colour { get; set; }
            public string contractEnd { get; set; }
            public object term { get; set; }
            public object highestRecordedMileage { get; set; }
            public object hrmDate { get; set; }
            public object fuelType { get; set; }
            public object engineSize { get; set; }
            public object dayRate { get; set; }
        

    }
   
}
