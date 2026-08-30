namespace Org.OpenAPITools.Models;


/// <summary>
/// Request object for updating a creative assets product group.
/// </summary>
public class CatalogsCreativeAssetsProductGroupUpdateRequest 
{
    
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


