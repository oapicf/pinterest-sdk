/**
* Pinterest REST API
* Pinterest's REST API
*
* The version of the OpenAPI document: 5.12.0
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
 * @param pinOrderId Salesforce order id
 * @param status Salesforce insertion order status
 * @param creationTime Salesforce insertion order creation time
 */
object SSIOInsertionOrderStatuss : BaseTable<SSIOInsertionOrderStatus>("SSIOInsertionOrderStatus") {
    val pinOrderId = text("pin_order_id") /* null */ /* Salesforce order id */
    val status = text("status") /* null */ /* Salesforce insertion order status */
    val creationTime = text("creation_time") /* null */ /* Salesforce insertion order creation time */

    /**
     * Create an entity of type SSIOInsertionOrderStatus from the model
     */
    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean) = SSIOInsertionOrderStatus(
        pinOrderId = row[pinOrderId]  /* kotlin.String? */ /* Salesforce order id */,
        status = row[status]  /* kotlin.String? */ /* Salesforce insertion order status */,
        creationTime = row[creationTime]  /* kotlin.String? */ /* Salesforce insertion order creation time */
    )

    /**
    * Assign all the columns from the entity of type SSIOInsertionOrderStatus to the DML expression.
    *
    * Usage:
    *
    * ```kotlin
    * let entity = SSIOInsertionOrderStatus()
    * database.update(SSIOInsertionOrderStatuss, {
    *     assignFrom(entity)
    * })
    * ```
    * @return the builder with the columns for the update or insert.
    */
    fun AssignmentsBuilder.assignFrom(entity: SSIOInsertionOrderStatus) {
        this.apply {
            set(SSIOInsertionOrderStatuss.pinOrderId, entity.pinOrderId)
            set(SSIOInsertionOrderStatuss.status, entity.status)
            set(SSIOInsertionOrderStatuss.creationTime, entity.creationTime)
        }
    }

}

