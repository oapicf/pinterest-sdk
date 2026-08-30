namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class TopVideoPinsAnalyticsResponse 
{
    public TopVideoPinsAnalyticsResponseDateAvailability DateAvailability { get; set; }
    public List<TopVideoPinsAnalyticsResponsePinsItems> Pins { get; set; }
    
    public TopVideoPinsSortBy SortBy { get; set; }
}


