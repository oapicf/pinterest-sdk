namespace Org.OpenAPITools.Models;


/// <summary>
/// Attribution windows for a conversion event.
/// </summary>
public class CampaignPlanningConversionAttribution 
{
    
    public CampaignPlanningConversionAttributionWindowDays ClickWindowDays { get; set; }
    
    public CampaignPlanningConversionAttributionWindowDays EngagementWindowDays { get; set; }
    
    public CampaignPlanningConversionAttributionWindowDays ViewWindowDays { get; set; }
}


