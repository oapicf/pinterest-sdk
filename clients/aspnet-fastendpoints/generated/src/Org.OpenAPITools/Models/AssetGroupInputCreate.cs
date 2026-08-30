namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class AssetGroupInputCreate 
{
    public AssetGroupBinding AssetGroup { get; set; }
    public string AssetGroupDescription { get; set; }
    public string AssetGroupName { get; set; }
    public List<AssetGroupType> AssetGroupTypes { get; set; }
}


