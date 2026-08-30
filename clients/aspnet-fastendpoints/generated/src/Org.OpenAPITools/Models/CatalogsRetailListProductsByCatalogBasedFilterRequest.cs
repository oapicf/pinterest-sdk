namespace Org.OpenAPITools.Models;


/// <summary>
/// Request object to list products for a given retail catalog_id and product group filter.
/// </summary>
public class CatalogsRetailListProductsByCatalogBasedFilterRequest 
{
    public string CatalogId { get; set; }
    
    /// <summary>
    /// Retail catalog based product group is available only for selected partners at the moment. If you are not eligible, please use feed based one.
    /// </summary>
    /// <value>Retail catalog based product group is available only for selected partners at the moment. If you are not eligible, please use feed based one.</value>
    public enum CatalogTypeEnum
    {
        
        /// <summary>
        /// Enum RETAILEnum for RETAIL
        /// </summary>
        RETAILEnum = 1
    }

    public CatalogTypeEnum CatalogType { get; set; }
    
    public Country Country { get; set; }
    public CatalogsProductGroupFilters Filters { get; set; }
    
    public CatalogsLocale Locale { get; set; }
}


