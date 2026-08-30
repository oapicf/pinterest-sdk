namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class CatalogsHotelReportParametersReport 
{
    public string FeedId { get; set; }
    public string ProcessingResultId { get; set; }
    
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
    public string CatalogId { get; set; }
}


