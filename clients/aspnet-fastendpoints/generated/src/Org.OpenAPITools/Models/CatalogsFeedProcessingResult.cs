namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class CatalogsFeedProcessingResult 
{
    public DateTime CreatedAt { get; set; }
    public string Id { get; set; }
    public CatalogsFeedIngestionDetails IngestionDetails { get; set; }
    public CatalogsFeedProductCounts ProductCounts { get; set; }
    
    public CatalogsFeedProcessingStatus Status { get; set; }
    public DateTime UpdatedAt { get; set; }
    public CatalogsFeedValidationDetails ValidationDetails { get; set; }
    public CatalogsFeedVideoCounts VideoCounts { get; set; }
}


