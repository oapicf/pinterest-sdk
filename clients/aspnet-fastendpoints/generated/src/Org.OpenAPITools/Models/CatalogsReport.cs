namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class CatalogsReport 
{
    
    /// <summary>
    /// Gets or Sets ReportStatus
    /// </summary>
    public enum ReportStatusEnum
    {
        
        /// <summary>
        /// Enum FINISHEDEnum for FINISHED
        /// </summary>
        FINISHEDEnum = 1,
        
        /// <summary>
        /// Enum INPROGRESSEnum for IN_PROGRESS
        /// </summary>
        INPROGRESSEnum = 2
    }

    public ReportStatusEnum ReportStatus { get; set; }
    public decimal Size { get; set; }
    public string Url { get; set; }
}


