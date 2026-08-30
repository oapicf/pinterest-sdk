namespace Org.OpenAPITools.Models;


/// <summary>
/// Experimental budget recommendation for a single experiment version.
/// </summary>
public class CampaignPlanningExperimentBudgetRecommendation 
{
    public int BudgetRecommendation { get; set; }
    public int LifetimeDaysRecommendation { get; set; }
    public List<CampaignPlanningBudgetRecommendationPoint> PointEstimations { get; set; }
    public string VersionId { get; set; }
}


