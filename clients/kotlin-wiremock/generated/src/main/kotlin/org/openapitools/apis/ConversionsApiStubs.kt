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
open class ConversionsApiStubs(private val objectMapper: ObjectMapper) {

    /**
     * Construct a stub for the operation advertiserDefinedEventsCreate.
     *
     * @param adAccountId path parameter adAccountId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [AdvertiserDefinedEventsCreateStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun advertiserDefinedEventsCreate(adAccountId: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): AdvertiserDefinedEventsCreateStubBuilder =
        AdvertiserDefinedEventsCreateStubBuilder(objectMapper, post(urlPathTemplate("/ad_accounts/{ad_account_id}/advertiser_defined_events"))
            .withPathParam("ad_account_id", adAccountId)
            .configurer()
        )

    /**
     * Construct a stub for the operation advertiserDefinedEventsDelete.
     *
     * @param adAccountId path parameter adAccountId pattern.
     * @param eventNames query parameter eventNames pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [AdvertiserDefinedEventsDeleteStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun advertiserDefinedEventsDelete(adAccountId: StringValuePattern, eventNames: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): AdvertiserDefinedEventsDeleteStubBuilder =
        AdvertiserDefinedEventsDeleteStubBuilder(objectMapper, delete(urlPathTemplate("/ad_accounts/{ad_account_id}/advertiser_defined_events"))
            .withPathParam("ad_account_id", adAccountId)
            .apply { eventNames?.let { withQueryParam("event_names", it) } }
            .configurer()
        )

    /**
     * Construct a stub for the operation advertiserDefinedEventsGet.
     *
     * @param adAccountId path parameter adAccountId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [AdvertiserDefinedEventsGetStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun advertiserDefinedEventsGet(adAccountId: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): AdvertiserDefinedEventsGetStubBuilder =
        AdvertiserDefinedEventsGetStubBuilder(objectMapper, get(urlPathTemplate("/ad_accounts/{ad_account_id}/advertiser_defined_events"))
            .withPathParam("ad_account_id", adAccountId)
            .configurer()
        )

    /**
     * Construct a stub for the operation advertiserDefinedEventsUpdate.
     *
     * @param adAccountId path parameter adAccountId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [AdvertiserDefinedEventsUpdateStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun advertiserDefinedEventsUpdate(adAccountId: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): AdvertiserDefinedEventsUpdateStubBuilder =
        AdvertiserDefinedEventsUpdateStubBuilder(objectMapper, patch(urlPathTemplate("/ad_accounts/{ad_account_id}/advertiser_defined_events"))
            .withPathParam("ad_account_id", adAccountId)
            .configurer()
        )
}
