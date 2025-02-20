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
package org.openapitools.server.models

import org.openapitools.server.models.OrderLinePaidType
import org.openapitools.server.models.OrderLineStatus

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
data class OrderLine(
    /* Associated List of campaign IDs. */
    val campaignIds: kotlin.collections.List<kotlin.String>,
    /* Order line ID. */
    val id: kotlin.String? = null,
    /* Always \"orderline\". */
    val type: kotlin.String? = null,
    /* Ad account ID. */
    val adAccountId: kotlin.String? = null,
    /* Purchase order ID. */
    val purchaseOrderId: kotlin.String? = null,
    /* Start time. Unix timestamp. */
    val startTime: java.math.BigDecimal? = null,
    /* End time. Unix timestamp. */
    val endTime: java.math.BigDecimal? = null,
    /* Order line budget in micro currency. */
    val budget: java.math.BigDecimal? = null,
    /* Order line paid budget in micro currency. */
    val paidBudget: java.math.BigDecimal? = null,
    /* Order line status. */
    val status: OrderLineStatus? = null,
    /* Order line name. */
    val name: kotlin.String? = null,
    /* Order line paid type. */
    val paidType: OrderLinePaidType? = null
) 

