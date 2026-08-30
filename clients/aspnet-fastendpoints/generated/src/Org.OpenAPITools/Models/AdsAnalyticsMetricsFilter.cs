namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class AdsAnalyticsMetricsFilter 
{
    
    public AdsAnalyticsFilterColumn Field { get; set; }
    
    public AdsAnalyticsFilterOperator Operator { get; set; }
    public List<decimal> Values { get; set; }
}


