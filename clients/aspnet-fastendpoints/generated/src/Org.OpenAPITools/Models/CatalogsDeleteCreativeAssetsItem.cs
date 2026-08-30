namespace Org.OpenAPITools.Models;


/// <summary>
/// A creative assets item to be deleted
/// </summary>
public class CatalogsDeleteCreativeAssetsItem 
{
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


