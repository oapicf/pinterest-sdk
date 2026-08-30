@file:Suppress(
    "RemoveRedundantQualifierName",
    "UnusedImport",
    "unused",
)

package org.openapitools.apis

import com.fasterxml.jackson.databind.ObjectMapper
import com.github.tomakehurst.wiremock.client.MappingBuilder
import com.github.tomakehurst.wiremock.client.ResponseDefinitionBuilder
import com.github.tomakehurst.wiremock.client.WireMock.*
import com.github.tomakehurst.wiremock.matching.StringValuePattern
import org.openapitools.models.*

/**
 * WireMock stub request builder.
 */
open class KeywordsApiStubs(private val objectMapper: ObjectMapper) {

    /**
     * Construct a stub for the operation countryKeywordsMetricsGet.
     *
     * @param adAccountId path parameter adAccountId pattern.
     * @param countryCode query parameter countryCode pattern.
     * @param keywords query parameter keywords pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [CountryKeywordsMetricsGetStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun countryKeywordsMetricsGet(adAccountId: StringValuePattern, countryCode: StringValuePattern? = null, keywords: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): CountryKeywordsMetricsGetStubBuilder =
        CountryKeywordsMetricsGetStubBuilder(objectMapper, get(urlPathTemplate("/ad_accounts/{ad_account_id}/keywords/metrics"))
            .withPathParam("ad_account_id", adAccountId)
            .apply { countryCode?.let { withQueryParam("country_code", it) } }
            .apply { keywords?.let { withQueryParam("keywords", it) } }
            .configurer()
        )

    /**
     * Construct a stub for the operation keywordsCreate.
     *
     * @param adAccountId path parameter adAccountId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [KeywordsCreateStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun keywordsCreate(adAccountId: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): KeywordsCreateStubBuilder =
        KeywordsCreateStubBuilder(objectMapper, post(urlPathTemplate("/ad_accounts/{ad_account_id}/keywords"))
            .withPathParam("ad_account_id", adAccountId)
            .configurer()
        )

    /**
     * Construct a stub for the operation keywordsGet.
     *
     * @param adAccountId path parameter adAccountId pattern.
     * @param campaignId query parameter campaignId pattern.
     * @param adGroupId query parameter adGroupId pattern.
     * @param adGroupIds query parameter adGroupIds pattern.
     * @param matchTypes query parameter matchTypes pattern.
     * @param bookmark query parameter bookmark pattern.
     * @param pageSize query parameter pageSize pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [KeywordsGetStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun keywordsGet(adAccountId: StringValuePattern, campaignId: StringValuePattern? = null, adGroupId: StringValuePattern? = null, adGroupIds: StringValuePattern? = null, matchTypes: StringValuePattern? = null, bookmark: StringValuePattern? = null, pageSize: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): KeywordsGetStubBuilder =
        KeywordsGetStubBuilder(objectMapper, get(urlPathTemplate("/ad_accounts/{ad_account_id}/keywords"))
            .withPathParam("ad_account_id", adAccountId)
            .apply { campaignId?.let { withQueryParam("campaign_id", it) } }
            .apply { adGroupId?.let { withQueryParam("ad_group_id", it) } }
            .apply { adGroupIds?.let { withQueryParam("ad_group_ids", it) } }
            .apply { matchTypes?.let { withQueryParam("match_types", it) } }
            .apply { bookmark?.let { withQueryParam("bookmark", it) } }
            .apply { pageSize?.let { withQueryParam("page_size", it) } }
            .configurer()
        )

    /**
     * Construct a stub for the operation keywordsUpdate.
     *
     * @param adAccountId path parameter adAccountId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [KeywordsUpdateStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun keywordsUpdate(adAccountId: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): KeywordsUpdateStubBuilder =
        KeywordsUpdateStubBuilder(objectMapper, patch(urlPathTemplate("/ad_accounts/{ad_account_id}/keywords"))
            .withPathParam("ad_account_id", adAccountId)
            .configurer()
        )

    /**
     * Construct a stub for the operation trendingKeywordsList.
     *
     * @param region path parameter region pattern.
     * @param trendType path parameter trendType pattern.
     * @param interests query parameter interests pattern.
     * @param genders query parameter genders pattern.
     * @param ages query parameter ages pattern.
     * @param includeKeywords query parameter includeKeywords pattern.
     * @param normalizeAgainstGroup query parameter normalizeAgainstGroup pattern.
     * @param limit query parameter limit pattern.
     * @param includeDemographics query parameter includeDemographics pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [TrendingKeywordsListStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun trendingKeywordsList(region: StringValuePattern, trendType: StringValuePattern, interests: StringValuePattern? = null, genders: StringValuePattern? = null, ages: StringValuePattern? = null, includeKeywords: StringValuePattern? = null, normalizeAgainstGroup: StringValuePattern? = null, limit: StringValuePattern? = null, includeDemographics: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): TrendingKeywordsListStubBuilder =
        TrendingKeywordsListStubBuilder(objectMapper, get(urlPathTemplate("/trends/keywords/{region}/top/{trend_type}"))
            .withPathParam("region", region)
            .withPathParam("trend_type", trendType)
            .apply { interests?.let { withQueryParam("interests", it) } }
            .apply { genders?.let { withQueryParam("genders", it) } }
            .apply { ages?.let { withQueryParam("ages", it) } }
            .apply { includeKeywords?.let { withQueryParam("include_keywords", it) } }
            .apply { normalizeAgainstGroup?.let { withQueryParam("normalize_against_group", it) } }
            .apply { limit?.let { withQueryParam("limit", it) } }
            .apply { includeDemographics?.let { withQueryParam("include_demographics", it) } }
            .configurer()
        )
}
