namespace Org.OpenAPITools.Models;


/// <summary>
/// Local inventory attributes for retail items (all fields optional for update/get)
/// </summary>
public class RetailLocalInventoryItemAttributesOptional 
{
    public string AdLink { get; set; }
    
    public ItemAvailability Availability { get; set; }
    public string Price { get; set; }
    public string SalePrice { get; set; }
}


