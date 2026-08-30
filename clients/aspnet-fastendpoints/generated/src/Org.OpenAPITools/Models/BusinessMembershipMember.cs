namespace Org.OpenAPITools.Models;


/// <summary>
/// A business member identified by &#x60;member_id&#x60; with their &#x60;business_role&#x60; in the business.
/// </summary>
public class BusinessMembershipMember 
{
    
    public BusinessRoleForMembers BusinessRole { get; set; }
    public string MemberId { get; set; }
}


