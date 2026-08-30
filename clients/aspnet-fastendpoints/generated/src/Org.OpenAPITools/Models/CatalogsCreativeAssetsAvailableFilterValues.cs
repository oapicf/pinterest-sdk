namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class CatalogsCreativeAssetsAvailableFilterValues 
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
    public CatalogsCreativeAssetsFilterValuesMap FilterValues { get; set; }
}


