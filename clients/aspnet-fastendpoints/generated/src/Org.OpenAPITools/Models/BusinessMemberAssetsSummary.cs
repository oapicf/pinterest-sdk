namespace Org.OpenAPITools.Models;


/// <summary>
/// Ad accounts and profiles the business member/partner has access to.
/// </summary>
public class BusinessMemberAssetsSummary 
{
    public List<AssetIdWithPermissions> AdAccounts { get; set; }
    public List<AssetIdWithPermissions> Profiles { get; set; }
}


