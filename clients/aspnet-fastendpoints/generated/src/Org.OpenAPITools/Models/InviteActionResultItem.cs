namespace Org.OpenAPITools.Models;


/// <summary>
/// An item representing the result of an invite/request action. Contains either an exception (on error) or an invite binding (on success).
/// </summary>
public class InviteActionResultItem 
{
    public InviteExceptionResponse Exception { get; set; }
    public InviteBusinessRoleBinding Invite { get; set; }
}


