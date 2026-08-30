namespace Org.OpenAPITools.Models;


/// <summary>
/// Request object for updating a retail product group.
/// </summary>
public class CatalogsRetailProductGroupUpdateRequest 
{
    
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
    public string Description { get; set; }
    public CatalogsProductGroupFiltersRequest Filters { get; set; }
    
    public CatalogsLocale Locale { get; set; }
    public string Name { get; set; }
}


