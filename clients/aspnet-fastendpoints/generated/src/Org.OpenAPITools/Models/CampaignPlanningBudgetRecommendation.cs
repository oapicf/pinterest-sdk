namespace Org.OpenAPITools.Models;


/// <summary>
/// Budget recommendation response containing recommended budget, estimated days, and point estimations.
/// </summary>
public class CampaignPlanningBudgetRecommendation 
{
    public int BudgetRecommendation { get; set; }
    public List<CampaignPlanningExperimentBudgetRecommendation> ExperimentCampaignBudgetRecommendation { get; set; }
    public int LifetimeDaysRecommendation { get; set; }
    public List<CampaignPlanningBudgetRecommendationPoint> PointEstimations { get; set; }
}


