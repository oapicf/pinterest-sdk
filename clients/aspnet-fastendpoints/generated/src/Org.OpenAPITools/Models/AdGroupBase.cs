namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class AdGroupBase 
{
    public string AdAccountId { get; set; }
    public int BidInMicroCurrency { get; set; }
    
    public BidStrategyType? BidStrategyType { get; set; }
    
    public ActionType BillableEvent { get; set; }
    public int BudgetInMicroCurrency { get; set; }
    public string CampaignId { get; set; }
    
    public ConversionLearningModeType? ConversionLearningModeType { get; set; }
    public int CreatedTime { get; set; }
    public string CustomerSegmentId { get; set; }
    public Object DcaAssets { get; set; }
    public int EndTime { get; set; }
    public AdgroupTrackingFeatures ExtFeatures { get; set; }
    public string FeedProfileId { get; set; }
    public string Id { get; set; }
    public bool IsCreativeOptimization { get; set; }
    public bool IsLocalInventory { get; set; }
    public int LifetimeFrequencyCap { get; set; }
    public decimal LocalInventoryRadiusInMiles { get; set; }
    public string Name { get; set; }
    public NullableOptimizationGoalMetadata OptimizationGoalMetadata { get; set; }
    public PerformancePlusCampaignSettings PerformancePlusCampaignSettings { get; set; }
    
    public PlacementGroupType PlacementGroup { get; set; }
    
    public PlacementTrafficType? PlacementTrafficType { get; set; }
    
    public PromotionApplicationLevel? PromotionApplicationLevel { get; set; }
    public string PromotionId { get; set; } = "0";
    public List<string> PromotionIds { get; set; }
    public int StartTime { get; set; }
    
    public EntityStatus Status { get; set; }
    
    public SummaryStatus SummaryStatus { get; set; }
    public TargetingSpecOptimal TargetingSpec { get; set; }
    public List<string> TargetingTemplateIds { get; set; }
    public AdGroupTrackingURLs TrackingUrls { get; set; }
    public string Type { get; set; } = "adgroup";
    public int UpdatedTime { get; set; }
}


