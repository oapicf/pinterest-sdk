package org.openapitools.api.consumer;

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
import org.openapitools.api.interfaces.BusinessesService;
import java.util.List;
import java.util.Map;
import java.time.OffsetDateTime;
import java.time.LocalDate;
import java.time.LocalDateTime;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.*;
import javax.annotation.Generated;


@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

@RestController
@RequestMapping("/businesses")
public class BusinessesServiceController {

    @DubboReference
    private BusinessesService businessesService;

    @RequestMapping(method = RequestMethod.POST, value = "/{business_id}/requests/assets/access")
    public CreateAssetAccessRequestResponse assetAccessRequestsCreate(
        @RequestParam(name = "businessId") String businessId,
        @RequestParam(name = "createAssetAccessRequestBody") CreateAssetAccessRequestBody createAssetAccessRequestBody
    ) {
        return businessesService.assetAccessRequestsCreate(businessId, createAssetAccessRequestBody);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/{business_id}/asset_groups")
    public AssetGroupInput assetGroupCreate(
        @RequestParam(name = "businessId") String businessId,
        @RequestParam(name = "assetGroupInputCreate") AssetGroupInputCreate assetGroupInputCreate
    ) {
        return businessesService.assetGroupCreate(businessId, assetGroupInputCreate);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/{business_id}/asset_groups")
    public AssetGroupDeletion assetGroupDelete(
        @RequestParam(name = "businessId") String businessId,
        @RequestParam(name = "assetGroupDeletionDelete") AssetGroupDeletionDelete assetGroupDeletionDelete
    ) {
        return businessesService.assetGroupDelete(businessId, assetGroupDeletionDelete);
    }

    @RequestMapping(method = RequestMethod.PATCH, value = "/{business_id}/asset_groups")
    public AssetGroupModification assetGroupUpdate(
        @RequestParam(name = "businessId") String businessId,
        @RequestParam(name = "assetGroupModificationReadOrUpdate") AssetGroupModificationReadOrUpdate assetGroupModificationReadOrUpdate
    ) {
        return businessesService.assetGroupUpdate(businessId, assetGroupModificationReadOrUpdate);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{business_id}/audiences/shared/accounts")
    public AdAccountsAudiencesSharedAccountsList200Response businessAccountAudiencesSharedAccountsList(
        @RequestParam(name = "businessId") String businessId,
        @RequestParam(name = "audienceId") String audienceId,
        @RequestParam(name = "accountType") AudienceAccountType accountType,
        @RequestParam(name = "bookmark") String bookmark,
        @RequestParam(name = "pageSize", defaultValue = "25") Integer pageSize
    ) {
        return businessesService.businessAccountAudiencesSharedAccountsList(businessId, audienceId, accountType, bookmark, pageSize);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{business_id}/assets/{asset_id}/members")
    public BusinessAssetMembersGet200Response businessAssetMembersGet(
        @RequestParam(name = "businessId") String businessId,
        @RequestParam(name = "assetId") String assetId,
        @RequestParam(name = "startIndex", defaultValue = "0") Integer startIndex,
        @RequestParam(name = "fetchSystemUsers", defaultValue = "false") Boolean fetchSystemUsers,
        @RequestParam(name = "bookmark") String bookmark,
        @RequestParam(name = "pageSize", defaultValue = "25") Integer pageSize
    ) {
        return businessesService.businessAssetMembersGet(businessId, assetId, startIndex, fetchSystemUsers, bookmark, pageSize);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{business_id}/assets/{asset_id}/partners")
    public BusinessAssetMembersGet200Response businessAssetPartnersGet(
        @RequestParam(name = "businessId") String businessId,
        @RequestParam(name = "assetId") String assetId,
        @RequestParam(name = "startIndex", defaultValue = "0") Integer startIndex,
        @RequestParam(name = "bookmark") String bookmark,
        @RequestParam(name = "pageSize", defaultValue = "25") Integer pageSize
    ) {
        return businessesService.businessAssetPartnersGet(businessId, assetId, startIndex, bookmark, pageSize);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{business_id}/assets")
    public BusinessAssetsGet200Response businessAssetsGet(
        @RequestParam(name = "businessId") String businessId,
        @RequestParam(name = "permissions") List<PermissionsWithOwner> permissions,
        @RequestParam(name = "childAssetId") String childAssetId,
        @RequestParam(name = "assetGroupId") String assetGroupId,
        @RequestParam(name = "assetType", defaultValue = "AD_ACCOUNT") String assetType,
        @RequestParam(name = "startIndex", defaultValue = "0") Integer startIndex,
        @RequestParam(name = "bookmark") String bookmark,
        @RequestParam(name = "pageSize", defaultValue = "25") Integer pageSize
    ) {
        return businessesService.businessAssetsGet(businessId, permissions, childAssetId, assetGroupId, assetType, startIndex, bookmark, pageSize);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{business_id}/members/{member_id}/assets")
    public BusinessMemberAssetsGetResponse businessMemberAssetsGet(
        @RequestParam(name = "businessId") String businessId,
        @RequestParam(name = "memberId") String memberId,
        @RequestParam(name = "assetType", defaultValue = "AD_ACCOUNT") String assetType,
        @RequestParam(name = "startIndex", defaultValue = "0") Integer startIndex,
        @RequestParam(name = "sortBy") AssetSortBy sortBy,
        @RequestParam(name = "sortAscending", defaultValue = "true") Boolean sortAscending,
        @RequestParam(name = "searchBy") AssetSearchBy searchBy,
        @RequestParam(name = "searchValue") String searchValue,
        @RequestParam(name = "assetPermissionType") AssetPermissionType assetPermissionType,
        @RequestParam(name = "adAccountStatuses") List<NonDraftEntityStatus> adAccountStatuses,
        @RequestParam(name = "bookmark") String bookmark,
        @RequestParam(name = "pageSize", defaultValue = "25") Integer pageSize
    ) {
        return businessesService.businessMemberAssetsGet(businessId, memberId, assetType, startIndex, sortBy, sortAscending, searchBy, searchValue, assetPermissionType, adAccountStatuses, bookmark, pageSize);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/{business_id}/members/assets/access")
    public DeleteMemberAccessResultsResponseArray businessMembersAssetAccessDelete(
        @RequestParam(name = "businessId") String businessId,
        @RequestParam(name = "businessMembersAssetAccessDeleteBody") BusinessMembersAssetAccessDeleteBody businessMembersAssetAccessDeleteBody
    ) {
        return businessesService.businessMembersAssetAccessDelete(businessId, businessMembersAssetAccessDeleteBody);
    }

    @RequestMapping(method = RequestMethod.PATCH, value = "/{business_id}/members/assets/access")
    public UpdateMemberAssetsResultsResponseArray businessMembersAssetAccessUpdate(
        @RequestParam(name = "businessId") String businessId,
        @RequestParam(name = "updateMemberAssetAccessBody") UpdateMemberAssetAccessBody updateMemberAssetAccessBody
    ) {
        return businessesService.businessMembersAssetAccessUpdate(businessId, updateMemberAssetAccessBody);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{business_id}/partners/{partner_id}/assets")
    public BusinessPartnerAssetAccessGet200Response businessPartnerAssetAccessGet(
        @RequestParam(name = "businessId") String businessId,
        @RequestParam(name = "partnerId") String partnerId,
        @RequestParam(name = "partnerType", defaultValue = "INTERNAL") String partnerType,
        @RequestParam(name = "assetType", defaultValue = "AD_ACCOUNT") String assetType,
        @RequestParam(name = "startIndex", defaultValue = "0") Integer startIndex,
        @RequestParam(name = "sortBy") AssetSortBy sortBy,
        @RequestParam(name = "sortAscending", defaultValue = "true") Boolean sortAscending,
        @RequestParam(name = "searchBy") AssetSearchBy searchBy,
        @RequestParam(name = "searchValue") String searchValue,
        @RequestParam(name = "bookmark") String bookmark,
        @RequestParam(name = "pageSize", defaultValue = "25") Integer pageSize
    ) {
        return businessesService.businessPartnerAssetAccessGet(businessId, partnerId, partnerType, assetType, startIndex, sortBy, sortAscending, searchBy, searchValue, bookmark, pageSize);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/{business_id}/invites")
    public CancelInvitesResponse cancelInvitesOrRequests(
        @RequestParam(name = "businessId") String businessId,
        @RequestParam(name = "cancelInvitesRequest") CancelInvitesRequest cancelInvitesRequest
    ) {
        return businessesService.cancelInvitesOrRequests(businessId, cancelInvitesRequest);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/{business_id}/invites/assets/access")
    public UpdateInvitesResultsResponseArray createAssetInvites(
        @RequestParam(name = "businessId") String businessId,
        @RequestParam(name = "createAssetInvitesRequest") CreateAssetInvitesRequest createAssetInvitesRequest
    ) {
        return businessesService.createAssetInvites(businessId, createAssetInvitesRequest);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/{business_id}/invites")
    public CreateInvitesResultsResponseArray createMembershipOrPartnershipInvites(
        @RequestParam(name = "businessId") String businessId,
        @RequestParam(name = "createMembershipOrPartnershipInvitesBody") CreateMembershipOrPartnershipInvitesBody createMembershipOrPartnershipInvitesBody
    ) {
        return businessesService.createMembershipOrPartnershipInvites(businessId, createMembershipOrPartnershipInvitesBody);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/{business_id}/members")
    public DeleteBusinessMembership200Response deleteBusinessMembership(
        @RequestParam(name = "businessId") String businessId,
        @RequestParam(name = "deleteBusinessMembershipBody") DeleteBusinessMembershipBody deleteBusinessMembershipBody
    ) {
        return businessesService.deleteBusinessMembership(businessId, deleteBusinessMembershipBody);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/{business_id}/partners")
    public DeleteBusinessPartners deleteBusinessPartners(
        @RequestParam(name = "businessId") String businessId,
        @RequestParam(name = "deleteBusinessPartnersDelete") DeleteBusinessPartnersDelete deleteBusinessPartnersDelete
    ) {
        return businessesService.deleteBusinessPartners(businessId, deleteBusinessPartnersDelete);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/{business_id}/partners/assets")
    public DeletePartnerAssetAccessResultsResponseArray deletePartnerAssetAccessHandlerImpl(
        @RequestParam(name = "businessId") String businessId,
        @RequestParam(name = "deletePartnerAssetAccessBody") DeletePartnerAssetAccessBody deletePartnerAssetAccessBody
    ) {
        return businessesService.deletePartnerAssetAccessHandlerImpl(businessId, deletePartnerAssetAccessBody);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/employers")
    public GetBusinessEmployers200Response getBusinessEmployers(
        @RequestParam(name = "assetsSummary", defaultValue = "true") Boolean assetsSummary,
        @RequestParam(name = "bookmark") String bookmark,
        @RequestParam(name = "pageSize", defaultValue = "25") Integer pageSize
    ) {
        return businessesService.getBusinessEmployers(assetsSummary, bookmark, pageSize);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{business_id}/members")
    public GetBusinessEmployers200Response getBusinessMembers(
        @RequestParam(name = "businessId") String businessId,
        @RequestParam(name = "fetchSystemUsers", defaultValue = "false") Boolean fetchSystemUsers,
        @RequestParam(name = "assetsSummary", defaultValue = "false") Boolean assetsSummary,
        @RequestParam(name = "businessRoles") List<MemberBusinessRole> businessRoles,
        @RequestParam(name = "memberIds") String memberIds,
        @RequestParam(name = "startIndex", defaultValue = "0") Integer startIndex,
        @RequestParam(name = "bookmark") String bookmark,
        @RequestParam(name = "pageSize", defaultValue = "25") Integer pageSize
    ) {
        return businessesService.getBusinessMembers(businessId, fetchSystemUsers, assetsSummary, businessRoles, memberIds, startIndex, bookmark, pageSize);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{business_id}/partners")
    public GetBusinessEmployers200Response getBusinessPartners(
        @RequestParam(name = "businessId") String businessId,
        @RequestParam(name = "assetsSummary", defaultValue = "false") Boolean assetsSummary,
        @RequestParam(name = "partnerType") PartnerType partnerType,
        @RequestParam(name = "partnerIds") String partnerIds,
        @RequestParam(name = "startIndex", defaultValue = "0") Integer startIndex,
        @RequestParam(name = "sortAscending") Boolean sortAscending,
        @RequestParam(name = "bookmark") String bookmark,
        @RequestParam(name = "pageSize", defaultValue = "25") Integer pageSize
    ) {
        return businessesService.getBusinessPartners(businessId, assetsSummary, partnerType, partnerIds, startIndex, sortAscending, bookmark, pageSize);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{business_id}/invites")
    public GetInvites200Response getInvites(
        @RequestParam(name = "businessId") String businessId,
        @RequestParam(name = "isMember", defaultValue = "true") Boolean isMember,
        @RequestParam(name = "inviteStatus") List<InviteFilterStatus> inviteStatus,
        @RequestParam(name = "inviteType") InviteType inviteType,
        @RequestParam(name = "bookmark") String bookmark,
        @RequestParam(name = "pageSize", defaultValue = "25") Integer pageSize
    ) {
        return businessesService.getInvites(businessId, isMember, inviteStatus, inviteType, bookmark, pageSize);
    }

    @RequestMapping(method = RequestMethod.PATCH, value = "/invites")
    public RespondToInvitesResponseArray respondBusinessAccessInvites(
        @RequestParam(name = "authRespondInvitesBody") AuthRespondInvitesBody authRespondInvitesBody
    ) {
        return businessesService.respondBusinessAccessInvites(authRespondInvitesBody);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{business_id}/audiences")
    public SharedAudiencesForBusinessList200Response sharedAudiencesForBusinessList(
        @RequestParam(name = "businessId") String businessId,
        @RequestParam(name = "order") Order order,
        @RequestParam(name = "bookmark") String bookmark,
        @RequestParam(name = "pageSize", defaultValue = "25") Integer pageSize
    ) {
        return businessesService.sharedAudiencesForBusinessList(businessId, order, bookmark, pageSize);
    }

    @RequestMapping(method = RequestMethod.PATCH, value = "/{business_id}/system_users/{system_user_id}")
    public void systemUserUpdate(
        @RequestParam(name = "businessId") String businessId,
        @RequestParam(name = "systemUserId") String systemUserId,
        @RequestParam(name = "systemUserUpdateWithRequiredBody") SystemUserUpdateWithRequiredBody systemUserUpdateWithRequiredBody
    ) {
        businessesService.systemUserUpdate(businessId, systemUserId, systemUserUpdateWithRequiredBody);
    }

    @RequestMapping(method = RequestMethod.PATCH, value = "/{business_id}/members")
    public UpdateBusinessMembershipsResponse updateBusinessMemberships(
        @RequestParam(name = "businessId") String businessId,
        @RequestParam(name = "businessMembershipMember") List<BusinessMembershipMember> businessMembershipMember
    ) {
        return businessesService.updateBusinessMemberships(businessId, businessMembershipMember);
    }

    @RequestMapping(method = RequestMethod.PATCH, value = "/{business_id}/audiences/ad_accounts/shared")
    public BusinessToAdAccountSharedAudience updateBusinessToAdAccountSharedAudience(
        @RequestParam(name = "businessId") String businessId,
        @RequestParam(name = "businessToAdAccountSharedAudienceUpdateWithRequiredBody") BusinessToAdAccountSharedAudienceUpdateWithRequiredBody businessToAdAccountSharedAudienceUpdateWithRequiredBody
    ) {
        return businessesService.updateBusinessToAdAccountSharedAudience(businessId, businessToAdAccountSharedAudienceUpdateWithRequiredBody);
    }

    @RequestMapping(method = RequestMethod.PATCH, value = "/{business_id}/audiences/businesses/shared")
    public BusinessToBusinessSharedAudience updateBusinessToBusinessSharedAudience(
        @RequestParam(name = "businessId") String businessId,
        @RequestParam(name = "businessToBusinessSharedAudienceUpdateWithRequiredBody") BusinessToBusinessSharedAudienceUpdateWithRequiredBody businessToBusinessSharedAudienceUpdateWithRequiredBody
    ) {
        return businessesService.updateBusinessToBusinessSharedAudience(businessId, businessToBusinessSharedAudienceUpdateWithRequiredBody);
    }

    @RequestMapping(method = RequestMethod.PATCH, value = "/{business_id}/partners/assets")
    public UpdatePartnerAssetsResultsResponseArray updatePartnerAssetAccessHandlerImpl(
        @RequestParam(name = "businessId") String businessId,
        @RequestParam(name = "updatePartnerAssetAccessBody") UpdatePartnerAssetAccessBody updatePartnerAssetAccessBody
    ) {
        return businessesService.updatePartnerAssetAccessHandlerImpl(businessId, updatePartnerAssetAccessBody);
    }
}
