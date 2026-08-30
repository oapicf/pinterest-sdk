namespace Org.OpenAPITools.Models;


/// <summary>
/// Body to be used on path to send Members or Partners Invite or Request
/// </summary>
public class CreateMembershipOrPartnershipInvitesBody 
{
    
    public BusinessRoleForInvite BusinessRole { get; set; }
    
    public InviteType InviteType { get; set; }
    public List<string> Members { get; set; }
    public List<string> Partners { get; set; }
}


