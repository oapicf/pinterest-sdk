package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.OrderLinePaidType
import org.openapitools.model.OrderLineStatus
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
 * Order Line
 * @param id Order line ID.
 * @param type Always \"orderline\".
 * @param adAccountId Ad account ID.
 * @param purchaseOrderId Purchase order ID.
 * @param startTime Start time. Unix timestamp.
 * @param endTime End time. Unix timestamp.
 * @param budget Order line budget in micro currency.
 * @param paidBudget Order line paid budget in micro currency.
 * @param status Order line status.
 * @param name Order line name.
 * @param paidType Order line paid type.
 */
data class OrderLines(

    @get:Pattern(regexp="^\\d+$")
    @Schema(example = "2680059592705", description = "Order line ID.")
    @get:JsonProperty("id") val id: kotlin.String? = null,

    @Schema(example = "orderline", description = "Always \"orderline\".")
    @get:JsonProperty("type") val type: kotlin.String? = null,

    @Schema(example = "549755885175", description = "Ad account ID.")
    @get:JsonProperty("ad_account_id") val adAccountId: kotlin.String? = null,

    @Schema(example = "PO12345", description = "Purchase order ID.")
    @get:JsonProperty("purchase_order_id") val purchaseOrderId: kotlin.String? = null,

    @Schema(example = "1452208622", description = "Start time. Unix timestamp.")
    @get:JsonProperty("start_time") val startTime: java.math.BigDecimal? = null,

    @Schema(example = "1461269616", description = "End time. Unix timestamp.")
    @get:JsonProperty("end_time") val endTime: java.math.BigDecimal? = null,

    @Schema(example = "5000000", description = "Order line budget in micro currency.")
    @get:JsonProperty("budget") val budget: java.math.BigDecimal? = null,

    @Schema(example = "5000000", description = "Order line paid budget in micro currency.")
    @get:JsonProperty("paid_budget") val paidBudget: java.math.BigDecimal? = null,

    @field:Valid
    @Schema(example = "null", description = "Order line status.")
    @get:JsonProperty("status") val status: OrderLineStatus? = null,

    @Schema(example = "Order Line Name 1", description = "Order line name.")
    @get:JsonProperty("name") val name: kotlin.String? = null,

    @field:Valid
    @Schema(example = "null", description = "Order line paid type.")
    @get:JsonProperty("paid_type") val paidType: OrderLinePaidType? = null
) {

}

