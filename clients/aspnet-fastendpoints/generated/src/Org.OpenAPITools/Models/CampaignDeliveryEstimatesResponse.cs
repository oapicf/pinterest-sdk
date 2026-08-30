namespace Org.OpenAPITools.Models;


/// <summary>
/// Delivery estimates response for a campaign.
/// </summary>
public class CampaignDeliveryEstimatesResponse 
{
    public List<CampaignPlanningCurveEstimate> Curves { get; set; }
    public CampaignDeliveryEstimatesDerivedMetrics DerivedMetrics { get; set; }
    public int MaxPotentialSpend { get; set; }
}


