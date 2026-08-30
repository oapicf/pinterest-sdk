namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class LocalInventoryOperation 
{
    public RetailLocalInventoryItemAttributes Attributes { get; set; }
    public string ItemId { get; set; }
    
    /// <summary>
    /// Gets or Sets Operation
    /// </summary>
    public enum OperationEnum
    {
        
        /// <summary>
        /// Enum DELETEEnum for DELETE
        /// </summary>
        DELETEEnum = 1
    }

    public OperationEnum Operation { get; set; }
    public string StoreCode { get; set; }
}


