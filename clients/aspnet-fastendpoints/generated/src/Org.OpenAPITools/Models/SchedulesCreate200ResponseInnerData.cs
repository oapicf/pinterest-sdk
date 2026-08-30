namespace Org.OpenAPITools.Models;


/// <summary>
/// Created/updated resource on success or error details on failure
/// </summary>
public class SchedulesCreate200ResponseInnerData 
{
    public ScheduleDeltaValue DeltaValue { get; set; }
    public int EndTimestamp { get; set; }
    public string EntityId { get; set; }
    
    public AdAccountEntityType EntityType { get; set; }
    public string Name { get; set; }
    
    public ScheduleAction ScheduleAction { get; set; }
    public string ScheduleId { get; set; }
    
    public ScheduleStatus ScheduleStatus { get; set; }
    
    public ScheduleType ScheduleType { get; set; }
    public int StartTimestamp { get; set; }
    public string Id { get; set; }
    public PinterestLibError Exceptions { get; set; }
}


