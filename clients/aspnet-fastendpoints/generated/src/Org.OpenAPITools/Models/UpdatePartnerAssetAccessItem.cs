namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class UpdatePartnerAssetAccessItem 
{
    public string AssetId { get; set; }
    public string PartnerId { get; set; }
    public List<Permissions> Permissions { get; set; }
}


