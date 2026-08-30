namespace Org.OpenAPITools.Models;


/// <summary>
/// Resource create operation model.
/// </summary>
public class ScheduleCreate 
{
    public ScheduleDeltaValue DeltaValue { get; set; }
    public int EndTimestamp { get; set; }
    public string EntityId { get; set; }
    
    public AdAccountEntityType EntityType { get; set; }
    public string Name { get; set; }
    
    public ScheduleAction ScheduleAction { get; set; }
    
    public ScheduleStatus ScheduleStatus { get; set; }
    
    public ScheduleType ScheduleType { get; set; }
    public int StartTimestamp { get; set; }
}


