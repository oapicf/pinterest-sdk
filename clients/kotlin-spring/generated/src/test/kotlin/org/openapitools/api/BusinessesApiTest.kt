package org.openapitools.api

import org.openapitools.model.AdAccountsAudiencesSharedAccountsList200Response
import org.openapitools.model.AudienceAccountType
import org.openapitools.model.AudiencesList200Response
import org.openapitools.model.AuthRespondInvitesBody
import org.openapitools.model.BusinessAssetMembersGet200Response
import org.openapitools.model.BusinessAssetPartnersGet200Response
import org.openapitools.model.BusinessAssetsGet200Response
import org.openapitools.model.BusinessMemberAssetsGet200Response
import org.openapitools.model.BusinessMembersAssetAccessDeleteRequest
import org.openapitools.model.BusinessPartnerAssetAccessGet200Response
import org.openapitools.model.BusinessSharedAudience
import org.openapitools.model.BusinessSharedAudienceResponse
import org.openapitools.model.CancelInvitesBody
import org.openapitools.model.CreateAssetAccessRequestBody
import org.openapitools.model.CreateAssetAccessRequestResponse
import org.openapitools.model.CreateAssetGroupBody
import org.openapitools.model.CreateAssetGroupResponse
import org.openapitools.model.CreateAssetInvitesRequest
import org.openapitools.model.CreateInvitesResultsResponseArray
import org.openapitools.model.CreateMembershipOrPartnershipInvitesBody
import org.openapitools.model.DeleteAssetGroupBody
import org.openapitools.model.DeleteAssetGroupResponse
import org.openapitools.model.DeleteInvitesResultsResponseArray
import org.openapitools.model.DeleteMemberAccessResultsResponseArray
import org.openapitools.model.DeletePartnerAssetAccessBody
import org.openapitools.model.DeletePartnerAssetsResultsResponseArray
import org.openapitools.model.DeletePartnersRequest
import org.openapitools.model.DeletePartnersResponse
import org.openapitools.model.DeletedMembersResponse
import org.openapitools.model.Error
import org.openapitools.model.GetBusinessEmployers200Response
import org.openapitools.model.GetBusinessMembers200Response
import org.openapitools.model.GetBusinessPartners200Response
import org.openapitools.model.GetInvites200Response
import org.openapitools.model.InviteType
import org.openapitools.model.MemberBusinessRole
import org.openapitools.model.MembersToDeleteBody
import org.openapitools.model.PartnerType
import org.openapitools.model.PermissionsWithOwner
import org.openapitools.model.RespondToInvitesResponseArray
import org.openapitools.model.SharedAudience
import org.openapitools.model.SharedAudienceResponse
import org.openapitools.model.UpdateAssetGroupBody
import org.openapitools.model.UpdateAssetGroupResponse
import org.openapitools.model.UpdateInvitesResultsResponseArray
import org.openapitools.model.UpdateMemberAssetAccessBody
import org.openapitools.model.UpdateMemberAssetsResultsResponseArray
import org.openapitools.model.UpdateMemberBusinessRoleBody
import org.openapitools.model.UpdateMemberResultsResponseArray
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
        val createAssetGroupBody: CreateAssetGroupBody = TODO()
        val response: ResponseEntity<CreateAssetGroupResponse> = api.assetGroupCreate(businessId, createAssetGroupBody)

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
        val deleteAssetGroupBody: DeleteAssetGroupBody = TODO()
        val response: ResponseEntity<DeleteAssetGroupResponse> = api.assetGroupDelete(businessId, deleteAssetGroupBody)

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
        val updateAssetGroupBody: UpdateAssetGroupBody = TODO()
        val response: ResponseEntity<UpdateAssetGroupResponse> = api.assetGroupUpdate(businessId, updateAssetGroupBody)

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
        val pageSize: kotlin.Int = TODO()
        val bookmark: kotlin.String? = TODO()
        val response: ResponseEntity<AdAccountsAudiencesSharedAccountsList200Response> = api.businessAccountAudiencesSharedAccountsList(businessId, audienceId, accountType, pageSize, bookmark)

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
        val bookmark: kotlin.String? = TODO()
        val pageSize: kotlin.Int = TODO()
        val startIndex: kotlin.Int = TODO()
        val response: ResponseEntity<BusinessAssetMembersGet200Response> = api.businessAssetMembersGet(businessId, assetId, bookmark, pageSize, startIndex)

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
        val response: ResponseEntity<BusinessAssetPartnersGet200Response> = api.businessAssetPartnersGet(businessId, assetId, startIndex, bookmark, pageSize)

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
        val bookmark: kotlin.String? = TODO()
        val pageSize: kotlin.Int = TODO()
        val response: ResponseEntity<BusinessMemberAssetsGet200Response> = api.businessMemberAssetsGet(businessId, memberId, assetType, startIndex, bookmark, pageSize)

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
        val businessMembersAssetAccessDeleteRequest: BusinessMembersAssetAccessDeleteRequest = TODO()
        val response: ResponseEntity<DeleteMemberAccessResultsResponseArray> = api.businessMembersAssetAccessDelete(businessId, businessMembersAssetAccessDeleteRequest)

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
        val partnerType: PartnerType? = TODO()
        val assetType: kotlin.String = TODO()
        val startIndex: kotlin.Int = TODO()
        val pageSize: kotlin.Int = TODO()
        val bookmark: kotlin.String? = TODO()
        val response: ResponseEntity<BusinessPartnerAssetAccessGet200Response> = api.businessPartnerAssetAccessGet(businessId, partnerId, partnerType, assetType, startIndex, pageSize, bookmark)

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
        val cancelInvitesBody: CancelInvitesBody = TODO()
        val response: ResponseEntity<DeleteInvitesResultsResponseArray> = api.cancelInvitesOrRequests(businessId, cancelInvitesBody)

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
        val membersToDeleteBody: MembersToDeleteBody = TODO()
        val response: ResponseEntity<DeletedMembersResponse> = api.deleteBusinessMembership(businessId, membersToDeleteBody)

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
        val deletePartnersRequest: DeletePartnersRequest = TODO()
        val response: ResponseEntity<DeletePartnersResponse> = api.deleteBusinessPartners(businessId, deletePartnersRequest)

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
        val response: ResponseEntity<DeletePartnerAssetsResultsResponseArray> = api.deletePartnerAssetAccessHandlerImpl(businessId, deletePartnerAssetAccessBody)

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
        val pageSize: kotlin.Int = TODO()
        val bookmark: kotlin.String? = TODO()
        val response: ResponseEntity<GetBusinessEmployers200Response> = api.getBusinessEmployers(pageSize, bookmark)

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
        val assetsSummary: kotlin.Boolean = TODO()
        val businessRoles: kotlin.collections.List<MemberBusinessRole>? = TODO()
        val memberIds: kotlin.String? = TODO()
        val startIndex: kotlin.Int = TODO()
        val bookmark: kotlin.String? = TODO()
        val pageSize: kotlin.Int = TODO()
        val response: ResponseEntity<GetBusinessMembers200Response> = api.getBusinessMembers(businessId, assetsSummary, businessRoles, memberIds, startIndex, bookmark, pageSize)

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
        val pageSize: kotlin.Int = TODO()
        val bookmark: kotlin.String? = TODO()
        val response: ResponseEntity<GetBusinessPartners200Response> = api.getBusinessPartners(businessId, assetsSummary, partnerType, partnerIds, startIndex, pageSize, bookmark)

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
        val inviteStatus: kotlin.collections.List<kotlin.String>? = TODO()
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
        val bookmark: kotlin.String? = TODO()
        val order: kotlin.String? = TODO()
        val pageSize: kotlin.Int = TODO()
        val response: ResponseEntity<AudiencesList200Response> = api.sharedAudiencesForBusinessList(businessId, bookmark, order, pageSize)

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
        val updateMemberBusinessRoleBody: kotlin.collections.List<UpdateMemberBusinessRoleBody> = TODO()
        val response: ResponseEntity<UpdateMemberResultsResponseArray> = api.updateBusinessMemberships(businessId, updateMemberBusinessRoleBody)

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
        val sharedAudience: SharedAudience = TODO()
        val response: ResponseEntity<SharedAudienceResponse> = api.updateBusinessToAdAccountSharedAudience(businessId, sharedAudience)

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
        val businessSharedAudience: BusinessSharedAudience = TODO()
        val response: ResponseEntity<BusinessSharedAudienceResponse> = api.updateBusinessToBusinessSharedAudience(businessId, businessSharedAudience)

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
