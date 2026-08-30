namespace Org.OpenAPITools.Models;


/// <summary>
/// Common invite/request data returned by the business access endpoints.
/// </summary>
public class BaseInviteDataResponse 
{
    public string Id { get; set; }
    public InviteDataResponse InviteData { get; set; }
    public bool IsReceivedInvite { get; set; }
    public BusinessAccessUserSummary User { get; set; }
}


