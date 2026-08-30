namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class CatalogsCreativeAssetsItemsPostFilter 
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
    public List<string> CreativeAssetsIds { get; set; }
}


