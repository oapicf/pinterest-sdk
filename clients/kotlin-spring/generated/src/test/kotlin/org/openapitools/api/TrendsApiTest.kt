package org.openapitools.api

import org.openapitools.model.Error
import org.openapitools.model.TrendType
import org.openapitools.model.TrendingKeywordsResponse
import org.openapitools.model.TrendsSupportedRegion
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
        val response: ResponseEntity<TrendingKeywordsResponse> = api.trendingKeywordsList(region, trendType, interests, genders, ages, includeKeywords, normalizeAgainstGroup, limit)

        // TODO: test validations
    }
}
