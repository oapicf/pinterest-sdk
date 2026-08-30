namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class CatalogsHotelProductGroup 
{
    public string CatalogId { get; set; }
    
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
    public int CreatedAt { get; set; }
    public string Description { get; set; }
    public CatalogsHotelProductGroupFilters Filters { get; set; }
    public string Id { get; set; }
    public string Name { get; set; }
    
    public CatalogsHotelProductGroupType Type { get; set; }
    public int UpdatedAt { get; set; }
}


