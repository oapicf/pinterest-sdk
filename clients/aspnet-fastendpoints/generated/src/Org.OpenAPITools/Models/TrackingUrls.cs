namespace Org.OpenAPITools.Models;


/// <summary>
///   Third-party tracking URLs. Up to three tracking URLs - with a max length of 2,000 - are supported for   each event type. Tracking URLs set at the ad group or ad level can override   those set at the campaign level. For more information, see [Third-party and dynamic tracking](https://help.pinterest.com/en/business/article/third-party-and-dynamic-tracking).
/// </summary>
public class TrackingUrls 
{
    public List<string> AudienceVerification { get; set; }
    public List<string> BuyableButton { get; set; }
    public List<string> Click { get; set; }
    public List<string> Engagement { get; set; }
    public List<string> Impression { get; set; }
}


