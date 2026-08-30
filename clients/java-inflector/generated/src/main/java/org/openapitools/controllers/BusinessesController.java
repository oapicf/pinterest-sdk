package org.openapitools.controllers;

import io.swagger.inflector.models.RequestContext;
import io.swagger.inflector.models.ResponseContext;
import javax.ws.rs.core.Response.Status;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;
import java.io.File;
import java.util.List;

import org.openapitools.model.*;

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
import java.util.List;
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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2026-08-30T09:52:16.246263874Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class BusinessesController  {
  /**
   * Uncomment and implement as you see fit.  These operations will map
   * Directly to operation calls from the routing logic.  Because the inflector
   * Code allows you to implement logic incrementally, they are disabled.
   **/

  /*
    public ResponseContext assetAccessRequestsCreate(RequestContext request , String businessId, CreateAssetAccessRequestBody createAssetAccessRequestBody) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext assetGroupCreate(RequestContext request , String businessId, AssetGroupInputCreate assetGroupInputCreate) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext assetGroupDelete(RequestContext request , String businessId, AssetGroupDeletionDelete assetGroupDeletionDelete) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext assetGroupUpdate(RequestContext request , String businessId, AssetGroupModificationReadOrUpdate assetGroupModificationReadOrUpdate) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext businessAccountAudiencesSharedAccountsList(RequestContext request , String businessId, String audienceId, AudienceAccountType accountType, String bookmark, Integer pageSize) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext businessAssetMembersGet(RequestContext request , String businessId, String assetId, Integer startIndex, Boolean fetchSystemUsers, String bookmark, Integer pageSize) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext businessAssetPartnersGet(RequestContext request , String businessId, String assetId, Integer startIndex, String bookmark, Integer pageSize) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext businessAssetsGet(RequestContext request , String businessId, List<PermissionsWithOwner> permissions, String childAssetId, String assetGroupId, String assetType, Integer startIndex, String bookmark, Integer pageSize) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext businessMemberAssetsGet(RequestContext request , String businessId, String memberId, String assetType, Integer startIndex, AssetSortBy sortBy, Boolean sortAscending, AssetSearchBy searchBy, String searchValue, AssetPermissionType assetPermissionType, List<NonDraftEntityStatus> adAccountStatuses, String bookmark, Integer pageSize) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext businessMembersAssetAccessDelete(RequestContext request , String businessId, BusinessMembersAssetAccessDeleteBody businessMembersAssetAccessDeleteBody) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext businessMembersAssetAccessUpdate(RequestContext request , String businessId, UpdateMemberAssetAccessBody updateMemberAssetAccessBody) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext businessPartnerAssetAccessGet(RequestContext request , String businessId, String partnerId, String partnerType, String assetType, Integer startIndex, AssetSortBy sortBy, Boolean sortAscending, AssetSearchBy searchBy, String searchValue, String bookmark, Integer pageSize) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext cancelInvitesOrRequests(RequestContext request , String businessId, CancelInvitesRequest cancelInvitesRequest) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext createAssetInvites(RequestContext request , String businessId, CreateAssetInvitesRequest createAssetInvitesRequest) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext createMembershipOrPartnershipInvites(RequestContext request , String businessId, CreateMembershipOrPartnershipInvitesBody createMembershipOrPartnershipInvitesBody) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext deleteBusinessMembership(RequestContext request , String businessId, DeleteBusinessMembershipBody deleteBusinessMembershipBody) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext deleteBusinessPartners(RequestContext request , String businessId, DeleteBusinessPartnersDelete deleteBusinessPartnersDelete) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext deletePartnerAssetAccessHandlerImpl(RequestContext request , String businessId, DeletePartnerAssetAccessBody deletePartnerAssetAccessBody) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext getBusinessEmployers(RequestContext request , Boolean assetsSummary, String bookmark, Integer pageSize) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext getBusinessMembers(RequestContext request , String businessId, Boolean fetchSystemUsers, Boolean assetsSummary, List<MemberBusinessRole> businessRoles, String memberIds, Integer startIndex, String bookmark, Integer pageSize) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext getBusinessPartners(RequestContext request , String businessId, Boolean assetsSummary, PartnerType partnerType, String partnerIds, Integer startIndex, Boolean sortAscending, String bookmark, Integer pageSize) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext getInvites(RequestContext request , String businessId, Boolean isMember, List<InviteFilterStatus> inviteStatus, InviteType inviteType, String bookmark, Integer pageSize) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext respondBusinessAccessInvites(RequestContext request , AuthRespondInvitesBody authRespondInvitesBody) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext sharedAudiencesForBusinessList(RequestContext request , String businessId, Order order, String bookmark, Integer pageSize) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext systemUserUpdate(RequestContext request , String businessId, String systemUserId, SystemUserUpdateWithRequiredBody systemUserUpdateWithRequiredBody) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext updateBusinessMemberships(RequestContext request , String businessId, List<BusinessMembershipMember> businessMembershipMember) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext updateBusinessToAdAccountSharedAudience(RequestContext request , String businessId, BusinessToAdAccountSharedAudienceUpdateWithRequiredBody businessToAdAccountSharedAudienceUpdateWithRequiredBody) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext updateBusinessToBusinessSharedAudience(RequestContext request , String businessId, BusinessToBusinessSharedAudienceUpdateWithRequiredBody businessToBusinessSharedAudienceUpdateWithRequiredBody) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext updatePartnerAssetAccessHandlerImpl(RequestContext request , String businessId, UpdatePartnerAssetAccessBody updatePartnerAssetAccessBody) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

}
