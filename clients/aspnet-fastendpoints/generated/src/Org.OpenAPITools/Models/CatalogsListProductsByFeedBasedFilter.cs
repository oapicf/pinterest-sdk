namespace Org.OpenAPITools.Models;


/// <summary>
/// Request object to list products for a given feed_id and product group filter.
/// </summary>
public class CatalogsListProductsByFeedBasedFilter 
{
    public string FeedId { get; set; }
    public CatalogsProductGroupFilters Filters { get; set; }
}


