namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class PriceFilterPrice 
{
    
    public NonNullableCatalogsCurrency Currency { get; set; }
    public bool Negated { get; set; }
    
    public NumericFilterOperatorType Operator { get; set; }
    public decimal Value { get; set; }
}


