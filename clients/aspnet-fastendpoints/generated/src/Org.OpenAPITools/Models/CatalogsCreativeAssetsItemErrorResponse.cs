namespace Org.OpenAPITools.Models;


/// <summary>
/// Object describing a creative assets item error
/// </summary>
public class CatalogsCreativeAssetsItemErrorResponse 
{
    
    /// <summary>
    /// Gets or Sets CatalogType
    /// </summary>
    public enum CatalogTypeEnum
    {
        
        /// <summary>
        /// Enum CREATIVEASSETSEnum for CREATIVE_ASSETS
        /// </summary>
        CREATIVEASSETSEnum = 1
    }

    public CatalogTypeEnum CatalogType { get; set; }
    public string CreativeAssetsId { get; set; }
    public List<ItemValidationEvent> Errors { get; set; }
    
    /// <summary>
    /// Discriminator literal identifying this leaf inside an `ItemResponse` payload.
    /// </summary>
    /// <value>Discriminator literal identifying this leaf inside an `ItemResponse` payload.</value>
    public enum ItemResponseKindEnum
    {
        
        /// <summary>
        /// Enum CreativeAssetsItemErrorEnum for creative_assets_item_error
        /// </summary>
        CreativeAssetsItemErrorEnum = 1
    }

    public ItemResponseKindEnum ItemResponseKind { get; set; }
}


