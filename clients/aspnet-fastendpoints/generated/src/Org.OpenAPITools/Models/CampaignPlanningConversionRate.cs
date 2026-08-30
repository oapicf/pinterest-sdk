namespace Org.OpenAPITools.Models;


/// <summary>
/// Conversion rate estimate for a specific conversion event and attribution window combination.
/// </summary>
public class CampaignPlanningConversionRate 
{
    public CampaignPlanningConversionAttribution AttributionWindows { get; set; }
    
    public CampaignPlanningConversionEvent ConversionEvent { get; set; }
    public float ConversionRate { get; set; }
}


