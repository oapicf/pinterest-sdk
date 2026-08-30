
using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Features;


public class FeedProcessingResultsListRequest
{
    /// <summary>
    /// Unique identifier of a feed.
    /// </summary>
    [FastEndpoints.BindFrom("feed_id")]
    public string FeedId { get; set; }
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
public class FeedsCreateRequest
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
    public CatalogsFeedCreateRequestSchema catalogsFeedCreateRequestSchema { get; set; }
}
public class FeedsDeleteRequest
{
    /// <summary>
    /// Unique identifier of a feed.
    /// </summary>
    [FastEndpoints.BindFrom("feed_id")]
    public string FeedId { get; set; }
    /// <summary>
    /// Unique identifier of an ad account.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("ad_account_id")]
    public string? AdAccountId { get; set; }
}
public class FeedsGetRequest
{
    /// <summary>
    /// Unique identifier of a feed.
    /// </summary>
    [FastEndpoints.BindFrom("feed_id")]
    public string FeedId { get; set; }
    /// <summary>
    /// Unique identifier of an ad account.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("ad_account_id")]
    public string? AdAccountId { get; set; }
}
public class FeedsIngestRequest
{
    /// <summary>
    /// Unique identifier of a feed.
    /// </summary>
    [FastEndpoints.BindFrom("feed_id")]
    public string FeedId { get; set; }
    /// <summary>
    /// Unique identifier of an ad account.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("ad_account_id")]
    public string? AdAccountId { get; set; }
}
public class FeedsListRequest
{
    /// <summary>
    /// Filter entities for a given catalog_id. If not given, all catalogs are considered.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("catalog_id")]
    public string? CatalogId { get; set; }
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
public class FeedsUpdateRequest
{
    /// <summary>
    /// Unique identifier of a feed.
    /// </summary>
    [FastEndpoints.BindFrom("feed_id")]
    public string FeedId { get; set; }
    /// <summary>
    /// Unique identifier of an ad account.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("ad_account_id")]
    public string? AdAccountId { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.FromBody]
    public CatalogsFeedUpdateRequestSchema catalogsFeedUpdateRequestSchema { get; set; }
}
public class ItemsIssuesListRequest
{
    /// <summary>
    /// Unique identifier of a feed processing result. It can be acquired from the \&quot;id\&quot; field of the \&quot;items\&quot; array within the response of the [List processing results for a given feed](/docs/api/v5/#operation/feed_processing_results/list).
    /// </summary>
    [FastEndpoints.BindFrom("processing_result_id")]
    public string ProcessingResultId { get; set; }
    /// <summary>
    /// Item number based on order of appearance in the Catalogs Feed. For example, &#39;0&#39; refers to first item found in a feed that was downloaded from a &#39;location&#39; specified during feed creation.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("item_numbers")]
    public List<int>? ItemNumbers { get; set; }
    /// <summary>
    /// Filter item validation issues that have a given type of item validation issue.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("item_validation_issue")]
    public CatalogsItemValidationIssue ItemValidationIssue { get; set; }
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


