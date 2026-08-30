namespace Org.OpenAPITools.Models;


/// <summary>
/// Result model for local inventory operation
/// </summary>
public class LocalInventoryOperationResult 
{
    public List<SupplementalItemValidationEvent> Errors { get; set; }
    public string ItemId { get; set; }
    
    public SupplementalItemProcessingStatus Status { get; set; }
    public string StoreCode { get; set; }
    
    /// <summary>
    /// Gets or Sets SupplementalType
    /// </summary>
    public enum SupplementalTypeEnum
    {
        
        /// <summary>
        /// Enum LOCALINVENTORYEnum for LOCAL_INVENTORY
        /// </summary>
        LOCALINVENTORYEnum = 1
    }

    public SupplementalTypeEnum SupplementalType { get; set; }
    public List<SupplementalItemValidationEvent> Warnings { get; set; }
}


