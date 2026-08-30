namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class CatalogsReportDistributionStats 
{
    public string CatalogId { get; set; }
    public int Code { get; set; }
    public string CodeLabel { get; set; }
    public bool IneligibleForAds { get; set; }
    public bool IneligibleForOrganic { get; set; }
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
}


