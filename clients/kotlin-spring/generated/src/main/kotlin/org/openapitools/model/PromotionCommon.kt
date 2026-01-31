package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.PromotionTemplateValue
import org.openapitools.model.PromotionType
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
 * 
 * @param discountStatus Discount status based on the current time and start and end time of discount
 * @param endTime Promotion end time. Unix timestamp in seconds. Independent of campaign end time.
 * @param externalId Platform-specific ID for this promotion. Will be null for promotions first created within Pinterest.
 * @param platformType The source integration platform used when creating the promotion. Currently supported values are 'DEFAULT' and 'SHOPIFY'.
 * @param promotionCode Code that can be used to redeem a promotion.
 * @param promotionCustomId An optional field for user defined promotion ID for this promotion. Will copy from Pinterest system generated ID if user did not provide one.
 * @param promotionTitle Internal name for the promotion.
 * @param promotionType 
 * @param startTime Promotion start time. Unix timestamp in seconds. Independent of campaign start time.
 * @param templateValues List of values to be inserted in the promotion type-specific template.
 */
data class PromotionCommon(

    @Schema(example = "ACTIVE", description = "Discount status based on the current time and start and end time of discount")
    @get:JsonProperty("discount_status") val discountStatus: PromotionCommon.DiscountStatus? = null,

    @Schema(example = "1678003860", description = "Promotion end time. Unix timestamp in seconds. Independent of campaign end time.")
    @get:JsonProperty("end_time") val endTime: kotlin.Int? = null,

    @get:Size(max=64)
    @Schema(example = "abc", description = "Platform-specific ID for this promotion. Will be null for promotions first created within Pinterest.")
    @get:JsonProperty("external_id") val externalId: kotlin.String? = null,

    @Schema(example = "DEFAULT", description = "The source integration platform used when creating the promotion. Currently supported values are 'DEFAULT' and 'SHOPIFY'.")
    @get:JsonProperty("platform_type") val platformType: kotlin.String? = null,

    @Schema(example = "blackfriday10", description = "Code that can be used to redeem a promotion.")
    @get:JsonProperty("promotion_code") val promotionCode: kotlin.String? = null,

    @get:Size(max=50)
    @Schema(example = "freeshipping_2025", description = "An optional field for user defined promotion ID for this promotion. Will copy from Pinterest system generated ID if user did not provide one.")
    @get:JsonProperty("promotion_custom_id") val promotionCustomId: kotlin.String? = null,

    @Schema(example = "Black Friday 10% off", description = "Internal name for the promotion.")
    @get:JsonProperty("promotion_title") val promotionTitle: kotlin.String? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("promotion_type") val promotionType: PromotionType? = null,

    @Schema(example = "1677003860", description = "Promotion start time. Unix timestamp in seconds. Independent of campaign start time.")
    @get:JsonProperty("start_time") val startTime: kotlin.Int? = null,

    @field:Valid
    @get:Size(min=0,max=2) 
    @Schema(example = "null", description = "List of values to be inserted in the promotion type-specific template.")
    @get:JsonProperty("template_values") val templateValues: kotlin.collections.List<PromotionTemplateValue>? = null
) {

    /**
    * Discount status based on the current time and start and end time of discount
    * Values: OTHER,ACTIVE,PAUSED,SCHEDULED,EXPIRED
    */
    enum class DiscountStatus(@get:JsonValue val value: kotlin.String) {

        OTHER("OTHER"),
        ACTIVE("ACTIVE"),
        PAUSED("PAUSED"),
        SCHEDULED("SCHEDULED"),
        EXPIRED("EXPIRED");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): DiscountStatus {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'PromotionCommon'")
            }
        }
    }

}

