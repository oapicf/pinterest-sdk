namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class AudienceCategory 
{
    public string Id { get; set; }
    public decimal Index { get; set; }
    public string Key { get; set; }
    public string Name { get; set; }
    public decimal Ratio { get; set; }
    public List<AudienceSubcategory> Subcategories { get; set; }
}


