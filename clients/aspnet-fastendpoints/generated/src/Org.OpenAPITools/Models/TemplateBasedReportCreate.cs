namespace Org.OpenAPITools.Models;


/// <summary>
/// Resource create operation model.
/// </summary>
public class TemplateBasedReportCreate 
{
    public string Message { get; set; }
    
    public BulkReportingJobStatus ReportStatus { get; set; }
    public string Token { get; set; }
}


