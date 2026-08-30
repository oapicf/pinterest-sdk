namespace Org.OpenAPITools.Models;


/// <summary>
/// Object describing the catalogs retail items batch
/// </summary>
public class CatalogsRetailItemsBatch 
{
    public string BatchId { get; set; }
    
    /// <summary>
    /// Gets or Sets CatalogType
    /// </summary>
    public enum CatalogTypeEnum
    {
        
        /// <summary>
        /// Enum RETAILEnum for RETAIL
        /// </summary>
        RETAILEnum = 1
    }

    public CatalogTypeEnum CatalogType { get; set; }
    public DateTime CompletedTime { get; set; }
    public DateTime CreatedTime { get; set; }
    public List<ItemProcessingRecord> Items { get; set; }
    
    public BatchOperationStatus Status { get; set; }
}


