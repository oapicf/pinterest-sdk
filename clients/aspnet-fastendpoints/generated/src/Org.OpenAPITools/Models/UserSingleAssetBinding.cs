namespace Org.OpenAPITools.Models;


/// <summary>
/// An object containing the permissions a business member/partner has on the asset.
/// </summary>
public class UserSingleAssetBinding 
{
    public List<string> Permissions { get; set; }
    public BusinessAccessUserSummary User { get; set; }
}


