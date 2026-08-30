namespace Org.OpenAPITools.Models;


/// <summary>
/// Object describing a hotel record
/// </summary>
public class CatalogsHotelItemResponse 
{
    public CatalogsHotelAttributes Attributes { get; set; }
    
    /// <summary>
    /// Gets or Sets CatalogType
    /// </summary>
    public enum CatalogTypeEnum
    {
        
        /// <summary>
        /// Enum HOTELEnum for HOTEL
        /// </summary>
        HOTELEnum = 1
    }

    public CatalogTypeEnum CatalogType { get; set; }
    public string HotelId { get; set; }
    
    /// <summary>
    /// Discriminator literal identifying this leaf inside an `ItemResponse` payload.
    /// </summary>
    /// <value>Discriminator literal identifying this leaf inside an `ItemResponse` payload.</value>
    public enum ItemResponseKindEnum
    {
        
        /// <summary>
        /// Enum HotelItemEnum for hotel_item
        /// </summary>
        HotelItemEnum = 1
    }

    public ItemResponseKindEnum ItemResponseKind { get; set; }
    public List<Pin> Pins { get; set; }
}


