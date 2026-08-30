namespace Org.OpenAPITools.Models;


/// <summary>
/// Request object for updating a hotel product group.
/// </summary>
public class CatalogsHotelProductGroupUpdateRequest 
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
    public string Description { get; set; }
    public CatalogsHotelProductGroupFilters Filters { get; set; }
    public string Name { get; set; }
}


