namespace Org.OpenAPITools.Models;


/// <summary>
/// Object describing an item record or error. Discriminated by &#x60;item_response_kind&#x60; (one unique value per leaf).
/// </summary>
public class ItemResponse 
{
    public CatalogsCreativeAssetsAttributes Attributes { get; set; }
    
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
    public string ItemId { get; set; }
    
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
    public List<Pin> Pins { get; set; }
    public string HotelId { get; set; }
    public string CreativeAssetsId { get; set; }
    public List<ItemValidationEvent> Errors { get; set; }
}


