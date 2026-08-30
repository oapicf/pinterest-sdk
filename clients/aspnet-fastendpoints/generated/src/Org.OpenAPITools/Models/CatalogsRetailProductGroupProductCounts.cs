namespace Org.OpenAPITools.Models;


/// <summary>
/// Product counts for a Retail CatalogsProductGroup
/// </summary>
public class CatalogsRetailProductGroupProductCounts 
{
    
    /// <summary>
    /// Gets or Sets CatalogType
    /// </summary>
    public enum CatalogTypeEnum
    {
        
        /// <summary>
        /// Enum RETAILEnum for RETAIL
        /// </summary>
        RETAILEnum = 1
    }

    public CatalogTypeEnum CatalogType { get; set; }
    public decimal InStock { get; set; }
    public decimal OutOfStock { get; set; }
    public decimal Preorder { get; set; }
    public decimal Total { get; set; }
    public decimal Videos { get; set; }
}


