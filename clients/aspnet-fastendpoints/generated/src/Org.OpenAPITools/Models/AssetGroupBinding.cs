namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class AssetGroupBinding 
{
    public List<string> AdAccountsIds { get; set; }
    public string AssetGroupDescription { get; set; }
    public string AssetGroupName { get; set; }
    public List<string> AssetGroupTypes { get; set; }
    public List<string> CatalogsIds { get; set; }
    public BusinessAccessUserSummary CreatedBy { get; set; }
    public int CreatedTime { get; set; }
    public string Id { get; set; }
    public BusinessAccessUserSummary Owner { get; set; }
    public List<string> ProfilesIds { get; set; }
    public int UpdatedTime { get; set; }
}


