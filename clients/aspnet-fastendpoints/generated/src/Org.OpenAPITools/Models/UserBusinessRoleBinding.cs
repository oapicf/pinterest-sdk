namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class UserBusinessRoleBinding 
{
    public BusinessMemberAssetsSummary AssetsSummary { get; set; }
    public List<string> BusinessRoles { get; set; }
    public BusinessAccessUserSummary CreatedByBusiness { get; set; }
    public BusinessAccessUserSummary CreatedByUser { get; set; }
    public int CreatedTime { get; set; }
    public string Id { get; set; }
    public bool IsSharedPartner { get; set; }
    public BusinessAccessUserSummary User { get; set; }
}


