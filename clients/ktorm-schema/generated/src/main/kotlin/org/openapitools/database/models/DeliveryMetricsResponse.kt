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
 * @param items 
 */
object DeliveryMetricsResponses : BaseTable<DeliveryMetricsResponse>("DeliveryMetricsResponse") {

    /**
     * Create an entity of type DeliveryMetricsResponse from the model
     */
    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean) = DeliveryMetricsResponse(
        items = emptyList() /* kotlin.Array<DeliveryMetricsResponseItemsInner>? */
    )

    /**
    * Assign all the columns from the entity of type DeliveryMetricsResponse to the DML expression.
    *
    * Usage:
    *
    * ```kotlin
    * let entity = DeliveryMetricsResponse()
    * database.update(DeliveryMetricsResponses, {
    *     assignFrom(entity)
    * })
    * ```
    * @return the builder with the columns for the update or insert.
    */
    fun AssignmentsBuilder.assignFrom(entity: DeliveryMetricsResponse) {
        this.apply {
        }
    }

}


object DeliveryMetricsResponseDeliveryMetricsResponseItemsInner : BaseTable<Pair<kotlin.Long, kotlin.Long>>("DeliveryMetricsResponseDeliveryMetricsResponseItemsInner") {
    val deliveryMetricsResponse = long("deliveryMetricsResponse")
    val deliveryMetricsResponseItemsInner = long("deliveryMetricsResponseItemsInner")

    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean): Pair<kotlin.Long, kotlin.Long> =
        Pair(row[deliveryMetricsResponse] ?: 0, row[deliveryMetricsResponseItemsInner] ?: 0)

    fun AssignmentsBuilder.assignFrom(entity: Pair<kotlin.Long, kotlin.Long>) {
        this.apply {
            set(DeliveryMetricsResponseDeliveryMetricsResponseItemsInner.deliveryMetricsResponse, entity.first)
            set(DeliveryMetricsResponseDeliveryMetricsResponseItemsInner.deliveryMetricsResponseItemsInner, entity.second)
        }
    }

}
