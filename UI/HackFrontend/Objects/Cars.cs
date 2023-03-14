using System.ComponentModel.DataAnnotations;
using System.ComponentModel.DataAnnotations.Schema;

namespace HackFrontend.Objects
{
    /// <summary>
    /// Movies Object 
    /// </summary>
    public class Cars
    {
        [DatabaseGenerated(DatabaseGeneratedOption.Identity)]
		public int ID { get; set; }
		public string Manufacture { get; set; }
		public string Model { get; set; }
		public int Year { get; set; }
		public string Description { get; set; }
		public string Registration { get; set; }
		public string Colour { get; set; }
		public DateTime ContractEnd { get; set; }
		public int Term { get; set; }
		public int HighestRecordedMileage { get; set; }
		public DateTime HRMDate { get; set; }
		public string FuelType { get; set; }
		public string EngineSize { get; set; }

	}
   
}
