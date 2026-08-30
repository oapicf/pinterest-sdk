namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class LeadSubscriptionPostParams 
{
    public string AdAccountId { get; set; }
    public string ApiVersion { get; set; }
    public int CreatedTime { get; set; }
    public string CryptographicAlgorithm { get; set; }
    public string CryptographicKey { get; set; }
    public string Id { get; set; }
    public string LeadFormId { get; set; }
    public string UserAccountId { get; set; }
    public string WebhookUrl { get; set; }
    public string PartnerAccessToken { get; set; }
    public PartnerMetadata PartnerMetadata { get; set; }
    public string PartnerRefreshToken { get; set; }
}


