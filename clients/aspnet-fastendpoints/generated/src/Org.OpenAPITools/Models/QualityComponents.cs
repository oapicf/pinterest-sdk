namespace Org.OpenAPITools.Models;


/// <summary>
/// Set of quality components, with each component containing a event coverage and details.
/// </summary>
public class QualityComponents 
{
    public Dictionary<string, QualityComponentDetails> AdvertiserExternalId { get; set; }
    public Dictionary<string, QualityComponentDetails> ClickIdEpik { get; set; }
    public Dictionary<string, QualityComponentDetails> ExternalEventId { get; set; }
    public Dictionary<string, QualityComponentDetails> HashedEmail { get; set; }
    public Dictionary<string, QualityComponentDetails> HashedMaid { get; set; }
    public Dictionary<string, QualityComponentDetails> IpAddress { get; set; }
    public Dictionary<string, QualityComponentDetails> OrderId { get; set; }
    public Dictionary<string, QualityComponentDetails> OrderValue { get; set; }
    public Dictionary<string, QualityComponentDetails> ProductId { get; set; }
    public Dictionary<string, QualityComponentDetails> SourceUrl { get; set; }
    public Dictionary<string, QualityComponentDetails> UserAgent { get; set; }
}


