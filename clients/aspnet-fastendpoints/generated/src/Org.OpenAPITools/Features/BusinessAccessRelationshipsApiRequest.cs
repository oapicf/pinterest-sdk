
using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Features;


public class BrandAccountsCreateRequest
{
    /// <summary>
    /// business hierarchy node id
    /// </summary>
    [FastEndpoints.BindFrom("business_hierarchy_id")]
    public string BusinessHierarchyId { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.FromBody]
    public BrandAccountCreate brandAccountCreate { get; set; }
}
public class BrandAccountsUpdateRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("brand_account_id")]
    public string BrandAccountId { get; set; }
    /// <summary>
    /// business hierarchy node id
    /// </summary>
    [FastEndpoints.BindFrom("business_hierarchy_id")]
    public string BusinessHierarchyId { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.FromBody]
    public BrandAccountUpdate brandAccountUpdate { get; set; }
}
public class DeleteBusinessMembershipRequest
{
    /// <summary>
    /// Business id
    /// </summary>
    [FastEndpoints.BindFrom("business_id")]
    public string BusinessId { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.FromBody]
    public DeleteBusinessMembershipBody deleteBusinessMembershipBody { get; set; }
}
public class DeleteBusinessPartnersRequest
{
    /// <summary>
    /// Unique identifier of the requesting business.
    /// </summary>
    [FastEndpoints.BindFrom("business_id")]
    public string BusinessId { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.FromBody]
    public DeleteBusinessPartnersDelete deleteBusinessPartnersDelete { get; set; }
}
public class GetBusinessEmployersRequest
{
    /// <summary>
    /// Include assets summary in the response if this is true. Defaults to true.  The assets summary returns a dictionary representing a summary of the assets for the business user ID, with information like the ad accounts and profiles the user has permissions for and what those permissions are
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("assets_summary")]
    public bool? AssetsSummary { get; set; }
    /// <summary>
    /// Cursor used to fetch the next page of items
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("bookmark")]
    public string? Bookmark { get; set; }
    /// <summary>
    /// Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("page_size")]
    public int? PageSize { get; set; }
}
public class GetBusinessMembersRequest
{
    /// <summary>
    /// Unique identifier of the requesting business.
    /// </summary>
    [FastEndpoints.BindFrom("business_id")]
    public string BusinessId { get; set; }
    /// <summary>
    /// Fetches system users if True. Fetches regular user employees if False.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("fetch_system_users")]
    public bool? FetchSystemUsers { get; set; }
    /// <summary>
    /// Include assets summary in the response if this is true.  The assets summary returns a dictionary representing a summary of the assets for the business user ID, with information like the ad accounts and profiles the user has permissions for and what those permissions are
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("assets_summary")]
    public bool? AssetsSummary { get; set; }
    /// <summary>
    /// A list of business roles to filter the members by. Only members whose roles are in the specified roles will be returned.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("business_roles")]
    public List<MemberBusinessRole>? BusinessRoles { get; set; }
    /// <summary>
    /// A list of business members ids separated by comma.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("member_ids")]
    public string? MemberIds { get; set; }
    /// <summary>
    /// An index to start fetching the results from. Only the results starting from this index will be returned.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("start_index")]
    public int? StartIndex { get; set; }
    /// <summary>
    /// Cursor used to fetch the next page of items
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("bookmark")]
    public string? Bookmark { get; set; }
    /// <summary>
    /// Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("page_size")]
    public int? PageSize { get; set; }
}
public class GetBusinessPartnersRequest
{
    /// <summary>
    /// Unique identifier of the requesting business.
    /// </summary>
    [FastEndpoints.BindFrom("business_id")]
    public string BusinessId { get; set; }
    /// <summary>
    /// Include assets summary in the response if this is true.  The assets summary returns a dictionary representing a summary of the assets for the business user ID, with information like the ad accounts and profiles the user has permissions for and what those permissions are
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("assets_summary")]
    public bool? AssetsSummary { get; set; }
    /// <summary>
    /// Specifies whether to fetch internal or external (shared) partners. If partner_type&#x3D;INTERNAL, the asset being queried is for accesses the partner has to your business assets. If partner_type&#x3D;EXTERNAL, the asset being queried is for the accesses you have to the partner&#39;s business asset.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("partner_type")]
    public PartnerType PartnerType { get; set; }
    /// <summary>
    /// A list of business partner ids separated by commas used to filter the results. Only partners with the specified ids will be returned.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("partner_ids")]
    public string? PartnerIds { get; set; }
    /// <summary>
    /// An index to start fetching the results from. Only the results starting from this index will be returned.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("start_index")]
    public int? StartIndex { get; set; }
    /// <summary>
    /// Sort ascending.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("sort_ascending")]
    public bool? SortAscending { get; set; }
    /// <summary>
    /// Cursor used to fetch the next page of items
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("bookmark")]
    public string? Bookmark { get; set; }
    /// <summary>
    /// Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("page_size")]
    public int? PageSize { get; set; }
}
public class SystemUserUpdateRequest
{
    /// <summary>
    /// Unique identifier of the requesting business.
    /// </summary>
    [FastEndpoints.BindFrom("business_id")]
    public string BusinessId { get; set; }
    /// <summary>
    /// Unique identifier of a system user.
    /// </summary>
    [FastEndpoints.BindFrom("system_user_id")]
    public string SystemUserId { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.FromBody]
    public SystemUserUpdateWithRequiredBody systemUserUpdateWithRequiredBody { get; set; }
}
public class UpdateBusinessMembershipsRequest
{
    /// <summary>
    /// Business id
    /// </summary>
    [FastEndpoints.BindFrom("business_id")]
    public string BusinessId { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.FromBody]
    public List<BusinessMembershipMember> businessMembershipMember { get; set; }
}


