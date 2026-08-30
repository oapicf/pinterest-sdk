namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class ConversionProductReport 
{
    public string Message { get; set; }
    
    public BulkReportingJobStatus ReportStatus { get; set; }
    public decimal Size { get; set; }
    public string Token { get; set; }
    public string Url { get; set; }
}


