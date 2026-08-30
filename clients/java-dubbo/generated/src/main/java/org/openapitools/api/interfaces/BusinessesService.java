package org.openapitools.api.interfaces;

import org.openapitools.model.AdAccountsAudiencesSharedAccountsList200Response;
import org.openapitools.model.AssetGroupDeletion;
import org.openapitools.model.AssetGroupDeletionDelete;
import org.openapitools.model.AssetGroupInput;
import org.openapitools.model.AssetGroupInputCreate;
import org.openapitools.model.AssetGroupModification;
import org.openapitools.model.AssetGroupModificationReadOrUpdate;
import org.openapitools.model.AssetPermissionType;
import org.openapitools.model.AssetSearchBy;
import org.openapitools.model.AssetSortBy;
import org.openapitools.model.AudienceAccountType;
import org.openapitools.model.AuthRespondInvitesBody;
import org.openapitools.model.BusinessAssetMembersGet200Response;
import org.openapitools.model.BusinessAssetsGet200Response;
import org.openapitools.model.BusinessMemberAssetsGetResponse;
import org.openapitools.model.BusinessMembersAssetAccessDeleteBody;
import org.openapitools.model.BusinessMembershipMember;
import org.openapitools.model.BusinessPartnerAssetAccessGet200Response;
import org.openapitools.model.BusinessToAdAccountSharedAudience;
import org.openapitools.model.BusinessToAdAccountSharedAudienceUpdateWithRequiredBody;
import org.openapitools.model.BusinessToBusinessSharedAudience;
import org.openapitools.model.BusinessToBusinessSharedAudienceUpdateWithRequiredBody;
import org.openapitools.model.CancelInvitesRequest;
import org.openapitools.model.CancelInvitesResponse;
import org.openapitools.model.CreateAssetAccessRequestBody;
import org.openapitools.model.CreateAssetAccessRequestResponse;
import org.openapitools.model.CreateAssetInvitesRequest;
import org.openapitools.model.CreateInvitesResultsResponseArray;
import org.openapitools.model.CreateMembershipOrPartnershipInvitesBody;
import org.openapitools.model.DeleteBusinessMembership200Response;
import org.openapitools.model.DeleteBusinessMembershipBody;
import org.openapitools.model.DeleteBusinessPartners;
import org.openapitools.model.DeleteBusinessPartnersDelete;
import org.openapitools.model.DeleteMemberAccessResultsResponseArray;
import org.openapitools.model.DeletePartnerAssetAccessBody;
import org.openapitools.model.DeletePartnerAssetAccessResultsResponseArray;
import org.openapitools.model.GetBusinessEmployers200Response;
import org.openapitools.model.GetInvites200Response;
import org.openapitools.model.InviteFilterStatus;
import org.openapitools.model.InviteType;
import org.openapitools.model.MemberBusinessRole;
import org.openapitools.model.NonDraftEntityStatus;
import org.openapitools.model.Order;
import org.openapitools.model.PartnerType;
import org.openapitools.model.PermissionsWithOwner;
import org.openapitools.model.PinterestLibError;
import org.openapitools.model.RespondToInvitesResponseArray;
import org.openapitools.model.SharedAudiencesForBusinessList200Response;
import org.openapitools.model.SystemUserUpdateWithRequiredBody;
import org.openapitools.model.UpdateBusinessMembershipsResponse;
import org.openapitools.model.UpdateInvitesResultsResponseArray;
import org.openapitools.model.UpdateMemberAssetAccessBody;
import org.openapitools.model.UpdateMemberAssetsResultsResponseArray;
import org.openapitools.model.UpdatePartnerAssetAccessBody;
import org.openapitools.model.UpdatePartnerAssetsResultsResponseArray;
import org.openapitools.model.*;
import java.util.List;
import java.util.Map;
import java.time.OffsetDateTime;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.annotation.Generated;


@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public interface BusinessesService {

    /**
     * Create a request to access an existing partner&#39;s assets.
     * Create a request to access an existing partner&#39;s assets with the specified permissions. The request will be sent to the partner for approval. The assets that can be requested are ad accounts and profiles.
     *
     * @param businessId Unique identifier of the requesting business. (required)
     * @param createAssetAccessRequestBody  (required)
     * @return CreateAssetAccessRequestResponse
     */
    CreateAssetAccessRequestResponse assetAccessRequestsCreate(
        String businessId,
        CreateAssetAccessRequestBody createAssetAccessRequestBody
    );

    /**
     * Create a new asset group.
     * Create a new asset group with the specified parameters. - An [asset group](https://help.pinterest.com/en/business/article/asset-groups) is a custom group of assets based on how you would like to manage your accounts.
     *
     * @param businessId Unique identifier of the requesting business. (required)
     * @param assetGroupInputCreate  (required)
     * @return AssetGroupInput
     */
    AssetGroupInput assetGroupCreate(
        String businessId,
        AssetGroupInputCreate assetGroupInputCreate
    );

    /**
     * Delete asset groups.
     * Delete a batch of asset groups.
     *
     * @param businessId Unique identifier of the requesting business. (required)
     * @param assetGroupDeletionDelete  (required)
     * @return AssetGroupDeletion
     */
    AssetGroupDeletion assetGroupDelete(
        String businessId,
        AssetGroupDeletionDelete assetGroupDeletionDelete
    );

    /**
     * Update asset groups.
     * Update a batch of asset groups with the specified parameters.
     *
     * @param businessId Unique identifier of the requesting business. (required)
     * @param assetGroupModificationReadOrUpdate  (required)
     * @return AssetGroupModification
     */
    AssetGroupModification assetGroupUpdate(
        String businessId,
        AssetGroupModificationReadOrUpdate assetGroupModificationReadOrUpdate
    );

    /**
     * List accounts with access to an audience owned by a business
     * List all ad accounts and/or businesses that have access to a specific audience. The audience must either be owned by an ad account in the requesting business, or it must have been shared with the requesting business. If the requesting business is not the owner of the audience, only ad accounts owned by the requesting business will be returned.
     *
     * @param businessId Unique identifier of the requesting business. (required)
     * @param audienceId Unique identifier of the audience to use to filter the results. (required)
     * @param accountType Filter accounts by account type. (required)
     * @param bookmark Cursor used to fetch the next page of items (optional)
     * @param pageSize Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional, default to 25)
     * @return AdAccountsAudiencesSharedAccountsList200Response
     */
    AdAccountsAudiencesSharedAccountsList200Response businessAccountAudiencesSharedAccountsList(
        String businessId,
        String audienceId,
        AudienceAccountType accountType,
        String bookmark,
        Integer pageSize
    );

    /**
     * Get members with access to asset
     * Get all the members the requesting business has granted access to on the given asset.
     *
     * @param businessId Unique identifier of the requesting business. (required)
     * @param assetId Unique identifier of a business asset. (required)
     * @param startIndex An index to start fetching the results from. Only the results starting from this index will be returned. (optional, default to 0)
     * @param fetchSystemUsers Fetches system users if True. Fetches regular user employees if False. (optional, default to false)
     * @param bookmark Cursor used to fetch the next page of items (optional)
     * @param pageSize Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional, default to 25)
     * @return BusinessAssetMembersGet200Response
     */
    BusinessAssetMembersGet200Response businessAssetMembersGet(
        String businessId,
        String assetId,
        Integer startIndex,
        Boolean fetchSystemUsers,
        String bookmark,
        Integer pageSize
    );

    /**
     * Get partners with access to asset
     * Get all the partners the requesting business has granted access to on the given asset. Note: If the asset has been shared with you, an empty array will be returned. This is because an asset shared with you cannot be shared with a different partner.
     *
     * @param businessId Unique identifier of the requesting business. (required)
     * @param assetId Unique identifier of a business asset. (required)
     * @param startIndex An index to start fetching the results from. Only the results starting from this index will be returned. (optional, default to 0)
     * @param bookmark Cursor used to fetch the next page of items (optional)
     * @param pageSize Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional, default to 25)
     * @return BusinessAssetMembersGet200Response
     */
    BusinessAssetMembersGet200Response businessAssetPartnersGet(
        String businessId,
        String assetId,
        Integer startIndex,
        String bookmark,
        Integer pageSize
    );

    /**
     * List business assets
     * Get all the assets the requesting business has access to. This includes assets the business owns and assets the business has access to through partnerships.
     *
     * @param businessId Unique identifier of the requesting business. (required)
     * @param permissions A list of asset permissions used to filter the assets. Only assets where the requesting business has at least one of the specified permissions will be returned. (optional)
     * @param childAssetId A child asset unique identifier. Used to fetch asset groups that contain the asset id as a child. (optional)
     * @param assetGroupId An asset group unique identifier. Used to fetch assets contained within the specified asset group. (optional)
     * @param assetType A resource type to filter the assets by. Only assets of the specified type will be returned. (optional, default to AD_ACCOUNT)
     * @param startIndex An index to start fetching the results from. Only the results starting from this index will be returned. (optional, default to 0)
     * @param bookmark Cursor used to fetch the next page of items (optional)
     * @param pageSize Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional, default to 25)
     * @return BusinessAssetsGet200Response
     */
    BusinessAssetsGet200Response businessAssetsGet(
        String businessId,
        List<PermissionsWithOwner> permissions,
        String childAssetId,
        String assetGroupId,
        String assetType,
        Integer startIndex,
        String bookmark,
        Integer pageSize
    );

    /**
     * Get assets assigned to a member
     * Get assets on which you assigned asset permissions to the given member. Can be used to: - get all assets, regardless of asset type or - get assets of one asset type by using the asset_type query. The return response will include the permissions the member has to that asset and the asset type.
     *
     * @param businessId Unique identifier of the requesting business. (required)
     * @param memberId The member id to fetch assets for. (required)
     * @param assetType A resource type to filter the assets by. Only assets of the specified type will be returned. (optional, default to AD_ACCOUNT)
     * @param startIndex An index to start fetching the results from. Only the results starting from this index will be returned. (optional, default to 0)
     * @param sortBy The field to sort member assets by (optional)
     * @param sortAscending Sort assets in ascending order (optional, default to true)
     * @param searchBy The field to search member assets by (optional)
     * @param searchValue The value to search for (optional)
     * @param assetPermissionType The type of asset permission to filter by (optional)
     * @param adAccountStatuses A list of ad account statuses to filter the assets by. Only used when asset_type is AD_ACCOUNT. (optional)
     * @param bookmark Cursor used to fetch the next page of items (optional)
     * @param pageSize Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional, default to 25)
     * @return BusinessMemberAssetsGetResponse
     */
    BusinessMemberAssetsGetResponse businessMemberAssetsGet(
        String businessId,
        String memberId,
        String assetType,
        Integer startIndex,
        AssetSortBy sortBy,
        Boolean sortAscending,
        AssetSearchBy searchBy,
        String searchValue,
        AssetPermissionType assetPermissionType,
        List<NonDraftEntityStatus> adAccountStatuses,
        String bookmark,
        Integer pageSize
    );

    /**
     * Delete member access to asset
     * Terminate multiple members&#39; access to an asset.
     *
     * @param businessId Unique identifier of the requesting business. (required)
     * @param businessMembersAssetAccessDeleteBody  (required)
     * @return DeleteMemberAccessResultsResponseArray
     */
    DeleteMemberAccessResultsResponseArray businessMembersAssetAccessDelete(
        String businessId,
        BusinessMembersAssetAccessDeleteBody businessMembersAssetAccessDeleteBody
    );

    /**
     * Assign/Update member asset permissions
     * Grant multiple members access to assets and/or update multiple member&#39;s exisiting permissions to an asset. Note: Not all listed permissions are applicable to each asset type. For example, PROFILE_PUBLISHER would not be applicable to an asset of type AD_ACCOUNT. The permission level PROFILE_PUBLISHER is only available to an asset of the type PROFILE.
     *
     * @param businessId Unique identifier of the requesting business. (required)
     * @param updateMemberAssetAccessBody  (required)
     * @return UpdateMemberAssetsResultsResponseArray
     */
    UpdateMemberAssetsResultsResponseArray businessMembersAssetAccessUpdate(
        String businessId,
        UpdateMemberAssetAccessBody updateMemberAssetAccessBody
    );

    /**
     * Get assets assigned to a partner or assets assigned by a partner
     * Can be used to get the business assets your partner has granted you access to or the business assets you have granted your partner access to. If you specify: - partner_type&#x3D;INTERNAL, you will retrieve your business assets that the partner has access to. - partner_type&#x3D;EXTERNAL, you will retrieve the partner&#39;s business assets that the partner has granted you access to.
     *
     * @param businessId Unique identifier of the requesting business. (required)
     * @param partnerId The partner id to be bound to the Business (required)
     * @param partnerType Specifies whether to fetch internal or external (shared) partners.  If partner_type&#x3D;INTERNAL, the asset being queried is for accesses the partner has to your business assets.  If partner_type&#x3D;EXTERNAL, the asset being queried is for the accesses you have to the partner&#39;s business asset. (optional, default to INTERNAL)
     * @param assetType A resource type to filter the assets by. Only assets of the specified type will be returned. (optional, default to AD_ACCOUNT)
     * @param startIndex An index to start fetching the results from. Only the results starting from this index will be returned. (optional, default to 0)
     * @param sortBy The field to sort member assets by (optional)
     * @param sortAscending Sort assets in ascending order (optional, default to true)
     * @param searchBy The field to search member assets by (optional)
     * @param searchValue The value to search for (optional)
     * @param bookmark Cursor used to fetch the next page of items (optional)
     * @param pageSize Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional, default to 25)
     * @return BusinessPartnerAssetAccessGet200Response
     */
    BusinessPartnerAssetAccessGet200Response businessPartnerAssetAccessGet(
        String businessId,
        String partnerId,
        String partnerType,
        String assetType,
        Integer startIndex,
        AssetSortBy sortBy,
        Boolean sortAscending,
        AssetSearchBy searchBy,
        String searchValue,
        String bookmark,
        Integer pageSize
    );

    /**
     * Cancel invites/requests
     * Cancel membership/partnership invites and/or requests.
     *
     * @param businessId Unique identifier of the requesting business. (required)
     * @param cancelInvitesRequest  (required)
     * @return CancelInvitesResponse
     */
    CancelInvitesResponse cancelInvitesOrRequests(
        String businessId,
        CancelInvitesRequest cancelInvitesRequest
    );

    /**
     * Update invite/request with an asset permission
     * Assign asset permissions information to an existing invite/request. Can be used to: - Request access to a partner&#39;s asset. Note: This is only for when no existing partnership exists. If an existing   partnership exists, use \&quot;Create a request to access an existing partner&#39;s assets\&quot; to request access to your   partner&#39;s assets.     - invite_type&#x3D;\&quot;PARTNER_REQUEST\&quot; - Invite a partner to access your business assets. Note: This is only for when there is no existing partnership.   If there is an existing partnership, use \&quot;Assign/Update partner asset permissions\&quot; to assign a partner access to   new assets.     - invite_type&#x3D;\&quot;PARTNER_INVITE\&quot; - Invite a member to access your business assets. Note: This is only for when there is no existing membership.   If there is an existing membership, use \&quot;Assign/Update member asset permissions\&quot; to assign a member access to new   assets.     - invite_type&#x3D;\&quot;MEMBER_INVITE\&quot;  To learn more about permission levels, visit https://help.pinterest.com/en/business/article/business-manager-overview.
     *
     * @param businessId Unique identifier of the requesting business. (required)
     * @param createAssetInvitesRequest  (required)
     * @return UpdateInvitesResultsResponseArray
     */
    UpdateInvitesResultsResponseArray createAssetInvites(
        String businessId,
        CreateAssetInvitesRequest createAssetInvitesRequest
    );

    /**
     * Create invites or requests
     * Create batch invites or requests. Can create batch invites or requests as described below. - Invite members to join the business. This would required specifying the following:     - invite_type&#x3D;\&quot;MEMBER_INVITE\&quot;     - business_role&#x3D;\&quot;EMPLOYEE\&quot; OR business_role&#x3D;\&quot;BIZ_ADMIN\&quot; (To learn more about business roles, visit     https://help.pinterest.com/en/business/article/profile-permissions-in-business-access.)     - members - Invite partners to access your business assets. This would require specifying the following:     - invite_type&#x3D;\&quot;PARTNER_INVITE\&quot;     - business_role&#x3D;\&quot;PARTNER\&quot;     - partners - Request to be a partner so you can access their assets. This would require specifying the following:     - invite_type&#x3D;\&quot;PARTNER_REQUEST\&quot;     - business_role&#x3D;\&quot;PARTNER\&quot;     - partners
     *
     * @param businessId Unique identifier of the requesting business. (required)
     * @param createMembershipOrPartnershipInvitesBody  (required)
     * @return CreateInvitesResultsResponseArray
     */
    CreateInvitesResultsResponseArray createMembershipOrPartnershipInvites(
        String businessId,
        CreateMembershipOrPartnershipInvitesBody createMembershipOrPartnershipInvitesBody
    );

    /**
     * Terminate business memberships
     * Terminate memberships between the specified members and your business.
     *
     * @param businessId Business id (required)
     * @param deleteBusinessMembershipBody  (required)
     * @return DeleteBusinessMembership200Response
     */
    DeleteBusinessMembership200Response deleteBusinessMembership(
        String businessId,
        DeleteBusinessMembershipBody deleteBusinessMembershipBody
    );

    /**
     * Terminate business partnerships
     * Terminate partnerships between the specified partners and your business. Note: You may only batch terminate partners of the same partner type.
     *
     * @param businessId Unique identifier of the requesting business. (required)
     * @param deleteBusinessPartnersDelete  (required)
     * @return DeleteBusinessPartners
     */
    DeleteBusinessPartners deleteBusinessPartners(
        String businessId,
        DeleteBusinessPartnersDelete deleteBusinessPartnersDelete
    );

    /**
     * Delete partner access to asset
     * Terminate multiple partners&#39; access to an asset. If - partner_type&#x3D;INTERNAL: You will terminate a partner&#39;s asset access to your business assets. - partner_type&#x3D;EXTERNAL: You will terminate your own access to your partner&#39;s business assets.
     *
     * @param businessId Unique identifier of the requesting business. (required)
     * @param deletePartnerAssetAccessBody  (required)
     * @return DeletePartnerAssetAccessResultsResponseArray
     */
    DeletePartnerAssetAccessResultsResponseArray deletePartnerAssetAccessHandlerImpl(
        String businessId,
        DeletePartnerAssetAccessBody deletePartnerAssetAccessBody
    );

    /**
     * List business employers for user
     * Get all of the viewing user&#39;s business employers.
     *
     * @param assetsSummary Include assets summary in the response if this is true. Defaults to true.  The assets summary returns a dictionary representing a summary of the assets for the business user ID, with information like the ad accounts and profiles the user has permissions for and what those permissions are (optional, default to true)
     * @param bookmark Cursor used to fetch the next page of items (optional)
     * @param pageSize Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional, default to 25)
     * @return GetBusinessEmployers200Response
     */
    GetBusinessEmployers200Response getBusinessEmployers(
        Boolean assetsSummary,
        String bookmark,
        Integer pageSize
    );

    /**
     * Get business members
     * Get all members of the specified business. The return response will include the member&#39;s business_role and assets they have access to if assets_summary&#x3D;TRUE
     *
     * @param businessId Unique identifier of the requesting business. (required)
     * @param fetchSystemUsers Fetches system users if True. Fetches regular user employees if False. (optional, default to false)
     * @param assetsSummary Include assets summary in the response if this is true.  The assets summary returns a dictionary representing a summary of the assets for the business user ID, with information like the ad accounts and profiles the user has permissions for and what those permissions are (optional, default to false)
     * @param businessRoles A list of business roles to filter the members by. Only members whose roles are in the specified roles will be returned. (optional)
     * @param memberIds A list of business members ids separated by comma. (optional)
     * @param startIndex An index to start fetching the results from. Only the results starting from this index will be returned. (optional, default to 0)
     * @param bookmark Cursor used to fetch the next page of items (optional)
     * @param pageSize Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional, default to 25)
     * @return GetBusinessEmployers200Response
     */
    GetBusinessEmployers200Response getBusinessMembers(
        String businessId,
        Boolean fetchSystemUsers,
        Boolean assetsSummary,
        List<MemberBusinessRole> businessRoles,
        String memberIds,
        Integer startIndex,
        String bookmark,
        Integer pageSize
    );

    /**
     * Get business partners
     * Get all partners of the specified business.  If the assets_summary&#x3D;TRUE and: - partner_type&#x3D;INTERNAL, the business assets returned are your business assets the partner has access to. - partner_type&#x3D;EXTERNAL, the business assets returned are your partner&#39;s business assets the partner has granted you   access to.
     *
     * @param businessId Unique identifier of the requesting business. (required)
     * @param assetsSummary Include assets summary in the response if this is true.  The assets summary returns a dictionary representing a summary of the assets for the business user ID, with information like the ad accounts and profiles the user has permissions for and what those permissions are (optional, default to false)
     * @param partnerType Specifies whether to fetch internal or external (shared) partners. If partner_type&#x3D;INTERNAL, the asset being queried is for accesses the partner has to your business assets. If partner_type&#x3D;EXTERNAL, the asset being queried is for the accesses you have to the partner&#39;s business asset. (optional)
     * @param partnerIds A list of business partner ids separated by commas used to filter the results. Only partners with the specified ids will be returned. (optional)
     * @param startIndex An index to start fetching the results from. Only the results starting from this index will be returned. (optional, default to 0)
     * @param sortAscending Sort ascending. (optional)
     * @param bookmark Cursor used to fetch the next page of items (optional)
     * @param pageSize Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional, default to 25)
     * @return GetBusinessEmployers200Response
     */
    GetBusinessEmployers200Response getBusinessPartners(
        String businessId,
        Boolean assetsSummary,
        PartnerType partnerType,
        String partnerIds,
        Integer startIndex,
        Boolean sortAscending,
        String bookmark,
        Integer pageSize
    );

    /**
     * Get invites/requests
     * Get the membership/partnership invites and/or requests for the authorized user.
     *
     * @param businessId Unique identifier of the requesting business. (required)
     * @param isMember A boolean field to indicate whether the invite is to create a partnership or a membership. (optional, default to true)
     * @param inviteStatus A list of invite statuses to filter invites by. Only invites whose status is in the provided statuses will be returned. (optional)
     * @param inviteType Invite type to filter invites by. Only invites of the specified type will be returned. (optional)
     * @param bookmark Cursor used to fetch the next page of items (optional)
     * @param pageSize Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional, default to 25)
     * @return GetInvites200Response
     */
    GetInvites200Response getInvites(
        String businessId,
        Boolean isMember,
        List<InviteFilterStatus> inviteStatus,
        InviteType inviteType,
        String bookmark,
        Integer pageSize
    );

    /**
     * Accept or decline an invite/request
     * Accept or decline invites or requests.
     *
     * @param authRespondInvitesBody  (required)
     * @return RespondToInvitesResponseArray
     */
    RespondToInvitesResponseArray respondBusinessAccessInvites(
        AuthRespondInvitesBody authRespondInvitesBody
    );

    /**
     * List received audiences for a business
     * Get a list of received audiences for the given business.
     *
     * @param businessId Unique identifier of the requesting business. (required)
     * @param order The order in which to sort the items returned: \&quot;ASCENDING\&quot; or \&quot;DESCENDING\&quot; by ID. Note that higher-value IDs are associated with more-recently added items. (optional)
     * @param bookmark Cursor used to fetch the next page of items (optional)
     * @param pageSize Maximum number of items to include in a single page. See documentation on [Pagination](/docs/reference/pagination/) for more information. (optional, default to 25)
     * @return SharedAudiencesForBusinessList200Response
     */
    SharedAudiencesForBusinessList200Response sharedAudiencesForBusinessList(
        String businessId,
        Order order,
        String bookmark,
        Integer pageSize
    );

    /**
     * Update a system user information.
     * Update a system user information such as name.
     *
     * @param businessId Unique identifier of the requesting business. (required)
     * @param systemUserId Unique identifier of a system user. (required)
     * @param systemUserUpdateWithRequiredBody  (required)
     * @return void
     */
    void systemUserUpdate(
        String businessId,
        String systemUserId,
        SystemUserUpdateWithRequiredBody systemUserUpdateWithRequiredBody
    );

    /**
     * Update member&#39;s business role
     * Update a member&#39;s business role within the business.
     *
     * @param businessId Business id (required)
     * @param businessMembershipMember  (required)
     * @return UpdateBusinessMembershipsResponse
     */
    UpdateBusinessMembershipsResponse updateBusinessMemberships(
        String businessId,
        List<BusinessMembershipMember> businessMembershipMember
    );

    /**
     * Update audience sharing from a business to ad accounts
     * From a business, share a specific audience with other ad account(s), or revoke access to a previously shared audience.  - If the business is the owner of the audience, it can share with any ad account within the same business hierarchy. - If the business is the recipient of the audience, it can share with any of its owned ad accounts.  This endpoint is not available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).
     *
     * @param businessId Unique identifier of the requesting business. (required)
     * @param businessToAdAccountSharedAudienceUpdateWithRequiredBody  (required)
     * @return BusinessToAdAccountSharedAudience
     */
    BusinessToAdAccountSharedAudience updateBusinessToAdAccountSharedAudience(
        String businessId,
        BusinessToAdAccountSharedAudienceUpdateWithRequiredBody businessToAdAccountSharedAudienceUpdateWithRequiredBody
    );

    /**
     * Update audience sharing between businesses
     * From a business, share a specific audience with another business account, or revoke access to a previously shared audience. Only the audience owner can share the audience with other businesses, and the recipient business must be within the same business hierarchy.  This endpoint is not available to all apps. [Learn more](/docs/getting-started/using-beta-and-restricted-features/).
     *
     * @param businessId Unique identifier of the requesting business. (required)
     * @param businessToBusinessSharedAudienceUpdateWithRequiredBody  (required)
     * @return BusinessToBusinessSharedAudience
     */
    BusinessToBusinessSharedAudience updateBusinessToBusinessSharedAudience(
        String businessId,
        BusinessToBusinessSharedAudienceUpdateWithRequiredBody businessToBusinessSharedAudienceUpdateWithRequiredBody
    );

    /**
     * Assign/Update partner asset permissions
     * Grant multiple partners access to assets and/or update multiple partner&#39;s exisiting permissions to an asset. If your partner already had permissions on the asset, they will be overriden with the new permissions you assign to them. To learn more about permission levels, visit https://help.pinterest.com/en/business/article/business-manager-overview  Note: Not all listed permissions are applicable to each asset type. For example, PROFILE_PUBLISHER would not be applicable to an asset of type AD_ACCOUNT. The permission level PROFILE_PUBLISHER is only available to an asset of the type PROFILE.
     *
     * @param businessId Unique identifier of the requesting business. (required)
     * @param updatePartnerAssetAccessBody  (required)
     * @return UpdatePartnerAssetsResultsResponseArray
     */
    UpdatePartnerAssetsResultsResponseArray updatePartnerAssetAccessHandlerImpl(
        String businessId,
        UpdatePartnerAssetAccessBody updatePartnerAssetAccessBody
    );
}
