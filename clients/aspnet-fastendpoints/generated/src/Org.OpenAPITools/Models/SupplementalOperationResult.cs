namespace Org.OpenAPITools.Models;


/// <summary>
/// Result of a supplemental item operation, discriminated by supplemental_type
/// </summary>
public class SupplementalOperationResult 
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


