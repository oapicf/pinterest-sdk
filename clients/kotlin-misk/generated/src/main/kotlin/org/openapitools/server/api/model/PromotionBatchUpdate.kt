package org.openapitools.server.api.model

import org.openapitools.server.api.model.DiscountStatus
import org.openapitools.server.api.model.PromotionTemplateValue
import org.openapitools.server.api.model.PromotionType
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class PromotionBatchUpdate(
    /** Promotion ID */
    val id: kotlin.String,
    val discountStatus: DiscountStatus? = null,
    /** Promotion end time. Unix timestamp in seconds. Independent of campaign end time. */
    val endTime: kotlin.Int? = null,
    /** Platform-specific ID for this promotion. Will be null for promotions first created within Pinterest. */
    val externalId: kotlin.String? = null,
    /** The source integration platform used when creating the promotion. Currently supported values are &#39;DEFAULT&#39; and &#39;SHOPIFY&#39;. */
    val platformType: kotlin.String? = null,
    /** Code that can be used to redeem a promotion. */
    val promotionCode: kotlin.String? = null,
    /** An optional field for user defined promotion ID for this promotion. Will copy from Pinterest system generated ID if user did not provide one. */
    val promotionCustomId: kotlin.String? = null,
    /** Internal name for the promotion. */
    val promotionTitle: kotlin.String? = null,
    val promotionType: PromotionType? = null,
    /** Promotion start time. Unix timestamp in seconds. Independent of campaign start time. */
    val startTime: kotlin.Int? = null,
    /** List of values to be inserted in the promotion type-specific template. */
    val templateValues: kotlin.collections.List<PromotionTemplateValue>? = null
)
