
using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Features;


public class AdvertiserDefinedEventsCreateRequest
{
    /// <summary>
    /// Unique identifier of an ad account.
    /// </summary>
    [FastEndpoints.BindFrom("ad_account_id")]
    public string AdAccountId { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.FromBody]
    public AdvertiserDefinedEventsCreateRequest advertiserDefinedEventsCreateRequest { get; set; }
}
public class AdvertiserDefinedEventsDeleteRequest
{
    /// <summary>
    /// Unique identifier of an ad account.
    /// </summary>
    [FastEndpoints.BindFrom("ad_account_id")]
    public string AdAccountId { get; set; }
    /// <summary>
    /// List of event names to delete
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("event_names")]
    public List<string> EventNames { get; set; }
}
public class AdvertiserDefinedEventsGetRequest
{
    /// <summary>
    /// Unique identifier of an ad account.
    /// </summary>
    [FastEndpoints.BindFrom("ad_account_id")]
    public string AdAccountId { get; set; }
}
public class AdvertiserDefinedEventsUpdateRequest
{
    /// <summary>
    /// Unique identifier of an ad account.
    /// </summary>
    [FastEndpoints.BindFrom("ad_account_id")]
    public string AdAccountId { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.FromBody]
    public AdvertiserDefinedEventsCreateRequest advertiserDefinedEventsCreateRequest { get; set; }
}


