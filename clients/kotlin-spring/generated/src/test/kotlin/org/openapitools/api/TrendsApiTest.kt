package org.openapitools.api

import org.openapitools.model.AgeTrendsBucket
import org.openapitools.model.Error
import org.openapitools.model.FeaturedTrend
import org.openapitools.model.GenderBucket
import org.openapitools.model.InterestsEnum
import org.openapitools.model.PinterestLibError
import org.openapitools.model.ProductCategoriesEngagementType
import org.openapitools.model.ProductCategoryDetailLookbackWindow
import org.openapitools.model.ProductCategoryDetails
import org.openapitools.model.ProductCategoryEnum
import org.openapitools.model.ProductCategoryRegion
import org.openapitools.model.TrendType
import org.openapitools.model.TrendingKeywordsResponse
import org.openapitools.model.TrendingProductCategory
import org.openapitools.model.TrendsSupportedRegion
import org.openapitools.model.VerticalProductCategory
import org.junit.jupiter.api.Test
import org.springframework.http.ResponseEntity

class TrendsApiTest {

    private val api: TrendsApiController = TrendsApiController()

    /**
     * To test TrendsApiController.trendingKeywordsList
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun trendingKeywordsListTest() {
        val region: TrendsSupportedRegion = TODO()
        val trendType: TrendType = TODO()
        val interests: kotlin.collections.List<kotlin.String>? = TODO()
        val genders: kotlin.collections.List<kotlin.String>? = TODO()
        val ages: kotlin.collections.List<kotlin.String>? = TODO()
        val includeKeywords: kotlin.collections.List<kotlin.String>? = TODO()
        val normalizeAgainstGroup: kotlin.Boolean = TODO()
        val limit: kotlin.Int = TODO()
        val includePrediction: kotlin.Boolean = TODO()
        val includeDemographics: kotlin.Boolean = TODO()
        
        val response: ResponseEntity<TrendingKeywordsResponse> = api.trendingKeywordsList(region, trendType, interests, genders, ages, includeKeywords, normalizeAgainstGroup, limit, includePrediction, includeDemographics)

        // TODO: test validations
    }

    /**
     * To test TrendsApiController.trendsFeaturedTopicsList
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun trendsFeaturedTopicsListTest() {
        val region: ProductCategoryRegion = TODO()
        val interest: InterestsEnum? = TODO()
        
        val response: ResponseEntity<List<FeaturedTrend>> = api.trendsFeaturedTopicsList(region, interest)

        // TODO: test validations
    }

    /**
     * To test TrendsApiController.trendsProductCategoriesDetailsList
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun trendsProductCategoriesDetailsListTest() {
        val productCategories: kotlin.collections.List<ProductCategoryEnum> = TODO()
        val region: ProductCategoryRegion = TODO()
        val lookbackWindow: ProductCategoryDetailLookbackWindow? = TODO()
        val engagementType: ProductCategoriesEngagementType? = TODO()
        
        val response: ResponseEntity<List<ProductCategoryDetails>> = api.trendsProductCategoriesDetailsList(productCategories, region, lookbackWindow, engagementType)

        // TODO: test validations
    }

    /**
     * To test TrendsApiController.trendsProductCategoriesTrendingList
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    fun trendsProductCategoriesTrendingListTest() {
        val region: ProductCategoryRegion = TODO()
        val verticals: kotlin.collections.List<VerticalProductCategory>? = TODO()
        val ages: kotlin.collections.List<AgeTrendsBucket>? = TODO()
        val genders: kotlin.collections.List<GenderBucket>? = TODO()
        val engagementType: ProductCategoriesEngagementType? = TODO()
        
        val response: ResponseEntity<List<TrendingProductCategory>> = api.trendsProductCategoriesTrendingList(region, verticals, ages, genders, engagementType)

        // TODO: test validations
    }
}
