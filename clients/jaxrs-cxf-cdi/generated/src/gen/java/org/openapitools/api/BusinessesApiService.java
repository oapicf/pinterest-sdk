package org.openapitools.api;

import org.openapitools.api.*;
import org.openapitools.model.*;

import org.apache.cxf.jaxrs.ext.multipart.Attachment;
import org.apache.cxf.jaxrs.ext.multipart.Multipart;

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

import java.io.InputStream;

import javax.validation.constraints.*;
import javax.validation.Valid;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSCXFCDIServerCodegen", date = "2026-08-30T09:54:04.171825690Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public interface BusinessesApiService {
      public Response assetAccessRequestsCreate(String businessId, CreateAssetAccessRequestBody createAssetAccessRequestBody, SecurityContext securityContext);
      public Response assetGroupCreate(String businessId, AssetGroupInputCreate assetGroupInputCreate, SecurityContext securityContext);
      public Response assetGroupDelete(String businessId, AssetGroupDeletionDelete assetGroupDeletionDelete, SecurityContext securityContext);
      public Response assetGroupUpdate(String businessId, AssetGroupModificationReadOrUpdate assetGroupModificationReadOrUpdate, SecurityContext securityContext);
      public Response businessAccountAudiencesSharedAccountsList(String businessId, String audienceId, AudienceAccountType accountType, String bookmark, Integer pageSize, SecurityContext securityContext);
      public Response businessAssetMembersGet(String businessId, String assetId, Integer startIndex, Boolean fetchSystemUsers, String bookmark, Integer pageSize, SecurityContext securityContext);
      public Response businessAssetPartnersGet(String businessId, String assetId, Integer startIndex, String bookmark, Integer pageSize, SecurityContext securityContext);
      public Response businessAssetsGet(String businessId, List<PermissionsWithOwner> permissions, String childAssetId, String assetGroupId, String assetType, Integer startIndex, String bookmark, Integer pageSize, SecurityContext securityContext);
      public Response businessMemberAssetsGet(String businessId, String memberId, String assetType, Integer startIndex, AssetSortBy sortBy, Boolean sortAscending, AssetSearchBy searchBy, String searchValue, AssetPermissionType assetPermissionType, List<NonDraftEntityStatus> adAccountStatuses, String bookmark, Integer pageSize, SecurityContext securityContext);
      public Response businessMembersAssetAccessDelete(String businessId, BusinessMembersAssetAccessDeleteBody businessMembersAssetAccessDeleteBody, SecurityContext securityContext);
      public Response businessMembersAssetAccessUpdate(String businessId, UpdateMemberAssetAccessBody updateMemberAssetAccessBody, SecurityContext securityContext);
      public Response businessPartnerAssetAccessGet(String businessId, String partnerId, String partnerType, String assetType, Integer startIndex, AssetSortBy sortBy, Boolean sortAscending, AssetSearchBy searchBy, String searchValue, String bookmark, Integer pageSize, SecurityContext securityContext);
      public Response cancelInvitesOrRequests(String businessId, CancelInvitesRequest cancelInvitesRequest, SecurityContext securityContext);
      public Response createAssetInvites(String businessId, CreateAssetInvitesRequest createAssetInvitesRequest, SecurityContext securityContext);
      public Response createMembershipOrPartnershipInvites(String businessId, CreateMembershipOrPartnershipInvitesBody createMembershipOrPartnershipInvitesBody, SecurityContext securityContext);
      public Response deleteBusinessMembership(String businessId, DeleteBusinessMembershipBody deleteBusinessMembershipBody, SecurityContext securityContext);
      public Response deleteBusinessPartners(String businessId, DeleteBusinessPartnersDelete deleteBusinessPartnersDelete, SecurityContext securityContext);
      public Response deletePartnerAssetAccessHandlerImpl(String businessId, DeletePartnerAssetAccessBody deletePartnerAssetAccessBody, SecurityContext securityContext);
      public Response getBusinessEmployers(Boolean assetsSummary, String bookmark, Integer pageSize, SecurityContext securityContext);
      public Response getBusinessMembers(String businessId, Boolean fetchSystemUsers, Boolean assetsSummary, List<MemberBusinessRole> businessRoles, String memberIds, Integer startIndex, String bookmark, Integer pageSize, SecurityContext securityContext);
      public Response getBusinessPartners(String businessId, Boolean assetsSummary, PartnerType partnerType, String partnerIds, Integer startIndex, Boolean sortAscending, String bookmark, Integer pageSize, SecurityContext securityContext);
      public Response getInvites(String businessId, Boolean isMember, List<InviteFilterStatus> inviteStatus, InviteType inviteType, String bookmark, Integer pageSize, SecurityContext securityContext);
      public Response respondBusinessAccessInvites(AuthRespondInvitesBody authRespondInvitesBody, SecurityContext securityContext);
      public Response sharedAudiencesForBusinessList(String businessId, Order order, String bookmark, Integer pageSize, SecurityContext securityContext);
      public Response systemUserUpdate(String businessId, String systemUserId, SystemUserUpdateWithRequiredBody systemUserUpdateWithRequiredBody, SecurityContext securityContext);
      public Response updateBusinessMemberships(String businessId, List<@Valid BusinessMembershipMember> businessMembershipMember, SecurityContext securityContext);
      public Response updateBusinessToAdAccountSharedAudience(String businessId, BusinessToAdAccountSharedAudienceUpdateWithRequiredBody businessToAdAccountSharedAudienceUpdateWithRequiredBody, SecurityContext securityContext);
      public Response updateBusinessToBusinessSharedAudience(String businessId, BusinessToBusinessSharedAudienceUpdateWithRequiredBody businessToBusinessSharedAudienceUpdateWithRequiredBody, SecurityContext securityContext);
      public Response updatePartnerAssetAccessHandlerImpl(String businessId, UpdatePartnerAssetAccessBody updatePartnerAssetAccessBody, SecurityContext securityContext);
}
