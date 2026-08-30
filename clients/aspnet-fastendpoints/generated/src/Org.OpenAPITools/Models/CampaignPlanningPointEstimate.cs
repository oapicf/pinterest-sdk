namespace Org.OpenAPITools.Models;


/// <summary>
/// A JSON object that represents a single estimation point. An estimation point contains the expected budget used and the estimated result, Y, along with an expected range based for the budget.
/// </summary>
public class CampaignPlanningPointEstimate 
{
    public int Budget { get; set; }
    public double DoubleY { get; set; }
    public int MaxY { get; set; }
    public int MinY { get; set; }
    public int Y { get; set; }
}


