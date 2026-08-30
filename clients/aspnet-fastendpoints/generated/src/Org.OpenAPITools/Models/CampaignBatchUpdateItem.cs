namespace Org.OpenAPITools.Models;


/// <summary>
/// Single campaign update item with update-specific bid options.
/// </summary>
public class CampaignBatchUpdateItem 
{
    public string AdAccountId { get; set; }
    public string AppId { get; set; }
    
    public MobileAppPlatform AppPlatform { get; set; }
    public CampaignBidOptionsUpdate BidOptions { get; set; }
    public int DailySpendCap { get; set; }
    public int DefaultAdGroupBudgetInMicroCurrency { get; set; }
    public int EndTime { get; set; }
    public string Id { get; set; }
    
    public IntendedPromotionType IntendedPromotionType { get; set; }
    public bool IsAutomatedCampaign { get; set; }
    public bool IsCampaignBudgetOptimization { get; set; }
    public bool IsFlexibleDailyBudgets { get; set; }
    public bool IsLtvOptimized { get; set; }
    public bool IsPerformancePlus { get; set; }
    public bool IsTopOfSearch { get; set; }
    public int LifetimeSpendCap { get; set; }
    public string Name { get; set; }
    
    public ConversionObjectiveType ObjectiveType { get; set; }
    public string OrderLineId { get; set; }
    public PerformancePlusCampaignSettings PerformancePlusCampaignSettings { get; set; }
    public int StartTime { get; set; }
    
    public EntityStatus Status { get; set; }
    public TrackingUrls TrackingUrls { get; set; }
}


