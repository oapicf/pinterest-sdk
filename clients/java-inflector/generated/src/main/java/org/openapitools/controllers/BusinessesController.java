package org.openapitools.controllers;

import io.swagger.inflector.models.RequestContext;
import io.swagger.inflector.models.ResponseContext;
import javax.ws.rs.core.Response.Status;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;
import java.io.File;
import java.util.List;

import org.openapitools.model.*;

import org.openapitools.model.AdAccountsAudiencesSharedAccountsList200Response;
import org.openapitools.model.AudienceAccountType;
import org.openapitools.model.AudiencesList200Response;
import org.openapitools.model.AuthRespondInvitesBody;
import org.openapitools.model.BusinessAssetMembersGet200Response;
import org.openapitools.model.BusinessAssetPartnersGet200Response;
import org.openapitools.model.BusinessAssetsGet200Response;
import org.openapitools.model.BusinessMemberAssetsGet200Response;
import org.openapitools.model.BusinessMembersAssetAccessDeleteRequest;
import org.openapitools.model.BusinessPartnerAssetAccessGet200Response;
import org.openapitools.model.BusinessSharedAudience;
import org.openapitools.model.BusinessSharedAudienceResponse;
import org.openapitools.model.CancelInvitesBody;
import org.openapitools.model.CreateAssetAccessRequestBody;
import org.openapitools.model.CreateAssetAccessRequestResponse;
import org.openapitools.model.CreateAssetGroupBody;
import org.openapitools.model.CreateAssetGroupResponse;
import org.openapitools.model.CreateAssetInvitesRequest;
import org.openapitools.model.CreateInvitesResultsResponseArray;
import org.openapitools.model.CreateMembershipOrPartnershipInvitesBody;
import org.openapitools.model.DeleteAssetGroupBody;
import org.openapitools.model.DeleteAssetGroupResponse;
import org.openapitools.model.DeleteInvitesResultsResponseArray;
import org.openapitools.model.DeleteMemberAccessResultsResponseArray;
import org.openapitools.model.DeletePartnerAssetAccessBody;
import org.openapitools.model.DeletePartnerAssetsResultsResponseArray;
import org.openapitools.model.DeletePartnersRequest;
import org.openapitools.model.DeletePartnersResponse;
import org.openapitools.model.DeletedMembersResponse;
import org.openapitools.model.Error;
import org.openapitools.model.GetBusinessEmployers200Response;
import org.openapitools.model.GetBusinessMembers200Response;
import org.openapitools.model.GetBusinessPartners200Response;
import org.openapitools.model.GetInvites200Response;
import org.openapitools.model.InviteType;
import java.util.List;
import org.openapitools.model.MemberBusinessRole;
import org.openapitools.model.MembersToDeleteBody;
import org.openapitools.model.PartnerType;
import org.openapitools.model.PermissionsWithOwner;
import org.openapitools.model.RespondToInvitesResponseArray;
import org.openapitools.model.SharedAudience;
import org.openapitools.model.SharedAudienceResponse;
import org.openapitools.model.UpdateAssetGroupBody;
import org.openapitools.model.UpdateAssetGroupResponse;
import org.openapitools.model.UpdateInvitesResultsResponseArray;
import org.openapitools.model.UpdateMemberAssetAccessBody;
import org.openapitools.model.UpdateMemberAssetsResultsResponseArray;
import org.openapitools.model.UpdateMemberBusinessRoleBody;
import org.openapitools.model.UpdateMemberResultsResponseArray;
import org.openapitools.model.UpdatePartnerAssetAccessBody;
import org.openapitools.model.UpdatePartnerAssetsResultsResponseArray;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2024-11-05T02:02:36.960464654Z[Etc/UTC]", comments = "Generator version: 7.9.0")
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
    public ResponseContext assetGroupCreate(RequestContext request , String businessId, CreateAssetGroupBody createAssetGroupBody) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext assetGroupDelete(RequestContext request , String businessId, DeleteAssetGroupBody deleteAssetGroupBody) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext assetGroupUpdate(RequestContext request , String businessId, UpdateAssetGroupBody updateAssetGroupBody) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext businessAccountAudiencesSharedAccountsList(RequestContext request , String businessId, String audienceId, AudienceAccountType accountType, Integer pageSize, String bookmark) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext businessAssetMembersGet(RequestContext request , String businessId, String assetId, String bookmark, Integer pageSize, Integer startIndex) {
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
    public ResponseContext businessMemberAssetsGet(RequestContext request , String businessId, String memberId, String assetType, Integer startIndex, String bookmark, Integer pageSize) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext businessMembersAssetAccessDelete(RequestContext request , String businessId, BusinessMembersAssetAccessDeleteRequest businessMembersAssetAccessDeleteRequest) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext businessMembersAssetAccessUpdate(RequestContext request , String businessId, UpdateMemberAssetAccessBody updateMemberAssetAccessBody) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext businessPartnerAssetAccessGet(RequestContext request , String businessId, String partnerId, PartnerType partnerType, String assetType, Integer startIndex, Integer pageSize, String bookmark) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext cancelInvitesOrRequests(RequestContext request , String businessId, CancelInvitesBody cancelInvitesBody) {
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
    public ResponseContext deleteBusinessMembership(RequestContext request , String businessId, MembersToDeleteBody membersToDeleteBody) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext deleteBusinessPartners(RequestContext request , String businessId, DeletePartnersRequest deletePartnersRequest) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext deletePartnerAssetAccessHandlerImpl(RequestContext request , String businessId, DeletePartnerAssetAccessBody deletePartnerAssetAccessBody) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext getBusinessEmployers(RequestContext request , Integer pageSize, String bookmark) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext getBusinessMembers(RequestContext request , String businessId, Boolean assetsSummary, List<MemberBusinessRole> businessRoles, String memberIds, Integer startIndex, String bookmark, Integer pageSize) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext getBusinessPartners(RequestContext request , String businessId, Boolean assetsSummary, PartnerType partnerType, String partnerIds, Integer startIndex, Integer pageSize, String bookmark) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext getInvites(RequestContext request , String businessId, Boolean isMember, List<String> inviteStatus, InviteType inviteType, String bookmark, Integer pageSize) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext respondBusinessAccessInvites(RequestContext request , AuthRespondInvitesBody authRespondInvitesBody) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext sharedAudiencesForBusinessList(RequestContext request , String businessId, String bookmark, String order, Integer pageSize) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext updateBusinessMemberships(RequestContext request , String businessId, List<UpdateMemberBusinessRoleBody> updateMemberBusinessRoleBody) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext updateBusinessToAdAccountSharedAudience(RequestContext request , String businessId, SharedAudience sharedAudience) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext updateBusinessToBusinessSharedAudience(RequestContext request , String businessId, BusinessSharedAudience businessSharedAudience) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

  /*
    public ResponseContext updatePartnerAssetAccessHandlerImpl(RequestContext request , String businessId, UpdatePartnerAssetAccessBody updatePartnerAssetAccessBody) {
        return new ResponseContext().status(Status.INTERNAL_SERVER_ERROR).entity( "Not implemented" );
    }
  */

}
