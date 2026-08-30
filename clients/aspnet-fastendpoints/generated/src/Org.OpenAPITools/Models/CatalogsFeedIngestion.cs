namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class CatalogsFeedIngestion 
{
    public DateTime CreatedAt { get; set; }
    public string FeedId { get; set; }
    public string Id { get; set; }
    
    public CatalogsFeedProcessingStatus Status { get; set; }
}


