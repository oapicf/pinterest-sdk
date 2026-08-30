@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class PromotionBatchUpdate(
    @field:JsonProperty("id")
    val id: kotlin.String,

    @field:JsonProperty("discount_status")
    val discountStatus: DiscountStatus? = null,

    @field:JsonProperty("end_time")
    val endTime: kotlin.Int? = null,

    @field:JsonProperty("external_id")
    val externalId: kotlin.String? = null,

    @field:JsonProperty("platform_type")
    val platformType: kotlin.String? = null,

    @field:JsonProperty("promotion_code")
    val promotionCode: kotlin.String? = null,

    @field:JsonProperty("promotion_custom_id")
    val promotionCustomId: kotlin.String? = null,

    @field:JsonProperty("promotion_title")
    val promotionTitle: kotlin.String? = null,

    @field:JsonProperty("promotion_type")
    val promotionType: PromotionType? = null,

    @field:JsonProperty("start_time")
    val startTime: kotlin.Int? = null,

    @field:JsonProperty("template_values")
    val templateValues: kotlin.collections.List<PromotionTemplateValue>? = null,

)
