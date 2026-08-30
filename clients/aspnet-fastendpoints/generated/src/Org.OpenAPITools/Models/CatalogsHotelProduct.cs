namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class CatalogsHotelProduct 
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
    public CatalogsHotelProductMetadata Metadata { get; set; }
    public Pin Pin { get; set; }
}


