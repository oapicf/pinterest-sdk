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
 * Object describing a hotel record
 * @param catalogType 
 * @param hotelId The catalog hotel id in the merchant namespace
 * @param pins The pins mapped to the item
 * @param attributes 
 */
object CatalogsHotelItemResponses : BaseTable<CatalogsHotelItemResponse>("CatalogsHotelItemResponse") {
    val catalogType = long("catalog_type")
    val hotelId = text("hotel_id") /* null */ /* The catalog hotel id in the merchant namespace */
    val attributes = long("attributes") /* null */

    /**
     * Create an entity of type CatalogsHotelItemResponse from the model
     */
    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean) = CatalogsHotelItemResponse(
        catalogType = CatalogsTypes.createEntity(row, withReferences) /* CatalogsType */,
        hotelId = row[hotelId]  /* kotlin.String? */ /* The catalog hotel id in the merchant namespace */,
        pins = emptyList() /* kotlin.Array<Pin>? */ /* The pins mapped to the item */,
        attributes = CatalogsHotelAttributess.createEntity(row, withReferences) /* CatalogsHotelAttributes? */
    )

    /**
    * Assign all the columns from the entity of type CatalogsHotelItemResponse to the DML expression.
    *
    * Usage:
    *
    * ```kotlin
    * let entity = CatalogsHotelItemResponse()
    * database.update(CatalogsHotelItemResponses, {
    *     assignFrom(entity)
    * })
    * ```
    * @return the builder with the columns for the update or insert.
    */
    fun AssignmentsBuilder.assignFrom(entity: CatalogsHotelItemResponse) {
        this.apply {
            set(CatalogsHotelItemResponses.catalogType, entity.catalogType)
            set(CatalogsHotelItemResponses.hotelId, entity.hotelId)
            set(CatalogsHotelItemResponses.attributes, entity.attributes)
        }
    }

}


object CatalogsHotelItemResponsePin : BaseTable<Pair<kotlin.Long, kotlin.Long>>("CatalogsHotelItemResponsePin") {
    val catalogsHotelItemResponse = long("catalogsHotelItemResponse")
    val pin = long("pin")

    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean): Pair<kotlin.Long, kotlin.Long> =
        Pair(row[catalogsHotelItemResponse] ?: 0, row[pin] ?: 0)

    fun AssignmentsBuilder.assignFrom(entity: Pair<kotlin.Long, kotlin.Long>) {
        this.apply {
            set(CatalogsHotelItemResponsePin.catalogsHotelItemResponse, entity.first)
            set(CatalogsHotelItemResponsePin.pin, entity.second)
        }
    }

}

