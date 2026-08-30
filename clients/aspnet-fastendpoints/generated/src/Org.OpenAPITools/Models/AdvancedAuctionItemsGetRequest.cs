namespace Org.OpenAPITools.Models;


/// <summary>
/// Request object used to get bid options values for a batch of retail catalog items
/// </summary>
public class AdvancedAuctionItemsGetRequest 
{
    public string CatalogId { get; set; }
    public List<AdvancedAuctionKey> Items { get; set; }
}


