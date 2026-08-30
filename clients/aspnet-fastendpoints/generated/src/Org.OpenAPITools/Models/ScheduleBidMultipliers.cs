namespace Org.OpenAPITools.Models;


/// <summary>
/// The value of the bid changes. This must be provided when the schedule type is CAMPAIGN_BID_MULTIPLIERS.
/// </summary>
public class ScheduleBidMultipliers 
{
    public BidOptionsAgeBucketMultipliers AgeBucketMultipliers { get; set; }
    public BidOptionsAppTypeMultipliers AppTypeMultipliers { get; set; }
    public List<BidOptionsAudienceMultipliers> AudienceMultipliers { get; set; }
    public BidOptionsGenderMultipliers GenderMultipliers { get; set; }
    public BidOptionsPlacementMultipliers PlacementMultipliers { get; set; }
}


