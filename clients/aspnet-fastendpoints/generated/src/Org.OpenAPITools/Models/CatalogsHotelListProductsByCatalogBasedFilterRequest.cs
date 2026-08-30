namespace Org.OpenAPITools.Models;


/// <summary>
/// Request object to list products for a given hotel catalog_id and product group filter.
/// </summary>
public class CatalogsHotelListProductsByCatalogBasedFilterRequest 
{
    public string CatalogId { get; set; }
    
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
    public CatalogsHotelProductGroupFilters Filters { get; set; }
}


