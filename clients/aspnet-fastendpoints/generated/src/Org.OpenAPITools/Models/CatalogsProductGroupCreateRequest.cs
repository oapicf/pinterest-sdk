namespace Org.OpenAPITools.Models;


/// <summary>
/// Request object for creating a product group.
/// </summary>
public class CatalogsProductGroupCreateRequest 
{
    public string Description { get; set; }
    public string FeedId { get; set; }
    public CatalogsProductGroupFiltersRequest Filters { get; set; }
    public bool IsFeatured { get; set; }
    public string Name { get; set; }
}


