namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class UpdateMemberAssetAccessItem 
{
    public string AssetId { get; set; }
    public string MemberId { get; set; }
    public List<Permissions> Permissions { get; set; }
}


