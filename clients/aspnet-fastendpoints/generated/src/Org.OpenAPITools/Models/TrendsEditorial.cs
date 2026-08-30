namespace Org.OpenAPITools.Models;


/// <summary>
/// Information of the published editorial article.
/// </summary>
public class TrendsEditorial 
{
    public string BoardUrl { get; set; }
    public string Description { get; set; }
    public List<string> Interests { get; set; }
    public List<string> PinsUrl { get; set; }
    public List<KeywordInfo> RelatedKeywords { get; set; }
    public string Title { get; set; }
}


