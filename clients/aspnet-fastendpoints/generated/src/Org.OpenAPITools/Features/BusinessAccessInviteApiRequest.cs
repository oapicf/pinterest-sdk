
using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Features;


public class AssetAccessRequestsCreateRequest
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
    public CreateAssetAccessRequestBody createAssetAccessRequestBody { get; set; }
}
public class CancelInvitesOrRequestsRequest
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
    public CancelInvitesRequest cancelInvitesRequest { get; set; }
}
public class CreateAssetInvitesRequest
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
    public CreateAssetInvitesRequest createAssetInvitesRequest { get; set; }
}
public class CreateMembershipOrPartnershipInvitesRequest
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
    public CreateMembershipOrPartnershipInvitesBody createMembershipOrPartnershipInvitesBody { get; set; }
}
public class GetInvitesRequest
{
    /// <summary>
    /// Unique identifier of the requesting business.
    /// </summary>
    [FastEndpoints.BindFrom("business_id")]
    public string BusinessId { get; set; }
    /// <summary>
    /// A boolean field to indicate whether the invite is to create a partnership or a membership.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("is_member")]
    public bool? IsMember { get; set; }
    /// <summary>
    /// A list of invite statuses to filter invites by. Only invites whose status is in the provided statuses will be returned.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("invite_status")]
    public List<InviteFilterStatus>? InviteStatus { get; set; }
    /// <summary>
    /// Invite type to filter invites by. Only invites of the specified type will be returned.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("invite_type")]
    public InviteType InviteType { get; set; }
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
public class RespondBusinessAccessInvitesRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.FromBody]
    public AuthRespondInvitesBody authRespondInvitesBody { get; set; }
}


