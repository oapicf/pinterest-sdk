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
open class AdAccountsApiStubs(private val objectMapper: ObjectMapper) {

    /**
     * Construct a stub for the operation adAccountAnalytics.
     *
     * @param adAccountId path parameter adAccountId pattern.
     * @param startDate query parameter startDate pattern.
     * @param endDate query parameter endDate pattern.
     * @param columns query parameter columns pattern.
     * @param granularity query parameter granularity pattern.
     * @param clickWindowDays query parameter clickWindowDays pattern.
     * @param engagementWindowDays query parameter engagementWindowDays pattern.
     * @param viewWindowDays query parameter viewWindowDays pattern.
     * @param conversionReportTime query parameter conversionReportTime pattern.
     * @param reportingTimezone query parameter reportingTimezone pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [AdAccountAnalyticsStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun adAccountAnalytics(adAccountId: StringValuePattern, startDate: StringValuePattern? = null, endDate: StringValuePattern? = null, columns: StringValuePattern? = null, granularity: StringValuePattern? = null, clickWindowDays: StringValuePattern? = null, engagementWindowDays: StringValuePattern? = null, viewWindowDays: StringValuePattern? = null, conversionReportTime: StringValuePattern? = null, reportingTimezone: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): AdAccountAnalyticsStubBuilder =
        AdAccountAnalyticsStubBuilder(objectMapper, get(urlPathTemplate("/ad_accounts/{ad_account_id}/analytics"))
            .withPathParam("ad_account_id", adAccountId)
            .apply { startDate?.let { withQueryParam("start_date", it) } }
            .apply { endDate?.let { withQueryParam("end_date", it) } }
            .apply { columns?.let { withQueryParam("columns", it) } }
            .apply { granularity?.let { withQueryParam("granularity", it) } }
            .apply { clickWindowDays?.let { withQueryParam("click_window_days", it) } }
            .apply { engagementWindowDays?.let { withQueryParam("engagement_window_days", it) } }
            .apply { viewWindowDays?.let { withQueryParam("view_window_days", it) } }
            .apply { conversionReportTime?.let { withQueryParam("conversion_report_time", it) } }
            .apply { reportingTimezone?.let { withQueryParam("reporting_timezone", it) } }
            .configurer()
        )

    /**
     * Construct a stub for the operation adAccountTargetingAnalyticsGet.
     *
     * @param adAccountId path parameter adAccountId pattern.
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
     * @return A [AdAccountTargetingAnalyticsGetStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun adAccountTargetingAnalyticsGet(adAccountId: StringValuePattern, startDate: StringValuePattern? = null, endDate: StringValuePattern? = null, targetingTypes: StringValuePattern? = null, columns: StringValuePattern? = null, granularity: StringValuePattern? = null, clickWindowDays: StringValuePattern? = null, engagementWindowDays: StringValuePattern? = null, viewWindowDays: StringValuePattern? = null, conversionReportTime: StringValuePattern? = null, attributionTypes: StringValuePattern? = null, reportingTimezone: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): AdAccountTargetingAnalyticsGetStubBuilder =
        AdAccountTargetingAnalyticsGetStubBuilder(objectMapper, get(urlPathTemplate("/ad_accounts/{ad_account_id}/targeting_analytics"))
            .withPathParam("ad_account_id", adAccountId)
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
     * Construct a stub for the operation adAccountsCreate.
     *
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [AdAccountsCreateStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun adAccountsCreate(configurer: MappingBuilder.() -> MappingBuilder = { this }): AdAccountsCreateStubBuilder =
        AdAccountsCreateStubBuilder(objectMapper, post(urlPathTemplate("/ad_accounts"))
            .configurer()
        )

    /**
     * Construct a stub for the operation adAccountsGet.
     *
     * @param adAccountId path parameter adAccountId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [AdAccountsGetStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun adAccountsGet(adAccountId: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): AdAccountsGetStubBuilder =
        AdAccountsGetStubBuilder(objectMapper, get(urlPathTemplate("/ad_accounts/{ad_account_id}"))
            .withPathParam("ad_account_id", adAccountId)
            .configurer()
        )

    /**
     * Construct a stub for the operation adAccountsList.
     *
     * @param includeSharedAccounts query parameter includeSharedAccounts pattern.
     * @param bookmark query parameter bookmark pattern.
     * @param pageSize query parameter pageSize pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [AdAccountsListStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun adAccountsList(includeSharedAccounts: StringValuePattern? = null, bookmark: StringValuePattern? = null, pageSize: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): AdAccountsListStubBuilder =
        AdAccountsListStubBuilder(objectMapper, get(urlPathTemplate("/ad_accounts"))
            .apply { includeSharedAccounts?.let { withQueryParam("include_shared_accounts", it) } }
            .apply { bookmark?.let { withQueryParam("bookmark", it) } }
            .apply { pageSize?.let { withQueryParam("page_size", it) } }
            .configurer()
        )

    /**
     * Construct a stub for the operation analyticsCreateConversionProductReport.
     *
     * @param adAccountId path parameter adAccountId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [AnalyticsCreateConversionProductReportStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun analyticsCreateConversionProductReport(adAccountId: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): AnalyticsCreateConversionProductReportStubBuilder =
        AnalyticsCreateConversionProductReportStubBuilder(objectMapper, post(urlPathTemplate("/ad_accounts/{ad_account_id}/reports/brand_category_sku"))
            .withPathParam("ad_account_id", adAccountId)
            .configurer()
        )

    /**
     * Construct a stub for the operation analyticsCreateMmmReport.
     *
     * @param adAccountId path parameter adAccountId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [AnalyticsCreateMmmReportStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun analyticsCreateMmmReport(adAccountId: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): AnalyticsCreateMmmReportStubBuilder =
        AnalyticsCreateMmmReportStubBuilder(objectMapper, post(urlPathTemplate("/ad_accounts/{ad_account_id}/mmm_reports"))
            .withPathParam("ad_account_id", adAccountId)
            .configurer()
        )

    /**
     * Construct a stub for the operation analyticsCreateReport.
     *
     * @param adAccountId path parameter adAccountId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [AnalyticsCreateReportStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun analyticsCreateReport(adAccountId: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): AnalyticsCreateReportStubBuilder =
        AnalyticsCreateReportStubBuilder(objectMapper, post(urlPathTemplate("/ad_accounts/{ad_account_id}/reports"))
            .withPathParam("ad_account_id", adAccountId)
            .configurer()
        )

    /**
     * Construct a stub for the operation analyticsCreateTemplateReport.
     *
     * @param adAccountId path parameter adAccountId pattern.
     * @param templateId path parameter templateId pattern.
     * @param startDate query parameter startDate pattern.
     * @param endDate query parameter endDate pattern.
     * @param granularity query parameter granularity pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [AnalyticsCreateTemplateReportStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun analyticsCreateTemplateReport(adAccountId: StringValuePattern, templateId: StringValuePattern, startDate: StringValuePattern? = null, endDate: StringValuePattern? = null, granularity: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): AnalyticsCreateTemplateReportStubBuilder =
        AnalyticsCreateTemplateReportStubBuilder(objectMapper, post(urlPathTemplate("/ad_accounts/{ad_account_id}/templates/{template_id}/reports"))
            .withPathParam("ad_account_id", adAccountId)
            .withPathParam("template_id", templateId)
            .apply { startDate?.let { withQueryParam("start_date", it) } }
            .apply { endDate?.let { withQueryParam("end_date", it) } }
            .apply { granularity?.let { withQueryParam("granularity", it) } }
            .configurer()
        )

    /**
     * Construct a stub for the operation analyticsGetConversionProductReport.
     *
     * @param adAccountId path parameter adAccountId pattern.
     * @param token query parameter token pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [AnalyticsGetConversionProductReportStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun analyticsGetConversionProductReport(adAccountId: StringValuePattern, token: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): AnalyticsGetConversionProductReportStubBuilder =
        AnalyticsGetConversionProductReportStubBuilder(objectMapper, get(urlPathTemplate("/ad_accounts/{ad_account_id}/reports/brand_category_sku"))
            .withPathParam("ad_account_id", adAccountId)
            .apply { token?.let { withQueryParam("token", it) } }
            .configurer()
        )

    /**
     * Construct a stub for the operation analyticsGetMmmReport.
     *
     * @param adAccountId path parameter adAccountId pattern.
     * @param token query parameter token pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [AnalyticsGetMmmReportStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun analyticsGetMmmReport(adAccountId: StringValuePattern, token: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): AnalyticsGetMmmReportStubBuilder =
        AnalyticsGetMmmReportStubBuilder(objectMapper, get(urlPathTemplate("/ad_accounts/{ad_account_id}/mmm_reports"))
            .withPathParam("ad_account_id", adAccountId)
            .apply { token?.let { withQueryParam("token", it) } }
            .configurer()
        )

    /**
     * Construct a stub for the operation analyticsGetReport.
     *
     * @param adAccountId path parameter adAccountId pattern.
     * @param token query parameter token pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [AnalyticsGetReportStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun analyticsGetReport(adAccountId: StringValuePattern, token: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): AnalyticsGetReportStubBuilder =
        AnalyticsGetReportStubBuilder(objectMapper, get(urlPathTemplate("/ad_accounts/{ad_account_id}/reports"))
            .withPathParam("ad_account_id", adAccountId)
            .apply { token?.let { withQueryParam("token", it) } }
            .configurer()
        )

    /**
     * Construct a stub for the operation sandboxDelete.
     *
     * @param adAccountId path parameter adAccountId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [SandboxDeleteStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun sandboxDelete(adAccountId: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): SandboxDeleteStubBuilder =
        SandboxDeleteStubBuilder(objectMapper, delete(urlPathTemplate("/ad_accounts/{ad_account_id}/sandbox"))
            .withPathParam("ad_account_id", adAccountId)
            .configurer()
        )

    /**
     * Construct a stub for the operation templatesList.
     *
     * @param adAccountId path parameter adAccountId pattern.
     * @param bookmark query parameter bookmark pattern.
     * @param pageSize query parameter pageSize pattern.
     * @param order query parameter order pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [TemplatesListStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun templatesList(adAccountId: StringValuePattern, bookmark: StringValuePattern? = null, pageSize: StringValuePattern? = null, order: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): TemplatesListStubBuilder =
        TemplatesListStubBuilder(objectMapper, get(urlPathTemplate("/ad_accounts/{ad_account_id}/templates"))
            .withPathParam("ad_account_id", adAccountId)
            .apply { bookmark?.let { withQueryParam("bookmark", it) } }
            .apply { pageSize?.let { withQueryParam("page_size", it) } }
            .apply { order?.let { withQueryParam("order", it) } }
            .configurer()
        )
}
