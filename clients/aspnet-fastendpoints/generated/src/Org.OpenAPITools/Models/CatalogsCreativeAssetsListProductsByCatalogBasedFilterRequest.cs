namespace Org.OpenAPITools.Models;


/// <summary>
/// Request object to list products for a given creative assets catalog_id and product group filter.
/// </summary>
public class CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest 
{
    public string CatalogId { get; set; }
    
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
    public CatalogsCreativeAssetsProductGroupFilters Filters { get; set; }
}


