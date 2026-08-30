namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class BusinessAssets 
{
    public AssetGroupBinding AssetGroupInfo { get; set; }
    public string AssetId { get; set; }
    
    public AssetTypeResponse AssetType { get; set; }
    public List<string> Permissions { get; set; }
    public CatalogBinding CatalogInfo { get; set; }
}


