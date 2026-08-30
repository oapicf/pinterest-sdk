namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class CatalogsRetailAvailableFilterValues 
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
    public CatalogsRetailFilterValuesMap FilterValues { get; set; }
}


