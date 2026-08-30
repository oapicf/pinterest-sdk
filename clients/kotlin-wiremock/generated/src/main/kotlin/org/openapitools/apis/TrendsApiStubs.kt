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
open class TrendsApiStubs(private val objectMapper: ObjectMapper) {

    /**
     * Construct a stub for the operation trendsEditorialArticlesList.
     *
     * @param region query parameter region pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [TrendsEditorialArticlesListStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun trendsEditorialArticlesList(region: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): TrendsEditorialArticlesListStubBuilder =
        TrendsEditorialArticlesListStubBuilder(objectMapper, get(urlPathTemplate("/trends/editorial_articles"))
            .apply { region?.let { withQueryParam("region", it) } }
            .configurer()
        )

    /**
     * Construct a stub for the operation trendsFeaturedTopicsList.
     *
     * @param interest query parameter interest pattern.
     * @param region query parameter region pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [TrendsFeaturedTopicsListStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun trendsFeaturedTopicsList(interest: StringValuePattern? = null, region: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): TrendsFeaturedTopicsListStubBuilder =
        TrendsFeaturedTopicsListStubBuilder(objectMapper, get(urlPathTemplate("/trends/topics/featured"))
            .apply { interest?.let { withQueryParam("interest", it) } }
            .apply { region?.let { withQueryParam("region", it) } }
            .configurer()
        )

    /**
     * Construct a stub for the operation trendsProductCategoriesDetailsList.
     *
     * @param productCategories query parameter productCategories pattern.
     * @param region query parameter region pattern.
     * @param lookbackWindow query parameter lookbackWindow pattern.
     * @param engagementType query parameter engagementType pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [TrendsProductCategoriesDetailsListStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun trendsProductCategoriesDetailsList(productCategories: StringValuePattern? = null, region: StringValuePattern? = null, lookbackWindow: StringValuePattern? = null, engagementType: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): TrendsProductCategoriesDetailsListStubBuilder =
        TrendsProductCategoriesDetailsListStubBuilder(objectMapper, get(urlPathTemplate("/trends/product_categories/details"))
            .apply { productCategories?.let { withQueryParam("product_categories", it) } }
            .apply { region?.let { withQueryParam("region", it) } }
            .apply { lookbackWindow?.let { withQueryParam("lookback_window", it) } }
            .apply { engagementType?.let { withQueryParam("engagement_type", it) } }
            .configurer()
        )

    /**
     * Construct a stub for the operation trendsProductCategoriesTrendingList.
     *
     * @param region query parameter region pattern.
     * @param verticals query parameter verticals pattern.
     * @param ages query parameter ages pattern.
     * @param genders query parameter genders pattern.
     * @param engagementType query parameter engagementType pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [TrendsProductCategoriesTrendingListStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun trendsProductCategoriesTrendingList(region: StringValuePattern? = null, verticals: StringValuePattern? = null, ages: StringValuePattern? = null, genders: StringValuePattern? = null, engagementType: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): TrendsProductCategoriesTrendingListStubBuilder =
        TrendsProductCategoriesTrendingListStubBuilder(objectMapper, get(urlPathTemplate("/trends/product_categories/trending"))
            .apply { region?.let { withQueryParam("region", it) } }
            .apply { verticals?.let { withQueryParam("verticals", it) } }
            .apply { ages?.let { withQueryParam("ages", it) } }
            .apply { genders?.let { withQueryParam("genders", it) } }
            .apply { engagementType?.let { withQueryParam("engagement_type", it) } }
            .configurer()
        )
}
