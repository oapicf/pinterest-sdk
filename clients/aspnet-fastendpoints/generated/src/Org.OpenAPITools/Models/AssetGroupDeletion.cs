namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class AssetGroupDeletion 
{
    public List<string> DeletedAssetGroups { get; set; }
    public List<AssetGroupDeleteError> Exceptions { get; set; }
}


