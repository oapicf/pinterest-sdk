namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class ProductGroupPromotion 
{
    public string AdGroupId { get; set; }
    public int BidInMicroCurrency { get; set; }
    public string CatalogProductGroupId { get; set; }
    public string CatalogProductGroupName { get; set; }
    
    public CollectionsHeaderType? CollectionsHeaderType { get; set; }
    public string CollectionsHeroDestinationUrl { get; set; }
    public string CollectionsHeroPinId { get; set; }
    
    public CreativeType CreativeType { get; set; }
    
    public ProductGroupPromotionCustomizableCTAType CustomizableCtaType { get; set; }
    public string Definition { get; set; }
    
    public GridClickType? GridClickType { get; set; }
    public string Id { get; set; }
    public bool Included { get; set; }
    public bool IsGenerateBackground { get; set; }
    public bool IsImageAutoResizing { get; set; }
    public bool IsMdl { get; set; }
    public string ParentId { get; set; }
    
    public PreferredMediaType? PreferredMediaType { get; set; }
    public string RelativeDefinition { get; set; }
    public string SelectedImageTag { get; set; }
    public string SelectedVideoTag { get; set; }
    public string SlideshowCollectionsDescription { get; set; }
    public string SlideshowCollectionsTitle { get; set; }
    
    public EntityStatus Status { get; set; }
    public string TrackingUrl { get; set; }
}


