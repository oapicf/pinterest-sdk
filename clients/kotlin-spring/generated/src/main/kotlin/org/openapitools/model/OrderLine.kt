package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSetter
import com.fasterxml.jackson.annotation.JsonValue
import com.fasterxml.jackson.annotation.Nulls
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
 * 
 * @param adAccountId Ad account ID.
 * @param campaignIds Associated List of campaign IDs.
 * @param id Order line ID.
 * @param status Order line status.
 * @param type Always \"orderline\".
 * @param budget Order line budget in micro currency.
 * @param endTime End time. Unix timestamp.
 * @param name Order line name.
 * @param paidBudget Order line paid budget in micro currency.
 * @param paidType Order line paid type.
 * @param purchaseOrderId Purchase order ID.
 * @param startTime Start time. Unix timestamp.
 */
data class OrderLine(

    @Schema(required = true, description = "Ad account ID.")
    @param:JsonProperty("ad_account_id")
    @get:JsonProperty("ad_account_id", required = true) val adAccountId: kotlin.String,

    @Schema(example = "[\"626735565838\"]", required = true, description = "Associated List of campaign IDs.")
    @param:JsonProperty("campaign_ids")
    @get:JsonProperty("campaign_ids", required = true) val campaignIds: kotlin.collections.List<kotlin.String>,

    @get:Pattern(regexp="^\\d+$")
    @Schema(required = true, description = "Order line ID.")
    @param:JsonProperty("id")
    @get:JsonProperty("id", required = true) val id: kotlin.String,

    @field:Valid
    @Schema(required = true, description = "Order line status.")
    @param:JsonProperty("status")
    @get:JsonProperty("status", required = true) val status: OrderLineStatus,

    @Schema(required = true, description = "Always \"orderline\".")
    @param:JsonProperty("type")
    @get:JsonProperty("type", required = true) val type: kotlin.String,

    @Schema(description = "Order line budget in micro currency.")
    @param:JsonProperty("budget")
    @get:JsonProperty("budget") val budget: java.math.BigDecimal? = null,

    @Schema(description = "End time. Unix timestamp.")
    @param:JsonProperty("end_time")
    @get:JsonProperty("end_time") val endTime: java.math.BigDecimal? = null,

    @Schema(description = "Order line name.")
    @param:JsonProperty("name")
    @get:JsonProperty("name") val name: kotlin.String? = null,

    @Schema(description = "Order line paid budget in micro currency.")
    @param:JsonProperty("paid_budget")
    @get:JsonProperty("paid_budget") val paidBudget: java.math.BigDecimal? = null,

    @field:Valid
    @Schema(description = "Order line paid type.")
    @param:JsonProperty("paid_type")
    @get:JsonProperty("paid_type") val paidType: OrderLinePaidType? = null,

    @Schema(description = "Purchase order ID.")
    @param:JsonProperty("purchase_order_id")
    @get:JsonProperty("purchase_order_id") val purchaseOrderId: kotlin.String? = null,

    @Schema(description = "Start time. Unix timestamp.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("start_time")
    @get:JsonProperty("start_time") val startTime: java.math.BigDecimal? = null
) {

}

