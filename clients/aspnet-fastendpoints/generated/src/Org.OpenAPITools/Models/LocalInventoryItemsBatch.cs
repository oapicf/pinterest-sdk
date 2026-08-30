namespace Org.OpenAPITools.Models;


/// <summary>
/// Unified model for local inventory items batch operation
/// </summary>
public class LocalInventoryItemsBatch 
{
    public string BatchId { get; set; }
    public DateTime CompletedTime { get; set; }
    public DateTime CreatedTime { get; set; }
    public List<SupplementalOperationResult> OperationResults { get; set; }
    
    public SupplementalItemBatchOperationStatus Status { get; set; }
}


