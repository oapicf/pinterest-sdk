namespace Org.OpenAPITools.Models;


/// <summary>
/// Request body for bulk adding product tags to a pin.
/// </summary>
public class ProductTagsBulkAddRequest 
{
    public List<ProductTagItem> ProductTags { get; set; }
}


