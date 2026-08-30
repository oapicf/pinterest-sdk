namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class AssetGroupUpdateItemReadOrUpdateItem 
{
    public string AssetGroupId { get; set; }
    public List<AssetGroupType> AssetGroupTypes { get; set; }
    public List<string> AssetsToAdd { get; set; }
    public List<string> AssetsToRemove { get; set; }
    public string Description { get; set; }
    public string Name { get; set; }
}


