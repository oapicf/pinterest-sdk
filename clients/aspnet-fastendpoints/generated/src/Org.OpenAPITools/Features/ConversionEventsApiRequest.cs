
using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Features;


public class EventsCreateRequest
{
    /// <summary>
    /// Unique identifier of an ad account.
    /// </summary>
    [FastEndpoints.BindFrom("ad_account_id")]
    public string AdAccountId { get; set; }
    /// <summary>
    /// Include query param ?test&#x3D;true to mark the request as a test request. The events will not be recorded but the API will still return the same response messages. Use this mode to verify your requests are working and your events are constructed correctly. Warning: If you use this query parameter, be certain that it is off (set to false or deleted) before sending a legitimate (non-testing) request.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("test")]
    public bool? Test { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.FromBody]
    public ConversionEventsCreate conversionEventsCreate { get; set; }
}


