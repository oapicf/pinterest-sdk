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
import org.openapitools.server.api.model.AdAccountsSubscriptionsGetList200Response
import org.openapitools.server.api.model.LeadSubscription
import org.openapitools.server.api.model.LeadSubscriptionPostParamsCreate
import org.openapitools.server.api.model.PinterestLibError

@MiskTest(startService = true)
internal class LeadAdsApiTest {

    @Suppress("unused")
    @MiskTestModule
    private val module = MiskTestModule()

    @Inject private lateinit var leadAdsApi: LeadAdsApiAction

    /**
     * To test LeadAdsApiAction.adAccountsSubscriptionsDelById
     */
    @Test
    fun `should handle adAccountsSubscriptionsDelById`() {
        val adAccountId = TODO()
        val subscriptionId = TODO()
        val response: LeadSubscription = leadAdsApi.adAccountsSubscriptionsDelById(adAccountId, subscriptionId)
    }

    /**
     * To test LeadAdsApiAction.adAccountsSubscriptionsGetById
     */
    @Test
    fun `should handle adAccountsSubscriptionsGetById`() {
        val adAccountId = TODO()
        val subscriptionId = TODO()
        val response: LeadSubscription = leadAdsApi.adAccountsSubscriptionsGetById(adAccountId, subscriptionId)
    }

    /**
     * To test LeadAdsApiAction.adAccountsSubscriptionsGetList
     */
    @Test
    fun `should handle adAccountsSubscriptionsGetList`() {
        val adAccountId = TODO()
        val bookmark = TODO()
        val pageSize = TODO()
        val response: AdAccountsSubscriptionsGetList200Response = leadAdsApi.adAccountsSubscriptionsGetList(adAccountId, bookmark, pageSize)
    }

    /**
     * To test LeadAdsApiAction.adAccountsSubscriptionsPost
     */
    @Test
    fun `should handle adAccountsSubscriptionsPost`() {
        val adAccountId = TODO()
        val leadSubscriptionPostParamsCreate = TODO()
        val response: LeadSubscription = leadAdsApi.adAccountsSubscriptionsPost(adAccountId, leadSubscriptionPostParamsCreate)
    }
}
