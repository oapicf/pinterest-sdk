namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class AdUpdateRequest 
{
    public string Id { get; set; }
    public string PinId { get; set; }
    public string AdGroupId { get; set; }
    public string AndroidDeepLink { get; set; }
    public List<string> CarouselAndroidDeepLinks { get; set; }
    public List<string> CarouselDestinationUrls { get; set; }
    public List<string> CarouselIosDeepLinks { get; set; }
    public string ClickTrackingUrl { get; set; }
    
    public CreativeType CreativeType { get; set; }
    
    public CustomizableCTAType? CustomizableCtaType { get; set; }
    public string DestinationUrl { get; set; }
    
    public DisclosureType? DisclosureType { get; set; }
    public string DisclosureUrl { get; set; }
    
    public GridClickType? GridClickType { get; set; }
    public string IosDeepLink { get; set; }
    public bool IsCarting { get; set; }
    public bool IsPinDeleted { get; set; }
    public bool IsRemovable { get; set; }
    public string LeadFormId { get; set; }
    public string Name { get; set; }
    public Object QuizPinData { get; set; }
    
    public EntityStatus Status { get; set; }
    public Object TrackingUrls { get; set; }
    public string ViewTrackingUrl { get; set; }
}


