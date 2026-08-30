namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class CatalogsRetailProductGroup 
{
    public string CatalogId { get; set; }
    
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
    public string Country { get; set; }
    public int CreatedAt { get; set; }
    public string Description { get; set; }
    public string FeedId { get; set; }
    public CatalogsProductGroupFilters Filters { get; set; }
    public string Id { get; set; }
    public bool IsFeatured { get; set; }
    public string Locale { get; set; }
    public string Name { get; set; }
    
    public CatalogsProductGroupStatus Status { get; set; }
    
    public CatalogsProductGroupType Type { get; set; }
    public int UpdatedAt { get; set; }
}


