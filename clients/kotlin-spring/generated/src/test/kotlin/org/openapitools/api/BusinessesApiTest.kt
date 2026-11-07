package org.openapitools.api

import org.openapitools.model.AdAccountsAudiencesSharedAccountsList200Response
import org.openapitools.model.AssetGroupDeletion
import org.openapitools.model.AssetGroupDeletionDelete
import org.openapitools.model.AssetGroupInput
import org.openapitools.model.AssetGroupInputCreate
import org.openapitools.model.AssetGroupModification
import org.openapitools.model.AssetGroupModificationReadOrUpdate
import org.openapitools.model.AssetPermissionType
import org.openapitools.model.AssetSearchBy
import org.openapitools.model.AssetSortBy
import org.openapitools.model.AudienceAccountType
import org.openapitools.model.AuthRespondInvitesBody
import org.openapitools.model.BusinessAssetMembersGet200Response
import org.openapitools.model.BusinessAssetsGet200Response
import org.openapitools.model.BusinessMemberAssetsGetResponse
import org.openapitools.model.BusinessMembersAssetAccessDeleteBody
import org.openapitools.model.BusinessMembershipMember
import org.openapitools.model.BusinessPartnerAssetAccessGet200Response
import org.openapitools.model.BusinessToAdAccountSharedAudience
import org.openapitools.model.BusinessToAdAccountSharedAudienceUpdateWithRequiredBody
import org.openapitools.model.BusinessToBusinessSharedAudience
import org.openapitools.model.BusinessToBusinessSharedAudienceUpdateWithRequiredBody
import org.openapitools.model.CancelInvitesRequest
import org.openapitools.model.CancelInvitesResponse
import org.openapitools.model.CreateAssetAccessRequestBody
import org.openapitools.model.CreateAssetAccessRequestResponse
import org.openapitools.model.CreateAssetInvitesRequest
import org.openapitools.model.CreateInvitesResultsResponseArray
import org.openapitools.model.CreateMembershipOrPartnershipInvitesBody
import org.openapitools.model.DeleteBusinessMembership200Response
import org.openapitools.model.DeleteBusinessMembershipBody
import org.openapitools.model.DeleteBusinessPartners
import org.openapitools.model.DeleteBusinessPartnersDelete
import org.openapitools.model.DeleteMemberAccessResultsResponseArray
import org.openapitools.model.DeletePartnerAssetAccessBody
import org.openapitools.model.DeletePartnerAssetAccessResultsResponseArray
import org.openapitools.model.GetBusinessEmployers200Response
import org.openapitools.model.GetInvites200Response
import org.openapitools.model.InviteFilterStatus
import org.openapitools.model.InviteType
import org.openapitools.model.MemberBusinessRole
import org.openapitools.model.NonDraftEntityStatus
import org.openapitools.model.Order
import org.openapitools.model.PartnerType
import org.openapitools.model.PermissionsWithOwner
import org.openapitools.model.PinterestLibError
import org.openapitools.model.RespondToInvitesResponseArray
import org.openapitools.model.SharedAudiencesForBusinessList200Response
import org.openapitools.model.SystemUserUpdateWithRequiredBody
import org.openapitools.model.UpdateBusinessMembershipsResponse
import org.openapitools.model.UpdateInvitesResultsResponseArray
import org.openapitools.model.UpdateMemberAssetAccessBody
import org.openapitools.model.UpdateMemberAssetsResultsResponseArray
import org.openapitools.model.UpdatePartnerAssetAccessBody
import org.openapitools.model.UpdatePartnerAssetsResultsResponseArray
import org.junit.jupiter.api.Test
import org.springframework.http.ResponseEntity

class BusinessesApiTest {

    private val api: BusinessesApiController = BusinessesApiController()

    /**
     * To test BusinessesApiController.assetAccessRequestsCreate
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun assetAccessRequestsCreateTest() {
        val businessId: kotlin.String = TODO()
        val createAssetAccessRequestBody: CreateAssetAccessRequestBody = TODO()
        
        
        val response: ResponseEntity<CreateAssetAccessRequestResponse> = api.assetAccessRequestsCreate(businessId, createAssetAccessRequestBody)

        // TODO: test validations
    }

    /**
     * To test BusinessesApiController.assetGroupCreate
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun assetGroupCreateTest() {
        val businessId: kotlin.String = TODO()
        val assetGroupInputCreate: AssetGroupInputCreate = TODO()
        
        
        val response: ResponseEntity<AssetGroupInput> = api.assetGroupCreate(businessId, assetGroupInputCreate)

        // TODO: test validations
    }

    /**
     * To test BusinessesApiController.assetGroupDelete
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun assetGroupDeleteTest() {
        val businessId: kotlin.String = TODO()
        val assetGroupDeletionDelete: AssetGroupDeletionDelete = TODO()
        
        
        val response: ResponseEntity<AssetGroupDeletion> = api.assetGroupDelete(businessId, assetGroupDeletionDelete)

        // TODO: test validations
    }

    /**
     * To test BusinessesApiController.assetGroupUpdate
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun assetGroupUpdateTest() {
        val businessId: kotlin.String = TODO()
        val assetGroupModificationReadOrUpdate: AssetGroupModificationReadOrUpdate = TODO()
        
        
        val response: ResponseEntity<AssetGroupModification> = api.assetGroupUpdate(businessId, assetGroupModificationReadOrUpdate)

        // TODO: test validations
    }

    /**
     * To test BusinessesApiController.businessAccountAudiencesSharedAccountsList
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun businessAccountAudiencesSharedAccountsListTest() {
        val businessId: kotlin.String = TODO()
        val audienceId: kotlin.String = TODO()
        val accountType: AudienceAccountType = TODO()
        val bookmark: kotlin.String? = TODO()
        val pageSize: kotlin.Int = TODO()
        
        
        val response: ResponseEntity<AdAccountsAudiencesSharedAccountsList200Response> = api.businessAccountAudiencesSharedAccountsList(businessId, audienceId, accountType, bookmark, pageSize)

        // TODO: test validations
    }

    /**
     * To test BusinessesApiController.businessAssetMembersGet
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun businessAssetMembersGetTest() {
        val businessId: kotlin.String = TODO()
        val assetId: kotlin.String = TODO()
        val startIndex: kotlin.Int = TODO()
        val fetchSystemUsers: kotlin.Boolean = TODO()
        val bookmark: kotlin.String? = TODO()
        val pageSize: kotlin.Int = TODO()
        
        
        val response: ResponseEntity<BusinessAssetMembersGet200Response> = api.businessAssetMembersGet(businessId, assetId, startIndex, fetchSystemUsers, bookmark, pageSize)

        // TODO: test validations
    }

    /**
     * To test BusinessesApiController.businessAssetPartnersGet
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun businessAssetPartnersGetTest() {
        val businessId: kotlin.String = TODO()
        val assetId: kotlin.String = TODO()
        val startIndex: kotlin.Int = TODO()
        val bookmark: kotlin.String? = TODO()
        val pageSize: kotlin.Int = TODO()
        
        
        val response: ResponseEntity<BusinessAssetMembersGet200Response> = api.businessAssetPartnersGet(businessId, assetId, startIndex, bookmark, pageSize)

        // TODO: test validations
    }

    /**
     * To test BusinessesApiController.businessAssetsGet
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun businessAssetsGetTest() {
        val businessId: kotlin.String = TODO()
        val permissions: kotlin.collections.List<PermissionsWithOwner>? = TODO()
        val childAssetId: kotlin.String? = TODO()
        val assetGroupId: kotlin.String? = TODO()
        val assetType: kotlin.String = TODO()
        val startIndex: kotlin.Int = TODO()
        val bookmark: kotlin.String? = TODO()
        val pageSize: kotlin.Int = TODO()
        
        
        val response: ResponseEntity<BusinessAssetsGet200Response> = api.businessAssetsGet(businessId, permissions, childAssetId, assetGroupId, assetType, startIndex, bookmark, pageSize)

        // TODO: test validations
    }

    /**
     * To test BusinessesApiController.businessMemberAssetsGet
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun businessMemberAssetsGetTest() {
        val businessId: kotlin.String = TODO()
        val memberId: kotlin.String = TODO()
        val assetType: kotlin.String = TODO()
        val startIndex: kotlin.Int = TODO()
        val sortBy: AssetSortBy? = TODO()
        val sortAscending: kotlin.Boolean = TODO()
        val searchBy: AssetSearchBy? = TODO()
        val searchValue: kotlin.String? = TODO()
        val assetPermissionType: AssetPermissionType? = TODO()
        val adAccountStatuses: kotlin.collections.List<NonDraftEntityStatus>? = TODO()
        val bookmark: kotlin.String? = TODO()
        val pageSize: kotlin.Int = TODO()
        
        
        val response: ResponseEntity<BusinessMemberAssetsGetResponse> = api.businessMemberAssetsGet(businessId, memberId, assetType, startIndex, sortBy, sortAscending, searchBy, searchValue, assetPermissionType, adAccountStatuses, bookmark, pageSize)

        // TODO: test validations
    }

    /**
     * To test BusinessesApiController.businessMembersAssetAccessDelete
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun businessMembersAssetAccessDeleteTest() {
        val businessId: kotlin.String = TODO()
        val businessMembersAssetAccessDeleteBody: BusinessMembersAssetAccessDeleteBody = TODO()
        
        
        val response: ResponseEntity<DeleteMemberAccessResultsResponseArray> = api.businessMembersAssetAccessDelete(businessId, businessMembersAssetAccessDeleteBody)

        // TODO: test validations
    }

    /**
     * To test BusinessesApiController.businessMembersAssetAccessUpdate
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun businessMembersAssetAccessUpdateTest() {
        val businessId: kotlin.String = TODO()
        val updateMemberAssetAccessBody: UpdateMemberAssetAccessBody = TODO()
        
        
        val response: ResponseEntity<UpdateMemberAssetsResultsResponseArray> = api.businessMembersAssetAccessUpdate(businessId, updateMemberAssetAccessBody)

        // TODO: test validations
    }

    /**
     * To test BusinessesApiController.businessPartnerAssetAccessGet
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun businessPartnerAssetAccessGetTest() {
        val businessId: kotlin.String = TODO()
        val partnerId: kotlin.String = TODO()
        val partnerType: kotlin.String = TODO()
        val assetType: kotlin.String = TODO()
        val startIndex: kotlin.Int = TODO()
        val sortBy: AssetSortBy? = TODO()
        val sortAscending: kotlin.Boolean = TODO()
        val searchBy: AssetSearchBy? = TODO()
        val searchValue: kotlin.String? = TODO()
        val bookmark: kotlin.String? = TODO()
        val pageSize: kotlin.Int = TODO()
        
        
        val response: ResponseEntity<BusinessPartnerAssetAccessGet200Response> = api.businessPartnerAssetAccessGet(businessId, partnerId, partnerType, assetType, startIndex, sortBy, sortAscending, searchBy, searchValue, bookmark, pageSize)

        // TODO: test validations
    }

    /**
     * To test BusinessesApiController.cancelInvitesOrRequests
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun cancelInvitesOrRequestsTest() {
        val businessId: kotlin.String = TODO()
        val cancelInvitesRequest: CancelInvitesRequest = TODO()
        
        
        val response: ResponseEntity<CancelInvitesResponse> = api.cancelInvitesOrRequests(businessId, cancelInvitesRequest)

        // TODO: test validations
    }

    /**
     * To test BusinessesApiController.createAssetInvites
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun createAssetInvitesTest() {
        val businessId: kotlin.String = TODO()
        val createAssetInvitesRequest: CreateAssetInvitesRequest = TODO()
        
        
        val response: ResponseEntity<UpdateInvitesResultsResponseArray> = api.createAssetInvites(businessId, createAssetInvitesRequest)

        // TODO: test validations
    }

    /**
     * To test BusinessesApiController.createMembershipOrPartnershipInvites
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun createMembershipOrPartnershipInvitesTest() {
        val businessId: kotlin.String = TODO()
        val createMembershipOrPartnershipInvitesBody: CreateMembershipOrPartnershipInvitesBody = TODO()
        
        
        val response: ResponseEntity<CreateInvitesResultsResponseArray> = api.createMembershipOrPartnershipInvites(businessId, createMembershipOrPartnershipInvitesBody)

        // TODO: test validations
    }

    /**
     * To test BusinessesApiController.deleteBusinessMembership
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun deleteBusinessMembershipTest() {
        val businessId: kotlin.String = TODO()
        val deleteBusinessMembershipBody: DeleteBusinessMembershipBody = TODO()
        
        
        val response: ResponseEntity<DeleteBusinessMembership200Response> = api.deleteBusinessMembership(businessId, deleteBusinessMembershipBody)

        // TODO: test validations
    }

    /**
     * To test BusinessesApiController.deleteBusinessPartners
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun deleteBusinessPartnersTest() {
        val businessId: kotlin.String = TODO()
        val deleteBusinessPartnersDelete: DeleteBusinessPartnersDelete = TODO()
        
        
        val response: ResponseEntity<DeleteBusinessPartners> = api.deleteBusinessPartners(businessId, deleteBusinessPartnersDelete)

        // TODO: test validations
    }

    /**
     * To test BusinessesApiController.deletePartnerAssetAccessHandlerImpl
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun deletePartnerAssetAccessHandlerImplTest() {
        val businessId: kotlin.String = TODO()
        val deletePartnerAssetAccessBody: DeletePartnerAssetAccessBody = TODO()
        
        
        val response: ResponseEntity<DeletePartnerAssetAccessResultsResponseArray> = api.deletePartnerAssetAccessHandlerImpl(businessId, deletePartnerAssetAccessBody)

        // TODO: test validations
    }

    /**
     * To test BusinessesApiController.getBusinessEmployers
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getBusinessEmployersTest() {
        val assetsSummary: kotlin.Boolean = TODO()
        val bookmark: kotlin.String? = TODO()
        val pageSize: kotlin.Int = TODO()
        
        
        val response: ResponseEntity<GetBusinessEmployers200Response> = api.getBusinessEmployers(assetsSummary, bookmark, pageSize)

        // TODO: test validations
    }

    /**
     * To test BusinessesApiController.getBusinessMembers
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getBusinessMembersTest() {
        val businessId: kotlin.String = TODO()
        val fetchSystemUsers: kotlin.Boolean = TODO()
        val assetsSummary: kotlin.Boolean = TODO()
        val businessRoles: kotlin.collections.List<MemberBusinessRole>? = TODO()
        val memberIds: kotlin.String? = TODO()
        val startIndex: kotlin.Int = TODO()
        val bookmark: kotlin.String? = TODO()
        val pageSize: kotlin.Int = TODO()
        
        
        val response: ResponseEntity<GetBusinessEmployers200Response> = api.getBusinessMembers(businessId, fetchSystemUsers, assetsSummary, businessRoles, memberIds, startIndex, bookmark, pageSize)

        // TODO: test validations
    }

    /**
     * To test BusinessesApiController.getBusinessPartners
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getBusinessPartnersTest() {
        val businessId: kotlin.String = TODO()
        val assetsSummary: kotlin.Boolean = TODO()
        val partnerType: PartnerType? = TODO()
        val partnerIds: kotlin.String? = TODO()
        val startIndex: kotlin.Int = TODO()
        val sortAscending: kotlin.Boolean? = TODO()
        val bookmark: kotlin.String? = TODO()
        val pageSize: kotlin.Int = TODO()
        
        
        val response: ResponseEntity<GetBusinessEmployers200Response> = api.getBusinessPartners(businessId, assetsSummary, partnerType, partnerIds, startIndex, sortAscending, bookmark, pageSize)

        // TODO: test validations
    }

    /**
     * To test BusinessesApiController.getInvites
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun getInvitesTest() {
        val businessId: kotlin.String = TODO()
        val isMember: kotlin.Boolean = TODO()
        val inviteStatus: kotlin.collections.List<InviteFilterStatus>? = TODO()
        val inviteType: InviteType? = TODO()
        val bookmark: kotlin.String? = TODO()
        val pageSize: kotlin.Int = TODO()
        
        
        val response: ResponseEntity<GetInvites200Response> = api.getInvites(businessId, isMember, inviteStatus, inviteType, bookmark, pageSize)

        // TODO: test validations
    }

    /**
     * To test BusinessesApiController.respondBusinessAccessInvites
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun respondBusinessAccessInvitesTest() {
        val authRespondInvitesBody: AuthRespondInvitesBody = TODO()
        
        
        val response: ResponseEntity<RespondToInvitesResponseArray> = api.respondBusinessAccessInvites(authRespondInvitesBody)

        // TODO: test validations
    }

    /**
     * To test BusinessesApiController.sharedAudiencesForBusinessList
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun sharedAudiencesForBusinessListTest() {
        val businessId: kotlin.String = TODO()
        val order: Order? = TODO()
        val bookmark: kotlin.String? = TODO()
        val pageSize: kotlin.Int = TODO()
        
        
        val response: ResponseEntity<SharedAudiencesForBusinessList200Response> = api.sharedAudiencesForBusinessList(businessId, order, bookmark, pageSize)

        // TODO: test validations
    }

    /**
     * To test BusinessesApiController.systemUserUpdate
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun systemUserUpdateTest() {
        val businessId: kotlin.String = TODO()
        val systemUserId: kotlin.String = TODO()
        val systemUserUpdateWithRequiredBody: SystemUserUpdateWithRequiredBody = TODO()
        
        
        val response: ResponseEntity<Unit> = api.systemUserUpdate(businessId, systemUserId, systemUserUpdateWithRequiredBody)

        // TODO: test validations
    }

    /**
     * To test BusinessesApiController.updateBusinessMemberships
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun updateBusinessMembershipsTest() {
        val businessId: kotlin.String = TODO()
        val businessMembershipMember: kotlin.collections.List<BusinessMembershipMember> = TODO()
        
        
        val response: ResponseEntity<UpdateBusinessMembershipsResponse> = api.updateBusinessMemberships(businessId, businessMembershipMember)

        // TODO: test validations
    }

    /**
     * To test BusinessesApiController.updateBusinessToAdAccountSharedAudience
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun updateBusinessToAdAccountSharedAudienceTest() {
        val businessId: kotlin.String = TODO()
        val businessToAdAccountSharedAudienceUpdateWithRequiredBody: BusinessToAdAccountSharedAudienceUpdateWithRequiredBody = TODO()
        
        
        val response: ResponseEntity<BusinessToAdAccountSharedAudience> = api.updateBusinessToAdAccountSharedAudience(businessId, businessToAdAccountSharedAudienceUpdateWithRequiredBody)

        // TODO: test validations
    }

    /**
     * To test BusinessesApiController.updateBusinessToBusinessSharedAudience
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun updateBusinessToBusinessSharedAudienceTest() {
        val businessId: kotlin.String = TODO()
        val businessToBusinessSharedAudienceUpdateWithRequiredBody: BusinessToBusinessSharedAudienceUpdateWithRequiredBody = TODO()
        
        
        val response: ResponseEntity<BusinessToBusinessSharedAudience> = api.updateBusinessToBusinessSharedAudience(businessId, businessToBusinessSharedAudienceUpdateWithRequiredBody)

        // TODO: test validations
    }

    /**
     * To test BusinessesApiController.updatePartnerAssetAccessHandlerImpl
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun updatePartnerAssetAccessHandlerImplTest() {
        val businessId: kotlin.String = TODO()
        val updatePartnerAssetAccessBody: UpdatePartnerAssetAccessBody = TODO()
        
        
        val response: ResponseEntity<UpdatePartnerAssetsResultsResponseArray> = api.updatePartnerAssetAccessHandlerImpl(businessId, updatePartnerAssetAccessBody)

        // TODO: test validations
    }
}
