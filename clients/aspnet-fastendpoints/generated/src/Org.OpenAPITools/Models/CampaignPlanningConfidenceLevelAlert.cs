namespace Org.OpenAPITools.Models;


/// <summary>
/// A confidence level alert for the delivery estimates provided in the response.
/// </summary>
public class CampaignPlanningConfidenceLevelAlert 
{
    public string Description { get; set; }
    
    public CampaignPlanningConfidenceLevelAlertReason Reason { get; set; }
    
    public CampaignPlanningConfidenceLevelAlertSeverity Severity { get; set; }
}


