namespace Org.OpenAPITools.Models;


/// <summary>
/// An item to be upserted
/// </summary>
public class CatalogsUpsertRetailItem 
{
    public ItemAttributesRequest Attributes { get; set; }
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
}


