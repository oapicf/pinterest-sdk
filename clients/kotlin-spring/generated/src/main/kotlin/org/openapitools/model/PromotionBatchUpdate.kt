package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSetter
import com.fasterxml.jackson.annotation.JsonValue
import com.fasterxml.jackson.annotation.Nulls
import org.openapitools.model.DiscountStatus
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
 * @param id Promotion ID
 * @param discountStatus 
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
data class PromotionBatchUpdate(

    @get:Pattern(regexp="^\\d+$")
    @get:Size(max=18)
    @Schema(required = true, description = "Promotion ID")
    @param:JsonProperty("id")
    @get:JsonProperty("id", required = true) val id: kotlin.String,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("discount_status")
    @get:JsonProperty("discount_status") val discountStatus: DiscountStatus? = null,

    @Schema(description = "Promotion end time. Unix timestamp in seconds. Independent of campaign end time.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("end_time")
    @get:JsonProperty("end_time") val endTime: kotlin.Int? = null,

    @get:Size(max=64)
    @Schema(description = "Platform-specific ID for this promotion. Will be null for promotions first created within Pinterest.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("external_id")
    @get:JsonProperty("external_id") val externalId: kotlin.String? = null,

    @Schema(description = "The source integration platform used when creating the promotion. Currently supported values are 'DEFAULT' and 'SHOPIFY'.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("platform_type")
    @get:JsonProperty("platform_type") val platformType: kotlin.String? = null,

    @Schema(description = "Code that can be used to redeem a promotion.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("promotion_code")
    @get:JsonProperty("promotion_code") val promotionCode: kotlin.String? = null,

    @get:Size(max=50)
    @Schema(description = "An optional field for user defined promotion ID for this promotion. Will copy from Pinterest system generated ID if user did not provide one.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("promotion_custom_id")
    @get:JsonProperty("promotion_custom_id") val promotionCustomId: kotlin.String? = null,

    @Schema(description = "Internal name for the promotion.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("promotion_title")
    @get:JsonProperty("promotion_title") val promotionTitle: kotlin.String? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("promotion_type")
    @get:JsonProperty("promotion_type") val promotionType: PromotionType? = null,

    @Schema(description = "Promotion start time. Unix timestamp in seconds. Independent of campaign start time.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("start_time")
    @get:JsonProperty("start_time") val startTime: kotlin.Int? = null,

    @field:Valid
    @get:Size(min=0,max=2) 
    @Schema(description = "List of values to be inserted in the promotion type-specific template.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("template_values")
    @get:JsonProperty("template_values") val templateValues: kotlin.collections.List<PromotionTemplateValue>? = null
) {

}

