namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class AssetGroupModificationReadOrUpdate 
{
    public List<AssetGroupUpdateItemReadOrUpdateItem> AssetGroupsToUpdate { get; set; }
    public List<AssetGroupUpdateError> Exceptions { get; set; }
    public List<AssetGroupBinding> UpdatedAssetGroups { get; set; }
}


