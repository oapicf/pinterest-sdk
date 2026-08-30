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
open class AdsApiStubs(private val objectMapper: ObjectMapper) {

    /**
     * Construct a stub for the operation adPreviewsCreate.
     *
     * @param adAccountId path parameter adAccountId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [AdPreviewsCreateStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun adPreviewsCreate(adAccountId: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): AdPreviewsCreateStubBuilder =
        AdPreviewsCreateStubBuilder(objectMapper, post(urlPathTemplate("/ad_accounts/{ad_account_id}/ad_previews"))
            .withPathParam("ad_account_id", adAccountId)
            .configurer()
        )

    /**
     * Construct a stub for the operation adTargetingAnalyticsGet.
     *
     * @param adAccountId path parameter adAccountId pattern.
     * @param adIds query parameter adIds pattern.
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
     * @param sortColumns query parameter sortColumns pattern.
     * @param sortAscending query parameter sortAscending pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [AdTargetingAnalyticsGetStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun adTargetingAnalyticsGet(adAccountId: StringValuePattern, adIds: StringValuePattern? = null, startDate: StringValuePattern? = null, endDate: StringValuePattern? = null, targetingTypes: StringValuePattern? = null, columns: StringValuePattern? = null, granularity: StringValuePattern? = null, clickWindowDays: StringValuePattern? = null, engagementWindowDays: StringValuePattern? = null, viewWindowDays: StringValuePattern? = null, conversionReportTime: StringValuePattern? = null, attributionTypes: StringValuePattern? = null, reportingTimezone: StringValuePattern? = null, sortColumns: StringValuePattern? = null, sortAscending: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): AdTargetingAnalyticsGetStubBuilder =
        AdTargetingAnalyticsGetStubBuilder(objectMapper, get(urlPathTemplate("/ad_accounts/{ad_account_id}/ads/targeting_analytics"))
            .withPathParam("ad_account_id", adAccountId)
            .apply { adIds?.let { withQueryParam("ad_ids", it) } }
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
            .apply { sortColumns?.let { withQueryParam("sort_columns", it) } }
            .apply { sortAscending?.let { withQueryParam("sort_ascending", it) } }
            .configurer()
        )

    /**
     * Construct a stub for the operation adsAnalytics.
     *
     * @param adAccountId path parameter adAccountId pattern.
     * @param pinIds query parameter pinIds pattern.
     * @param startDate query parameter startDate pattern.
     * @param endDate query parameter endDate pattern.
     * @param adIds query parameter adIds pattern.
     * @param columns query parameter columns pattern.
     * @param granularity query parameter granularity pattern.
     * @param clickWindowDays query parameter clickWindowDays pattern.
     * @param engagementWindowDays query parameter engagementWindowDays pattern.
     * @param viewWindowDays query parameter viewWindowDays pattern.
     * @param conversionReportTime query parameter conversionReportTime pattern.
     * @param campaignIds query parameter campaignIds pattern.
     * @param reportingTimezone query parameter reportingTimezone pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [AdsAnalyticsStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun adsAnalytics(adAccountId: StringValuePattern, pinIds: StringValuePattern? = null, startDate: StringValuePattern? = null, endDate: StringValuePattern? = null, adIds: StringValuePattern? = null, columns: StringValuePattern? = null, granularity: StringValuePattern? = null, clickWindowDays: StringValuePattern? = null, engagementWindowDays: StringValuePattern? = null, viewWindowDays: StringValuePattern? = null, conversionReportTime: StringValuePattern? = null, campaignIds: StringValuePattern? = null, reportingTimezone: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): AdsAnalyticsStubBuilder =
        AdsAnalyticsStubBuilder(objectMapper, get(urlPathTemplate("/ad_accounts/{ad_account_id}/ads/analytics"))
            .withPathParam("ad_account_id", adAccountId)
            .apply { pinIds?.let { withQueryParam("pin_ids", it) } }
            .apply { startDate?.let { withQueryParam("start_date", it) } }
            .apply { endDate?.let { withQueryParam("end_date", it) } }
            .apply { adIds?.let { withQueryParam("ad_ids", it) } }
            .apply { columns?.let { withQueryParam("columns", it) } }
            .apply { granularity?.let { withQueryParam("granularity", it) } }
            .apply { clickWindowDays?.let { withQueryParam("click_window_days", it) } }
            .apply { engagementWindowDays?.let { withQueryParam("engagement_window_days", it) } }
            .apply { viewWindowDays?.let { withQueryParam("view_window_days", it) } }
            .apply { conversionReportTime?.let { withQueryParam("conversion_report_time", it) } }
            .apply { campaignIds?.let { withQueryParam("campaign_ids", it) } }
            .apply { reportingTimezone?.let { withQueryParam("reporting_timezone", it) } }
            .configurer()
        )

    /**
     * Construct a stub for the operation adsCreate.
     *
     * @param adAccountId path parameter adAccountId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [AdsCreateStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun adsCreate(adAccountId: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): AdsCreateStubBuilder =
        AdsCreateStubBuilder(objectMapper, post(urlPathTemplate("/ad_accounts/{ad_account_id}/ads"))
            .withPathParam("ad_account_id", adAccountId)
            .configurer()
        )

    /**
     * Construct a stub for the operation adsGet.
     *
     * @param adId path parameter adId pattern.
     * @param adAccountId path parameter adAccountId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [AdsGetStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun adsGet(adId: StringValuePattern, adAccountId: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): AdsGetStubBuilder =
        AdsGetStubBuilder(objectMapper, get(urlPathTemplate("/ad_accounts/{ad_account_id}/ads/{ad_id}"))
            .withPathParam("ad_id", adId)
            .withPathParam("ad_account_id", adAccountId)
            .configurer()
        )

    /**
     * Construct a stub for the operation adsList.
     *
     * @param adAccountId path parameter adAccountId pattern.
     * @param bookmark query parameter bookmark pattern.
     * @param pageSize query parameter pageSize pattern.
     * @param order query parameter order pattern.
     * @param campaignIds query parameter campaignIds pattern.
     * @param adGroupIds query parameter adGroupIds pattern.
     * @param adIds query parameter adIds pattern.
     * @param entityStatuses query parameter entityStatuses pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [AdsListStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun adsList(adAccountId: StringValuePattern, bookmark: StringValuePattern? = null, pageSize: StringValuePattern? = null, order: StringValuePattern? = null, campaignIds: StringValuePattern? = null, adGroupIds: StringValuePattern? = null, adIds: StringValuePattern? = null, entityStatuses: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): AdsListStubBuilder =
        AdsListStubBuilder(objectMapper, get(urlPathTemplate("/ad_accounts/{ad_account_id}/ads"))
            .withPathParam("ad_account_id", adAccountId)
            .apply { bookmark?.let { withQueryParam("bookmark", it) } }
            .apply { pageSize?.let { withQueryParam("page_size", it) } }
            .apply { order?.let { withQueryParam("order", it) } }
            .apply { campaignIds?.let { withQueryParam("campaign_ids", it) } }
            .apply { adGroupIds?.let { withQueryParam("ad_group_ids", it) } }
            .apply { adIds?.let { withQueryParam("ad_ids", it) } }
            .apply { entityStatuses?.let { withQueryParam("entity_statuses", it) } }
            .configurer()
        )

    /**
     * Construct a stub for the operation adsUpdate.
     *
     * @param adAccountId path parameter adAccountId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [AdsUpdateStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun adsUpdate(adAccountId: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): AdsUpdateStubBuilder =
        AdsUpdateStubBuilder(objectMapper, patch(urlPathTemplate("/ad_accounts/{ad_account_id}/ads"))
            .withPathParam("ad_account_id", adAccountId)
            .configurer()
        )

    /**
     * Construct a stub for the operation campaignAdPreviewCreate.
     *
     * @param adAccountId path parameter adAccountId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [CampaignAdPreviewCreateStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun campaignAdPreviewCreate(adAccountId: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): CampaignAdPreviewCreateStubBuilder =
        CampaignAdPreviewCreateStubBuilder(objectMapper, post(urlPathTemplate("/ad_accounts/{ad_account_id}/campaign_ad_preview"))
            .withPathParam("ad_account_id", adAccountId)
            .configurer()
        )

    /**
     * Construct a stub for the operation campaignAdPreviewDelete.
     *
     * @param adAccountId path parameter adAccountId pattern.
     * @param adGroupIds query parameter adGroupIds pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [CampaignAdPreviewDeleteStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun campaignAdPreviewDelete(adAccountId: StringValuePattern, adGroupIds: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): CampaignAdPreviewDeleteStubBuilder =
        CampaignAdPreviewDeleteStubBuilder(objectMapper, delete(urlPathTemplate("/ad_accounts/{ad_account_id}/campaign_ad_preview"))
            .withPathParam("ad_account_id", adAccountId)
            .apply { adGroupIds?.let { withQueryParam("ad_group_ids", it) } }
            .configurer()
        )

    /**
     * Construct a stub for the operation campaignAdPreviewRead.
     *
     * @param adAccountId path parameter adAccountId pattern.
     * @param adGroupIds query parameter adGroupIds pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [CampaignAdPreviewReadStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun campaignAdPreviewRead(adAccountId: StringValuePattern, adGroupIds: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): CampaignAdPreviewReadStubBuilder =
        CampaignAdPreviewReadStubBuilder(objectMapper, get(urlPathTemplate("/ad_accounts/{ad_account_id}/campaign_ad_preview"))
            .withPathParam("ad_account_id", adAccountId)
            .apply { adGroupIds?.let { withQueryParam("ad_group_ids", it) } }
            .configurer()
        )
}
