namespace Org.OpenAPITools.Models;


/// <summary>
/// A hotel item to be upserted.
/// </summary>
public class CatalogsUpsertHotelItem 
{
    public CatalogsHotelAttributes Attributes { get; set; }
    public string HotelId { get; set; }
    
    /// <summary>
    /// Gets or Sets Operation
    /// </summary>
    public enum OperationEnum
    {
        
        /// <summary>
        /// Enum UPSERTEnum for UPSERT
        /// </summary>
        UPSERTEnum = 1
    }

    public OperationEnum Operation { get; set; }
}


