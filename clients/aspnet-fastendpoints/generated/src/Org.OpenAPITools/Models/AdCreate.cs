namespace Org.OpenAPITools.Models;


/// <summary>
/// Resource create operation model.
/// </summary>
public class AdCreate 
{
    public string AdGroupId { get; set; }
    public string AndroidDeepLink { get; set; }
    public List<string> CarouselAndroidDeepLinks { get; set; }
    public List<string> CarouselDestinationUrls { get; set; }
    public List<string> CarouselIosDeepLinks { get; set; }
    public string ClickTrackingUrl { get; set; }
    public string CollectionItemsDestinationUrlTemplate { get; set; }
    
    public AdCollectionsHeaderType? CollectionsHeaderType { get; set; }
    
    public CreativeType CreativeType { get; set; }
    
    public CustomizableCTAType? CustomizableCtaType { get; set; }
    public string DestinationUrl { get; set; }
    
    public DisclosureType? DisclosureType { get; set; }
    public string DisclosureUrl { get; set; }
    
    public GridClickType? GridClickType { get; set; }
    public string IosDeepLink { get; set; }
    public bool IsCarting { get; set; }
    public bool IsCollageAcceptedTerms { get; set; }
    public bool IsCollageSingleDestination { get; set; }
    public bool IsPinDeleted { get; set; }
    public bool IsRemovable { get; set; }
    public string LeadFormId { get; set; }
    public string Name { get; set; }
    public string PinId { get; set; }
    public QuizPinData QuizPinData { get; set; }
    
    public EntityStatus Status { get; set; }
    public TrackingUrls TrackingUrls { get; set; }
    public string ViewTrackingUrl { get; set; }
}


