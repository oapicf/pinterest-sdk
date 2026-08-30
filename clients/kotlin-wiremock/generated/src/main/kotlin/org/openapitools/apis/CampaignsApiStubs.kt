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
open class CampaignsApiStubs(private val objectMapper: ObjectMapper) {

    /**
     * Construct a stub for the operation adPinsAnalytics.
     *
     * @param adAccountId path parameter adAccountId pattern.
     * @param campaignId query parameter campaignId pattern.
     * @param pinIds query parameter pinIds pattern.
     * @param startDate query parameter startDate pattern.
     * @param endDate query parameter endDate pattern.
     * @param columns query parameter columns pattern.
     * @param granularity query parameter granularity pattern.
     * @param clickWindowDays query parameter clickWindowDays pattern.
     * @param engagementWindowDays query parameter engagementWindowDays pattern.
     * @param viewWindowDays query parameter viewWindowDays pattern.
     * @param conversionReportTime query parameter conversionReportTime pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [AdPinsAnalyticsStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun adPinsAnalytics(adAccountId: StringValuePattern, campaignId: StringValuePattern? = null, pinIds: StringValuePattern? = null, startDate: StringValuePattern? = null, endDate: StringValuePattern? = null, columns: StringValuePattern? = null, granularity: StringValuePattern? = null, clickWindowDays: StringValuePattern? = null, engagementWindowDays: StringValuePattern? = null, viewWindowDays: StringValuePattern? = null, conversionReportTime: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): AdPinsAnalyticsStubBuilder =
        AdPinsAnalyticsStubBuilder(objectMapper, get(urlPathTemplate("/ad_accounts/{ad_account_id}/pins/analytics"))
            .withPathParam("ad_account_id", adAccountId)
            .apply { campaignId?.let { withQueryParam("campaign_id", it) } }
            .apply { pinIds?.let { withQueryParam("pin_ids", it) } }
            .apply { startDate?.let { withQueryParam("start_date", it) } }
            .apply { endDate?.let { withQueryParam("end_date", it) } }
            .apply { columns?.let { withQueryParam("columns", it) } }
            .apply { granularity?.let { withQueryParam("granularity", it) } }
            .apply { clickWindowDays?.let { withQueryParam("click_window_days", it) } }
            .apply { engagementWindowDays?.let { withQueryParam("engagement_window_days", it) } }
            .apply { viewWindowDays?.let { withQueryParam("view_window_days", it) } }
            .apply { conversionReportTime?.let { withQueryParam("conversion_report_time", it) } }
            .configurer()
        )

    /**
     * Construct a stub for the operation campaignTargetingAnalyticsGet.
     *
     * @param adAccountId path parameter adAccountId pattern.
     * @param campaignIds query parameter campaignIds pattern.
     * @param startDate query parameter startDate pattern.
     * @param endDate query parameter endDate pattern.
     * @param targetingTypes query parameter targetingTypes pattern.
     * @param columns query parameter columns pattern.
     * @param granularity query parameter granularity pattern.
     * @param clickWindowDays query parameter clickWindowDays pattern.
     * @param engagementWindowDays query parameter engagementWindowDays pattern.
     * @param viewWindowDays query parameter viewWindowDays pattern.
     * @param conversionReportTime query parameter conversionReportTime pattern.
     * @param attributionTypes query parameter attributionTypes pattern.
     * @param reportingTimezone query parameter reportingTimezone pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [CampaignTargetingAnalyticsGetStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun campaignTargetingAnalyticsGet(adAccountId: StringValuePattern, campaignIds: StringValuePattern? = null, startDate: StringValuePattern? = null, endDate: StringValuePattern? = null, targetingTypes: StringValuePattern? = null, columns: StringValuePattern? = null, granularity: StringValuePattern? = null, clickWindowDays: StringValuePattern? = null, engagementWindowDays: StringValuePattern? = null, viewWindowDays: StringValuePattern? = null, conversionReportTime: StringValuePattern? = null, attributionTypes: StringValuePattern? = null, reportingTimezone: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): CampaignTargetingAnalyticsGetStubBuilder =
        CampaignTargetingAnalyticsGetStubBuilder(objectMapper, get(urlPathTemplate("/ad_accounts/{ad_account_id}/campaigns/targeting_analytics"))
            .withPathParam("ad_account_id", adAccountId)
            .apply { campaignIds?.let { withQueryParam("campaign_ids", it) } }
            .apply { startDate?.let { withQueryParam("start_date", it) } }
            .apply { endDate?.let { withQueryParam("end_date", it) } }
            .apply { targetingTypes?.let { withQueryParam("targeting_types", it) } }
            .apply { columns?.let { withQueryParam("columns", it) } }
            .apply { granularity?.let { withQueryParam("granularity", it) } }
            .apply { clickWindowDays?.let { withQueryParam("click_window_days", it) } }
            .apply { engagementWindowDays?.let { withQueryParam("engagement_window_days", it) } }
            .apply { viewWindowDays?.let { withQueryParam("view_window_days", it) } }
            .apply { conversionReportTime?.let { withQueryParam("conversion_report_time", it) } }
            .apply { attributionTypes?.let { withQueryParam("attribution_types", it) } }
            .apply { reportingTimezone?.let { withQueryParam("reporting_timezone", it) } }
            .configurer()
        )

    /**
     * Construct a stub for the operation campaignsAnalytics.
     *
     * @param adAccountId path parameter adAccountId pattern.
     * @param startDate query parameter startDate pattern.
     * @param endDate query parameter endDate pattern.
     * @param campaignIds query parameter campaignIds pattern.
     * @param columns query parameter columns pattern.
     * @param granularity query parameter granularity pattern.
     * @param clickWindowDays query parameter clickWindowDays pattern.
     * @param engagementWindowDays query parameter engagementWindowDays pattern.
     * @param viewWindowDays query parameter viewWindowDays pattern.
     * @param conversionReportTime query parameter conversionReportTime pattern.
     * @param aggregateReportRows query parameter aggregateReportRows pattern.
     * @param reportingTimezone query parameter reportingTimezone pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [CampaignsAnalyticsStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun campaignsAnalytics(adAccountId: StringValuePattern, startDate: StringValuePattern? = null, endDate: StringValuePattern? = null, campaignIds: StringValuePattern? = null, columns: StringValuePattern? = null, granularity: StringValuePattern? = null, clickWindowDays: StringValuePattern? = null, engagementWindowDays: StringValuePattern? = null, viewWindowDays: StringValuePattern? = null, conversionReportTime: StringValuePattern? = null, aggregateReportRows: StringValuePattern? = null, reportingTimezone: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): CampaignsAnalyticsStubBuilder =
        CampaignsAnalyticsStubBuilder(objectMapper, get(urlPathTemplate("/ad_accounts/{ad_account_id}/campaigns/analytics"))
            .withPathParam("ad_account_id", adAccountId)
            .apply { startDate?.let { withQueryParam("start_date", it) } }
            .apply { endDate?.let { withQueryParam("end_date", it) } }
            .apply { campaignIds?.let { withQueryParam("campaign_ids", it) } }
            .apply { columns?.let { withQueryParam("columns", it) } }
            .apply { granularity?.let { withQueryParam("granularity", it) } }
            .apply { clickWindowDays?.let { withQueryParam("click_window_days", it) } }
            .apply { engagementWindowDays?.let { withQueryParam("engagement_window_days", it) } }
            .apply { viewWindowDays?.let { withQueryParam("view_window_days", it) } }
            .apply { conversionReportTime?.let { withQueryParam("conversion_report_time", it) } }
            .apply { aggregateReportRows?.let { withQueryParam("aggregate_report_rows", it) } }
            .apply { reportingTimezone?.let { withQueryParam("reporting_timezone", it) } }
            .configurer()
        )

    /**
     * Construct a stub for the operation campaignsCreate.
     *
     * @param adAccountId path parameter adAccountId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [CampaignsCreateStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun campaignsCreate(adAccountId: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): CampaignsCreateStubBuilder =
        CampaignsCreateStubBuilder(objectMapper, post(urlPathTemplate("/ad_accounts/{ad_account_id}/campaigns"))
            .withPathParam("ad_account_id", adAccountId)
            .configurer()
        )

    /**
     * Construct a stub for the operation campaignsGet.
     *
     * @param campaignId path parameter campaignId pattern.
     * @param adAccountId path parameter adAccountId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [CampaignsGetStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun campaignsGet(campaignId: StringValuePattern, adAccountId: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): CampaignsGetStubBuilder =
        CampaignsGetStubBuilder(objectMapper, get(urlPathTemplate("/ad_accounts/{ad_account_id}/campaigns/{campaign_id}"))
            .withPathParam("campaign_id", campaignId)
            .withPathParam("ad_account_id", adAccountId)
            .configurer()
        )

    /**
     * Construct a stub for the operation campaignsList.
     *
     * @param adAccountId path parameter adAccountId pattern.
     * @param bookmark query parameter bookmark pattern.
     * @param pageSize query parameter pageSize pattern.
     * @param order query parameter order pattern.
     * @param campaignIds query parameter campaignIds pattern.
     * @param entityStatuses query parameter entityStatuses pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [CampaignsListStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun campaignsList(adAccountId: StringValuePattern, bookmark: StringValuePattern? = null, pageSize: StringValuePattern? = null, order: StringValuePattern? = null, campaignIds: StringValuePattern? = null, entityStatuses: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): CampaignsListStubBuilder =
        CampaignsListStubBuilder(objectMapper, get(urlPathTemplate("/ad_accounts/{ad_account_id}/campaigns"))
            .withPathParam("ad_account_id", adAccountId)
            .apply { bookmark?.let { withQueryParam("bookmark", it) } }
            .apply { pageSize?.let { withQueryParam("page_size", it) } }
            .apply { order?.let { withQueryParam("order", it) } }
            .apply { campaignIds?.let { withQueryParam("campaign_ids", it) } }
            .apply { entityStatuses?.let { withQueryParam("entity_statuses", it) } }
            .configurer()
        )

    /**
     * Construct a stub for the operation campaignsUpdate.
     *
     * @param adAccountId path parameter adAccountId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [CampaignsUpdateStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun campaignsUpdate(adAccountId: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): CampaignsUpdateStubBuilder =
        CampaignsUpdateStubBuilder(objectMapper, patch(urlPathTemplate("/ad_accounts/{ad_account_id}/campaigns"))
            .withPathParam("ad_account_id", adAccountId)
            .configurer()
        )

    /**
     * Construct a stub for the operation getCampaignDeliveryEstimates.
     *
     * @param adAccountId path parameter adAccountId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [GetCampaignDeliveryEstimatesStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun getCampaignDeliveryEstimates(adAccountId: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): GetCampaignDeliveryEstimatesStubBuilder =
        GetCampaignDeliveryEstimatesStubBuilder(objectMapper, post(urlPathTemplate("/ad_accounts/{ad_account_id}/campaigns/delivery_estimates"))
            .withPathParam("ad_account_id", adAccountId)
            .configurer()
        )
}
