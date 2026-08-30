namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class AdPreviewRequest 
{
    public string ImageUrl { get; set; }
    public string PromotionId { get; set; }
    public string Title { get; set; }
    
    public AdShoppingPreviewCreativeType CreativeType { get; set; }
    public string PinId { get; set; }
    public string CatalogProductGroupId { get; set; }
    
    public CustomizableCTAType? CustomizableCtaType { get; set; }
    public string HeroImageTitle { get; set; }
    public string HeroImageUrl { get; set; }
    public string HeroPinId { get; set; }
    public string ImageTag { get; set; }
    public string ItemId { get; set; }
    
    public BasePreferredMediaType PreferredMediaType { get; set; }
    public bool ShowPromotion { get; set; }
    public string VideoTag { get; set; }
}


