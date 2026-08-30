namespace Org.OpenAPITools.Models;


/// <summary>
/// A currency filter. This filter cannot be negated
/// </summary>
public class CatalogsProductGroupCurrencyCriteria 
{
    public bool Negated { get; set; }
    
    public NonNullableCatalogsCurrency Values { get; set; }
}


