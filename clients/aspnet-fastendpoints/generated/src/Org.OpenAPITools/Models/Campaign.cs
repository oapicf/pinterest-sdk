namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class Campaign 
{
    public string AdAccountId { get; set; }
    public CampaignBidOptions BidOptions { get; set; }
    public int CreatedTime { get; set; }
    public int DailySpendCap { get; set; }
    public int DefaultAdGroupBudgetInMicroCurrency { get; set; }
    public int EndTime { get; set; }
    public string Id { get; set; }
    
    public IntendedPromotionType IntendedPromotionType { get; set; }
    public bool IsAutomatedCampaign { get; set; }
    public bool IsCampaignBudgetOptimization { get; set; }
    public bool IsCarting { get; set; }
    public bool IsFlexibleDailyBudgets { get; set; }
    public bool IsLtvOptimized { get; set; }
    public bool IsPerformancePlus { get; set; }
    public bool IsTopOfSearch { get; set; }
    public int LifetimeSpendCap { get; set; }
    public string Name { get; set; }
    
    public CampaignObjectiveType ObjectiveType { get; set; }
    public string OrderLineId { get; set; }
    public PerformancePlusCampaignSettings PerformancePlusCampaignSettings { get; set; }
    public int StartTime { get; set; }
    
    public EntityStatus Status { get; set; }
    
    public SummaryStatus SummaryStatus { get; set; }
    public TrackingUrls TrackingUrls { get; set; }
    public string Type { get; set; }
    public int UpdatedTime { get; set; }
}


