namespace Org.OpenAPITools.Models;


/// <summary>
/// An item to be updated
/// </summary>
public class CatalogsUpdateRetailItem 
{
    public UpdatableItemAttributes Attributes { get; set; }
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
    public List<UpdateMaskFieldType> UpdateMask { get; set; }
}


