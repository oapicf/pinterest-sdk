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
open class AdGroupsApiStubs(private val objectMapper: ObjectMapper) {

    /**
     * Construct a stub for the operation adGroupsAnalytics.
     *
     * @param adAccountId path parameter adAccountId pattern.
     * @param startDate query parameter startDate pattern.
     * @param endDate query parameter endDate pattern.
     * @param adGroupIds query parameter adGroupIds pattern.
     * @param columns query parameter columns pattern.
     * @param granularity query parameter granularity pattern.
     * @param clickWindowDays query parameter clickWindowDays pattern.
     * @param engagementWindowDays query parameter engagementWindowDays pattern.
     * @param viewWindowDays query parameter viewWindowDays pattern.
     * @param conversionReportTime query parameter conversionReportTime pattern.
     * @param aggregateReportRows query parameter aggregateReportRows pattern.
     * @param reportingTimezone query parameter reportingTimezone pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [AdGroupsAnalyticsStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun adGroupsAnalytics(adAccountId: StringValuePattern, startDate: StringValuePattern? = null, endDate: StringValuePattern? = null, adGroupIds: StringValuePattern? = null, columns: StringValuePattern? = null, granularity: StringValuePattern? = null, clickWindowDays: StringValuePattern? = null, engagementWindowDays: StringValuePattern? = null, viewWindowDays: StringValuePattern? = null, conversionReportTime: StringValuePattern? = null, aggregateReportRows: StringValuePattern? = null, reportingTimezone: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): AdGroupsAnalyticsStubBuilder =
        AdGroupsAnalyticsStubBuilder(objectMapper, get(urlPathTemplate("/ad_accounts/{ad_account_id}/ad_groups/analytics"))
            .withPathParam("ad_account_id", adAccountId)
            .apply { startDate?.let { withQueryParam("start_date", it) } }
            .apply { endDate?.let { withQueryParam("end_date", it) } }
            .apply { adGroupIds?.let { withQueryParam("ad_group_ids", it) } }
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
     * Construct a stub for the operation adGroupsAudienceSizing.
     *
     * @param adAccountId path parameter adAccountId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [AdGroupsAudienceSizingStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun adGroupsAudienceSizing(adAccountId: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): AdGroupsAudienceSizingStubBuilder =
        AdGroupsAudienceSizingStubBuilder(objectMapper, post(urlPathTemplate("/ad_accounts/{ad_account_id}/ad_groups/audience_sizing"))
            .withPathParam("ad_account_id", adAccountId)
            .configurer()
        )

    /**
     * Construct a stub for the operation adGroupsBidFloorGet.
     *
     * @param adAccountId path parameter adAccountId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [AdGroupsBidFloorGetStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun adGroupsBidFloorGet(adAccountId: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): AdGroupsBidFloorGetStubBuilder =
        AdGroupsBidFloorGetStubBuilder(objectMapper, post(urlPathTemplate("/ad_accounts/{ad_account_id}/bid_floor"))
            .withPathParam("ad_account_id", adAccountId)
            .configurer()
        )

    /**
     * Construct a stub for the operation adGroupsCreate.
     *
     * @param adAccountId path parameter adAccountId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [AdGroupsCreateStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun adGroupsCreate(adAccountId: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): AdGroupsCreateStubBuilder =
        AdGroupsCreateStubBuilder(objectMapper, post(urlPathTemplate("/ad_accounts/{ad_account_id}/ad_groups"))
            .withPathParam("ad_account_id", adAccountId)
            .configurer()
        )

    /**
     * Construct a stub for the operation adGroupsDynamicTitlesDownloadCsv.
     *
     * @param adAccountId path parameter adAccountId pattern.
     * @param adGroupId path parameter adGroupId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [AdGroupsDynamicTitlesDownloadCsvStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun adGroupsDynamicTitlesDownloadCsv(adAccountId: StringValuePattern, adGroupId: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): AdGroupsDynamicTitlesDownloadCsvStubBuilder =
        AdGroupsDynamicTitlesDownloadCsvStubBuilder(objectMapper, get(urlPathTemplate("/ad_accounts/{ad_account_id}/ad_groups/{ad_group_id}/dynamic_titles/csv"))
            .withPathParam("ad_account_id", adAccountId)
            .withPathParam("ad_group_id", adGroupId)
            .configurer()
        )

    /**
     * Construct a stub for the operation adGroupsDynamicTitlesGetStatus.
     *
     * @param adAccountId path parameter adAccountId pattern.
     * @param adGroupId path parameter adGroupId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [AdGroupsDynamicTitlesGetStatusStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun adGroupsDynamicTitlesGetStatus(adAccountId: StringValuePattern, adGroupId: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): AdGroupsDynamicTitlesGetStatusStubBuilder =
        AdGroupsDynamicTitlesGetStatusStubBuilder(objectMapper, get(urlPathTemplate("/ad_accounts/{ad_account_id}/ad_groups/{ad_group_id}/dynamic_titles/status"))
            .withPathParam("ad_account_id", adAccountId)
            .withPathParam("ad_group_id", adGroupId)
            .configurer()
        )

    /**
     * Construct a stub for the operation adGroupsDynamicTitlesGetUploadUrl.
     *
     * @param adAccountId path parameter adAccountId pattern.
     * @param adGroupId path parameter adGroupId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [AdGroupsDynamicTitlesGetUploadUrlStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun adGroupsDynamicTitlesGetUploadUrl(adAccountId: StringValuePattern, adGroupId: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): AdGroupsDynamicTitlesGetUploadUrlStubBuilder =
        AdGroupsDynamicTitlesGetUploadUrlStubBuilder(objectMapper, get(urlPathTemplate("/ad_accounts/{ad_account_id}/ad_groups/{ad_group_id}/dynamic_titles/uploads"))
            .withPathParam("ad_account_id", adAccountId)
            .withPathParam("ad_group_id", adGroupId)
            .configurer()
        )

    /**
     * Construct a stub for the operation adGroupsDynamicTitlesProcessCsv.
     *
     * @param adAccountId path parameter adAccountId pattern.
     * @param adGroupId path parameter adGroupId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [AdGroupsDynamicTitlesProcessCsvStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun adGroupsDynamicTitlesProcessCsv(adAccountId: StringValuePattern, adGroupId: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): AdGroupsDynamicTitlesProcessCsvStubBuilder =
        AdGroupsDynamicTitlesProcessCsvStubBuilder(objectMapper, post(urlPathTemplate("/ad_accounts/{ad_account_id}/ad_groups/{ad_group_id}/dynamic_titles"))
            .withPathParam("ad_account_id", adAccountId)
            .withPathParam("ad_group_id", adGroupId)
            .configurer()
        )

    /**
     * Construct a stub for the operation adGroupsGet.
     *
     * @param adGroupId path parameter adGroupId pattern.
     * @param adAccountId path parameter adAccountId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [AdGroupsGetStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun adGroupsGet(adGroupId: StringValuePattern, adAccountId: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): AdGroupsGetStubBuilder =
        AdGroupsGetStubBuilder(objectMapper, get(urlPathTemplate("/ad_accounts/{ad_account_id}/ad_groups/{ad_group_id}"))
            .withPathParam("ad_group_id", adGroupId)
            .withPathParam("ad_account_id", adAccountId)
            .configurer()
        )

    /**
     * Construct a stub for the operation adGroupsList.
     *
     * @param adAccountId path parameter adAccountId pattern.
     * @param bookmark query parameter bookmark pattern.
     * @param pageSize query parameter pageSize pattern.
     * @param order query parameter order pattern.
     * @param campaignIds query parameter campaignIds pattern.
     * @param adGroupIds query parameter adGroupIds pattern.
     * @param entityStatuses query parameter entityStatuses pattern.
     * @param translateInterestsToNames query parameter translateInterestsToNames pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [AdGroupsListStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun adGroupsList(adAccountId: StringValuePattern, bookmark: StringValuePattern? = null, pageSize: StringValuePattern? = null, order: StringValuePattern? = null, campaignIds: StringValuePattern? = null, adGroupIds: StringValuePattern? = null, entityStatuses: StringValuePattern? = null, translateInterestsToNames: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): AdGroupsListStubBuilder =
        AdGroupsListStubBuilder(objectMapper, get(urlPathTemplate("/ad_accounts/{ad_account_id}/ad_groups"))
            .withPathParam("ad_account_id", adAccountId)
            .apply { bookmark?.let { withQueryParam("bookmark", it) } }
            .apply { pageSize?.let { withQueryParam("page_size", it) } }
            .apply { order?.let { withQueryParam("order", it) } }
            .apply { campaignIds?.let { withQueryParam("campaign_ids", it) } }
            .apply { adGroupIds?.let { withQueryParam("ad_group_ids", it) } }
            .apply { entityStatuses?.let { withQueryParam("entity_statuses", it) } }
            .apply { translateInterestsToNames?.let { withQueryParam("translate_interests_to_names", it) } }
            .configurer()
        )

    /**
     * Construct a stub for the operation adGroupsTargetingAnalyticsGet.
     *
     * @param adAccountId path parameter adAccountId pattern.
     * @param adGroupIds query parameter adGroupIds pattern.
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
     * @return A [AdGroupsTargetingAnalyticsGetStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun adGroupsTargetingAnalyticsGet(adAccountId: StringValuePattern, adGroupIds: StringValuePattern? = null, startDate: StringValuePattern? = null, endDate: StringValuePattern? = null, targetingTypes: StringValuePattern? = null, columns: StringValuePattern? = null, granularity: StringValuePattern? = null, clickWindowDays: StringValuePattern? = null, engagementWindowDays: StringValuePattern? = null, viewWindowDays: StringValuePattern? = null, conversionReportTime: StringValuePattern? = null, attributionTypes: StringValuePattern? = null, reportingTimezone: StringValuePattern? = null, sortColumns: StringValuePattern? = null, sortAscending: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): AdGroupsTargetingAnalyticsGetStubBuilder =
        AdGroupsTargetingAnalyticsGetStubBuilder(objectMapper, get(urlPathTemplate("/ad_accounts/{ad_account_id}/ad_groups/targeting_analytics"))
            .withPathParam("ad_account_id", adAccountId)
            .apply { adGroupIds?.let { withQueryParam("ad_group_ids", it) } }
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
     * Construct a stub for the operation adGroupsUpdate.
     *
     * @param adAccountId path parameter adAccountId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [AdGroupsUpdateStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun adGroupsUpdate(adAccountId: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): AdGroupsUpdateStubBuilder =
        AdGroupsUpdateStubBuilder(objectMapper, patch(urlPathTemplate("/ad_accounts/{ad_account_id}/ad_groups"))
            .withPathParam("ad_account_id", adAccountId)
            .configurer()
        )

    /**
     * Construct a stub for the operation getAdGroupsByPromotionIdsList.
     *
     * @param adAccountId path parameter adAccountId pattern.
     * @param bookmark query parameter bookmark pattern.
     * @param pageSize query parameter pageSize pattern.
     * @param order query parameter order pattern.
     * @param promotionIds query parameter promotionIds pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [GetAdGroupsByPromotionIdsListStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun getAdGroupsByPromotionIdsList(adAccountId: StringValuePattern, bookmark: StringValuePattern? = null, pageSize: StringValuePattern? = null, order: StringValuePattern? = null, promotionIds: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): GetAdGroupsByPromotionIdsListStubBuilder =
        GetAdGroupsByPromotionIdsListStubBuilder(objectMapper, get(urlPathTemplate("/ad_accounts/{ad_account_id}/promotion_applied_entities"))
            .withPathParam("ad_account_id", adAccountId)
            .apply { bookmark?.let { withQueryParam("bookmark", it) } }
            .apply { pageSize?.let { withQueryParam("page_size", it) } }
            .apply { order?.let { withQueryParam("order", it) } }
            .apply { promotionIds?.let { withQueryParam("promotion_ids", it) } }
            .configurer()
        )
}
