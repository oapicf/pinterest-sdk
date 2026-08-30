@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class OrderLine(
    @field:JsonProperty("ad_account_id")
    val adAccountId: kotlin.String,

    @field:JsonProperty("campaign_ids")
    val campaignIds: kotlin.collections.List<kotlin.String>,

    @field:JsonProperty("id")
    val id: kotlin.String,

    @field:JsonProperty("status")
    val status: OrderLineStatus,

    @field:JsonProperty("type")
    val type: kotlin.String,

    @field:JsonProperty("budget")
    val budget: java.math.BigDecimal? = null,

    @field:JsonProperty("end_time")
    val endTime: java.math.BigDecimal? = null,

    @field:JsonProperty("name")
    val name: kotlin.String? = null,

    @field:JsonProperty("paid_budget")
    val paidBudget: java.math.BigDecimal? = null,

    @field:JsonProperty("paid_type")
    val paidType: OrderLinePaidType? = null,

    @field:JsonProperty("purchase_order_id")
    val purchaseOrderId: kotlin.String? = null,

    @field:JsonProperty("start_time")
    val startTime: java.math.BigDecimal? = null,

)
