namespace Org.OpenAPITools.Models;


/// <summary>
/// Creative assets batch item
/// </summary>
public class CatalogsCreativeAssetsBatchItem 
{
    public CatalogsUpdatableCreativeAssetsAttributes Attributes { get; set; }
    public string CreativeAssetsId { get; set; }
    
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
}


