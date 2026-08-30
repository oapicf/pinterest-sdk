namespace Org.OpenAPITools.Models;


/// <summary>
/// Product counts for a CatalogsProductGroup
/// </summary>
public class CatalogsProductGroupProductCountsVertical 
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
    public decimal InStock { get; set; }
    public decimal OutOfStock { get; set; }
    public decimal Preorder { get; set; }
    public decimal Total { get; set; }
    public decimal Videos { get; set; }
    public decimal AppLinks { get; set; }
    public decimal Images { get; set; }
}


