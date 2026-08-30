namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class AccountTemplate 
{
    public string AdAccountId { get; set; }
    public List<string> AdAccountIds { get; set; }
    public List<string> AdeColumns { get; set; }
    public Object AttributionType { get; set; }
    public decimal ClickWindowDays { get; set; }
    public List<ReportingColumn> Columns { get; set; }
    
    public ConversionReportTimeType ConversionReportTimeType { get; set; }
    
    public CreationSource CreationSource { get; set; }
    public List<string> CustomColumnIds { get; set; }
    public string DisplayMetadata { get; set; }
    public decimal EngagementWindowDays { get; set; }
    public string FiltersJson { get; set; }
    
    public Granularity Granularity { get; set; }
    public string Id { get; set; }
    public List<IngestionSource> IngestionSources { get; set; }
    public bool IsDefault { get; set; }
    public bool IsDeleted { get; set; }
    public bool IsOwnedByUser { get; set; }
    public bool IsScheduled { get; set; }
    public string Name { get; set; }
    public decimal ReportEndRelativeDaysInPast { get; set; }
    
    public DataOutputFormat ReportFormat { get; set; }
    
    public MetricsReportingLevel ReportLevel { get; set; }
    public decimal ReportStartRelativeDaysInPast { get; set; }
    
    public ReportingTimeZone ReportingTimeZone { get; set; }
    public Object SortBy { get; set; }
    public string Type { get; set; }
    public decimal UpdatedTime { get; set; }
    public string UserId { get; set; }
    public decimal ViewWindowDays { get; set; }
}


