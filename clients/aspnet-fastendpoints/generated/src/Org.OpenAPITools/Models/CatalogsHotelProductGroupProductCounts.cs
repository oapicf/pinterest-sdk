namespace Org.OpenAPITools.Models;


/// <summary>
/// Product counts for a Hotel CatalogsProductGroup
/// </summary>
public class CatalogsHotelProductGroupProductCounts 
{
    
    /// <summary>
    /// Gets or Sets CatalogType
    /// </summary>
    public enum CatalogTypeEnum
    {
        
        /// <summary>
        /// Enum HOTELEnum for HOTEL
        /// </summary>
        HOTELEnum = 1
    }

    public CatalogTypeEnum CatalogType { get; set; }
    public decimal Total { get; set; }
}


