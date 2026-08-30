package org.openapitools.api.provider;

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
import org.apache.dubbo.config.annotation.DubboService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import javax.annotation.Generated;


@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

@DubboService
public class BusinessesServiceImpl implements BusinessesService {

    private static final Logger logger = LoggerFactory.getLogger(BusinessesServiceImpl.class);

    @Override
    public CreateAssetAccessRequestResponse assetAccessRequestsCreate(
        String businessId,
        CreateAssetAccessRequestBody createAssetAccessRequestBody
    ) {
        logger.info("Dubbo service method assetAccessRequestsCreate called with parameters: businessId={}, createAssetAccessRequestBody={}", businessId, createAssetAccessRequestBody);
        
        // TODO: Implement your business logic here
        // Replace this with actual implementation
        return null;
    }

    @Override
    public AssetGroupInput assetGroupCreate(
        String businessId,
        AssetGroupInputCreate assetGroupInputCreate
    ) {
        logger.info("Dubbo service method assetGroupCreate called with parameters: businessId={}, assetGroupInputCreate={}", businessId, assetGroupInputCreate);
        
        // TODO: Implement your business logic here
        // Replace this with actual implementation
        return null;
    }

    @Override
    public AssetGroupDeletion assetGroupDelete(
        String businessId,
        AssetGroupDeletionDelete assetGroupDeletionDelete
    ) {
        logger.info("Dubbo service method assetGroupDelete called with parameters: businessId={}, assetGroupDeletionDelete={}", businessId, assetGroupDeletionDelete);
        
        // TODO: Implement your business logic here
        // Replace this with actual implementation
        return null;
    }

    @Override
    public AssetGroupModification assetGroupUpdate(
        String businessId,
        AssetGroupModificationReadOrUpdate assetGroupModificationReadOrUpdate
    ) {
        logger.info("Dubbo service method assetGroupUpdate called with parameters: businessId={}, assetGroupModificationReadOrUpdate={}", businessId, assetGroupModificationReadOrUpdate);
        
        // TODO: Implement your business logic here
        // Replace this with actual implementation
        return null;
    }

    @Override
    public AdAccountsAudiencesSharedAccountsList200Response businessAccountAudiencesSharedAccountsList(
        String businessId,
        String audienceId,
        AudienceAccountType accountType,
        String bookmark,
        Integer pageSize
    ) {
        logger.info("Dubbo service method businessAccountAudiencesSharedAccountsList called with parameters: businessId={}, audienceId={}, accountType={}, bookmark={}, pageSize={}", businessId, audienceId, accountType, bookmark, pageSize);
        
        // TODO: Implement your business logic here
        // Replace this with actual implementation
        return null;
    }

    @Override
    public BusinessAssetMembersGet200Response businessAssetMembersGet(
        String businessId,
        String assetId,
        Integer startIndex,
        Boolean fetchSystemUsers,
        String bookmark,
        Integer pageSize
    ) {
        logger.info("Dubbo service method businessAssetMembersGet called with parameters: businessId={}, assetId={}, startIndex={}, fetchSystemUsers={}, bookmark={}, pageSize={}", businessId, assetId, startIndex, fetchSystemUsers, bookmark, pageSize);
        
        // TODO: Implement your business logic here
        // Replace this with actual implementation
        return null;
    }

    @Override
    public BusinessAssetMembersGet200Response businessAssetPartnersGet(
        String businessId,
        String assetId,
        Integer startIndex,
        String bookmark,
        Integer pageSize
    ) {
        logger.info("Dubbo service method businessAssetPartnersGet called with parameters: businessId={}, assetId={}, startIndex={}, bookmark={}, pageSize={}", businessId, assetId, startIndex, bookmark, pageSize);
        
        // TODO: Implement your business logic here
        // Replace this with actual implementation
        return null;
    }

    @Override
    public BusinessAssetsGet200Response businessAssetsGet(
        String businessId,
        List<PermissionsWithOwner> permissions,
        String childAssetId,
        String assetGroupId,
        String assetType,
        Integer startIndex,
        String bookmark,
        Integer pageSize
    ) {
        logger.info("Dubbo service method businessAssetsGet called with parameters: businessId={}, permissions={}, childAssetId={}, assetGroupId={}, assetType={}, startIndex={}, bookmark={}, pageSize={}", businessId, permissions, childAssetId, assetGroupId, assetType, startIndex, bookmark, pageSize);
        
        // TODO: Implement your business logic here
        // Replace this with actual implementation
        return null;
    }

    @Override
    public BusinessMemberAssetsGetResponse businessMemberAssetsGet(
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
    ) {
        logger.info("Dubbo service method businessMemberAssetsGet called with parameters: businessId={}, memberId={}, assetType={}, startIndex={}, sortBy={}, sortAscending={}, searchBy={}, searchValue={}, assetPermissionType={}, adAccountStatuses={}, bookmark={}, pageSize={}", businessId, memberId, assetType, startIndex, sortBy, sortAscending, searchBy, searchValue, assetPermissionType, adAccountStatuses, bookmark, pageSize);
        
        // TODO: Implement your business logic here
        // Replace this with actual implementation
        return null;
    }

    @Override
    public DeleteMemberAccessResultsResponseArray businessMembersAssetAccessDelete(
        String businessId,
        BusinessMembersAssetAccessDeleteBody businessMembersAssetAccessDeleteBody
    ) {
        logger.info("Dubbo service method businessMembersAssetAccessDelete called with parameters: businessId={}, businessMembersAssetAccessDeleteBody={}", businessId, businessMembersAssetAccessDeleteBody);
        
        // TODO: Implement your business logic here
        // Replace this with actual implementation
        return null;
    }

    @Override
    public UpdateMemberAssetsResultsResponseArray businessMembersAssetAccessUpdate(
        String businessId,
        UpdateMemberAssetAccessBody updateMemberAssetAccessBody
    ) {
        logger.info("Dubbo service method businessMembersAssetAccessUpdate called with parameters: businessId={}, updateMemberAssetAccessBody={}", businessId, updateMemberAssetAccessBody);
        
        // TODO: Implement your business logic here
        // Replace this with actual implementation
        return null;
    }

    @Override
    public BusinessPartnerAssetAccessGet200Response businessPartnerAssetAccessGet(
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
    ) {
        logger.info("Dubbo service method businessPartnerAssetAccessGet called with parameters: businessId={}, partnerId={}, partnerType={}, assetType={}, startIndex={}, sortBy={}, sortAscending={}, searchBy={}, searchValue={}, bookmark={}, pageSize={}", businessId, partnerId, partnerType, assetType, startIndex, sortBy, sortAscending, searchBy, searchValue, bookmark, pageSize);
        
        // TODO: Implement your business logic here
        // Replace this with actual implementation
        return null;
    }

    @Override
    public CancelInvitesResponse cancelInvitesOrRequests(
        String businessId,
        CancelInvitesRequest cancelInvitesRequest
    ) {
        logger.info("Dubbo service method cancelInvitesOrRequests called with parameters: businessId={}, cancelInvitesRequest={}", businessId, cancelInvitesRequest);
        
        // TODO: Implement your business logic here
        // Replace this with actual implementation
        return null;
    }

    @Override
    public UpdateInvitesResultsResponseArray createAssetInvites(
        String businessId,
        CreateAssetInvitesRequest createAssetInvitesRequest
    ) {
        logger.info("Dubbo service method createAssetInvites called with parameters: businessId={}, createAssetInvitesRequest={}", businessId, createAssetInvitesRequest);
        
        // TODO: Implement your business logic here
        // Replace this with actual implementation
        return null;
    }

    @Override
    public CreateInvitesResultsResponseArray createMembershipOrPartnershipInvites(
        String businessId,
        CreateMembershipOrPartnershipInvitesBody createMembershipOrPartnershipInvitesBody
    ) {
        logger.info("Dubbo service method createMembershipOrPartnershipInvites called with parameters: businessId={}, createMembershipOrPartnershipInvitesBody={}", businessId, createMembershipOrPartnershipInvitesBody);
        
        // TODO: Implement your business logic here
        // Replace this with actual implementation
        return null;
    }

    @Override
    public DeleteBusinessMembership200Response deleteBusinessMembership(
        String businessId,
        DeleteBusinessMembershipBody deleteBusinessMembershipBody
    ) {
        logger.info("Dubbo service method deleteBusinessMembership called with parameters: businessId={}, deleteBusinessMembershipBody={}", businessId, deleteBusinessMembershipBody);
        
        // TODO: Implement your business logic here
        // Replace this with actual implementation
        return null;
    }

    @Override
    public DeleteBusinessPartners deleteBusinessPartners(
        String businessId,
        DeleteBusinessPartnersDelete deleteBusinessPartnersDelete
    ) {
        logger.info("Dubbo service method deleteBusinessPartners called with parameters: businessId={}, deleteBusinessPartnersDelete={}", businessId, deleteBusinessPartnersDelete);
        
        // TODO: Implement your business logic here
        // Replace this with actual implementation
        return null;
    }

    @Override
    public DeletePartnerAssetAccessResultsResponseArray deletePartnerAssetAccessHandlerImpl(
        String businessId,
        DeletePartnerAssetAccessBody deletePartnerAssetAccessBody
    ) {
        logger.info("Dubbo service method deletePartnerAssetAccessHandlerImpl called with parameters: businessId={}, deletePartnerAssetAccessBody={}", businessId, deletePartnerAssetAccessBody);
        
        // TODO: Implement your business logic here
        // Replace this with actual implementation
        return null;
    }

    @Override
    public GetBusinessEmployers200Response getBusinessEmployers(
        Boolean assetsSummary,
        String bookmark,
        Integer pageSize
    ) {
        logger.info("Dubbo service method getBusinessEmployers called with parameters: assetsSummary={}, bookmark={}, pageSize={}", assetsSummary, bookmark, pageSize);
        
        // TODO: Implement your business logic here
        // Replace this with actual implementation
        return null;
    }

    @Override
    public GetBusinessEmployers200Response getBusinessMembers(
        String businessId,
        Boolean fetchSystemUsers,
        Boolean assetsSummary,
        List<MemberBusinessRole> businessRoles,
        String memberIds,
        Integer startIndex,
        String bookmark,
        Integer pageSize
    ) {
        logger.info("Dubbo service method getBusinessMembers called with parameters: businessId={}, fetchSystemUsers={}, assetsSummary={}, businessRoles={}, memberIds={}, startIndex={}, bookmark={}, pageSize={}", businessId, fetchSystemUsers, assetsSummary, businessRoles, memberIds, startIndex, bookmark, pageSize);
        
        // TODO: Implement your business logic here
        // Replace this with actual implementation
        return null;
    }

    @Override
    public GetBusinessEmployers200Response getBusinessPartners(
        String businessId,
        Boolean assetsSummary,
        PartnerType partnerType,
        String partnerIds,
        Integer startIndex,
        Boolean sortAscending,
        String bookmark,
        Integer pageSize
    ) {
        logger.info("Dubbo service method getBusinessPartners called with parameters: businessId={}, assetsSummary={}, partnerType={}, partnerIds={}, startIndex={}, sortAscending={}, bookmark={}, pageSize={}", businessId, assetsSummary, partnerType, partnerIds, startIndex, sortAscending, bookmark, pageSize);
        
        // TODO: Implement your business logic here
        // Replace this with actual implementation
        return null;
    }

    @Override
    public GetInvites200Response getInvites(
        String businessId,
        Boolean isMember,
        List<InviteFilterStatus> inviteStatus,
        InviteType inviteType,
        String bookmark,
        Integer pageSize
    ) {
        logger.info("Dubbo service method getInvites called with parameters: businessId={}, isMember={}, inviteStatus={}, inviteType={}, bookmark={}, pageSize={}", businessId, isMember, inviteStatus, inviteType, bookmark, pageSize);
        
        // TODO: Implement your business logic here
        // Replace this with actual implementation
        return null;
    }

    @Override
    public RespondToInvitesResponseArray respondBusinessAccessInvites(
        AuthRespondInvitesBody authRespondInvitesBody
    ) {
        logger.info("Dubbo service method respondBusinessAccessInvites called with parameters: authRespondInvitesBody={}", authRespondInvitesBody);
        
        // TODO: Implement your business logic here
        // Replace this with actual implementation
        return null;
    }

    @Override
    public SharedAudiencesForBusinessList200Response sharedAudiencesForBusinessList(
        String businessId,
        Order order,
        String bookmark,
        Integer pageSize
    ) {
        logger.info("Dubbo service method sharedAudiencesForBusinessList called with parameters: businessId={}, order={}, bookmark={}, pageSize={}", businessId, order, bookmark, pageSize);
        
        // TODO: Implement your business logic here
        // Replace this with actual implementation
        return null;
    }

    @Override
    public void systemUserUpdate(
        String businessId,
        String systemUserId,
        SystemUserUpdateWithRequiredBody systemUserUpdateWithRequiredBody
    ) {
        logger.info("Dubbo service method systemUserUpdate called with parameters: businessId={}, systemUserId={}, systemUserUpdateWithRequiredBody={}", businessId, systemUserId, systemUserUpdateWithRequiredBody);
        
        // TODO: Implement your business logic here
    }

    @Override
    public UpdateBusinessMembershipsResponse updateBusinessMemberships(
        String businessId,
        List<BusinessMembershipMember> businessMembershipMember
    ) {
        logger.info("Dubbo service method updateBusinessMemberships called with parameters: businessId={}, businessMembershipMember={}", businessId, businessMembershipMember);
        
        // TODO: Implement your business logic here
        // Replace this with actual implementation
        return null;
    }

    @Override
    public BusinessToAdAccountSharedAudience updateBusinessToAdAccountSharedAudience(
        String businessId,
        BusinessToAdAccountSharedAudienceUpdateWithRequiredBody businessToAdAccountSharedAudienceUpdateWithRequiredBody
    ) {
        logger.info("Dubbo service method updateBusinessToAdAccountSharedAudience called with parameters: businessId={}, businessToAdAccountSharedAudienceUpdateWithRequiredBody={}", businessId, businessToAdAccountSharedAudienceUpdateWithRequiredBody);
        
        // TODO: Implement your business logic here
        // Replace this with actual implementation
        return null;
    }

    @Override
    public BusinessToBusinessSharedAudience updateBusinessToBusinessSharedAudience(
        String businessId,
        BusinessToBusinessSharedAudienceUpdateWithRequiredBody businessToBusinessSharedAudienceUpdateWithRequiredBody
    ) {
        logger.info("Dubbo service method updateBusinessToBusinessSharedAudience called with parameters: businessId={}, businessToBusinessSharedAudienceUpdateWithRequiredBody={}", businessId, businessToBusinessSharedAudienceUpdateWithRequiredBody);
        
        // TODO: Implement your business logic here
        // Replace this with actual implementation
        return null;
    }

    @Override
    public UpdatePartnerAssetsResultsResponseArray updatePartnerAssetAccessHandlerImpl(
        String businessId,
        UpdatePartnerAssetAccessBody updatePartnerAssetAccessBody
    ) {
        logger.info("Dubbo service method updatePartnerAssetAccessHandlerImpl called with parameters: businessId={}, updatePartnerAssetAccessBody={}", businessId, updatePartnerAssetAccessBody);
        
        // TODO: Implement your business logic here
        // Replace this with actual implementation
        return null;
    }
}
