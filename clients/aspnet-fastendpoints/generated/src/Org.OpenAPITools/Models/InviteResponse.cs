namespace Org.OpenAPITools.Models;


/// <summary>
/// A user&#39;s username or email OR a partner id that caused the error.
/// </summary>
public class InviteResponse 
{
    public InviteAssetsSummary AssetsSummary { get; set; }
    public List<string> BusinessRoles { get; set; }
    public BusinessAccessUserSummary CreatedByBusiness { get; set; }
    public BusinessAccessUserSummary CreatedByUser { get; set; }
    public int CreatedTime { get; set; }
    public string Id { get; set; }
    public InviteDataResponse InviteData { get; set; }
    public bool IsReceivedInvite { get; set; }
    public BusinessAccessUserSummary User { get; set; }
}


