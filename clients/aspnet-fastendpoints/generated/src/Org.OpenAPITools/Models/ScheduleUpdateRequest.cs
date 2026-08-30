namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class ScheduleUpdateRequest 
{
    public string EntityId { get; set; }
    public string EntityType { get; set; }
    public string Id { get; set; }
    public ScheduleCommonDeltaValue DeltaValue { get; set; }
    public int EndTimestamp { get; set; }
    public string Name { get; set; }
    
    public ScheduleAction ScheduleAction { get; set; }
    
    public ScheduleStatus ScheduleStatus { get; set; }
    
    public ScheduleType ScheduleType { get; set; }
    public int StartTimestamp { get; set; }
}


