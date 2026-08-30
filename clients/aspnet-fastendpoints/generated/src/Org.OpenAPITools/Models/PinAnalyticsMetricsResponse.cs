namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class PinAnalyticsMetricsResponse 
{
    public List<PinAnalyticsDailyMetrics> DailyMetrics { get; set; }
    public Dictionary<string, int> LifetimeMetrics { get; set; }
    public Dictionary<string, decimal> SummaryMetrics { get; set; }
}


