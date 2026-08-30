namespace Org.OpenAPITools.Models;


/// <summary>
/// Resource create operation model.
/// </summary>
public class ConversionMSOTEventsCreate 
{
    public List<long> ActionTimestamps { get; set; }
    public string AdGroupId { get; set; }
    
    public AttributionModel AttributionModel { get; set; }
    
    public AttributionScope AttributionScope { get; set; }
    public double AttributionScore { get; set; }
    public string CampaignId { get; set; }
    public string ClickWindow { get; set; }
    
    public Currency Currency { get; set; }
    public string EventId { get; set; }
    
    public MsotEventName EventName { get; set; }
    public long EventTimestamp { get; set; }
    public int TotalEventTouchpoints { get; set; }
    public int TotalEvents { get; set; }
    public double TotalEventsFractional { get; set; }
    public double Value { get; set; }
    public string ViewWindow { get; set; }
}


