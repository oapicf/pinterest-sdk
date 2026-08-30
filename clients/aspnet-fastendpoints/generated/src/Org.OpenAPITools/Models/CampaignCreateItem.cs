namespace Org.OpenAPITools.Models;


/// <summary>
/// Single campaign create item with create-specific defaults.
/// </summary>
public class CampaignCreateItem 
{
    public string AdAccountId { get; set; }
    public string AppId { get; set; }
    
    public MobileAppPlatform AppPlatform { get; set; }
    public CampaignBidOptions BidOptions { get; set; }
    public int DailySpendCap { get; set; }
    public int DefaultAdGroupBudgetInMicroCurrency { get; set; }
    public int EndTime { get; set; }
    
    public IntendedPromotionType IntendedPromotionType { get; set; }
    public bool IsAutomatedCampaign { get; set; } = false;
    public bool IsCampaignBudgetOptimization { get; set; } = true;
    public bool IsFlexibleDailyBudgets { get; set; } = false;
    public bool IsLtvOptimized { get; set; }
    public bool IsPerformancePlus { get; set; } = false;
    public bool IsTopOfSearch { get; set; } = false;
    public int LifetimeSpendCap { get; set; }
    public string Name { get; set; }
    
    public ConversionObjectiveType ObjectiveType { get; set; }
    public string OrderLineId { get; set; }
    public int StartTime { get; set; }
    
    public EntityStatus Status { get; set; }
    public TrackingUrls TrackingUrls { get; set; }
}


