@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ConversionProductReportCreate(
    @field:JsonProperty("columns")
    val columns: kotlin.collections.List<ConversionProductReportingColumn>,

    @field:JsonProperty("end_date")
    val endDate: kotlin.String,

    @field:JsonProperty("granularity")
    val granularity: ConversionProductReportGranularity,

    @field:JsonProperty("level")
    val level: ConversionProductReportLevel,

    @field:JsonProperty("report_name")
    val reportName: kotlin.String,

    @field:JsonProperty("start_date")
    val startDate: kotlin.String,

    @field:JsonProperty("ad_group_ids")
    val adGroupIds: kotlin.collections.List<kotlin.String>? = null,

    @field:JsonProperty("campaign_ids")
    val campaignIds: kotlin.collections.List<kotlin.String>? = null,

    @field:JsonProperty("campaign_objective_types")
    val campaignObjectiveTypes: kotlin.collections.List<ConversionObjectiveType>? = null,

    @field:JsonProperty("click_window_days")
    val clickWindowDays: ConversionAttributionWindowDays? = null,

    @field:JsonProperty("conversion_product_attribution_type")
    val conversionProductAttributionType: ConversionProductAttributionType? = null,

    @field:JsonProperty("conversion_product_breakdown")
    val conversionProductBreakdown: ConversionProductReportBreakdownType? = null,

    @field:JsonProperty("conversion_report_time")
    val conversionReportTime: ConversionReportTimeType? = null,

    @field:JsonProperty("product_sku_ids")
    val productSkuIds: kotlin.collections.List<kotlin.String>? = null,

    @field:JsonProperty("view_window_days")
    val viewWindowDays: ConversionAttributionWindowDays? = null,

)
