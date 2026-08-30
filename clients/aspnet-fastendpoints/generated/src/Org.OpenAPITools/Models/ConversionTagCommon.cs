namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class ConversionTagCommon 
{
    public string CodeSnippet { get; set; }
    public ConversionTagConfigs Configs { get; set; }
    
    public EnhancedMatchStatusType? EnhancedMatchStatus { get; set; }
    public string Id { get; set; }
    public decimal LastFiredTimeMs { get; set; }
    public string Name { get; set; }
    public string VarVersion { get; set; }
}


