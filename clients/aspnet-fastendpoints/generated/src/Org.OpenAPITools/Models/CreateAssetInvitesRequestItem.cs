namespace Org.OpenAPITools.Models;


/// <summary>
/// Object declaring an asset role update to an invite.
/// </summary>
public class CreateAssetInvitesRequestItem 
{
    public Dictionary<string, List<Permissions>> AssetIdToPermissions { get; set; }
    public string InviteId { get; set; }
    
    public InviteType InviteType { get; set; }
}


