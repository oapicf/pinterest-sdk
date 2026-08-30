namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class CreateAssetAccessRequestItem 
{
    public Dictionary<string, List<Permissions>> AssetIdToPermissions { get; set; }
    public string PartnerId { get; set; }
}


