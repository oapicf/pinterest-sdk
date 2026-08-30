
using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Features;


public class MsotEventsCreateRequest
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
    public ConversionMSOTEventsCreate conversionMSOTEventsCreate { get; set; }
}


