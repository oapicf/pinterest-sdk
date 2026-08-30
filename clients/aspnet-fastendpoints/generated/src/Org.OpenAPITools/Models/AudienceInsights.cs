namespace Org.OpenAPITools.Models;


/// <summary>
/// Audience interests and demographics.
/// </summary>
public class AudienceInsights 
{
    public List<AudienceCategory> Categories { get; set; }
    public string Date { get; set; }
    public AudienceDemographics Demographics { get; set; }
    public int Size { get; set; }
    public bool SizeIsUpperBound { get; set; }
    
    public AudienceInsightType Type { get; set; }
}


