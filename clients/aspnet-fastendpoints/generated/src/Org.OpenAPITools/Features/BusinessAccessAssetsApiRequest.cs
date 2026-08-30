
using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Features;


public class AssetGroupCreateRequest
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
    public AssetGroupInputCreate assetGroupInputCreate { get; set; }
}
public class AssetGroupDeleteRequest
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
    public AssetGroupDeletionDelete assetGroupDeletionDelete { get; set; }
}
public class AssetGroupUpdateRequest
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
    public AssetGroupModificationReadOrUpdate assetGroupModificationReadOrUpdate { get; set; }
}
public class BusinessAssetMembersGetRequest
{
    /// <summary>
    /// Unique identifier of the requesting business.
    /// </summary>
    [FastEndpoints.BindFrom("business_id")]
    public string BusinessId { get; set; }
    /// <summary>
    /// Unique identifier of a business asset.
    /// </summary>
    [FastEndpoints.BindFrom("asset_id")]
    public string AssetId { get; set; }
    /// <summary>
    /// An index to start fetching the results from. Only the results starting from this index will be returned.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("start_index")]
    public int? StartIndex { get; set; }
    /// <summary>
    /// Fetches system users if True. Fetches regular user employees if False.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("fetch_system_users")]
    public bool? FetchSystemUsers { get; set; }
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
public class BusinessAssetPartnersGetRequest
{
    /// <summary>
    /// Unique identifier of the requesting business.
    /// </summary>
    [FastEndpoints.BindFrom("business_id")]
    public string BusinessId { get; set; }
    /// <summary>
    /// Unique identifier of a business asset.
    /// </summary>
    [FastEndpoints.BindFrom("asset_id")]
    public string AssetId { get; set; }
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
public class BusinessAssetsGetRequest
{
    /// <summary>
    /// Unique identifier of the requesting business.
    /// </summary>
    [FastEndpoints.BindFrom("business_id")]
    public string BusinessId { get; set; }
    /// <summary>
    /// A list of asset permissions used to filter the assets. Only assets where the requesting business has at least one of the specified permissions will be returned.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("permissions")]
    public List<PermissionsWithOwner>? Permissions { get; set; }
    /// <summary>
    /// A child asset unique identifier. Used to fetch asset groups that contain the asset id as a child.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("child_asset_id")]
    public string? ChildAssetId { get; set; }
    /// <summary>
    /// An asset group unique identifier. Used to fetch assets contained within the specified asset group.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("asset_group_id")]
    public string? AssetGroupId { get; set; }
    /// <summary>
    /// A resource type to filter the assets by. Only assets of the specified type will be returned.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("asset_type")]
    public string? AssetType { get; set; }
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
public class BusinessMemberAssetsGetRequest
{
    /// <summary>
    /// Unique identifier of the requesting business.
    /// </summary>
    [FastEndpoints.BindFrom("business_id")]
    public string BusinessId { get; set; }
    /// <summary>
    /// The member id to fetch assets for.
    /// </summary>
    [FastEndpoints.BindFrom("member_id")]
    public string MemberId { get; set; }
    /// <summary>
    /// A resource type to filter the assets by. Only assets of the specified type will be returned.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("asset_type")]
    public string? AssetType { get; set; }
    /// <summary>
    /// An index to start fetching the results from. Only the results starting from this index will be returned.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("start_index")]
    public int? StartIndex { get; set; }
    /// <summary>
    /// The field to sort member assets by
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("sort_by")]
    public AssetSortBy SortBy { get; set; }
    /// <summary>
    /// Sort assets in ascending order
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("sort_ascending")]
    public bool? SortAscending { get; set; }
    /// <summary>
    /// The field to search member assets by
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("search_by")]
    public AssetSearchBy SearchBy { get; set; }
    /// <summary>
    /// The value to search for
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("search_value")]
    public string? SearchValue { get; set; }
    /// <summary>
    /// The type of asset permission to filter by
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("asset_permission_type")]
    public AssetPermissionType AssetPermissionType { get; set; }
    /// <summary>
    /// A list of ad account statuses to filter the assets by. Only used when asset_type is AD_ACCOUNT.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("ad_account_statuses")]
    public List<NonDraftEntityStatus>? AdAccountStatuses { get; set; }
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
public class BusinessMembersAssetAccessDeleteRequest
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
    public BusinessMembersAssetAccessDeleteBody businessMembersAssetAccessDeleteBody { get; set; }
}
public class BusinessMembersAssetAccessUpdateRequest
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
    public UpdateMemberAssetAccessBody updateMemberAssetAccessBody { get; set; }
}
public class BusinessPartnerAssetAccessGetRequest
{
    /// <summary>
    /// Unique identifier of the requesting business.
    /// </summary>
    [FastEndpoints.BindFrom("business_id")]
    public string BusinessId { get; set; }
    /// <summary>
    /// The partner id to be bound to the Business
    /// </summary>
    [FastEndpoints.BindFrom("partner_id")]
    public string PartnerId { get; set; }
    /// <summary>
    /// Specifies whether to fetch internal or external (shared) partners.  If partner_type&#x3D;INTERNAL, the asset being queried is for accesses the partner has to your business assets.  If partner_type&#x3D;EXTERNAL, the asset being queried is for the accesses you have to the partner&#39;s business asset.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("partner_type")]
    public string? PartnerType { get; set; }
    /// <summary>
    /// A resource type to filter the assets by. Only assets of the specified type will be returned.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("asset_type")]
    public string? AssetType { get; set; }
    /// <summary>
    /// An index to start fetching the results from. Only the results starting from this index will be returned.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("start_index")]
    public int? StartIndex { get; set; }
    /// <summary>
    /// The field to sort member assets by
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("sort_by")]
    public AssetSortBy SortBy { get; set; }
    /// <summary>
    /// Sort assets in ascending order
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("sort_ascending")]
    public bool? SortAscending { get; set; }
    /// <summary>
    /// The field to search member assets by
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("search_by")]
    public AssetSearchBy SearchBy { get; set; }
    /// <summary>
    /// The value to search for
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("search_value")]
    public string? SearchValue { get; set; }
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
public class DeletePartnerAssetAccessHandlerImplRequest
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
    public DeletePartnerAssetAccessBody deletePartnerAssetAccessBody { get; set; }
}
public class UpdatePartnerAssetAccessHandlerImplRequest
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
    public UpdatePartnerAssetAccessBody updatePartnerAssetAccessBody { get; set; }
}


