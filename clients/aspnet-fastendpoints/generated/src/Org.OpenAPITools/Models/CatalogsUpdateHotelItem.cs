namespace Org.OpenAPITools.Models;


/// <summary>
/// Object describing an hotel item batch record
/// </summary>
public class CatalogsUpdateHotelItem 
{
    public CatalogsUpdatableHotelAttributes Attributes { get; set; }
    public string HotelId { get; set; }
    
    /// <summary>
    /// Gets or Sets Operation
    /// </summary>
    public enum OperationEnum
    {
        
        /// <summary>
        /// Enum UPDATEEnum for UPDATE
        /// </summary>
        UPDATEEnum = 1
    }

    public OperationEnum Operation { get; set; }
}


