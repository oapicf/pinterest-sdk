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
open class ProductGroupPromotionsApiStubs(private val objectMapper: ObjectMapper) {

    /**
     * Construct a stub for the operation productGroupPromotionsCreate.
     *
     * @param adAccountId path parameter adAccountId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [ProductGroupPromotionsCreateStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun productGroupPromotionsCreate(adAccountId: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): ProductGroupPromotionsCreateStubBuilder =
        ProductGroupPromotionsCreateStubBuilder(objectMapper, post(urlPathTemplate("/ad_accounts/{ad_account_id}/product_group_promotions"))
            .withPathParam("ad_account_id", adAccountId)
            .configurer()
        )

    /**
     * Construct a stub for the operation productGroupPromotionsGet.
     *
     * @param adAccountId path parameter adAccountId pattern.
     * @param productGroupPromotionId path parameter productGroupPromotionId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [ProductGroupPromotionsGetStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun productGroupPromotionsGet(adAccountId: StringValuePattern, productGroupPromotionId: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): ProductGroupPromotionsGetStubBuilder =
        ProductGroupPromotionsGetStubBuilder(objectMapper, get(urlPathTemplate("/ad_accounts/{ad_account_id}/product_group_promotions/{product_group_promotion_id}"))
            .withPathParam("ad_account_id", adAccountId)
            .withPathParam("product_group_promotion_id", productGroupPromotionId)
            .configurer()
        )

    /**
     * Construct a stub for the operation productGroupPromotionsList.
     *
     * @param adAccountId path parameter adAccountId pattern.
     * @param bookmark query parameter bookmark pattern.
     * @param pageSize query parameter pageSize pattern.
     * @param order query parameter order pattern.
     * @param productGroupPromotionIds query parameter productGroupPromotionIds pattern.
     * @param entityStatuses query parameter entityStatuses pattern.
     * @param adGroupId query parameter adGroupId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [ProductGroupPromotionsListStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun productGroupPromotionsList(adAccountId: StringValuePattern, bookmark: StringValuePattern? = null, pageSize: StringValuePattern? = null, order: StringValuePattern? = null, productGroupPromotionIds: StringValuePattern? = null, entityStatuses: StringValuePattern? = null, adGroupId: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): ProductGroupPromotionsListStubBuilder =
        ProductGroupPromotionsListStubBuilder(objectMapper, get(urlPathTemplate("/ad_accounts/{ad_account_id}/product_group_promotions"))
            .withPathParam("ad_account_id", adAccountId)
            .apply { bookmark?.let { withQueryParam("bookmark", it) } }
            .apply { pageSize?.let { withQueryParam("page_size", it) } }
            .apply { order?.let { withQueryParam("order", it) } }
            .apply { productGroupPromotionIds?.let { withQueryParam("product_group_promotion_ids", it) } }
            .apply { entityStatuses?.let { withQueryParam("entity_statuses", it) } }
            .apply { adGroupId?.let { withQueryParam("ad_group_id", it) } }
            .configurer()
        )

    /**
     * Construct a stub for the operation productGroupPromotionsUpdate.
     *
     * @param adAccountId path parameter adAccountId pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [ProductGroupPromotionsUpdateStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun productGroupPromotionsUpdate(adAccountId: StringValuePattern, configurer: MappingBuilder.() -> MappingBuilder = { this }): ProductGroupPromotionsUpdateStubBuilder =
        ProductGroupPromotionsUpdateStubBuilder(objectMapper, patch(urlPathTemplate("/ad_accounts/{ad_account_id}/product_group_promotions"))
            .withPathParam("ad_account_id", adAccountId)
            .configurer()
        )

    /**
     * Construct a stub for the operation productGroupsAnalytics.
     *
     * @param adAccountId path parameter adAccountId pattern.
     * @param startDate query parameter startDate pattern.
     * @param endDate query parameter endDate pattern.
     * @param productGroupIds query parameter productGroupIds pattern.
     * @param columns query parameter columns pattern.
     * @param granularity query parameter granularity pattern.
     * @param clickWindowDays query parameter clickWindowDays pattern.
     * @param engagementWindowDays query parameter engagementWindowDays pattern.
     * @param viewWindowDays query parameter viewWindowDays pattern.
     * @param conversionReportTime query parameter conversionReportTime pattern.
     * @param reportingTimezone query parameter reportingTimezone pattern.
     * @param configurer configurer for the [MappingBuilder], allowing for arbitrary changes.
     * @return A [ProductGroupsAnalyticsStubBuilder] to configure the response, and the final [MappingBuilder].
     */
    fun productGroupsAnalytics(adAccountId: StringValuePattern, startDate: StringValuePattern? = null, endDate: StringValuePattern? = null, productGroupIds: StringValuePattern? = null, columns: StringValuePattern? = null, granularity: StringValuePattern? = null, clickWindowDays: StringValuePattern? = null, engagementWindowDays: StringValuePattern? = null, viewWindowDays: StringValuePattern? = null, conversionReportTime: StringValuePattern? = null, reportingTimezone: StringValuePattern? = null, configurer: MappingBuilder.() -> MappingBuilder = { this }): ProductGroupsAnalyticsStubBuilder =
        ProductGroupsAnalyticsStubBuilder(objectMapper, get(urlPathTemplate("/ad_accounts/{ad_account_id}/product_groups/analytics"))
            .withPathParam("ad_account_id", adAccountId)
            .apply { startDate?.let { withQueryParam("start_date", it) } }
            .apply { endDate?.let { withQueryParam("end_date", it) } }
            .apply { productGroupIds?.let { withQueryParam("product_group_ids", it) } }
            .apply { columns?.let { withQueryParam("columns", it) } }
            .apply { granularity?.let { withQueryParam("granularity", it) } }
            .apply { clickWindowDays?.let { withQueryParam("click_window_days", it) } }
            .apply { engagementWindowDays?.let { withQueryParam("engagement_window_days", it) } }
            .apply { viewWindowDays?.let { withQueryParam("view_window_days", it) } }
            .apply { conversionReportTime?.let { withQueryParam("conversion_report_time", it) } }
            .apply { reportingTimezone?.let { withQueryParam("reporting_timezone", it) } }
            .configurer()
        )
}
