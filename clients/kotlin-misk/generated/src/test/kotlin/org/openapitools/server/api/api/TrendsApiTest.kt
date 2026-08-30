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
import org.openapitools.server.api.model.AgeTrendsBucket
import org.openapitools.server.api.model.FeaturedTrend
import org.openapitools.server.api.model.GenderBucket
import org.openapitools.server.api.model.InterestsEnum
import org.openapitools.server.api.model.PinterestLibError
import org.openapitools.server.api.model.ProductCategoriesEngagementType
import org.openapitools.server.api.model.ProductCategoryDetailLookbackWindow
import org.openapitools.server.api.model.ProductCategoryDetails
import org.openapitools.server.api.model.ProductCategoryEnum
import org.openapitools.server.api.model.ProductCategoryRegion
import org.openapitools.server.api.model.TrendingProductCategory
import org.openapitools.server.api.model.TrendsEditorial
import org.openapitools.server.api.model.VerticalProductCategory

@MiskTest(startService = true)
internal class TrendsApiTest {

    @Suppress("unused")
    @MiskTestModule
    private val module = MiskTestModule()

    @Inject private lateinit var trendsApi: TrendsApiAction

    /**
     * To test TrendsApiAction.trendsEditorialArticlesList
     */
    @Test
    fun `should handle trendsEditorialArticlesList`() {
        val region = TODO()
        val response: kotlin.collections.List<TrendsEditorial> = trendsApi.trendsEditorialArticlesList(region)
    }

    /**
     * To test TrendsApiAction.trendsFeaturedTopicsList
     */
    @Test
    fun `should handle trendsFeaturedTopicsList`() {
        val region = TODO()
        val interest = TODO()
        val response: kotlin.collections.List<FeaturedTrend> = trendsApi.trendsFeaturedTopicsList(region, interest)
    }

    /**
     * To test TrendsApiAction.trendsProductCategoriesDetailsList
     */
    @Test
    fun `should handle trendsProductCategoriesDetailsList`() {
        val productCategories = TODO()
        val region = TODO()
        val lookbackWindow = TODO()
        val engagementType = TODO()
        val response: kotlin.collections.List<ProductCategoryDetails> = trendsApi.trendsProductCategoriesDetailsList(productCategories, region, lookbackWindow, engagementType)
    }

    /**
     * To test TrendsApiAction.trendsProductCategoriesTrendingList
     */
    @Test
    fun `should handle trendsProductCategoriesTrendingList`() {
        val region = TODO()
        val verticals = TODO()
        val ages = TODO()
        val genders = TODO()
        val engagementType = TODO()
        val response: kotlin.collections.List<TrendingProductCategory> = trendsApi.trendsProductCategoriesTrendingList(region, verticals, ages, genders, engagementType)
    }
}
