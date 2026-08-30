namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class CatalogsRetailReportParametersReport 
{
    public string FeedId { get; set; }
    public string ProcessingResultId { get; set; }
    
    /// <summary>
    /// Gets or Sets ReportType
    /// </summary>
    public enum ReportTypeEnum
    {
        
        /// <summary>
        /// Enum ALLITEMSEnum for ALL_ITEMS
        /// </summary>
        ALLITEMSEnum = 1
    }

    public ReportTypeEnum ReportType { get; set; }
    public string CatalogId { get; set; }
    public string ProductGroupId { get; set; }
}


