
using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Features;


public class ItemsBatchGetRequest
{
    /// <summary>
    /// Id of a catalogs items batch to fetch
    /// </summary>
    [FastEndpoints.BindFrom("batch_id")]
    public string BatchId { get; set; }
    /// <summary>
    /// Unique identifier of an ad account.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("ad_account_id")]
    public string? AdAccountId { get; set; }
}
public class ItemsBatchPostRequest
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
    public CatalogsItemsBatchPostRequest catalogsItemsBatchPostRequest { get; set; }
}
public class ItemsPostRequest
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
    public CatalogsItemsRequest catalogsItemsRequest { get; set; }
}


