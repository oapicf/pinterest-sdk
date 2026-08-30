namespace Org.OpenAPITools.Models;


/// <summary>
/// The terminated asset access.
/// </summary>
public class DeletePartnerAssetAccessResult 
{
    public string AssetId { get; set; }
    public string AssetType { get; set; }
    public bool IsSharedPartner { get; set; }
    public string PartnerId { get; set; }
    public List<string> Permissions { get; set; }
}


