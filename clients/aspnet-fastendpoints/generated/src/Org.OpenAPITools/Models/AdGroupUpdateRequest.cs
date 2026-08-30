namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class AdGroupUpdateRequest 
{
    public decimal BidMultiplier { get; set; }
    public string Id { get; set; }
    public List<TargetingSpecOperations> TargetingSpecOperations { get; set; }
    public bool AutoTargetingEnabled { get; set; }
    public int BidInMicroCurrency { get; set; }
    
    public BidStrategyType? BidStrategyType { get; set; }
    
    public ActionType BillableEvent { get; set; }
    public int BudgetInMicroCurrency { get; set; }
    
    public BudgetType BudgetType { get; set; }
    public string CampaignId { get; set; }
    public int EndTime { get; set; }
    public bool IsCreativeOptimization { get; set; }
    public int LifetimeFrequencyCap { get; set; }
    public string Name { get; set; }
    public Object OptimizationGoalMetadata { get; set; }
    
    public PacingDeliveryType PacingDeliveryType { get; set; }
    
    public PlacementGroupType PlacementGroup { get; set; }
    
    /// <summary>
    /// Specify if the promotion is applied at ad group or item level
    /// </summary>
    /// <value>Specify if the promotion is applied at ad group or item level</value>
    public enum PromotionApplicationLevelEnum
    {
        
        /// <summary>
        /// Enum NONEEnum for NONE
        /// </summary>
        NONEEnum = 1,
        
        /// <summary>
        /// Enum ITEMEnum for ITEM
        /// </summary>
        ITEMEnum = 2,
        
        /// <summary>
        /// Enum ADGROUPEnum for AD_GROUP
        /// </summary>
        ADGROUPEnum = 3
    }

    public PromotionApplicationLevelEnum? PromotionApplicationLevel { get; set; }
    public string PromotionId { get; set; } = "0";
    public List<string> PromotionIds { get; set; }
    public int StartTime { get; set; }
    
    public EntityStatus Status { get; set; }
    public TargetingSpec TargetingSpec { get; set; }
    public List<string> TargetingTemplateIds { get; set; }
    public Object TrackingUrls { get; set; }
}


