namespace Org.OpenAPITools.Models;


/// <summary>
/// Create operation for local inventory item
/// </summary>
public class LocalInventoryCreateOperation 
{
    public RetailLocalInventoryItemAttributes Attributes { get; set; }
    public string ItemId { get; set; }
    
    /// <summary>
    /// Gets or Sets Operation
    /// </summary>
    public enum OperationEnum
    {
        
        /// <summary>
        /// Enum CREATEEnum for CREATE
        /// </summary>
        CREATEEnum = 1
    }

    public OperationEnum Operation { get; set; }
    public string StoreCode { get; set; }
}


