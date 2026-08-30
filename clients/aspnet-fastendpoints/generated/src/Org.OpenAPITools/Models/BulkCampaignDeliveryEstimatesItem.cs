namespace Org.OpenAPITools.Models;


/// <summary>
/// Delivery estimate result for a single campaign within a bulk request.
/// </summary>
public class BulkCampaignDeliveryEstimatesItem 
{
    public List<CampaignPlanningAdGroupAudienceSize> AdgroupAudienceSizes { get; set; }
    public float ConversionRate { get; set; }
    public List<CampaignPlanningConversionRate> ConversionRates { get; set; }
    public List<CampaignPlanningCurveEstimate> Curves { get; set; }
    public CampaignDeliveryEstimatesDerivedMetrics DerivedMetrics { get; set; }
    public List<CampaignPlanningResponseError> Errors { get; set; }
    public string EstimateId { get; set; }
    public int MaxPotentialSpend { get; set; }
}


