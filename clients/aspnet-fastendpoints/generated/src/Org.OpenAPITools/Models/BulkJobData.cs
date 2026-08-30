namespace Org.OpenAPITools.Models;


/// <summary>
/// Bulk request result data.
/// </summary>
public class BulkJobData 
{
    public string ResultUrl { get; set; }
    
    public BulkRequestStatus Status { get; set; }
    public int WorkloadId { get; set; }
}


