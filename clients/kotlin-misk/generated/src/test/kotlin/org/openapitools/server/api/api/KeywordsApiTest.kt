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
import org.openapitools.server.api.model.Keywords
import org.openapitools.server.api.model.KeywordsCreate
import org.openapitools.server.api.model.KeywordsGet200Response
import org.openapitools.server.api.model.KeywordsMetricsArrayResponse
import org.openapitools.server.api.model.KeywordsUpdate
import org.openapitools.server.api.model.MatchType
import org.openapitools.server.api.model.PinterestLibError
import org.openapitools.server.api.model.TrendType
import org.openapitools.server.api.model.TrendingKeywordsResponse
import org.openapitools.server.api.model.TrendsAgeBucket
import org.openapitools.server.api.model.TrendsGenderFilter
import org.openapitools.server.api.model.TrendsL1Interest
import org.openapitools.server.api.model.TrendsSupportedRegion

@MiskTest(startService = true)
internal class KeywordsApiTest {

    @Suppress("unused")
    @MiskTestModule
    private val module = MiskTestModule()

    @Inject private lateinit var keywordsApi: KeywordsApiAction

    /**
     * To test KeywordsApiAction.countryKeywordsMetricsGet
     */
    @Test
    fun `should handle countryKeywordsMetricsGet`() {
        val adAccountId = TODO()
        val countryCode = TODO()
        val keywords = TODO()
        val response: KeywordsMetricsArrayResponse = keywordsApi.countryKeywordsMetricsGet(adAccountId, countryCode, keywords)
    }

    /**
     * To test KeywordsApiAction.keywordsCreate
     */
    @Test
    fun `should handle keywordsCreate`() {
        val adAccountId = TODO()
        val keywordsCreate = TODO()
        val response: Keywords = keywordsApi.keywordsCreate(adAccountId, keywordsCreate)
    }

    /**
     * To test KeywordsApiAction.keywordsGet
     */
    @Test
    fun `should handle keywordsGet`() {
        val adAccountId = TODO()
        val campaignId = TODO()
        val adGroupId = TODO()
        val adGroupIds = TODO()
        val matchTypes = TODO()
        val bookmark = TODO()
        val pageSize = TODO()
        val response: KeywordsGet200Response = keywordsApi.keywordsGet(adAccountId, campaignId, adGroupId, adGroupIds, matchTypes, bookmark, pageSize)
    }

    /**
     * To test KeywordsApiAction.keywordsUpdate
     */
    @Test
    fun `should handle keywordsUpdate`() {
        val adAccountId = TODO()
        val keywordsUpdate = TODO()
        val response: Keywords = keywordsApi.keywordsUpdate(adAccountId, keywordsUpdate)
    }

    /**
     * To test KeywordsApiAction.trendingKeywordsList
     */
    @Test
    fun `should handle trendingKeywordsList`() {
        val region = TODO()
        val trendType = TODO()
        val interests = TODO()
        val genders = TODO()
        val ages = TODO()
        val includeKeywords = TODO()
        val normalizeAgainstGroup = TODO()
        val limit = TODO()
        val includeDemographics = TODO()
        val response: TrendingKeywordsResponse = keywordsApi.trendingKeywordsList(region, trendType, interests, genders, ages, includeKeywords, normalizeAgainstGroup, limit, includeDemographics)
    }
}
