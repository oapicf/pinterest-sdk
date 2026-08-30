namespace Org.OpenAPITools.Models;


/// <summary>
/// Retail product metadata entity
/// </summary>
public class CatalogsRetailProductMetadata 
{
    
    public ProductAvailability Availability { get; set; }
    
    public NonNullableCatalogsCurrency Currency { get; set; }
    public string ItemGroupId { get; set; }
    public string ItemId { get; set; }
    public decimal Price { get; set; }
    public decimal SalePrice { get; set; }
}


