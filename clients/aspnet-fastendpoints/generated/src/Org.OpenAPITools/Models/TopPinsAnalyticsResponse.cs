namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class TopPinsAnalyticsResponse 
{
    public TopPinsAnalyticsResponseDateAvailability DateAvailability { get; set; }
    public List<TopPinsAnalyticsResponsePinsItems> Pins { get; set; }
    
    public TopPinsSortBy SortBy { get; set; }
}


