namespace Org.OpenAPITools.Models;


/// <summary>
/// Request body for bulk deleting product tags from a pin.
/// </summary>
public class ProductTagsBulkDeleteRequest 
{
    public List<ProductTagItem> ProductTags { get; set; }
}


