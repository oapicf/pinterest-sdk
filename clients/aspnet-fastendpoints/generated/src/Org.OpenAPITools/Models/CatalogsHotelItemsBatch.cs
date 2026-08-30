namespace Org.OpenAPITools.Models;


/// <summary>
/// Object describing the catalogs hotel items batch. If specified, you must provide all properties.
/// </summary>
public class CatalogsHotelItemsBatch 
{
    public string BatchId { get; set; }
    
    /// <summary>
    /// Gets or Sets CatalogType
    /// </summary>
    public enum CatalogTypeEnum
    {
        
        /// <summary>
        /// Enum HOTELEnum for HOTEL
        /// </summary>
        HOTELEnum = 1
    }

    public CatalogTypeEnum CatalogType { get; set; }
    public DateTime CompletedTime { get; set; }
    public DateTime CreatedTime { get; set; }
    public List<HotelProcessingRecord> Items { get; set; }
    
    public BatchOperationStatus Status { get; set; }
}


