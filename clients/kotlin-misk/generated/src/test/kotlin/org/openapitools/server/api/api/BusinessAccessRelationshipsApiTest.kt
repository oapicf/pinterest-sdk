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
import org.openapitools.server.api.model.BrandAccount
import org.openapitools.server.api.model.BrandAccountCreate
import org.openapitools.server.api.model.BrandAccountUpdate
import org.openapitools.server.api.model.BusinessMembershipMember
import org.openapitools.server.api.model.DeleteBusinessMembership200Response
import org.openapitools.server.api.model.DeleteBusinessMembershipBody
import org.openapitools.server.api.model.DeleteBusinessPartners
import org.openapitools.server.api.model.DeleteBusinessPartnersDelete
import org.openapitools.server.api.model.GetBusinessEmployers200Response
import org.openapitools.server.api.model.MemberBusinessRole
import org.openapitools.server.api.model.PartnerType
import org.openapitools.server.api.model.PinterestLibError
import org.openapitools.server.api.model.SystemUserUpdateWithRequiredBody
import org.openapitools.server.api.model.UpdateBusinessMembershipsResponse

@MiskTest(startService = true)
internal class BusinessAccessRelationshipsApiTest {

    @Suppress("unused")
    @MiskTestModule
    private val module = MiskTestModule()

    @Inject private lateinit var businessAccessRelationshipsApi: BusinessAccessRelationshipsApiAction

    /**
     * To test BusinessAccessRelationshipsApiAction.brandAccountsCreate
     */
    @Test
    fun `should handle brandAccountsCreate`() {
        val businessHierarchyId = TODO()
        val brandAccountCreate = TODO()
        val response: BrandAccount = businessAccessRelationshipsApi.brandAccountsCreate(businessHierarchyId, brandAccountCreate)
    }

    /**
     * To test BusinessAccessRelationshipsApiAction.brandAccountsUpdate
     */
    @Test
    fun `should handle brandAccountsUpdate`() {
        val brandAccountId = TODO()
        val businessHierarchyId = TODO()
        val brandAccountUpdate = TODO()
        val response: BrandAccount = businessAccessRelationshipsApi.brandAccountsUpdate(brandAccountId, businessHierarchyId, brandAccountUpdate)
    }

    /**
     * To test BusinessAccessRelationshipsApiAction.deleteBusinessMembership
     */
    @Test
    fun `should handle deleteBusinessMembership`() {
        val businessId = TODO()
        val deleteBusinessMembershipBody = TODO()
        val response: DeleteBusinessMembership200Response = businessAccessRelationshipsApi.deleteBusinessMembership(businessId, deleteBusinessMembershipBody)
    }

    /**
     * To test BusinessAccessRelationshipsApiAction.deleteBusinessPartners
     */
    @Test
    fun `should handle deleteBusinessPartners`() {
        val businessId = TODO()
        val deleteBusinessPartnersDelete = TODO()
        val response: DeleteBusinessPartners = businessAccessRelationshipsApi.deleteBusinessPartners(businessId, deleteBusinessPartnersDelete)
    }

    /**
     * To test BusinessAccessRelationshipsApiAction.getBusinessEmployers
     */
    @Test
    fun `should handle getBusinessEmployers`() {
        val assetsSummary = TODO()
        val bookmark = TODO()
        val pageSize = TODO()
        val response: GetBusinessEmployers200Response = businessAccessRelationshipsApi.getBusinessEmployers(assetsSummary, bookmark, pageSize)
    }

    /**
     * To test BusinessAccessRelationshipsApiAction.getBusinessMembers
     */
    @Test
    fun `should handle getBusinessMembers`() {
        val businessId = TODO()
        val fetchSystemUsers = TODO()
        val assetsSummary = TODO()
        val businessRoles = TODO()
        val memberIds = TODO()
        val startIndex = TODO()
        val bookmark = TODO()
        val pageSize = TODO()
        val response: GetBusinessEmployers200Response = businessAccessRelationshipsApi.getBusinessMembers(businessId, fetchSystemUsers, assetsSummary, businessRoles, memberIds, startIndex, bookmark, pageSize)
    }

    /**
     * To test BusinessAccessRelationshipsApiAction.getBusinessPartners
     */
    @Test
    fun `should handle getBusinessPartners`() {
        val businessId = TODO()
        val assetsSummary = TODO()
        val partnerType = TODO()
        val partnerIds = TODO()
        val startIndex = TODO()
        val sortAscending = TODO()
        val bookmark = TODO()
        val pageSize = TODO()
        val response: GetBusinessEmployers200Response = businessAccessRelationshipsApi.getBusinessPartners(businessId, assetsSummary, partnerType, partnerIds, startIndex, sortAscending, bookmark, pageSize)
    }

    /**
     * To test BusinessAccessRelationshipsApiAction.systemUserUpdate
     */
    @Test
    fun `should handle systemUserUpdate`() {
        val businessId = TODO()
        val systemUserId = TODO()
        val systemUserUpdateWithRequiredBody = TODO()
        val response = businessAccessRelationshipsApi.systemUserUpdate(businessId, systemUserId, systemUserUpdateWithRequiredBody)
    }

    /**
     * To test BusinessAccessRelationshipsApiAction.updateBusinessMemberships
     */
    @Test
    fun `should handle updateBusinessMemberships`() {
        val businessId = TODO()
        val businessMembershipMember = TODO()
        val response: UpdateBusinessMembershipsResponse = businessAccessRelationshipsApi.updateBusinessMemberships(businessId, businessMembershipMember)
    }
}
