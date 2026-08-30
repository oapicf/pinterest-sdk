namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class TemplateBasedReport 
{
    public string Message { get; set; }
    
    public BulkReportingJobStatus ReportStatus { get; set; }
    public string TemplateId { get; set; }
    public string Token { get; set; }
}


