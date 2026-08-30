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
open class CatalogsApiStubs(private val objectMapper: ObjectMapper) {

    /**
     * Construct a stub for the operation catalogsAvailableFilterValues.
     *
     * @param catalogId query parameter catalogId pattern.
     * @param feedId query parameter feedId pattern.
     * @param country query parameter country pattern.
     * @param language query parameter language pattern.
     * @param adAccountId query parameter adAccountId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [CatalogsAvailableFilterValuesStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun catalogsAvailableFilterValues(catalogId: StringValuePattern? = null, feedId: StringValuePattern? = null, country: StringValuePattern? = null, language: StringValuePattern? = null, adAccountId: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): CatalogsAvailableFilterValuesStubBuilder =
        CatalogsAvailableFilterValuesStubBuilder(objectMapper, get(urlPathTemplate("/catalogs/available_filter_values"))
            .apply { catalogId?.let { withQueryParam("catalog_id", it) } }
            .apply { feedId?.let { withQueryParam("feed_id", it) } }
            .apply { country?.let { withQueryParam("country", it) } }
            .apply { language?.let { withQueryParam("language", it) } }
            .apply { adAccountId?.let { withQueryParam("ad_account_id", it) } }
            .configurer()
        )

    /**
     * Construct a stub for the operation catalogsCreate.
     *
     * @param adAccountId query parameter adAccountId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [CatalogsCreateStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun catalogsCreate(adAccountId: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): CatalogsCreateStubBuilder =
        CatalogsCreateStubBuilder(objectMapper, post(urlPathTemplate("/catalogs"))
            .apply { adAccountId?.let { withQueryParam("ad_account_id", it) } }
            .configurer()
        )

    /**
     * Construct a stub for the operation catalogsList.
     *
     * @param adAccountId query parameter adAccountId pattern.
     * @param bookmark query parameter bookmark pattern.
     * @param pageSize query parameter pageSize pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [CatalogsListStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun catalogsList(adAccountId: StringValuePattern? = null, bookmark: StringValuePattern? = null, pageSize: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): CatalogsListStubBuilder =
        CatalogsListStubBuilder(objectMapper, get(urlPathTemplate("/catalogs"))
            .apply { adAccountId?.let { withQueryParam("ad_account_id", it) } }
            .apply { bookmark?.let { withQueryParam("bookmark", it) } }
            .apply { pageSize?.let { withQueryParam("page_size", it) } }
            .configurer()
        )
}
