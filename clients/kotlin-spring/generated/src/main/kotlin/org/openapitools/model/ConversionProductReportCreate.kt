package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSetter
import com.fasterxml.jackson.annotation.JsonValue
import com.fasterxml.jackson.annotation.Nulls
import org.openapitools.model.ConversionAttributionWindowDays
import org.openapitools.model.ConversionObjectiveType
import org.openapitools.model.ConversionProductAttributionType
import org.openapitools.model.ConversionProductReportBreakdownType
import org.openapitools.model.ConversionProductReportGranularity
import org.openapitools.model.ConversionProductReportLevel
import org.openapitools.model.ConversionProductReportingColumn
import org.openapitools.model.ConversionReportTimeType
import javax.validation.constraints.DecimalMax
import javax.validation.constraints.DecimalMin
import javax.validation.constraints.Email
import javax.validation.constraints.Max
import javax.validation.constraints.Min
import javax.validation.constraints.NotNull
import javax.validation.constraints.Pattern
import javax.validation.constraints.Size
import javax.validation.Valid
import io.swagger.v3.oas.annotations.media.Schema

/**
 * Resource create operation model.
 * @param columns Metric and entity columns
 * @param endDate   Metric report end date (UTC). Format: YYYY-MM-DD.   A max of 1 year is allowed between the start and end date for reports.
 * @param granularity Report granularity for time-based metric aggregation
 * @param level Level of the report
 * @param reportName Name of the conversion product report
 * @param startDate   Metric report start date (UTC). Format: YYYY-MM-DD.   Start date must be after 2024-03-16. 7 day minimum time window for report is required.
 * @param adGroupIds   List of ad group ids.   Only support ad_group_ids field when level of the report is AD_GROUP.
 * @param campaignIds   List of campaign ids.   Only support campaign_ids field when level of the report is CAMPAIGN.
 * @param campaignObjectiveTypes List of values for filtering. Default is ['CONSIDERATION','AWARENESS','WEB_CONVERSION','VIDEO_COMPLETION'].
 * @param clickWindowDays Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.
 * @param conversionProductAttributionType   Required attribution type of the B/C/S report.   When the attribution type is BRAND_ATTRIBUTION, start_date for the report must be after 2025-04-01.
 * @param conversionProductBreakdown Report breakdown type. This is used to specify the breakdown of the report by brand, category, or SKU.
 * @param conversionReportTime The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.
 * @param productSkuIds   List of SKU ids.   Only support product_sku_ids field when report breakdown type is PRODUCT_SKU_GROUP.
 * @param viewWindowDays Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day.
 */
data class ConversionProductReportCreate(

    @field:Valid
    @Schema(required = true, description = "Metric and entity columns")
    @param:JsonProperty("columns")
    @get:JsonProperty("columns", required = true) val columns: kotlin.collections.List<ConversionProductReportingColumn>,

    @get:Pattern(regexp="^\\d{4}-\\d{2}-\\d{2}$")
    @Schema(example = "2024-04-23", required = true, description = "  Metric report end date (UTC). Format: YYYY-MM-DD.   A max of 1 year is allowed between the start and end date for reports.")
    @param:JsonProperty("end_date")
    @get:JsonProperty("end_date", required = true) val endDate: kotlin.String,

    @field:Valid
    @Schema(required = true, description = "Report granularity for time-based metric aggregation")
    @param:JsonProperty("granularity")
    @get:JsonProperty("granularity", required = true) val granularity: ConversionProductReportGranularity,

    @field:Valid
    @Schema(required = true, description = "Level of the report")
    @param:JsonProperty("level")
    @get:JsonProperty("level", required = true) val level: ConversionProductReportLevel,

    @Schema(required = true, description = "Name of the conversion product report")
    @param:JsonProperty("report_name")
    @get:JsonProperty("report_name", required = true) val reportName: kotlin.String,

    @get:Pattern(regexp="^\\d{4}-\\d{2}-\\d{2}$")
    @Schema(example = "2024-04-17", required = true, description = "  Metric report start date (UTC). Format: YYYY-MM-DD.   Start date must be after 2024-03-16. 7 day minimum time window for report is required.")
    @param:JsonProperty("start_date")
    @get:JsonProperty("start_date", required = true) val startDate: kotlin.String,

    @get:Size(min=1,max=500) 
    @Schema(example = "[\"12345678\"]", description = "  List of ad group ids.   Only support ad_group_ids field when level of the report is AD_GROUP.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("ad_group_ids")
    @get:JsonProperty("ad_group_ids") val adGroupIds: kotlin.collections.List<kotlin.String>? = null,

    @get:Size(min=1,max=500) 
    @Schema(example = "[\"12345678\"]", description = "  List of campaign ids.   Only support campaign_ids field when level of the report is CAMPAIGN.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("campaign_ids")
    @get:JsonProperty("campaign_ids") val campaignIds: kotlin.collections.List<kotlin.String>? = null,

    @field:Valid
    @get:Size(min=1,max=7) 
    @Schema(description = "List of values for filtering. Default is ['CONSIDERATION','AWARENESS','WEB_CONVERSION','VIDEO_COMPLETION'].")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("campaign_objective_types")
    @get:JsonProperty("campaign_objective_types") val campaignObjectiveTypes: kotlin.collections.List<ConversionObjectiveType>? = null,

    @field:Valid
    @Schema(description = "Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("click_window_days")
    @get:JsonProperty("click_window_days") val clickWindowDays: ConversionAttributionWindowDays? = null,

    @field:Valid
    @Schema(description = "  Required attribution type of the B/C/S report.   When the attribution type is BRAND_ATTRIBUTION, start_date for the report must be after 2025-04-01.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("conversion_product_attribution_type")
    @get:JsonProperty("conversion_product_attribution_type") val conversionProductAttributionType: ConversionProductAttributionType? = null,

    @field:Valid
    @Schema(description = "Report breakdown type. This is used to specify the breakdown of the report by brand, category, or SKU.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("conversion_product_breakdown")
    @get:JsonProperty("conversion_product_breakdown") val conversionProductBreakdown: ConversionProductReportBreakdownType? = null,

    @field:Valid
    @Schema(description = "The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("conversion_report_time")
    @get:JsonProperty("conversion_report_time") val conversionReportTime: ConversionReportTimeType? = null,

    @get:Size(min=2,max=30000) 
    @Schema(example = "[\"WBC45678\",\"WBC45679\"]", description = "  List of SKU ids.   Only support product_sku_ids field when report breakdown type is PRODUCT_SKU_GROUP.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("product_sku_ids")
    @get:JsonProperty("product_sku_ids") val productSkuIds: kotlin.collections.List<kotlin.String>? = null,

    @field:Valid
    @Schema(description = "Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `1` day.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("view_window_days")
    @get:JsonProperty("view_window_days") val viewWindowDays: ConversionAttributionWindowDays? = null
) {

}

