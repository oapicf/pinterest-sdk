namespace Org.OpenAPITools.Models;


/// <summary>
/// A hotel item to be deleted
/// </summary>
public class CatalogsDeleteHotelItem 
{
    public string HotelId { get; set; }
    
    /// <summary>
    /// Gets or Sets Operation
    /// </summary>
    public enum OperationEnum
    {
        
        /// <summary>
        /// Enum DELETEEnum for DELETE
        /// </summary>
        DELETEEnum = 1
    }

    public OperationEnum Operation { get; set; }
}


