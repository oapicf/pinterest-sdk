namespace Org.OpenAPITools.Models;


/// <summary>
/// Object holding a group of filters for a hotel product group
/// </summary>
public class CatalogsHotelProductGroupFilters 
{
    public List<CatalogsHotelProductGroupFilterKeys> AnyOf { get; set; }
    public List<CatalogsHotelProductGroupFilterKeys> AllOf { get; set; }
}


