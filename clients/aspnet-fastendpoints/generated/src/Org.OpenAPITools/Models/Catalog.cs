namespace Org.OpenAPITools.Models;


/// <summary>
/// Catalog entity
/// </summary>
public class Catalog 
{
    
    public CatalogsType CatalogType { get; set; }
    public DateTime CreatedAt { get; set; }
    public string Id { get; set; }
    public string Name { get; set; }
    public DateTime UpdatedAt { get; set; }
}


