
using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Features;


public class SearchPartnerPinsRequest
{
    /// <summary>
    /// Search term to look up pins.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("term")]
    public string Term { get; set; }
    /// <summary>
    /// Two letter country code (ISO 3166-1 alpha-2)
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("country_code")]
    public string CountryCode { get; set; }
    /// <summary>
    /// Cursor used to fetch the next page of items
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("bookmark")]
    public string? Bookmark { get; set; }
    /// <summary>
    /// Search locale.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("locale")]
    public string? Locale { get; set; }
    /// <summary>
    /// Max search result size
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("limit")]
    public int? Limit { get; set; }
}
public class SearchUserBoardsGetRequest
{
    /// <summary>
    /// Unique identifier of an ad account.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("ad_account_id")]
    public string? AdAccountId { get; set; }
    /// <summary>
    /// Search query. Can contain pin description keywords or comma-separated pin IDs.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("query")]
    public string? Query { get; set; }
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
public class SearchUserPinsListRequest
{
    /// <summary>
    /// Unique identifier of an ad account.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("ad_account_id")]
    public string? AdAccountId { get; set; }
    /// <summary>
    /// Search query. Can contain pin description keywords or comma-separated pin IDs.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("query")]
    public string Query { get; set; }
    /// <summary>
    /// Cursor used to fetch the next page of items
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("bookmark")]
    public string? Bookmark { get; set; }
}


