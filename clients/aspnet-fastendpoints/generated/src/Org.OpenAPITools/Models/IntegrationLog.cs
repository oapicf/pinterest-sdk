namespace Org.OpenAPITools.Models;


/// <summary>
/// Schema for log sent from an integration application.
/// </summary>
public class IntegrationLog 
{
    public string AdvertiserId { get; set; }
    public string AppVersionNumber { get; set; }
    public int ClientTimestamp { get; set; }
    public IntegrationLogClientError Error { get; set; }
    
    public IntegrationLogEventType EventType { get; set; }
    public string ExternalBusinessId { get; set; }
    public string FeedProfileId { get; set; }
    
    public IntegrationLogLevel LogLevel { get; set; }
    public string MerchantId { get; set; }
    public string Message { get; set; }
    public string PlatformVersionNumber { get; set; }
    public IntegrationLogClientRequest Request { get; set; }
    public string TagId { get; set; }
}


