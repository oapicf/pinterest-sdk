namespace Org.OpenAPITools.Models;


/// <summary>
/// A creative assets item to be updated.
/// </summary>
public class CatalogsUpdateCreativeAssetsItem 
{
    public CatalogsUpdatableCreativeAssetsAttributes Attributes { get; set; }
    public string CreativeAssetsId { get; set; }
    
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
}


