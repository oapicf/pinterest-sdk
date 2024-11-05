package org.openapitools.api;

import org.openapitools.api.*;
import org.openapitools.model.*;

import org.apache.cxf.jaxrs.ext.multipart.Attachment;
import org.apache.cxf.jaxrs.ext.multipart.Multipart;

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

import java.util.List;

import java.io.InputStream;

import javax.validation.constraints.*;
import javax.validation.Valid;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSCXFCDIServerCodegen", date = "2024-11-05T02:19:42.400563355Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public interface BusinessesApiService {
      public Response assetAccessRequestsCreate(String businessId, CreateAssetAccessRequestBody createAssetAccessRequestBody, SecurityContext securityContext);
      public Response assetGroupCreate(String businessId, CreateAssetGroupBody createAssetGroupBody, SecurityContext securityContext);
      public Response assetGroupDelete(String businessId, DeleteAssetGroupBody deleteAssetGroupBody, SecurityContext securityContext);
      public Response assetGroupUpdate(String businessId, UpdateAssetGroupBody updateAssetGroupBody, SecurityContext securityContext);
      public Response businessAccountAudiencesSharedAccountsList(String businessId, String audienceId, AudienceAccountType accountType, Integer pageSize, String bookmark, SecurityContext securityContext);
      public Response businessAssetMembersGet(String businessId, String assetId, String bookmark, Integer pageSize, Integer startIndex, SecurityContext securityContext);
      public Response businessAssetPartnersGet(String businessId, String assetId, Integer startIndex, String bookmark, Integer pageSize, SecurityContext securityContext);
      public Response businessAssetsGet(String businessId, List<PermissionsWithOwner> permissions, String childAssetId, String assetGroupId, String assetType, Integer startIndex, String bookmark, Integer pageSize, SecurityContext securityContext);
      public Response businessMemberAssetsGet(String businessId, String memberId, String assetType, Integer startIndex, String bookmark, Integer pageSize, SecurityContext securityContext);
      public Response businessMembersAssetAccessDelete(String businessId, BusinessMembersAssetAccessDeleteRequest businessMembersAssetAccessDeleteRequest, SecurityContext securityContext);
      public Response businessMembersAssetAccessUpdate(String businessId, UpdateMemberAssetAccessBody updateMemberAssetAccessBody, SecurityContext securityContext);
      public Response businessPartnerAssetAccessGet(String businessId, String partnerId, PartnerType partnerType, String assetType, Integer startIndex, Integer pageSize, String bookmark, SecurityContext securityContext);
      public Response cancelInvitesOrRequests(String businessId, CancelInvitesBody cancelInvitesBody, SecurityContext securityContext);
      public Response createAssetInvites(String businessId, CreateAssetInvitesRequest createAssetInvitesRequest, SecurityContext securityContext);
      public Response createMembershipOrPartnershipInvites(String businessId, CreateMembershipOrPartnershipInvitesBody createMembershipOrPartnershipInvitesBody, SecurityContext securityContext);
      public Response deleteBusinessMembership(String businessId, MembersToDeleteBody membersToDeleteBody, SecurityContext securityContext);
      public Response deleteBusinessPartners(String businessId, DeletePartnersRequest deletePartnersRequest, SecurityContext securityContext);
      public Response deletePartnerAssetAccessHandlerImpl(String businessId, DeletePartnerAssetAccessBody deletePartnerAssetAccessBody, SecurityContext securityContext);
      public Response getBusinessEmployers(Integer pageSize, String bookmark, SecurityContext securityContext);
      public Response getBusinessMembers(String businessId, Boolean assetsSummary, List<MemberBusinessRole> businessRoles, String memberIds, Integer startIndex, String bookmark, Integer pageSize, SecurityContext securityContext);
      public Response getBusinessPartners(String businessId, Boolean assetsSummary, PartnerType partnerType, String partnerIds, Integer startIndex, Integer pageSize, String bookmark, SecurityContext securityContext);
      public Response getInvites(String businessId, Boolean isMember, List<String> inviteStatus, InviteType inviteType, String bookmark, Integer pageSize, SecurityContext securityContext);
      public Response respondBusinessAccessInvites(AuthRespondInvitesBody authRespondInvitesBody, SecurityContext securityContext);
      public Response sharedAudiencesForBusinessList(String businessId, String bookmark, String order, Integer pageSize, SecurityContext securityContext);
      public Response updateBusinessMemberships(String businessId, List<@Valid UpdateMemberBusinessRoleBody> updateMemberBusinessRoleBody, SecurityContext securityContext);
      public Response updateBusinessToAdAccountSharedAudience(String businessId, SharedAudience sharedAudience, SecurityContext securityContext);
      public Response updateBusinessToBusinessSharedAudience(String businessId, BusinessSharedAudience businessSharedAudience, SecurityContext securityContext);
      public Response updatePartnerAssetAccessHandlerImpl(String businessId, UpdatePartnerAssetAccessBody updatePartnerAssetAccessBody, SecurityContext securityContext);
}
