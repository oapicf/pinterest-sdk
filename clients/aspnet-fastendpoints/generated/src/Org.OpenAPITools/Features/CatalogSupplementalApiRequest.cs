
using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Features;


public class CatalogsLocalInventoryItemsBatchOperateRequest
{
    /// <summary>
    /// Unique identifier of a catalog.
    /// </summary>
    [FastEndpoints.BindFrom("catalog_id")]
    public string CatalogId { get; set; }
    /// <summary>
    /// Unique identifier of an ad account.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("ad_account_id")]
    public string? AdAccountId { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.FromBody]
    public LocalInventoryItemsBatchCreate localInventoryItemsBatchCreate { get; set; }
}
public class CatalogsLocalInventoryItemsPostRequest
{
    /// <summary>
    /// Unique identifier of a catalog.
    /// </summary>
    [FastEndpoints.BindFrom("catalog_id")]
    public string CatalogId { get; set; }
    /// <summary>
    /// Unique identifier of an ad account.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("ad_account_id")]
    public string? AdAccountId { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.FromBody]
    public LocalInventoryItemsGetCreate localInventoryItemsGetCreate { get; set; }
}
public class CatalogsLocalStoresCreateRequest
{
    /// <summary>
    /// Unique identifier of a catalog.
    /// </summary>
    [FastEndpoints.BindFrom("catalog_id")]
    public string CatalogId { get; set; }
    /// <summary>
    /// Unique identifier of an ad account.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("ad_account_id")]
    public string? AdAccountId { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.FromBody]
    public List<LocalStoreCreate> localStoreCreate { get; set; }
}
public class CatalogsLocalStoresDeleteRequest
{
    /// <summary>
    /// Unique identifier of a catalog.
    /// </summary>
    [FastEndpoints.BindFrom("catalog_id")]
    public string CatalogId { get; set; }
    /// <summary>
    /// List of local store IDs to filter by.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("ids")]
    public List<string> Ids { get; set; }
    /// <summary>
    /// Unique identifier of an ad account.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("ad_account_id")]
    public string? AdAccountId { get; set; }
}
public class CatalogsLocalStoresListRequest
{
    /// <summary>
    /// Unique identifier of a catalog.
    /// </summary>
    [FastEndpoints.BindFrom("catalog_id")]
    public string CatalogId { get; set; }
    /// <summary>
    /// List of local store IDs to filter by.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("ids")]
    public List<string>? Ids { get; set; }
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
public class CatalogsLocalStoresUpdateRequest
{
    /// <summary>
    /// Unique identifier of a catalog.
    /// </summary>
    [FastEndpoints.BindFrom("catalog_id")]
    public string CatalogId { get; set; }
    /// <summary>
    /// Unique identifier of an ad account.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("ad_account_id")]
    public string? AdAccountId { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.FromBody]
    public List<LocalStoreBatchUpdate> localStoreBatchUpdate { get; set; }
}
public class CatalogsSupplementalItemsBatchGetRequest
{
    /// <summary>
    /// Unique identifier of a catalog.
    /// </summary>
    [FastEndpoints.BindFrom("catalog_id")]
    public string CatalogId { get; set; }
    /// <summary>
    /// Unique identifier of an items batch operation.
    /// </summary>
    [FastEndpoints.BindFrom("batch_id")]
    public string BatchId { get; set; }
    /// <summary>
    /// Unique identifier of an ad account.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("ad_account_id")]
    public string? AdAccountId { get; set; }
}


