namespace Org.OpenAPITools.Models;


/// <summary>
/// An invite object if the invite/request was successfully updated. Will only be provided if the an invite/request is successfully updated.
/// </summary>
public class InviteBusinessRoleBinding 
{
    public string CreatedByBusinessId { get; set; }
    public string CreatedByUserId { get; set; }
    public string Id { get; set; }
    public InviteDataResponse InviteData { get; set; }
    public bool IsReceivedInvite { get; set; }
    public BusinessAccessUserSummary User { get; set; }
}


