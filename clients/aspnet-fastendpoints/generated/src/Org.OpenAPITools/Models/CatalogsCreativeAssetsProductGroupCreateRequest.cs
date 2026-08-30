namespace Org.OpenAPITools.Models;


/// <summary>
/// Request object for creating a creative assets product group.
/// </summary>
public class CatalogsCreativeAssetsProductGroupCreateRequest 
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
    public string Description { get; set; }
    public CatalogsCreativeAssetsProductGroupFilters Filters { get; set; }
    public string Name { get; set; }
}


