namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class AnalyticsMetricsResponse 
{
    public List<AnalyticsDailyMetrics> DailyMetrics { get; set; }
    public Dictionary<string, decimal> SummaryMetrics { get; set; }
}


