namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class AnalyticsDailyMetrics 
{
    
    public DataStatus DataStatus { get; set; }
    public string Date { get; set; }
    public Dictionary<string, decimal> Metrics { get; set; }
}


