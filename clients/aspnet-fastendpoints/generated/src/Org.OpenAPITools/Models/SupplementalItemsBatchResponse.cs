namespace Org.OpenAPITools.Models;


/// <summary>
/// Response model for supplemental items batch operation
/// </summary>
public class SupplementalItemsBatchResponse 
{
    public string BatchId { get; set; }
    public DateTime CompletedTime { get; set; }
    public DateTime CreatedTime { get; set; }
    public List<SupplementalOperationResult> OperationResults { get; set; }
    
    public SupplementalItemBatchOperationStatus Status { get; set; }
}


