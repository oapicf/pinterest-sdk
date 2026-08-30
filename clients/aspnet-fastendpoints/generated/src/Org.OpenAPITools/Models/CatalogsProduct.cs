namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class CatalogsProduct 
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
    public CatalogsCreativeAssetsProductMetadata Metadata { get; set; }
    public Pin Pin { get; set; }
}


