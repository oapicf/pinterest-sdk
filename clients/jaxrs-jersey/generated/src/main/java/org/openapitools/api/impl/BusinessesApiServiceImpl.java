package org.openapitools.api.impl;

import org.openapitools.api.*;
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

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import org.glassfish.jersey.media.multipart.FormDataBodyPart;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.validation.constraints.*;
import javax.validation.Valid;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2026-08-30T09:54:14.357431345Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class BusinessesApiServiceImpl extends BusinessesApiService {
    @Override
    public Response assetAccessRequestsCreate( @Pattern(regexp="^\\d+$") @Size(min=1,max=20)String businessId, CreateAssetAccessRequestBody createAssetAccessRequestBody, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response assetGroupCreate( @Pattern(regexp="^\\d+$") @Size(min=1,max=20)String businessId, AssetGroupInputCreate assetGroupInputCreate, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response assetGroupDelete( @Pattern(regexp="^\\d+$") @Size(min=1,max=20)String businessId, AssetGroupDeletionDelete assetGroupDeletionDelete, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response assetGroupUpdate( @Pattern(regexp="^\\d+$") @Size(min=1,max=20)String businessId, AssetGroupModificationReadOrUpdate assetGroupModificationReadOrUpdate, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response businessAccountAudiencesSharedAccountsList( @Pattern(regexp="^\\d+$") @Size(min=1,max=20)String businessId,  @NotNull  @Pattern(regexp="^\\d+$") @Size(max=18)String audienceId,  @NotNull AudienceAccountType accountType, String bookmark,  @Min(1) @Max(250)Integer pageSize, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response businessAssetMembersGet( @Pattern(regexp="^\\d+$") @Size(min=1,max=20)String businessId,  @Pattern(regexp="^\\d+$") @Size(min=1,max=20)String assetId,  @Min(0)Integer startIndex, Boolean fetchSystemUsers, String bookmark,  @Min(1) @Max(250)Integer pageSize, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response businessAssetPartnersGet( @Pattern(regexp="^\\d+$") @Size(min=1,max=20)String businessId,  @Pattern(regexp="^\\d+$") @Size(min=1,max=20)String assetId,  @Min(0)Integer startIndex, String bookmark,  @Min(1) @Max(250)Integer pageSize, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response businessAssetsGet( @Pattern(regexp="^\\d+$") @Size(min=1,max=20)String businessId, List<PermissionsWithOwner> permissions,  @Pattern(regexp="^\\d+$") @Size(min=1,max=20)String childAssetId,  @Pattern(regexp="^\\d+$") @Size(min=1,max=20)String assetGroupId, String assetType,  @Min(0)Integer startIndex, String bookmark,  @Min(1) @Max(250)Integer pageSize, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response businessMemberAssetsGet( @Pattern(regexp="^\\d+$") @Size(min=1,max=20)String businessId,  @Pattern(regexp="^\\d+$") @Size(min=1,max=20)String memberId, String assetType,  @Min(0)Integer startIndex, AssetSortBy sortBy, Boolean sortAscending, AssetSearchBy searchBy, String searchValue, AssetPermissionType assetPermissionType, List<NonDraftEntityStatus> adAccountStatuses, String bookmark,  @Min(1) @Max(250)Integer pageSize, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response businessMembersAssetAccessDelete( @Pattern(regexp="^\\d+$") @Size(min=1,max=20)String businessId, BusinessMembersAssetAccessDeleteBody businessMembersAssetAccessDeleteBody, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response businessMembersAssetAccessUpdate( @Pattern(regexp="^\\d+$") @Size(min=1,max=20)String businessId, UpdateMemberAssetAccessBody updateMemberAssetAccessBody, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response businessPartnerAssetAccessGet( @Pattern(regexp="^\\d+$") @Size(min=1,max=20)String businessId,  @Pattern(regexp="^\\d+$") @Size(min=1,max=20)String partnerId, String partnerType, String assetType,  @Min(0)Integer startIndex, AssetSortBy sortBy, Boolean sortAscending, AssetSearchBy searchBy, String searchValue, String bookmark,  @Min(1) @Max(250)Integer pageSize, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response cancelInvitesOrRequests( @Pattern(regexp="^\\d+$") @Size(min=1)String businessId, CancelInvitesRequest cancelInvitesRequest, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response createAssetInvites( @Pattern(regexp="^\\d+$") @Size(min=1,max=20)String businessId, CreateAssetInvitesRequest createAssetInvitesRequest, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response createMembershipOrPartnershipInvites( @Pattern(regexp="^\\d+$") @Size(min=1)String businessId, CreateMembershipOrPartnershipInvitesBody createMembershipOrPartnershipInvitesBody, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response deleteBusinessMembership( @Pattern(regexp="^\\d+$") @Size(min=1,max=20)String businessId, DeleteBusinessMembershipBody deleteBusinessMembershipBody, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response deleteBusinessPartners( @Pattern(regexp="^\\d+$") @Size(min=1,max=20)String businessId, DeleteBusinessPartnersDelete deleteBusinessPartnersDelete, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response deletePartnerAssetAccessHandlerImpl( @Pattern(regexp="^\\d+$") @Size(min=1,max=20)String businessId, DeletePartnerAssetAccessBody deletePartnerAssetAccessBody, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response getBusinessEmployers(Boolean assetsSummary, String bookmark,  @Min(1) @Max(250)Integer pageSize, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response getBusinessMembers( @Pattern(regexp="^\\d+$") @Size(min=1,max=20)String businessId, Boolean fetchSystemUsers, Boolean assetsSummary, List<MemberBusinessRole> businessRoles,  @Size(max=500)String memberIds,  @Min(0)Integer startIndex, String bookmark,  @Min(1) @Max(250)Integer pageSize, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response getBusinessPartners( @Pattern(regexp="^\\d+$") @Size(min=1,max=20)String businessId, Boolean assetsSummary, PartnerType partnerType,  @Size(max=500)String partnerIds,  @Min(0)Integer startIndex, Boolean sortAscending, String bookmark,  @Min(1) @Max(250)Integer pageSize, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response getInvites( @Pattern(regexp="^\\d+$") @Size(min=1)String businessId, Boolean isMember,  @Size(min=1)List<InviteFilterStatus> inviteStatus, InviteType inviteType, String bookmark,  @Min(1) @Max(250)Integer pageSize, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response respondBusinessAccessInvites(AuthRespondInvitesBody authRespondInvitesBody, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response sharedAudiencesForBusinessList( @Pattern(regexp="^\\d+$") @Size(min=1,max=20)String businessId, Order order, String bookmark,  @Min(1) @Max(250)Integer pageSize, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response systemUserUpdate( @Pattern(regexp="^\\d+$") @Size(min=1,max=20)String businessId,  @Pattern(regexp="^\\d+$") @Size(min=1,max=20)String systemUserId, SystemUserUpdateWithRequiredBody systemUserUpdateWithRequiredBody, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response updateBusinessMemberships( @Pattern(regexp="^\\d+$") @Size(min=1,max=20)String businessId, List<@Valid BusinessMembershipMember> businessMembershipMember, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response updateBusinessToAdAccountSharedAudience( @Pattern(regexp="^\\d+$") @Size(min=1,max=20)String businessId, BusinessToAdAccountSharedAudienceUpdateWithRequiredBody businessToAdAccountSharedAudienceUpdateWithRequiredBody, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response updateBusinessToBusinessSharedAudience( @Pattern(regexp="^\\d+$") @Size(min=1,max=20)String businessId, BusinessToBusinessSharedAudienceUpdateWithRequiredBody businessToBusinessSharedAudienceUpdateWithRequiredBody, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
    @Override
    public Response updatePartnerAssetAccessHandlerImpl( @Pattern(regexp="^\\d+$") @Size(min=1,max=20)String businessId, UpdatePartnerAssetAccessBody updatePartnerAssetAccessBody, SecurityContext securityContext) throws NotFoundException {
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
}
