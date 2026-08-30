namespace Org.OpenAPITools.Models;


/// <summary>
/// Object holding available filter values for each filter key
/// </summary>
public class CatalogsAvailableFilterValues 
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


