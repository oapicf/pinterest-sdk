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
open class SearchApiStubs(private val objectMapper: ObjectMapper) {

    /**
     * Construct a stub for the operation searchPartnerPins.
     *
     * @param term query parameter term pattern.
     * @param countryCode query parameter countryCode pattern.
     * @param bookmark query parameter bookmark pattern.
     * @param locale query parameter locale pattern.
     * @param limit query parameter limit pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [SearchPartnerPinsStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun searchPartnerPins(term: StringValuePattern? = null, countryCode: StringValuePattern? = null, bookmark: StringValuePattern? = null, locale: StringValuePattern? = null, limit: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): SearchPartnerPinsStubBuilder =
        SearchPartnerPinsStubBuilder(objectMapper, get(urlPathTemplate("/search/partner/pins"))
            .apply { term?.let { withQueryParam("term", it) } }
            .apply { countryCode?.let { withQueryParam("country_code", it) } }
            .apply { bookmark?.let { withQueryParam("bookmark", it) } }
            .apply { locale?.let { withQueryParam("locale", it) } }
            .apply { limit?.let { withQueryParam("limit", it) } }
            .configurer()
        )

    /**
     * Construct a stub for the operation searchUserBoardsGet.
     *
     * @param adAccountId query parameter adAccountId pattern.
     * @param query query parameter query pattern.
     * @param bookmark query parameter bookmark pattern.
     * @param pageSize query parameter pageSize pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [SearchUserBoardsGetStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun searchUserBoardsGet(adAccountId: StringValuePattern? = null, query: StringValuePattern? = null, bookmark: StringValuePattern? = null, pageSize: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): SearchUserBoardsGetStubBuilder =
        SearchUserBoardsGetStubBuilder(objectMapper, get(urlPathTemplate("/search/boards"))
            .apply { adAccountId?.let { withQueryParam("ad_account_id", it) } }
            .apply { query?.let { withQueryParam("query", it) } }
            .apply { bookmark?.let { withQueryParam("bookmark", it) } }
            .apply { pageSize?.let { withQueryParam("page_size", it) } }
            .configurer()
        )

    /**
     * Construct a stub for the operation searchUserPinsList.
     *
     * @param adAccountId query parameter adAccountId pattern.
     * @param query query parameter query pattern.
     * @param bookmark query parameter bookmark pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [SearchUserPinsListStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun searchUserPinsList(adAccountId: StringValuePattern? = null, query: StringValuePattern? = null, bookmark: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): SearchUserPinsListStubBuilder =
        SearchUserPinsListStubBuilder(objectMapper, get(urlPathTemplate("/search/pins"))
            .apply { adAccountId?.let { withQueryParam("ad_account_id", it) } }
            .apply { query?.let { withQueryParam("query", it) } }
            .apply { bookmark?.let { withQueryParam("bookmark", it) } }
            .configurer()
        )
}
