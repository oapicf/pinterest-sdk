namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class CampaignCreateRequestAllOf1 
{
    public CampaignBidOptionsCreate BidOptions { get; set; }
    
    public IntendedPromotionType IntendedPromotionType { get; set; }
    public bool IsAutomatedCampaign { get; set; }
    public bool IsCampaignBudgetOptimization { get; set; }
    public bool IsFlexibleDailyBudgets { get; set; }
    public bool IsLtvOptimized { get; set; }
    public bool IsPerformancePlus { get; set; } = false;
    public bool IsTopOfSearch { get; set; } = false;
    
    public ObjectiveType ObjectiveType { get; set; }
    
    public EntityStatus Status { get; set; }
}


