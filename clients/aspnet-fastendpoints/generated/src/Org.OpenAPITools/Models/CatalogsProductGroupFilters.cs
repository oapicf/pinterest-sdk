namespace Org.OpenAPITools.Models;


/// <summary>
/// Object holding a group of filters for a catalog product group
/// </summary>
public class CatalogsProductGroupFilters 
{
    public List<CatalogsProductGroupFilterKeys> AnyOf { get; set; }
    public List<CatalogsProductGroupFilterKeys> AllOf { get; set; }
}


