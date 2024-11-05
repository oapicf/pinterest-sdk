package org.openapitools.api

import org.openapitools.model.AdvancedAuctionItems
import org.openapitools.model.AdvancedAuctionItemsGetRequest
import org.openapitools.model.AdvancedAuctionItemsSubmitRequest
import org.openapitools.model.AdvancedAuctionProcessedItems
import org.openapitools.model.Error
import org.junit.jupiter.api.Test
import org.springframework.http.ResponseEntity

class AdvancedAuctionApiTest {

    private val api: AdvancedAuctionApiController = AdvancedAuctionApiController()

    /**
     * To test AdvancedAuctionApiController.advancedAuctionItemsGetPost
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun advancedAuctionItemsGetPostTest() {
        val advancedAuctionItemsGetRequest: AdvancedAuctionItemsGetRequest = TODO()
        val adAccountId: kotlin.String? = TODO()
        val response: ResponseEntity<AdvancedAuctionItems> = api.advancedAuctionItemsGetPost(advancedAuctionItemsGetRequest, adAccountId)

        // TODO: test validations
    }

    /**
     * To test AdvancedAuctionApiController.advancedAuctionItemsSubmitPost
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun advancedAuctionItemsSubmitPostTest() {
        val advancedAuctionItemsSubmitRequest: AdvancedAuctionItemsSubmitRequest = TODO()
        val adAccountId: kotlin.String? = TODO()
        val response: ResponseEntity<AdvancedAuctionProcessedItems> = api.advancedAuctionItemsSubmitPost(advancedAuctionItemsSubmitRequest, adAccountId)

        // TODO: test validations
    }
}
