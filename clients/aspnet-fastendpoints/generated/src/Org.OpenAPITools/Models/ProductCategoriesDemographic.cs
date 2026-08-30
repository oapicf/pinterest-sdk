namespace Org.OpenAPITools.Models;


/// <summary>
/// Age and gender distribution who engaged with this product category in the past 3 months
/// </summary>
public class ProductCategoriesDemographic 
{
    public Dictionary<string, decimal> Age { get; set; }
    public GenderDemographics Gender { get; set; }
}


