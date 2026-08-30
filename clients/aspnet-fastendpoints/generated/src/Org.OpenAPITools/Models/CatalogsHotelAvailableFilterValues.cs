namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class CatalogsHotelAvailableFilterValues 
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
    public CatalogsHotelFilterValuesMap FilterValues { get; set; }
}


