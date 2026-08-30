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
open class ConversionEqsApiStubs(private val objectMapper: ObjectMapper) {

    /**
     * Construct a stub for the operation conversionEqsList.
     *
     * @param adAccountId path parameter adAccountId pattern.
     * @param lookbackPeriod query parameter lookbackPeriod pattern.
     * @param sourcePlatform query parameter sourcePlatform pattern.
     * @param ingestionSource query parameter ingestionSource pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [ConversionEqsListStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun conversionEqsList(adAccountId: StringValuePattern, lookbackPeriod: StringValuePattern? = null, sourcePlatform: StringValuePattern? = null, ingestionSource: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): ConversionEqsListStubBuilder =
        ConversionEqsListStubBuilder(objectMapper, get(urlPathTemplate("/ad_accounts/{ad_account_id}/conversion_eqs"))
            .withPathParam("ad_account_id", adAccountId)
            .apply { lookbackPeriod?.let { withQueryParam("lookback_period", it) } }
            .apply { sourcePlatform?.let { withQueryParam("source_platform", it) } }
            .apply { ingestionSource?.let { withQueryParam("ingestion_source", it) } }
            .configurer()
        )
}
