namespace Org.OpenAPITools.Models;


/// <summary>
/// Trending shopping product category
/// </summary>
public class TrendingProductCategory 
{
    
    public ProductCategoriesEngagementType EngagementType { get; set; }
    public int PctChangeMom { get; set; }
    public int PercentRelativeVolume { get; set; }
    public int PinterestProductCategoryId { get; set; }
    public string ProductCategory { get; set; }
    public List<string> Verticals { get; set; }
}


