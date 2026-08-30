
using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Features;


public class CatalogsAvailableFilterValuesRequest
{
    /// <summary>
    /// Filter entities for a given catalog_id.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("catalog_id")]
    public string CatalogId { get; set; }
    /// <summary>
    /// Filter entities for a given feed_id. If not given, all feeds are considered.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("feed_id")]
    public string? FeedId { get; set; }
    /// <summary>
    /// Country for the Catalogs Items
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("country")]
    public Country Country { get; set; }
    /// <summary>
    /// Language for the Catalogs Items
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("language")]
    public CatalogsLocale Language { get; set; }
    /// <summary>
    /// Unique identifier of an ad account.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("ad_account_id")]
    public string? AdAccountId { get; set; }
}
public class CatalogsCreateRequest
{
    /// <summary>
    /// Unique identifier of an ad account.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("ad_account_id")]
    public string? AdAccountId { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.FromBody]
    public CatalogCreate catalogCreate { get; set; }
}
public class CatalogsListRequest
{
    /// <summary>
    /// Unique identifier of an ad account.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("ad_account_id")]
    public string? AdAccountId { get; set; }
    /// <summary>
    /// Cursor used to fetch the next page of items
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("bookmark")]
    public string? Bookmark { get; set; }
    /// <summary>
    /// Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("page_size")]
    public int? PageSize { get; set; }
}


