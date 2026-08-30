namespace Org.OpenAPITools.Models;


/// <summary>
/// An object containing the permissions a business partner has on the asset.
/// </summary>
public class UpdatePartnerAssetsResult 
{
    public string AssetId { get; set; }
    
    public AssetTypeResponse AssetType { get; set; }
    public string PartnerId { get; set; }
    public List<string> Permissions { get; set; }
}


