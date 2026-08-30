namespace Org.OpenAPITools.Models;


/// <summary>
/// Object describing the catalogs creative assets items batch
/// </summary>
public class CatalogsCreativeAssetsItemsBatch 
{
    public string BatchId { get; set; }
    
    /// <summary>
    /// Gets or Sets CatalogType
    /// </summary>
    public enum CatalogTypeEnum
    {
        
        /// <summary>
        /// Enum CREATIVEASSETSEnum for CREATIVE_ASSETS
        /// </summary>
        CREATIVEASSETSEnum = 1
    }

    public CatalogTypeEnum CatalogType { get; set; }
    public DateTime CompletedTime { get; set; }
    public DateTime CreatedTime { get; set; }
    public List<CreativeAssetsProcessingRecord> Items { get; set; }
    
    public BatchOperationStatus Status { get; set; }
}


