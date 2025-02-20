/**
* Pinterest REST API
* Pinterest's REST API
*
* The version of the OpenAPI document: 5.14.0
* Contact: blah+oapicf@cliffano.com
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
package org.openapitools.database.models

import org.ktorm.dsl.*
import org.ktorm.schema.*
import org.ktorm.database.Database
import .*


/**
 * 
 * @param campaignIds Associated List of campaign IDs.
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
object OrderLines : BaseTable<OrderLine>("OrderLine") {
    val id = text("id") /* null */ /* Order line ID. */
    val type = text("type") /* null */ /* Always \"orderline\". */
    val adAccountId = text("ad_account_id") /* null */ /* Ad account ID. */
    val purchaseOrderId = text("purchase_order_id") /* null */ /* Purchase order ID. */
    val startTime = decimal("start_time") /* null */ /* Start time. Unix timestamp. */
    val endTime = decimal("end_time") /* null */ /* End time. Unix timestamp. */
    val budget = decimal("budget") /* null */ /* Order line budget in micro currency. */
    val paidBudget = decimal("paid_budget") /* null */ /* Order line paid budget in micro currency. */
    val status = long("status") /* null */ /* Order line status. */
    val name = text("name") /* null */ /* Order line name. */
    val paidType = long("paid_type") /* null */ /* Order line paid type. */

    /**
     * Create an entity of type OrderLine from the model
     */
    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean) = OrderLine(
        campaignIds = emptyList() /* kotlin.Array<kotlin.String> */ /* Associated List of campaign IDs. */,
        id = row[id]  /* kotlin.String? */ /* Order line ID. */,
        type = row[type]  /* kotlin.String? */ /* Always \"orderline\". */,
        adAccountId = row[adAccountId]  /* kotlin.String? */ /* Ad account ID. */,
        purchaseOrderId = row[purchaseOrderId]  /* kotlin.String? */ /* Purchase order ID. */,
        startTime = row[startTime]  /* java.math.BigDecimal? */ /* Start time. Unix timestamp. */,
        endTime = row[endTime]  /* java.math.BigDecimal? */ /* End time. Unix timestamp. */,
        budget = row[budget]  /* java.math.BigDecimal? */ /* Order line budget in micro currency. */,
        paidBudget = row[paidBudget]  /* java.math.BigDecimal? */ /* Order line paid budget in micro currency. */,
        status = OrderLineStatuss.createEntity(row, withReferences) /* OrderLineStatus? */ /* Order line status. */,
        name = row[name]  /* kotlin.String? */ /* Order line name. */,
        paidType = OrderLinePaidTypes.createEntity(row, withReferences) /* OrderLinePaidType? */ /* Order line paid type. */
    )

    /**
    * Assign all the columns from the entity of type OrderLine to the DML expression.
    *
    * Usage:
    *
    * ```kotlin
    * let entity = OrderLine()
    * database.update(OrderLines, {
    *     assignFrom(entity)
    * })
    * ```
    * @return the builder with the columns for the update or insert.
    */
    fun AssignmentsBuilder.assignFrom(entity: OrderLine) {
        this.apply {
            set(OrderLines.id, entity.id)
            set(OrderLines.type, entity.type)
            set(OrderLines.adAccountId, entity.adAccountId)
            set(OrderLines.purchaseOrderId, entity.purchaseOrderId)
            set(OrderLines.startTime, entity.startTime)
            set(OrderLines.endTime, entity.endTime)
            set(OrderLines.budget, entity.budget)
            set(OrderLines.paidBudget, entity.paidBudget)
            set(OrderLines.status, entity.status)
            set(OrderLines.name, entity.name)
            set(OrderLines.paidType, entity.paidType)
        }
    }

}


object OrderLineCampaignIds : BaseTable<Pair<kotlin.Long, kotlin.String>>("OrderLineCampaignIds") {
    val orderLine = long("orderLine")
    val campaignIds = text("campaignIds")

    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean): Pair<kotlin.Long, kotlin.String> =
        Pair(row[orderLine] ?: 0, row[campaignIds] ?: "")

    fun AssignmentsBuilder.assignFrom(entity: Pair<kotlin.Long, kotlin.String>) {
        this.apply {
            set(OrderLineCampaignIds.orderLine, entity.first)
            set(OrderLineCampaignIds.campaignIds, entity.second)
        }
    }

}

