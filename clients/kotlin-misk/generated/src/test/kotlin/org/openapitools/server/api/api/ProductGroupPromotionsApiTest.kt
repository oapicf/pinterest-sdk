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
import org.openapitools.server.api.model.EntityStatus
import org.openapitools.server.api.model.Granularity
import org.openapitools.server.api.model.PinterestLibError
import org.openapitools.server.api.model.PinterestLibPaginationOrder
import org.openapitools.server.api.model.ProductGroupAnalyticsItems
import org.openapitools.server.api.model.ProductGroupPromotion
import org.openapitools.server.api.model.ProductGroupPromotions
import org.openapitools.server.api.model.ProductGroupPromotionsCreate
import org.openapitools.server.api.model.ProductGroupPromotionsList200Response
import org.openapitools.server.api.model.ProductGroupPromotionsUpdateWithRequiredBody
import org.openapitools.server.api.model.ReportingColumnSync
import org.openapitools.server.api.model.ReportingTimeZone

@MiskTest(startService = true)
internal class ProductGroupPromotionsApiTest {

    @Suppress("unused")
    @MiskTestModule
    private val module = MiskTestModule()

    @Inject private lateinit var productGroupPromotionsApi: ProductGroupPromotionsApiAction

    /**
     * To test ProductGroupPromotionsApiAction.productGroupPromotionsCreate
     */
    @Test
    fun `should handle productGroupPromotionsCreate`() {
        val adAccountId = TODO()
        val productGroupPromotionsCreate = TODO()
        val response: ProductGroupPromotions = productGroupPromotionsApi.productGroupPromotionsCreate(adAccountId, productGroupPromotionsCreate)
    }

    /**
     * To test ProductGroupPromotionsApiAction.productGroupPromotionsGet
     */
    @Test
    fun `should handle productGroupPromotionsGet`() {
        val adAccountId = TODO()
        val productGroupPromotionId = TODO()
        val response: ProductGroupPromotion = productGroupPromotionsApi.productGroupPromotionsGet(adAccountId, productGroupPromotionId)
    }

    /**
     * To test ProductGroupPromotionsApiAction.productGroupPromotionsList
     */
    @Test
    fun `should handle productGroupPromotionsList`() {
        val adAccountId = TODO()
        val bookmark = TODO()
        val pageSize = TODO()
        val order = TODO()
        val productGroupPromotionIds = TODO()
        val entityStatuses = TODO()
        val adGroupId = TODO()
        val response: ProductGroupPromotionsList200Response = productGroupPromotionsApi.productGroupPromotionsList(adAccountId, bookmark, pageSize, order, productGroupPromotionIds, entityStatuses, adGroupId)
    }

    /**
     * To test ProductGroupPromotionsApiAction.productGroupPromotionsUpdate
     */
    @Test
    fun `should handle productGroupPromotionsUpdate`() {
        val adAccountId = TODO()
        val productGroupPromotionsUpdateWithRequiredBody = TODO()
        val response: ProductGroupPromotions = productGroupPromotionsApi.productGroupPromotionsUpdate(adAccountId, productGroupPromotionsUpdateWithRequiredBody)
    }

    /**
     * To test ProductGroupPromotionsApiAction.productGroupsAnalytics
     */
    @Test
    fun `should handle productGroupsAnalytics`() {
        val startDate = TODO()
        val endDate = TODO()
        val productGroupIds = TODO()
        val columns = TODO()
        val granularity = TODO()
        val adAccountId = TODO()
        val clickWindowDays = TODO()
        val engagementWindowDays = TODO()
        val viewWindowDays = TODO()
        val conversionReportTime = TODO()
        val reportingTimezone = TODO()
        val response: kotlin.collections.List<ProductGroupAnalyticsItems> = productGroupPromotionsApi.productGroupsAnalytics(startDate, endDate, productGroupIds, columns, granularity, adAccountId, clickWindowDays, engagementWindowDays, viewWindowDays, conversionReportTime, reportingTimezone)
    }
}
