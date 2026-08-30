namespace Org.OpenAPITools.Models;


/// <summary>
/// Product category details
/// </summary>
public class ProductCategoryDetails 
{
    public ProductCategoriesDemographic Demographics { get; set; }
    public bool HasPrediction { get; set; }
    public ProductCategoriesMetricsHighlights MetricsHighlights { get; set; }
    public Dictionary<string, decimal> PredictedTimeSeries { get; set; }
    
    public ProductCategoryEnum ProductCategory { get; set; }
    public List<string> RelatedSearches { get; set; }
    public Dictionary<string, decimal> TimeSeries { get; set; }
}


