namespace Org.OpenAPITools.Models;


/// <summary>
/// A point estimation containing the estimate data and estimation type for a budget recommendation.
/// </summary>
public class CampaignPlanningBudgetRecommendationPoint 
{
    
    public CampaignPlanningEstimationType EstimationType { get; set; }
    public CampaignPlanningPointEstimate PointEstimate { get; set; }
}


