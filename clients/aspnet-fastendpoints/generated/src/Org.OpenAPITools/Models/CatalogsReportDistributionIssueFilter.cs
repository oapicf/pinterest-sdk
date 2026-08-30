namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class CatalogsReportDistributionIssueFilter 
{
    public string CatalogId { get; set; }
    
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
}


