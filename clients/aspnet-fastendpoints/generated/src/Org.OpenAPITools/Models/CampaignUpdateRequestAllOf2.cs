namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class CampaignUpdateRequestAllOf2 
{
    public CampaignBidOptionsUpdate BidOptions { get; set; }
    
    public IntendedPromotionType IntendedPromotionType { get; set; }
    public bool IsLtvOptimized { get; set; }
    public bool IsPerformancePlus { get; set; }
    public bool IsTopOfSearch { get; set; }
    
    public ObjectiveType? ObjectiveType { get; set; }
}


