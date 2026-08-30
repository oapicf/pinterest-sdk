namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class BulkUpsertRequestCreateCatalogProductGroupsItems 
{
    public string Description { get; set; }
    public string FeedId { get; set; }
    public CatalogsProductGroupFiltersRequest Filters { get; set; }
    public bool IsFeatured { get; set; }
    public string Name { get; set; }
}


