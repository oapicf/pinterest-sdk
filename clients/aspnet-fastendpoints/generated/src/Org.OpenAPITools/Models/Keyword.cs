namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class Keyword 
{
    public bool Archived { get; set; }
    public int Bid { get; set; }
    public string Id { get; set; }
    
    public MatchType? MatchType { get; set; }
    public string ParentId { get; set; }
    public string ParentType { get; set; }
    public string Type { get; set; }
    public string Value { get; set; }
}


