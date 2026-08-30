namespace Org.OpenAPITools.Models;


/// <summary>
/// Object describing a retail item record
/// </summary>
public class CatalogsRetailItemResponse 
{
    public ItemAttributes Attributes { get; set; }
    
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
    public string ItemId { get; set; }
    
    /// <summary>
    /// Discriminator literal identifying this leaf inside an `ItemResponse` payload.
    /// </summary>
    /// <value>Discriminator literal identifying this leaf inside an `ItemResponse` payload.</value>
    public enum ItemResponseKindEnum
    {
        
        /// <summary>
        /// Enum RetailItemEnum for retail_item
        /// </summary>
        RetailItemEnum = 1
    }

    public ItemResponseKindEnum ItemResponseKind { get; set; }
    public List<Pin> Pins { get; set; }
}


