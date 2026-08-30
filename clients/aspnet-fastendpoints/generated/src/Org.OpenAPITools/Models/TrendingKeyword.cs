namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class TrendingKeyword 
{
    public TrendingKeywordDemographics Demographics { get; set; }
    public bool HasPrediction { get; set; }
    public string Keyword { get; set; }
    public int PctGrowthMom { get; set; }
    public int PctGrowthWow { get; set; }
    public int PctGrowthYoy { get; set; }
    public PredictedTimeSeries PredictedTimeSeries { get; set; }
    public TimeSeries TimeSeries { get; set; }
}


