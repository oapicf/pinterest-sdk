namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class CancelInviteResult 
{
    public string Id { get; set; }
    public InviteDataResponse InviteData { get; set; }
    public bool IsReceivedInvite { get; set; }
    public CancelInviteResultUser User { get; set; }
}


