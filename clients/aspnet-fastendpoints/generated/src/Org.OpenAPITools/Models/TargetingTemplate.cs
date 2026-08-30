namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class TargetingTemplate 
{
    public string AdAccountId { get; set; }
    public bool AutoTargetingEnabled { get; set; } = true;
    public int CreatedTime { get; set; }
    public string Id { get; set; }
    public List<TargetingTemplateKeyword> Keywords { get; set; }
    public string Name { get; set; }
    
    public PlacementGroupType PlacementGroup { get; set; }
    public TargetingTemplateAudienceSizing Sizing { get; set; }
    
    public TargetingTemplateStatus Status { get; set; }
    public TargetingSpecOptimal TargetingAttributes { get; set; }
    public TrackingUrls TrackingUrls { get; set; }
    public int UpdatedTime { get; set; }
    public bool Valid { get; set; }
}


