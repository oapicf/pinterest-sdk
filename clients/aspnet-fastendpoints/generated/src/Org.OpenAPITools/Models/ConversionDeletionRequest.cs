namespace Org.OpenAPITools.Models;


/// <summary>
/// Conversion deletion request
/// </summary>
public class ConversionDeletionRequest 
{
    public DateTime CreatedTime { get; set; }
    public DateTime ProcessedTime { get; set; }
    public string RequestId { get; set; }
    
    public ConversionDeletionRequestStatus Status { get; set; }
}


