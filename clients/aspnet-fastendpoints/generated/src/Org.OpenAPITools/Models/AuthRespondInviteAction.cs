namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class AuthRespondInviteAction 
{
    public bool AcceptInvite { get; set; }
    public Dictionary<string, List<Permissions>> AssetIdToPermissions { get; set; }
}


