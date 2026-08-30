namespace Org.OpenAPITools.Models;


/// <summary>
/// Local inventory attributes for retail items (required fields for create/upsert)
/// </summary>
public class RetailLocalInventoryItemAttributes 
{
    public string AdLink { get; set; }
    
    public ItemAvailability Availability { get; set; }
    public string Price { get; set; }
    public string SalePrice { get; set; }
}


