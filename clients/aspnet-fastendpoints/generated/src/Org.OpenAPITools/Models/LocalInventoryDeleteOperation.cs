namespace Org.OpenAPITools.Models;


/// <summary>
/// Delete operation for local inventory item
/// </summary>
public class LocalInventoryDeleteOperation 
{
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


