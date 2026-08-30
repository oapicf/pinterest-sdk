namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class CustomerSegment 
{
    public string AdAccountId { get; set; }
    public List<string> AudienceIds { get; set; }
    public int CreatedTime { get; set; }
    public string Id { get; set; }
    public string Name { get; set; }
    
    public TargetingTemplateStatus Status { get; set; }
    public int UpdatedTime { get; set; }
}


