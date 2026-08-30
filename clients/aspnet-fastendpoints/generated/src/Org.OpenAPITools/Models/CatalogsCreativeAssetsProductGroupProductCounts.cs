namespace Org.OpenAPITools.Models;


/// <summary>
/// Product counts for a Creative Assets CatalogsProductGroup
/// </summary>
public class CatalogsCreativeAssetsProductGroupProductCounts 
{
    public decimal AppLinks { get; set; }
    
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
    public decimal Images { get; set; }
    public decimal Total { get; set; }
    public decimal Videos { get; set; }
}


