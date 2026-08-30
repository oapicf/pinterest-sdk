namespace Org.OpenAPITools.Models;


/// <summary>
/// Hotel batch item
/// </summary>
public class CatalogsHotelBatchItem 
{
    public CatalogsUpdatableHotelAttributes Attributes { get; set; }
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


