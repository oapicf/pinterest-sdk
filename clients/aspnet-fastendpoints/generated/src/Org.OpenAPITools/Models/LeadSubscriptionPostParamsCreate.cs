namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class LeadSubscriptionPostParamsCreate 
{
    public string LeadFormId { get; set; }
    public string WebhookUrl { get; set; }
    public string PartnerAccessToken { get; set; }
    public PartnerMetadata PartnerMetadata { get; set; }
    public string PartnerRefreshToken { get; set; }
}


