namespace Org.OpenAPITools.Models;


/// <summary>
/// An item to be created
/// </summary>
public class CatalogsCreateRetailItem 
{
    public ItemAttributesRequest Attributes { get; set; }
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
}


