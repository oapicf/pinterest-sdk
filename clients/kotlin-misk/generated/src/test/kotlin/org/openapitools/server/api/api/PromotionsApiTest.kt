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
import org.openapitools.server.api.model.PinterestLibError
import org.openapitools.server.api.model.PinterestLibPaginationOrder
import org.openapitools.server.api.model.Promotion
import org.openapitools.server.api.model.PromotionBatchUpdate
import org.openapitools.server.api.model.PromotionCreate
import org.openapitools.server.api.model.PromotionsList200Response
import org.openapitools.server.api.model.PromotionsResponse

@MiskTest(startService = true)
internal class PromotionsApiTest {

    @Suppress("unused")
    @MiskTestModule
    private val module = MiskTestModule()

    @Inject private lateinit var promotionsApi: PromotionsApiAction

    /**
     * To test PromotionsApiAction.promotionsCreate
     */
    @Test
    fun `should handle promotionsCreate`() {
        val adAccountId = TODO()
        val promotionCreate = TODO()
        val response: PromotionsResponse = promotionsApi.promotionsCreate(adAccountId, promotionCreate)
    }

    /**
     * To test PromotionsApiAction.promotionsDelete
     */
    @Test
    fun `should handle promotionsDelete`() {
        val promotionId = TODO()
        val adAccountId = TODO()
        val response: Promotion = promotionsApi.promotionsDelete(promotionId, adAccountId)
    }

    /**
     * To test PromotionsApiAction.promotionsGet
     */
    @Test
    fun `should handle promotionsGet`() {
        val promotionId = TODO()
        val adAccountId = TODO()
        val response: Promotion = promotionsApi.promotionsGet(promotionId, adAccountId)
    }

    /**
     * To test PromotionsApiAction.promotionsList
     */
    @Test
    fun `should handle promotionsList`() {
        val adAccountId = TODO()
        val bookmark = TODO()
        val pageSize = TODO()
        val order = TODO()
        val response: PromotionsList200Response = promotionsApi.promotionsList(adAccountId, bookmark, pageSize, order)
    }

    /**
     * To test PromotionsApiAction.promotionsUpdate
     */
    @Test
    fun `should handle promotionsUpdate`() {
        val adAccountId = TODO()
        val promotionBatchUpdate = TODO()
        val response: PromotionsResponse = promotionsApi.promotionsUpdate(adAccountId, promotionBatchUpdate)
    }
}
