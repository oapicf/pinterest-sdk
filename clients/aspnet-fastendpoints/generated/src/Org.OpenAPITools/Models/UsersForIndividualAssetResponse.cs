namespace Org.OpenAPITools.Models;


/// <summary>
/// An object containing the permissions a business member has on the asset.
/// </summary>
public class UsersForIndividualAssetResponse 
{
    public string AssetId { get; set; }
    public string MemberId { get; set; }
    public List<string> Permissions { get; set; }
}


