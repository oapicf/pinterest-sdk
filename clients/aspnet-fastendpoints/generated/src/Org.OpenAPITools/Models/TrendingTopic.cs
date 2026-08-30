namespace Org.OpenAPITools.Models;


/// <summary>
/// Individual trending topic within an interest category
/// </summary>
public class TrendingTopic 
{
    public string Description { get; set; }
    public string Id { get; set; }
    public int PercentGrowthMom { get; set; }
    public List<TrendingPin> Pins { get; set; }
    public List<string> RelatedInterests { get; set; }
    public List<string> RelatedSearches { get; set; }
    public Dictionary<string, decimal> TimeSeries { get; set; }
    public string Title { get; set; }
}


