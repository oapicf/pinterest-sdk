package org.openapitools.server.api.model

import org.openapitools.server.api.model.OrderLinePaidType
import org.openapitools.server.api.model.OrderLineStatus
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class OrderLine(
    /** Ad account ID. */
    val adAccountId: kotlin.String,
    /** Associated List of campaign IDs. */
    val campaignIds: kotlin.collections.List<kotlin.String>,
    /** Order line ID. */
    val id: kotlin.String,
    /** Order line status. */
    val status: OrderLineStatus,
    /** Always \&quot;orderline\&quot;. */
    val type: kotlin.String,
    /** Order line budget in micro currency. */
    val budget: java.math.BigDecimal? = null,
    /** End time. Unix timestamp. */
    val endTime: java.math.BigDecimal? = null,
    /** Order line name. */
    val name: kotlin.String? = null,
    /** Order line paid budget in micro currency. */
    val paidBudget: java.math.BigDecimal? = null,
    /** Order line paid type. */
    val paidType: OrderLinePaidType? = null,
    /** Purchase order ID. */
    val purchaseOrderId: kotlin.String? = null,
    /** Start time. Unix timestamp. */
    val startTime: java.math.BigDecimal? = null
)
