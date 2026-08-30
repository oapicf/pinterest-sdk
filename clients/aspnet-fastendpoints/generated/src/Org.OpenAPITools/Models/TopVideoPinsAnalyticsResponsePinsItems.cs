namespace Org.OpenAPITools.Models;


/// <summary>
/// Array with metrics, status, and pin id for the requested metric
/// </summary>
public class TopVideoPinsAnalyticsResponsePinsItems 
{
    public Dictionary<string, DataStatus> DataStatus { get; set; }
    public Dictionary<string, decimal> Metrics { get; set; }
    public string PinId { get; set; }
}


