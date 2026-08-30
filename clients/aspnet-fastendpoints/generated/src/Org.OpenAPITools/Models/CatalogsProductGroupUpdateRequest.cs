namespace Org.OpenAPITools.Models;


/// <summary>
/// Request object for updating a product group.
/// </summary>
public class CatalogsProductGroupUpdateRequest 
{
    public string Description { get; set; }
    public CatalogsProductGroupFiltersRequest Filters { get; set; }
    public bool IsFeatured { get; set; }
    public string Name { get; set; }
}


