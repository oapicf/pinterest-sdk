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
open class CatalogReportsApiStubs(private val objectMapper: ObjectMapper) {

    /**
     * Construct a stub for the operation reportsCreate.
     *
     * @param adAccountId query parameter adAccountId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [ReportsCreateStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun reportsCreate(adAccountId: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): ReportsCreateStubBuilder =
        ReportsCreateStubBuilder(objectMapper, post(urlPathTemplate("/catalogs/reports"))
            .apply { adAccountId?.let { withQueryParam("ad_account_id", it) } }
            .configurer()
        )

    /**
     * Construct a stub for the operation reportsGet.
     *
     * @param adAccountId query parameter adAccountId pattern.
     * @param token query parameter token pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [ReportsGetStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun reportsGet(adAccountId: StringValuePattern? = null, token: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): ReportsGetStubBuilder =
        ReportsGetStubBuilder(objectMapper, get(urlPathTemplate("/catalogs/reports"))
            .apply { adAccountId?.let { withQueryParam("ad_account_id", it) } }
            .apply { token?.let { withQueryParam("token", it) } }
            .configurer()
        )

    /**
     * Construct a stub for the operation reportsStats.
     *
     * @param adAccountId query parameter adAccountId pattern.
     * @param parameters query parameter parameters pattern.
     * @param bookmark query parameter bookmark pattern.
     * @param pageSize query parameter pageSize pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [ReportsStatsStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun reportsStats(adAccountId: StringValuePattern? = null, parameters: StringValuePattern? = null, bookmark: StringValuePattern? = null, pageSize: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): ReportsStatsStubBuilder =
        ReportsStatsStubBuilder(objectMapper, get(urlPathTemplate("/catalogs/reports/stats"))
            .apply { adAccountId?.let { withQueryParam("ad_account_id", it) } }
            .apply { parameters?.let { withQueryParam("parameters", it) } }
            .apply { bookmark?.let { withQueryParam("bookmark", it) } }
            .apply { pageSize?.let { withQueryParam("page_size", it) } }
            .configurer()
        )
}
