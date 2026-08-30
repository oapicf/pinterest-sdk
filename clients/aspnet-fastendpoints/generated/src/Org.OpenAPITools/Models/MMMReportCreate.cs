namespace Org.OpenAPITools.Models;


/// <summary>
/// Resource create operation model.
/// </summary>
public class MMMReportCreate 
{
    public List<string> AdvertiserIds { get; set; }
    public List<MMMReportingColumn> Columns { get; set; }
    public List<TargetingAdvertiserCountry> Countries { get; set; }
    public List<string> CustomColumnIds { get; set; }
    public string EndDate { get; set; }
    
    public MMMReportGranularity Granularity { get; set; }
    
    public MMMReportLevel Level { get; set; }
    public string ReportName { get; set; }
    public string StartDate { get; set; }
    public List<MMMReportingTargetingType> TargetingTypes { get; set; }
}


