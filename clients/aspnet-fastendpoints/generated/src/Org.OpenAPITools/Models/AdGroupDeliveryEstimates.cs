namespace Org.OpenAPITools.Models;


/// <summary>
/// Ad group configuration for delivery estimates.
/// </summary>
public class AdGroupDeliveryEstimates 
{
    public bool AutoTargetingEnabled { get; set; }
    public List<AdGroupAudienceSizingCreativeTypes> CreativeTypes { get; set; }
    public List<AdGroupDeliveryEstimatesKeywordsItems> Keywords { get; set; }
    public int MonthlyFrequencyCap { get; set; }
    public OptimizationGoalMetadata OptimizationGoalMetadata { get; set; }
    
    public OptimizationType OptimizationType { get; set; }
    
    public PlacementGroupType PlacementGroup { get; set; }
    public List<string> ProductGroupIds { get; set; }
    public TargetingSpecOptimal TargetingSpec { get; set; }
}


