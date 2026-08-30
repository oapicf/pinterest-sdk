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
open class ConversionEventsApiStubs(private val objectMapper: ObjectMapper) {

    /**
     * Construct a stub for the operation eventsCreate.
     *
     * @param adAccountId path parameter adAccountId pattern.
     * @param test query parameter test pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [EventsCreateStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun eventsCreate(adAccountId: StringValuePattern, test: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): EventsCreateStubBuilder =
        EventsCreateStubBuilder(objectMapper, post(urlPathTemplate("/ad_accounts/{ad_account_id}/events"))
            .withPathParam("ad_account_id", adAccountId)
            .apply { test?.let { withQueryParam("test", it) } }
            .configurer()
        )
}
