namespace Org.OpenAPITools.Models;


/// <summary>
/// An item to be deleted
/// </summary>
public class CatalogsDeleteRetailItem 
{
    public string ItemId { get; set; }
    public long LastUpdatedTime { get; set; }
    
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


