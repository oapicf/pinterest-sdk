namespace Org.OpenAPITools.Models;


/// <summary>
/// Campaign configuration for delivery estimates.
/// </summary>
public class CampaignDeliveryEstimatesCampaign 
{
    public List<AdGroupDeliveryEstimates> AdGroups { get; set; }
    
    public BudgetDurationType BudgetDurationType { get; set; }
    public int DailySpendCap { get; set; }
    public string EndDate { get; set; }
    public int LifetimeSpendCap { get; set; }
    
    public DeliveryEstimateObjectiveType ObjectiveType { get; set; }
    public string StartDate { get; set; }
}


