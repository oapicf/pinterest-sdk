package org.openapitools.server.api.model

import org.openapitools.server.api.model.Currency
import org.openapitools.server.api.model.LineItem
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class EventData(
    /** Currency. For example, &#39;USD&#39;. */
    val currency: Currency? = null,
    /** Promotion code. For example, &#39;Newsletter&#39;. */
    val leadType: kotlin.String? = null,
    val lineItems: LineItem? = null,
    /** Order ID. For example, &#39;X-151481&#39;. */
    val orderId: kotlin.String? = null,
    /** Order quantity. For example, 1. */
    val orderQuantity: kotlin.Int? = null,
    /** Page name. For example, &#39;Our Favorite Pins on Pinterest&#39;. */
    val pageName: kotlin.String? = null,
    /** Promotion code. For example, &#39;WINTER10&#39;. */
    val promoCode: kotlin.String? = null,
    /** Property. For example, &#39;Athleta&#39;. */
    val `property`: kotlin.String? = null,
    /** Search query string. For example, &#39;boots&#39;. */
    val searchQuery: kotlin.String? = null,
    /** Product value. For example, &#39;199.98&#39;. */
    val `value`: kotlin.String? = null,
    /** Video title. For example, &#39;How to style your Parker Boots&#39;. */
    val videoTitle: kotlin.String? = null
)
