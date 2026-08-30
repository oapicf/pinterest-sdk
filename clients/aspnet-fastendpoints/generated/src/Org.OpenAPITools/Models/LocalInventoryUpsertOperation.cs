namespace Org.OpenAPITools.Models;


/// <summary>
/// Upsert operation for local inventory item
/// </summary>
public class LocalInventoryUpsertOperation 
{
    public RetailLocalInventoryItemAttributes Attributes { get; set; }
    public string ItemId { get; set; }
    
    /// <summary>
    /// Gets or Sets Operation
    /// </summary>
    public enum OperationEnum
    {
        
        /// <summary>
        /// Enum UPSERTEnum for UPSERT
        /// </summary>
        UPSERTEnum = 1
    }

    public OperationEnum Operation { get; set; }
    public string StoreCode { get; set; }
}


