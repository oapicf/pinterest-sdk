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
 * @param data 
 * @param errorMessages 
 */
object OrderLineErrors : BaseTable<OrderLineError>("OrderLineError") {
    val data = long("data") /* null */

    /**
     * Create an entity of type OrderLineError from the model
     */
    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean) = OrderLineError(
        data = OrderLines.createEntity(row, withReferences) /* OrderLine? */,
        errorMessages = emptyList() /* kotlin.Array<kotlin.String>? */
    )

    /**
    * Assign all the columns from the entity of type OrderLineError to the DML expression.
    *
    * Usage:
    *
    * ```kotlin
    * let entity = OrderLineError()
    * database.update(OrderLineErrors, {
    *     assignFrom(entity)
    * })
    * ```
    * @return the builder with the columns for the update or insert.
    */
    fun AssignmentsBuilder.assignFrom(entity: OrderLineError) {
        this.apply {
            set(OrderLineErrors.data, entity.data)
        }
    }

}


object OrderLineErrorErrorMessages : BaseTable<Pair<kotlin.Long, kotlin.String>>("OrderLineErrorErrorMessages") {
    val orderLineError = long("orderLineError")
    val errorMessages = text("errorMessages")

    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean): Pair<kotlin.Long, kotlin.String> =
        Pair(row[orderLineError] ?: 0, row[errorMessages] ?: "")

    fun AssignmentsBuilder.assignFrom(entity: Pair<kotlin.Long, kotlin.String>) {
        this.apply {
            set(OrderLineErrorErrorMessages.orderLineError, entity.first)
            set(OrderLineErrorErrorMessages.errorMessages, entity.second)
        }
    }

}

