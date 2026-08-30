namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class CatalogsRetailBatchRequestItemsItems 
{
    public ItemAttributesRequest Attributes { get; set; }
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
    public List<UpdateMaskFieldType> UpdateMask { get; set; }
    public long LastUpdatedTime { get; set; }
}


