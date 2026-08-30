namespace Org.OpenAPITools.Models;


/// <summary>
/// Featured trending topics for a specific interest and market
/// </summary>
public class FeaturedTrend 
{
    
    public InterestsEnum Interest { get; set; }
    
    public ProductCategoryRegion Market { get; set; }
    public List<TrendingTopic> Trends { get; set; }
}


