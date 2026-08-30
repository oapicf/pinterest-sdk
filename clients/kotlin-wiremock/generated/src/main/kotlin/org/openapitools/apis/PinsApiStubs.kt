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
open class PinsApiStubs(private val objectMapper: ObjectMapper) {

    /**
     * Construct a stub for the operation multiPinsAnalytics.
     *
     * @param pinIds query parameter pinIds pattern.
     * @param startDate query parameter startDate pattern.
     * @param endDate query parameter endDate pattern.
     * @param appTypes query parameter appTypes pattern.
     * @param metricTypes query parameter metricTypes pattern.
     * @param adAccountId query parameter adAccountId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [MultiPinsAnalyticsStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun multiPinsAnalytics(pinIds: StringValuePattern? = null, startDate: StringValuePattern? = null, endDate: StringValuePattern? = null, appTypes: StringValuePattern? = null, metricTypes: StringValuePattern? = null, adAccountId: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): MultiPinsAnalyticsStubBuilder =
        MultiPinsAnalyticsStubBuilder(objectMapper, get(urlPathTemplate("/pins/analytics"))
            .apply { pinIds?.let { withQueryParam("pin_ids", it) } }
            .apply { startDate?.let { withQueryParam("start_date", it) } }
            .apply { endDate?.let { withQueryParam("end_date", it) } }
            .apply { appTypes?.let { withQueryParam("app_types", it) } }
            .apply { metricTypes?.let { withQueryParam("metric_types", it) } }
            .apply { adAccountId?.let { withQueryParam("ad_account_id", it) } }
            .configurer()
        )

    /**
     * Construct a stub for the operation pinsAnalytics.
     *
     * @param pinId path parameter pinId pattern.
     * @param startDate query parameter startDate pattern.
     * @param endDate query parameter endDate pattern.
     * @param appTypes query parameter appTypes pattern.
     * @param metricTypes query parameter metricTypes pattern.
     * @param splitField query parameter splitField pattern.
     * @param adAccountId query parameter adAccountId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [PinsAnalyticsStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun pinsAnalytics(pinId: StringValuePattern, startDate: StringValuePattern? = null, endDate: StringValuePattern? = null, appTypes: StringValuePattern? = null, metricTypes: StringValuePattern? = null, splitField: StringValuePattern? = null, adAccountId: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): PinsAnalyticsStubBuilder =
        PinsAnalyticsStubBuilder(objectMapper, get(urlPathTemplate("/pins/{pin_id}/analytics"))
            .withPathParam("pin_id", pinId)
            .apply { startDate?.let { withQueryParam("start_date", it) } }
            .apply { endDate?.let { withQueryParam("end_date", it) } }
            .apply { appTypes?.let { withQueryParam("app_types", it) } }
            .apply { metricTypes?.let { withQueryParam("metric_types", it) } }
            .apply { splitField?.let { withQueryParam("split_field", it) } }
            .apply { adAccountId?.let { withQueryParam("ad_account_id", it) } }
            .configurer()
        )

    /**
     * Construct a stub for the operation pinsCreate.
     *
     * @param adAccountId query parameter adAccountId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [PinsCreateStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun pinsCreate(adAccountId: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): PinsCreateStubBuilder =
        PinsCreateStubBuilder(objectMapper, post(urlPathTemplate("/pins"))
            .apply { adAccountId?.let { withQueryParam("ad_account_id", it) } }
            .configurer()
        )

    /**
     * Construct a stub for the operation pinsDelete.
     *
     * @param pinId path parameter pinId pattern.
     * @param adAccountId query parameter adAccountId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [PinsDeleteStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun pinsDelete(pinId: StringValuePattern, adAccountId: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): PinsDeleteStubBuilder =
        PinsDeleteStubBuilder(objectMapper, delete(urlPathTemplate("/pins/{pin_id}"))
            .withPathParam("pin_id", pinId)
            .apply { adAccountId?.let { withQueryParam("ad_account_id", it) } }
            .configurer()
        )

    /**
     * Construct a stub for the operation pinsGet.
     *
     * @param pinId path parameter pinId pattern.
     * @param adAccountId query parameter adAccountId pattern.
     * @param pinMetrics query parameter pinMetrics pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [PinsGetStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun pinsGet(pinId: StringValuePattern, adAccountId: StringValuePattern? = null, pinMetrics: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): PinsGetStubBuilder =
        PinsGetStubBuilder(objectMapper, get(urlPathTemplate("/pins/{pin_id}"))
            .withPathParam("pin_id", pinId)
            .apply { adAccountId?.let { withQueryParam("ad_account_id", it) } }
            .apply { pinMetrics?.let { withQueryParam("pin_metrics", it) } }
            .configurer()
        )

    /**
     * Construct a stub for the operation pinsList.
     *
     * @param pinFilter query parameter pinFilter pattern.
     * @param pinMetrics query parameter pinMetrics pattern.
     * @param includeProtectedPins query parameter includeProtectedPins pattern.
     * @param pinType query parameter pinType pattern.
     * @param creativeTypes query parameter creativeTypes pattern.
     * @param adAccountId query parameter adAccountId pattern.
     * @param domain query parameter domain pattern.
     * @param domains query parameter domains pattern.
     * @param includeProductTagObj query parameter includeProductTagObj pattern.
     * @param bookmark query parameter bookmark pattern.
     * @param pageSize query parameter pageSize pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [PinsListStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun pinsList(pinFilter: StringValuePattern? = null, pinMetrics: StringValuePattern? = null, includeProtectedPins: StringValuePattern? = null, pinType: StringValuePattern? = null, creativeTypes: StringValuePattern? = null, adAccountId: StringValuePattern? = null, domain: StringValuePattern? = null, domains: StringValuePattern? = null, includeProductTagObj: StringValuePattern? = null, bookmark: StringValuePattern? = null, pageSize: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): PinsListStubBuilder =
        PinsListStubBuilder(objectMapper, get(urlPathTemplate("/pins"))
            .apply { pinFilter?.let { withQueryParam("pin_filter", it) } }
            .apply { pinMetrics?.let { withQueryParam("pin_metrics", it) } }
            .apply { includeProtectedPins?.let { withQueryParam("include_protected_pins", it) } }
            .apply { pinType?.let { withQueryParam("pin_type", it) } }
            .apply { creativeTypes?.let { withQueryParam("creative_types", it) } }
            .apply { adAccountId?.let { withQueryParam("ad_account_id", it) } }
            .apply { domain?.let { withQueryParam("domain", it) } }
            .apply { domains?.let { withQueryParam("domains", it) } }
            .apply { includeProductTagObj?.let { withQueryParam("include_product_tag_obj", it) } }
            .apply { bookmark?.let { withQueryParam("bookmark", it) } }
            .apply { pageSize?.let { withQueryParam("page_size", it) } }
            .configurer()
        )

    /**
     * Construct a stub for the operation pinsSave.
     *
     * @param pinId path parameter pinId pattern.
     * @param adAccountId query parameter adAccountId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [PinsSaveStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun pinsSave(pinId: StringValuePattern, adAccountId: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): PinsSaveStubBuilder =
        PinsSaveStubBuilder(objectMapper, post(urlPathTemplate("/pins/{pin_id}/save"))
            .withPathParam("pin_id", pinId)
            .apply { adAccountId?.let { withQueryParam("ad_account_id", it) } }
            .configurer()
        )

    /**
     * Construct a stub for the operation pinsUpdate.
     *
     * @param pinId path parameter pinId pattern.
     * @param adAccountId query parameter adAccountId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [PinsUpdateStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun pinsUpdate(pinId: StringValuePattern, adAccountId: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): PinsUpdateStubBuilder =
        PinsUpdateStubBuilder(objectMapper, patch(urlPathTemplate("/pins/{pin_id}"))
            .withPathParam("pin_id", pinId)
            .apply { adAccountId?.let { withQueryParam("ad_account_id", it) } }
            .configurer()
        )
}
