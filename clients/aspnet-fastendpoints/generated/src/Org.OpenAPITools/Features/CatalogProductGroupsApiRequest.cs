
using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Features;


public class CatalogsProductGroupPinsListRequest
{
    /// <summary>
    /// Unique identifier of a product group
    /// </summary>
    [FastEndpoints.BindFrom("product_group_id")]
    public string ProductGroupId { get; set; }
    /// <summary>
    /// Unique identifier of an ad account.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("ad_account_id")]
    public string? AdAccountId { get; set; }
    /// <summary>
    /// Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before &#x60;2023-03-20&#x60; lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("pin_metrics")]
    public bool? PinMetrics { get; set; }
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
public class CatalogsProductGroupsCreateRequest
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
    public CatalogsProductGroupsCreateRequestSchema catalogsProductGroupsCreateRequestSchema { get; set; }
}
public class CatalogsProductGroupsCreateManyRequest
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
    public List<CatalogsProductGroupsCreateManyRequestItems> catalogsProductGroupsCreateManyRequestItems { get; set; }
}
public class CatalogsProductGroupsDeleteRequest
{
    /// <summary>
    /// Unique identifier of a product group
    /// </summary>
    [FastEndpoints.BindFrom("product_group_id")]
    public string ProductGroupId { get; set; }
    /// <summary>
    /// Unique identifier of an ad account.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("ad_account_id")]
    public string? AdAccountId { get; set; }
}
public class CatalogsProductGroupsDeleteManyRequest
{
    /// <summary>
    /// Comma-separated list of product group ids
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("id")]
    public List<int> Id { get; set; }
    /// <summary>
    /// Unique identifier of an ad account.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("ad_account_id")]
    public string? AdAccountId { get; set; }
}
public class CatalogsProductGroupsGetRequest
{
    /// <summary>
    /// Unique identifier of a product group
    /// </summary>
    [FastEndpoints.BindFrom("product_group_id")]
    public string ProductGroupId { get; set; }
    /// <summary>
    /// Unique identifier of an ad account.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("ad_account_id")]
    public string? AdAccountId { get; set; }
}
public class CatalogsProductGroupsListRequest
{
    /// <summary>
    /// Comma-separated list of product group ids
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("id")]
    public List<int>? Id { get; set; }
    /// <summary>
    /// Filter entities for a given feed_id. If not given, all feeds are considered.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("feed_id")]
    public string? FeedId { get; set; }
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
public class CatalogsProductGroupsProductCountsGetRequest
{
    /// <summary>
    /// Unique identifier of a product group
    /// </summary>
    [FastEndpoints.BindFrom("product_group_id")]
    public string ProductGroupId { get; set; }
    /// <summary>
    /// Unique identifier of an ad account.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("ad_account_id")]
    public string? AdAccountId { get; set; }
}
public class CatalogsProductGroupsUpdateRequest
{
    /// <summary>
    /// Unique identifier of a product group
    /// </summary>
    [FastEndpoints.BindFrom("product_group_id")]
    public string ProductGroupId { get; set; }
    /// <summary>
    /// Unique identifier of an ad account.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("ad_account_id")]
    public string? AdAccountId { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.FromBody]
    public CatalogsProductGroupsUpdateRequestSchema catalogsProductGroupsUpdateRequestSchema { get; set; }
}
public class ProductsByProductGroupFilterListRequest
{
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
    /// <summary>
    /// Unique identifier of an ad account.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("ad_account_id")]
    public string? AdAccountId { get; set; }
    /// <summary>
    /// Specify whether to return 90d and lifetime Pin metrics. Total comments and total reactions are only available with lifetime Pin metrics. If Pin was created before &#x60;2023-03-20&#x60; lifetime metrics will only be available for Video and Idea Pin formats. Lifetime metrics are available for all Pin formats since then.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("pin_metrics")]
    public bool? PinMetrics { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.FromBody]
    public CatalogsListProductsByFilterRequest catalogsListProductsByFilterRequest { get; set; }
}


