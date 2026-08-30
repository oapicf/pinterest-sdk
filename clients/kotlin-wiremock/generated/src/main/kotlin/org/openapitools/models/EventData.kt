@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class EventData(
    @field:JsonProperty("currency")
    val currency: Currency? = null,

    @field:JsonProperty("lead_type")
    val leadType: kotlin.String? = null,

    @field:JsonProperty("line_items")
    val lineItems: LineItem? = null,

    @field:JsonProperty("order_id")
    val orderId: kotlin.String? = null,

    @field:JsonProperty("order_quantity")
    val orderQuantity: kotlin.Int? = null,

    @field:JsonProperty("page_name")
    val pageName: kotlin.String? = null,

    @field:JsonProperty("promo_code")
    val promoCode: kotlin.String? = null,

    @field:JsonProperty("property")
    val `property`: kotlin.String? = null,

    @field:JsonProperty("search_query")
    val searchQuery: kotlin.String? = null,

    @field:JsonProperty("value")
    val `value`: kotlin.String? = null,

    @field:JsonProperty("video_title")
    val videoTitle: kotlin.String? = null,

)
