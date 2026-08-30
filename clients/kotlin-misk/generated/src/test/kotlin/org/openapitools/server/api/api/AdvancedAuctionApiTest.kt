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
import org.openapitools.server.api.model.AdvancedAuctionItems
import org.openapitools.server.api.model.AdvancedAuctionItemsGetRequest
import org.openapitools.server.api.model.AdvancedAuctionItemsSubmitRequest
import org.openapitools.server.api.model.AdvancedAuctionProcessedItems
import org.openapitools.server.api.model.PinterestLibError

@MiskTest(startService = true)
internal class AdvancedAuctionApiTest {

    @Suppress("unused")
    @MiskTestModule
    private val module = MiskTestModule()

    @Inject private lateinit var advancedAuctionApi: AdvancedAuctionApiAction

    /**
     * To test AdvancedAuctionApiAction.advancedAuctionItemsGetPost
     */
    @Test
    fun `should handle advancedAuctionItemsGetPost`() {
        val advancedAuctionItemsGetRequest = TODO()
        val adAccountId = TODO()
        val response: AdvancedAuctionItems = advancedAuctionApi.advancedAuctionItemsGetPost(advancedAuctionItemsGetRequest, adAccountId)
    }

    /**
     * To test AdvancedAuctionApiAction.advancedAuctionItemsSubmitPost
     */
    @Test
    fun `should handle advancedAuctionItemsSubmitPost`() {
        val advancedAuctionItemsSubmitRequest = TODO()
        val adAccountId = TODO()
        val response: AdvancedAuctionProcessedItems = advancedAuctionApi.advancedAuctionItemsSubmitPost(advancedAuctionItemsSubmitRequest, adAccountId)
    }
}
