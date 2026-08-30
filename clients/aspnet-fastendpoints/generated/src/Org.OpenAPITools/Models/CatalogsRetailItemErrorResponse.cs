namespace Org.OpenAPITools.Models;


/// <summary>
/// Object describing a retail item error
/// </summary>
public class CatalogsRetailItemErrorResponse 
{
    
    /// <summary>
    /// Gets or Sets CatalogType
    /// </summary>
    public enum CatalogTypeEnum
    {
        
        /// <summary>
        /// Enum RETAILEnum for RETAIL
        /// </summary>
        RETAILEnum = 1
    }

    public CatalogTypeEnum CatalogType { get; set; }
    public List<ItemValidationEvent> Errors { get; set; }
    public string ItemId { get; set; }
    
    /// <summary>
    /// Discriminator literal identifying this leaf inside an `ItemResponse` payload.
    /// </summary>
    /// <value>Discriminator literal identifying this leaf inside an `ItemResponse` payload.</value>
    public enum ItemResponseKindEnum
    {
        
        /// <summary>
        /// Enum RetailItemErrorEnum for retail_item_error
        /// </summary>
        RetailItemErrorEnum = 1
    }

    public ItemResponseKindEnum ItemResponseKind { get; set; }
}


