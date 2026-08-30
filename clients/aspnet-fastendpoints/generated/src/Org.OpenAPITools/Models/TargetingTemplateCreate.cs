namespace Org.OpenAPITools.Models;


/// <summary>
/// Resource create operation model.
/// </summary>
public class TargetingTemplateCreate 
{
    public bool AutoTargetingEnabled { get; set; } = true;
    public List<TargetingTemplateKeyword> Keywords { get; set; }
    public string Name { get; set; }
    
    public PlacementGroupType PlacementGroup { get; set; }
    public TargetingSpecOptimal TargetingAttributes { get; set; }
    public TrackingUrls TrackingUrls { get; set; }
}


