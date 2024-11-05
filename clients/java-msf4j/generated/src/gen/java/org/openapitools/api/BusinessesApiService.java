package org.openapitools.api;

import org.openapitools.api.*;
import org.openapitools.model.*;

import org.wso2.msf4j.formparam.FormDataParam;
import org.wso2.msf4j.formparam.FileInfo;

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

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2024-11-05T02:04:18.164649512Z[Etc/UTC]", comments = "Generator version: 7.9.0")
public abstract class BusinessesApiService {
    public abstract Response assetAccessRequestsCreate(String businessId
 ,CreateAssetAccessRequestBody createAssetAccessRequestBody
 ) throws NotFoundException;
    public abstract Response assetGroupCreate(String businessId
 ,CreateAssetGroupBody createAssetGroupBody
 ) throws NotFoundException;
    public abstract Response assetGroupDelete(String businessId
 ,DeleteAssetGroupBody deleteAssetGroupBody
 ) throws NotFoundException;
    public abstract Response assetGroupUpdate(String businessId
 ,UpdateAssetGroupBody updateAssetGroupBody
 ) throws NotFoundException;
    public abstract Response businessAccountAudiencesSharedAccountsList(String businessId
 ,String audienceId
 ,AudienceAccountType accountType
 ,Integer pageSize
 ,String bookmark
 ) throws NotFoundException;
    public abstract Response businessAssetMembersGet(String businessId
 ,String assetId
 ,String bookmark
 ,Integer pageSize
 ,Integer startIndex
 ) throws NotFoundException;
    public abstract Response businessAssetPartnersGet(String businessId
 ,String assetId
 ,Integer startIndex
 ,String bookmark
 ,Integer pageSize
 ) throws NotFoundException;
    public abstract Response businessAssetsGet(String businessId
 ,List<PermissionsWithOwner> permissions
 ,String childAssetId
 ,String assetGroupId
 ,String assetType
 ,Integer startIndex
 ,String bookmark
 ,Integer pageSize
 ) throws NotFoundException;
    public abstract Response businessMemberAssetsGet(String businessId
 ,String memberId
 ,String assetType
 ,Integer startIndex
 ,String bookmark
 ,Integer pageSize
 ) throws NotFoundException;
    public abstract Response businessMembersAssetAccessDelete(String businessId
 ,BusinessMembersAssetAccessDeleteRequest businessMembersAssetAccessDeleteRequest
 ) throws NotFoundException;
    public abstract Response businessMembersAssetAccessUpdate(String businessId
 ,UpdateMemberAssetAccessBody updateMemberAssetAccessBody
 ) throws NotFoundException;
    public abstract Response businessPartnerAssetAccessGet(String businessId
 ,String partnerId
 ,PartnerType partnerType
 ,String assetType
 ,Integer startIndex
 ,Integer pageSize
 ,String bookmark
 ) throws NotFoundException;
    public abstract Response cancelInvitesOrRequests(String businessId
 ,CancelInvitesBody cancelInvitesBody
 ) throws NotFoundException;
    public abstract Response createAssetInvites(String businessId
 ,CreateAssetInvitesRequest createAssetInvitesRequest
 ) throws NotFoundException;
    public abstract Response createMembershipOrPartnershipInvites(String businessId
 ,CreateMembershipOrPartnershipInvitesBody createMembershipOrPartnershipInvitesBody
 ) throws NotFoundException;
    public abstract Response deleteBusinessMembership(String businessId
 ,MembersToDeleteBody membersToDeleteBody
 ) throws NotFoundException;
    public abstract Response deleteBusinessPartners(String businessId
 ,DeletePartnersRequest deletePartnersRequest
 ) throws NotFoundException;
    public abstract Response deletePartnerAssetAccessHandlerImpl(String businessId
 ,DeletePartnerAssetAccessBody deletePartnerAssetAccessBody
 ) throws NotFoundException;
    public abstract Response getBusinessEmployers(Integer pageSize
 ,String bookmark
 ) throws NotFoundException;
    public abstract Response getBusinessMembers(String businessId
 ,Boolean assetsSummary
 ,List<MemberBusinessRole> businessRoles
 ,String memberIds
 ,Integer startIndex
 ,String bookmark
 ,Integer pageSize
 ) throws NotFoundException;
    public abstract Response getBusinessPartners(String businessId
 ,Boolean assetsSummary
 ,PartnerType partnerType
 ,String partnerIds
 ,Integer startIndex
 ,Integer pageSize
 ,String bookmark
 ) throws NotFoundException;
    public abstract Response getInvites(String businessId
 ,Boolean isMember
 ,List<String> inviteStatus
 ,InviteType inviteType
 ,String bookmark
 ,Integer pageSize
 ) throws NotFoundException;
    public abstract Response respondBusinessAccessInvites(AuthRespondInvitesBody authRespondInvitesBody
 ) throws NotFoundException;
    public abstract Response sharedAudiencesForBusinessList(String businessId
 ,String bookmark
 ,String order
 ,Integer pageSize
 ) throws NotFoundException;
    public abstract Response updateBusinessMemberships(String businessId
 ,List<@Valid UpdateMemberBusinessRoleBody> updateMemberBusinessRoleBody
 ) throws NotFoundException;
    public abstract Response updateBusinessToAdAccountSharedAudience(String businessId
 ,SharedAudience sharedAudience
 ) throws NotFoundException;
    public abstract Response updateBusinessToBusinessSharedAudience(String businessId
 ,BusinessSharedAudience businessSharedAudience
 ) throws NotFoundException;
    public abstract Response updatePartnerAssetAccessHandlerImpl(String businessId
 ,UpdatePartnerAssetAccessBody updatePartnerAssetAccessBody
 ) throws NotFoundException;
}
