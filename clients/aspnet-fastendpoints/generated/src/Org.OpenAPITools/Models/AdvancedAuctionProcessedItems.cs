namespace Org.OpenAPITools.Models;


/// <summary>
/// Response object containing the results of an operation on an item bid option
/// </summary>
public class AdvancedAuctionProcessedItems 
{
    public string CatalogId { get; set; }
    public List<AdvancedAuctionItemsSubmitRecord> Items { get; set; }
}


