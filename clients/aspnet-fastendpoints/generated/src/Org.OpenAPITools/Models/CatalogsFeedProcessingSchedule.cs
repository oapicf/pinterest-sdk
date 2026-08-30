namespace Org.OpenAPITools.Models;


/// <summary>
/// Daily processing schedule. This field is **OPTIONAL**. Use this to configure the preferred time for processing a feed (otherwise random).
/// </summary>
public class CatalogsFeedProcessingSchedule 
{
    public string Time { get; set; }
    
    public CatalogsFeedProcessingScheduleTimezone? Timezone { get; set; }
}


