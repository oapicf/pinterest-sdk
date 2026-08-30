package org.openapitools.server.api.api

import misk.testing.MiskTestModule
import jakarta.inject.Inject
import misk.testing.MiskTest
import misk.testing.MiskTestModule
import org.junit.jupiter.api.Test
import misk.web.HttpCall
import misk.web.PathParam
import misk.web.QueryParam
import misk.web.RequestBody
import misk.web.RequestHeader
import org.openapitools.server.api.model.AuthRespondInvitesBody
import org.openapitools.server.api.model.CancelInvitesRequest
import org.openapitools.server.api.model.CancelInvitesResponse
import org.openapitools.server.api.model.CreateAssetAccessRequestBody
import org.openapitools.server.api.model.CreateAssetAccessRequestResponse
import org.openapitools.server.api.model.CreateAssetInvitesRequest
import org.openapitools.server.api.model.CreateInvitesResultsResponseArray
import org.openapitools.server.api.model.CreateMembershipOrPartnershipInvitesBody
import org.openapitools.server.api.model.GetInvites200Response
import org.openapitools.server.api.model.InviteFilterStatus
import org.openapitools.server.api.model.InviteType
import org.openapitools.server.api.model.PinterestLibError
import org.openapitools.server.api.model.RespondToInvitesResponseArray
import org.openapitools.server.api.model.UpdateInvitesResultsResponseArray

@MiskTest(startService = true)
internal class BusinessAccessInviteApiTest {

    @Suppress("unused")
    @MiskTestModule
    private val module = MiskTestModule()

    @Inject private lateinit var businessAccessInviteApi: BusinessAccessInviteApiAction

    /**
     * To test BusinessAccessInviteApiAction.assetAccessRequestsCreate
     */
    @Test
    fun `should handle assetAccessRequestsCreate`() {
        val businessId = TODO()
        val createAssetAccessRequestBody = TODO()
        val response: CreateAssetAccessRequestResponse = businessAccessInviteApi.assetAccessRequestsCreate(businessId, createAssetAccessRequestBody)
    }

    /**
     * To test BusinessAccessInviteApiAction.cancelInvitesOrRequests
     */
    @Test
    fun `should handle cancelInvitesOrRequests`() {
        val businessId = TODO()
        val cancelInvitesRequest = TODO()
        val response: CancelInvitesResponse = businessAccessInviteApi.cancelInvitesOrRequests(businessId, cancelInvitesRequest)
    }

    /**
     * To test BusinessAccessInviteApiAction.createAssetInvites
     */
    @Test
    fun `should handle createAssetInvites`() {
        val businessId = TODO()
        val createAssetInvitesRequest = TODO()
        val response: UpdateInvitesResultsResponseArray = businessAccessInviteApi.createAssetInvites(businessId, createAssetInvitesRequest)
    }

    /**
     * To test BusinessAccessInviteApiAction.createMembershipOrPartnershipInvites
     */
    @Test
    fun `should handle createMembershipOrPartnershipInvites`() {
        val businessId = TODO()
        val createMembershipOrPartnershipInvitesBody = TODO()
        val response: CreateInvitesResultsResponseArray = businessAccessInviteApi.createMembershipOrPartnershipInvites(businessId, createMembershipOrPartnershipInvitesBody)
    }

    /**
     * To test BusinessAccessInviteApiAction.getInvites
     */
    @Test
    fun `should handle getInvites`() {
        val businessId = TODO()
        val isMember = TODO()
        val inviteStatus = TODO()
        val inviteType = TODO()
        val bookmark = TODO()
        val pageSize = TODO()
        val response: GetInvites200Response = businessAccessInviteApi.getInvites(businessId, isMember, inviteStatus, inviteType, bookmark, pageSize)
    }

    /**
     * To test BusinessAccessInviteApiAction.respondBusinessAccessInvites
     */
    @Test
    fun `should handle respondBusinessAccessInvites`() {
        val authRespondInvitesBody = TODO()
        val response: RespondToInvitesResponseArray = businessAccessInviteApi.respondBusinessAccessInvites(authRespondInvitesBody)
    }
}
