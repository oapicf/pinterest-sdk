namespace Org.OpenAPITools.Models;


/// <summary>
/// Object describing the schedule level bid level changes.
/// </summary>
public class ScheduleBidOptions 
{
    public ScheduleAgeBucketMultipliers AgeBucketMultipliers { get; set; }
    public ScheduleAppTypeMultipliers AppTypeMultipliers { get; set; }
    public ScheduleAudienceMultipliers AudienceMultipliers { get; set; }
    public ScheduleBidOptionsGenderMultipliers GenderMultipliers { get; set; }
    public ScheduleBidOptionsPlacementMultipliers PlacementMultipliers { get; set; }
}


