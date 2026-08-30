namespace Org.OpenAPITools.Models;


/// <summary>
/// Update operation for local inventory item
/// </summary>
public class LocalInventoryUpdateOperation 
{
    public RetailLocalInventoryItemAttributesOptional Attributes { get; set; }
    public string ItemId { get; set; }
    
    /// <summary>
    /// Gets or Sets Operation
    /// </summary>
    public enum OperationEnum
    {
        
        /// <summary>
        /// Enum UPDATEEnum for UPDATE
        /// </summary>
        UPDATEEnum = 1
    }

    public OperationEnum Operation { get; set; }
    public string StoreCode { get; set; }
}


