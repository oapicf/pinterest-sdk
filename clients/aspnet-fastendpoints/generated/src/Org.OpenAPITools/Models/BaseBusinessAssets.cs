namespace Org.OpenAPITools.Models;


/// <summary>
/// An object containing the permissions a business has on the asset.
/// </summary>
public class BaseBusinessAssets 
{
    public AssetGroupBinding AssetGroupInfo { get; set; }
    public string AssetId { get; set; }
    
    public AssetTypeResponse AssetType { get; set; }
    public List<string> Permissions { get; set; }
}


