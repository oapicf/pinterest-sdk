namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class AssetGroupModification 
{
    public List<AssetGroupUpdateError> Exceptions { get; set; }
    public List<AssetGroupBinding> UpdatedAssetGroups { get; set; }
}


