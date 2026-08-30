namespace Org.OpenAPITools.Models;


/// <summary>
/// Local inventory item response
/// </summary>
public class LocalInventoryItemResponse 
{
    public string AdLink { get; set; }
    
    public ItemAvailability Availability { get; set; }
    public long CreatedAt { get; set; }
    public string ItemId { get; set; }
    public long LastUpdatedTime { get; set; }
    public string Price { get; set; }
    public string SalePrice { get; set; }
    public StoreMetadata StoreMetadata { get; set; }
}


