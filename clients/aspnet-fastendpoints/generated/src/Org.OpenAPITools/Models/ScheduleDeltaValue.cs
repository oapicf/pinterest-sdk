namespace Org.OpenAPITools.Models;


/// <summary>
/// The value of the scheduled adjustment.
/// </summary>
public class ScheduleDeltaValue 
{
    public BidOptionsAgeBucketMultipliers AgeBucketMultipliers { get; set; }
    public BidOptionsAppTypeMultipliers AppTypeMultipliers { get; set; }
    public List<BidOptionsAudienceMultipliers> AudienceMultipliers { get; set; }
    public BidOptionsGenderMultipliers GenderMultipliers { get; set; }
    public BidOptionsPlacementMultipliers PlacementMultipliers { get; set; }
}


