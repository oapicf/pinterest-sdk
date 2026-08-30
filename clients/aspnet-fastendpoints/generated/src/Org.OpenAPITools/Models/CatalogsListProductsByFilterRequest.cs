namespace Org.OpenAPITools.Models;


/// <summary>
/// Request object to list products for a given product group filter.
/// </summary>
public class CatalogsListProductsByFilterRequest 
{
    public string FeedId { get; set; }
    public CatalogsProductGroupFilters Filters { get; set; }
}


