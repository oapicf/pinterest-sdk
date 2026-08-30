namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class CampaignCreateRequest 
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
    public string AdAccountId { get; set; }
    public int DailySpendCap { get; set; }
    public int DefaultAdGroupBudgetInMicroCurrency { get; set; }
    public int EndTime { get; set; }
    public int LifetimeSpendCap { get; set; }
    public string Name { get; set; }
    public string OrderLineId { get; set; }
    public int StartTime { get; set; }
    public Object TrackingUrls { get; set; }
}


