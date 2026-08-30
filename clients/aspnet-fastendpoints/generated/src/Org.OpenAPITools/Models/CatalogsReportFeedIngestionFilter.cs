namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class CatalogsReportFeedIngestionFilter 
{
    public string FeedId { get; set; }
    public string ProcessingResultId { get; set; }
    
    /// <summary>
    /// Gets or Sets ReportType
    /// </summary>
    public enum ReportTypeEnum
    {
        
        /// <summary>
        /// Enum FEEDINGESTIONISSUESEnum for FEED_INGESTION_ISSUES
        /// </summary>
        FEEDINGESTIONISSUESEnum = 1
    }

    public ReportTypeEnum ReportType { get; set; }
}


