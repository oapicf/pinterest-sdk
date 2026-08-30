namespace Org.OpenAPITools.Models;


/// <summary>
/// Object describing a hotel item error
/// </summary>
public class CatalogsHotelItemErrorResponse 
{
    
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
    public List<ItemValidationEvent> Errors { get; set; }
    public string HotelId { get; set; }
    
    /// <summary>
    /// Discriminator literal identifying this leaf inside an `ItemResponse` payload.
    /// </summary>
    /// <value>Discriminator literal identifying this leaf inside an `ItemResponse` payload.</value>
    public enum ItemResponseKindEnum
    {
        
        /// <summary>
        /// Enum HotelItemErrorEnum for hotel_item_error
        /// </summary>
        HotelItemErrorEnum = 1
    }

    public ItemResponseKindEnum ItemResponseKind { get; set; }
}


