namespace Org.OpenAPITools.Models;


/// <summary>
/// A creative assets item to be created.
/// </summary>
public class CatalogsCreateCreativeAssetsItem 
{
    public CatalogsCreativeAssetsAttributes Attributes { get; set; }
    public string CreativeAssetsId { get; set; }
    
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


