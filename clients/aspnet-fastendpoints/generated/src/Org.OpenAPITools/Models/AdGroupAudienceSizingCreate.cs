namespace Org.OpenAPITools.Models;


/// <summary>
/// Resource create operation model.
/// </summary>
public class AdGroupAudienceSizingCreate 
{
    public bool AutoTargetingEnabled { get; set; } = true;
    public List<AdGroupAudienceSizingCreativeTypes> CreativeTypes { get; set; }
    public List<AdGroupAudienceSizingKeyword> Keywords { get; set; }
    
    public AdgroupPlacementGroupType PlacementGroup { get; set; }
    public List<string> ProductGroupIds { get; set; }
    public TargetingSpecOptimal TargetingSpec { get; set; }
}


