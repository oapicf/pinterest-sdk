namespace Org.OpenAPITools.Models;


/// <summary>
/// Diagnostics aggregated numbers
/// </summary>
public class CatalogsReportStats 
{
    public string CatalogId { get; set; }
    public int Code { get; set; }
    public string CodeLabel { get; set; }
    public string Message { get; set; }
    public int Occurrences { get; set; }
    
    /// <summary>
    /// Gets or Sets ReportType
    /// </summary>
    public enum ReportTypeEnum
    {
        
        /// <summary>
        /// Enum DISTRIBUTIONISSUESEnum for DISTRIBUTION_ISSUES
        /// </summary>
        DISTRIBUTIONISSUESEnum = 1
    }

    public ReportTypeEnum ReportType { get; set; }
    
    /// <summary>
    /// An ERROR means that items have been dropped, while a WARN denotes that items have been ingested despite an issue
    /// </summary>
    /// <value>An ERROR means that items have been dropped, while a WARN denotes that items have been ingested despite an issue</value>
    public enum SeverityEnum
    {
        
        /// <summary>
        /// Enum WARNEnum for WARN
        /// </summary>
        WARNEnum = 1,
        
        /// <summary>
        /// Enum ERROREnum for ERROR
        /// </summary>
        ERROREnum = 2
    }

    public SeverityEnum Severity { get; set; }
    public bool IneligibleForAds { get; set; }
    public bool IneligibleForOrganic { get; set; }
}


