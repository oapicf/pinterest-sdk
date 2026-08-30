namespace Org.OpenAPITools.Models;


/// <summary>
/// An object containing the permissions a business member has on the asset.
/// </summary>
public class AssetIdPermissions 
{
    public AssetGroupBinding AssetGroupInfo { get; set; }
    public string AssetId { get; set; }
    
    public AssetTypeResponse AssetType { get; set; }
    public List<string> Permissions { get; set; }
}


