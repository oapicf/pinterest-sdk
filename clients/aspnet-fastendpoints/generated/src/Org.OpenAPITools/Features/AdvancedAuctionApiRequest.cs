
using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Features;


public class AdvancedAuctionItemsGetPostRequest
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
    public AdvancedAuctionItemsGetRequest advancedAuctionItemsGetRequest { get; set; }
}
public class AdvancedAuctionItemsSubmitPostRequest
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
    public AdvancedAuctionItemsSubmitRequest advancedAuctionItemsSubmitRequest { get; set; }
}


