namespace Org.OpenAPITools.Models;


/// <summary>
/// Request containing operations to perform on bid prices and bid multipliers for a batch of retail catalog items
/// </summary>
public class AdvancedAuctionItemsSubmitRequest 
{
    public string CatalogId { get; set; }
    public List<AdvancedAuctionItemsSubmitRecord> Items { get; set; }
}


