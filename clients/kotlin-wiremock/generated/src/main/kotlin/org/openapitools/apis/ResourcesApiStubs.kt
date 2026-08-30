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
open class ResourcesApiStubs(private val objectMapper: ObjectMapper) {

    /**
     * Construct a stub for the operation adAccountCountriesGet.
     *
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [AdAccountCountriesGetStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun adAccountCountriesGet(configurer: MappingBuilder.() -> MappingBuilder = { this }): AdAccountCountriesGetStubBuilder =
        AdAccountCountriesGetStubBuilder(objectMapper, get(urlPathTemplate("/resources/ad_account_countries"))
            .configurer()
        )

    /**
     * Construct a stub for the operation deliveryMetricsGet.
     *
     * @param reportType query parameter reportType pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [DeliveryMetricsGetStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun deliveryMetricsGet(reportType: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): DeliveryMetricsGetStubBuilder =
        DeliveryMetricsGetStubBuilder(objectMapper, get(urlPathTemplate("/resources/delivery_metrics"))
            .apply { reportType?.let { withQueryParam("report_type", it) } }
            .configurer()
        )

    /**
     * Construct a stub for the operation interestTargetingOptionsGet.
     *
     * @param interestId path parameter interestId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [InterestTargetingOptionsGetStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun interestTargetingOptionsGet(interestId: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): InterestTargetingOptionsGetStubBuilder =
        InterestTargetingOptionsGetStubBuilder(objectMapper, get(urlPathTemplate("/resources/targeting/interests/{interest_id}"))
            .withPathParam("interest_id", interestId)
            .configurer()
        )

    /**
     * Construct a stub for the operation leadFormQuestionsGet.
     *
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [LeadFormQuestionsGetStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun leadFormQuestionsGet(configurer: MappingBuilder.() -> MappingBuilder = { this }): LeadFormQuestionsGetStubBuilder =
        LeadFormQuestionsGetStubBuilder(objectMapper, get(urlPathTemplate("/resources/lead_form_questions"))
            .configurer()
        )

    /**
     * Construct a stub for the operation metricsReadyStateGet.
     *
     * @param date query parameter date pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [MetricsReadyStateGetStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun metricsReadyStateGet(date: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): MetricsReadyStateGetStubBuilder =
        MetricsReadyStateGetStubBuilder(objectMapper, get(urlPathTemplate("/resources/metrics_ready_state"))
            .apply { date?.let { withQueryParam("date", it) } }
            .configurer()
        )

    /**
     * Construct a stub for the operation targetingOptionsGet.
     *
     * @param targetingType path parameter targetingType pattern.
     * @param adAccountId query parameter adAccountId pattern.
     * @param clientId query parameter clientId pattern.
     * @param oauthSignature query parameter oauthSignature pattern.
     * @param timestamp query parameter timestamp pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [TargetingOptionsGetStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun targetingOptionsGet(targetingType: StringValuePattern, adAccountId: StringValuePattern? = null, clientId: StringValuePattern? = null, oauthSignature: StringValuePattern? = null, timestamp: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): TargetingOptionsGetStubBuilder =
        TargetingOptionsGetStubBuilder(objectMapper, get(urlPathTemplate("/resources/targeting/{targeting_type}"))
            .withPathParam("targeting_type", targetingType)
            .apply { adAccountId?.let { withQueryParam("ad_account_id", it) } }
            .apply { clientId?.let { withQueryParam("client_id", it) } }
            .apply { oauthSignature?.let { withQueryParam("oauth_signature", it) } }
            .apply { timestamp?.let { withQueryParam("timestamp", it) } }
            .configurer()
        )
}
