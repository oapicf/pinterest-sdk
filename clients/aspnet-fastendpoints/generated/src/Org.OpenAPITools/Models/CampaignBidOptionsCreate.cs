namespace Org.OpenAPITools.Models;


/// <summary>
/// Object describing the campaign level bid multipliers for create operations.
/// </summary>
public class CampaignBidOptionsCreate 
{
    public AgeBucketMultipliers AgeBucketMultipliers { get; set; }
    public AppTypeMultipliers AppTypeMultipliers { get; set; }
    public CampaignAudienceMultipliers AudienceMultipliers { get; set; }
    
    public FreqBidMultiplierTimeWindow? FreqBidMultiplierTimeWindow { get; set; }
    public FrequencyMultipliers FrequencyMultipliers { get; set; }
    public GenderMultipliers GenderMultipliers { get; set; }
    public PlacementMultipliers PlacementMultipliers { get; set; }
}


