namespace Org.OpenAPITools.Models;


/// <summary>
/// Object describing a creative assets item record
/// </summary>
public class CatalogsCreativeAssetsItemResponse 
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
    public string CreativeAssetsId { get; set; }
    
    /// <summary>
    /// Discriminator literal identifying this leaf inside an `ItemResponse` payload.
    /// </summary>
    /// <value>Discriminator literal identifying this leaf inside an `ItemResponse` payload.</value>
    public enum ItemResponseKindEnum
    {
        
        /// <summary>
        /// Enum CreativeAssetsItemEnum for creative_assets_item
        /// </summary>
        CreativeAssetsItemEnum = 1
    }

    public ItemResponseKindEnum ItemResponseKind { get; set; }
    public List<Pin> Pins { get; set; }
}


