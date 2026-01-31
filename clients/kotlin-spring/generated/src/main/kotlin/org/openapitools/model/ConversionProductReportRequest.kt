package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.ConversionAttributionWindowDays
import org.openapitools.model.ConversionProductReportingColumn
import org.openapitools.model.ConversionReportTimeType
import org.openapitools.model.ObjectiveType
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
 * Request for a brand, category, SKU report
 * @param columns Metric and entity columns
 * @param endDate Metric report end date (UTC). Format: YYYY-MM-DD.<br> A max of 1 year is allowed between the start and end date for reports.
 * @param granularity TOTAL - metrics are aggregated over the specified date range.<br> WEEK - metrics are broken down weekly.<br> MONTH - metrics are broken down monthly.
 * @param level Level of the report
 * @param reportName Name of the conversion product report.
 * @param startDate Metric report start date (UTC). Format: YYYY-MM-DD.<br> Start date must be after 2024-03-16. 7 day minimum time window for report is required.
 * @param adGroupIds List of ad group ids. <br>Only support ad_group_ids field when level of the report is AD_GROUP.
 * @param campaignIds List of campaign ids. <br>Only support campaign_ids field when level of the report is CAMPAIGN.
 * @param campaignObjectiveTypes List of values for filtering. Default is ['CONSIDERATION','AWARENESS','WEB_CONVERSION','VIDEO_COMPLETION'].
 * @param clickWindowDays Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.
 * @param conversionProductAttributionType 
 * @param conversionProductBreakdown 
 * @param conversionReportTime The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.
 * @param productSkuIds List of SKU ids. <br>Only support product_sku_ids field when report breakdown type is PRODUCT_SKU_GROUP.
 * @param viewWindowDays Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` day.
 */
data class ConversionProductReportRequest(

    @field:Valid
    @Schema(example = "null", required = true, description = "Metric and entity columns")
    @get:JsonProperty("columns", required = true) val columns: kotlin.collections.List<ConversionProductReportingColumn>,

    @get:Pattern(regexp="^(\\d{4})-(\\d{2})-(\\d{2})$")
    @Schema(example = "2024-04-23", required = true, description = "Metric report end date (UTC). Format: YYYY-MM-DD.<br> A max of 1 year is allowed between the start and end date for reports.")
    @get:JsonProperty("end_date", required = true) val endDate: kotlin.String,

    @Schema(example = "null", required = true, description = "TOTAL - metrics are aggregated over the specified date range.<br> WEEK - metrics are broken down weekly.<br> MONTH - metrics are broken down monthly.")
    @get:JsonProperty("granularity", required = true) val granularity: ConversionProductReportRequest.Granularity,

    @Schema(example = "null", required = true, description = "Level of the report")
    @get:JsonProperty("level", required = true) val level: ConversionProductReportRequest.Level,

    @Schema(example = "null", required = true, description = "Name of the conversion product report.")
    @get:JsonProperty("report_name", required = true) val reportName: kotlin.String,

    @get:Pattern(regexp="^(\\d{4})-(\\d{2})-(\\d{2})$")
    @Schema(example = "2024-03-17", required = true, description = "Metric report start date (UTC). Format: YYYY-MM-DD.<br> Start date must be after 2024-03-16. 7 day minimum time window for report is required.")
    @get:JsonProperty("start_date", required = true) val startDate: kotlin.String,

    @get:Size(min=1,max=500) 
    @Schema(example = "[\"12345678\"]", description = "List of ad group ids. <br>Only support ad_group_ids field when level of the report is AD_GROUP.")
    @get:JsonProperty("ad_group_ids") val adGroupIds: kotlin.collections.List<kotlin.String>? = null,

    @get:Size(min=1,max=500) 
    @Schema(example = "[\"12345678\"]", description = "List of campaign ids. <br>Only support campaign_ids field when level of the report is CAMPAIGN.")
    @get:JsonProperty("campaign_ids") val campaignIds: kotlin.collections.List<kotlin.String>? = null,

    @field:Valid
    @get:Size(min=1,max=7) 
    @Schema(example = "null", description = "List of values for filtering. Default is ['CONSIDERATION','AWARENESS','WEB_CONVERSION','VIDEO_COMPLETION'].")
    @get:JsonProperty("campaign_objective_types") val campaignObjectiveTypes: kotlin.collections.List<ObjectiveType>? = null,

    @field:Valid
    @Schema(example = "null", description = "Number of days to use as the conversion attribution window for a pin click action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` days.")
    @get:JsonProperty("click_window_days") val clickWindowDays: ConversionAttributionWindowDays? = ConversionAttributionWindowDays._30,

    @Schema(example = "null", description = "")
    @get:JsonProperty("conversion_product_attribution_type") val conversionProductAttributionType: ConversionProductReportRequest.ConversionProductAttributionType? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("conversion_product_breakdown") val conversionProductBreakdown: ConversionProductReportRequest.ConversionProductBreakdown? = null,

    @field:Valid
    @Schema(example = "null", description = "The date by which the conversion metrics returned from this endpoint will be reported. There are two dates associated with a conversion event: the date that the user interacted with the ad, and the date that the user completed a conversion event.")
    @get:JsonProperty("conversion_report_time") val conversionReportTime: ConversionReportTimeType? = "TIME_OF_AD_ACTION",

    @get:Size(min=2,max=500) 
    @Schema(example = "[\"WBC45678\",\"WBC45679\"]", description = "List of SKU ids. <br>Only support product_sku_ids field when report breakdown type is PRODUCT_SKU_GROUP.")
    @get:JsonProperty("product_sku_ids") val productSkuIds: kotlin.collections.List<kotlin.String>? = null,

    @field:Valid
    @Schema(example = "null", description = "Number of days to use as the conversion attribution window for a view action. Applies to Pinterest Tag conversion metrics. Prior conversion tags use their defined attribution windows. If not specified, defaults to `30` day.")
    @get:JsonProperty("view_window_days") val viewWindowDays: ConversionAttributionWindowDays? = ConversionAttributionWindowDays._30
) {

    /**
    * TOTAL - metrics are aggregated over the specified date range.<br> WEEK - metrics are broken down weekly.<br> MONTH - metrics are broken down monthly.
    * Values: WEEK,MONTH,TOTAL
    */
    enum class Granularity(@get:JsonValue val value: kotlin.String) {

        WEEK("WEEK"),
        MONTH("MONTH"),
        TOTAL("TOTAL");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): Granularity {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'ConversionProductReportRequest'")
            }
        }
    }

    /**
    * Level of the report
    * Values: ADVERTISER,CAMPAIGN,AD_GROUP
    */
    enum class Level(@get:JsonValue val value: kotlin.String) {

        ADVERTISER("ADVERTISER"),
        CAMPAIGN("CAMPAIGN"),
        AD_GROUP("AD_GROUP");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): Level {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'ConversionProductReportRequest'")
            }
        }
    }

    /**
    * 
    * Values: DEFAULT,BRAND_ATTRIBUTION
    */
    enum class ConversionProductAttributionType(@get:JsonValue val value: kotlin.String) {

        DEFAULT("DEFAULT"),
        BRAND_ATTRIBUTION("BRAND_ATTRIBUTION");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): ConversionProductAttributionType {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'ConversionProductReportRequest'")
            }
        }
    }

    /**
    * 
    * Values: PRODUCT_BRAND,PRODUCT_CATEGORY,PRODUCT_BRAND_AND_CATEGORY,PRODUCT_SKU,PRODUCT_SKU_GROUP
    */
    enum class ConversionProductBreakdown(@get:JsonValue val value: kotlin.String) {

        PRODUCT_BRAND("PRODUCT_BRAND"),
        PRODUCT_CATEGORY("PRODUCT_CATEGORY"),
        PRODUCT_BRAND_AND_CATEGORY("PRODUCT_BRAND_AND_CATEGORY"),
        PRODUCT_SKU("PRODUCT_SKU"),
        PRODUCT_SKU_GROUP("PRODUCT_SKU_GROUP");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): ConversionProductBreakdown {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'ConversionProductReportRequest'")
            }
        }
    }

}

