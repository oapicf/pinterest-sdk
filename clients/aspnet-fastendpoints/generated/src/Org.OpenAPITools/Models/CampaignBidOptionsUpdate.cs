namespace Org.OpenAPITools.Models;


/// <summary>
/// Object describing an update to the campaign level bid multipliers.
/// </summary>
public class CampaignBidOptionsUpdate 
{
    public AgeBucketMultipliers AgeBucketMultipliers { get; set; }
    public AppTypeMultipliers AppTypeMultipliers { get; set; }
    public CampaignAudienceMultipliers AudienceMultipliers { get; set; }
    
    public FreqBidMultiplierTimeWindow? FreqBidMultiplierTimeWindow { get; set; }
    public FrequencyMultipliers FrequencyMultipliers { get; set; }
    public GenderMultipliers GenderMultipliers { get; set; }
    public PlacementMultipliers PlacementMultipliers { get; set; }
    public List<CampaignBidOptionsUpdateMaskItems> UpdateMask { get; set; }
}


