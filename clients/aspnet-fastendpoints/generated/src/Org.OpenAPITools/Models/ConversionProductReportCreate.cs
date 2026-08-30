namespace Org.OpenAPITools.Models;


/// <summary>
/// Resource create operation model.
/// </summary>
public class ConversionProductReportCreate 
{
    public List<string> AdGroupIds { get; set; }
    public List<string> CampaignIds { get; set; }
    public List<ConversionObjectiveType> CampaignObjectiveTypes { get; set; }
    
    public ConversionAttributionWindowDays ClickWindowDays { get; set; }
    public List<ConversionProductReportingColumn> Columns { get; set; }
    
    public ConversionProductAttributionType ConversionProductAttributionType { get; set; }
    
    public ConversionProductReportBreakdownType ConversionProductBreakdown { get; set; }
    
    public ConversionReportTimeType ConversionReportTime { get; set; }
    public string EndDate { get; set; }
    
    public ConversionProductReportGranularity Granularity { get; set; }
    
    public ConversionProductReportLevel Level { get; set; }
    public List<string> ProductSkuIds { get; set; }
    public string ReportName { get; set; }
    public string StartDate { get; set; }
    
    public ConversionAttributionWindowDays ViewWindowDays { get; set; }
}


