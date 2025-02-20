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
 * Object describing an item record
 * @param catalogType 
 * @param itemId The catalog item id in the merchant namespace
 * @param pins The pins mapped to the item
 * @param attributes 
 * @param hotelId The catalog hotel id in the merchant namespace
 * @param creativeAssetsId The catalog creative assets id in the merchant namespace
 * @param errors Array with the errors for the item id requested
 */
object ItemResponses : BaseTable<ItemResponse>("ItemResponse") {
    val catalogType = long("catalog_type")
    val itemId = text("item_id") /* null */ /* The catalog item id in the merchant namespace */
    val attributes = long("attributes") /* null */
    val hotelId = text("hotel_id") /* null */ /* The catalog hotel id in the merchant namespace */
    val creativeAssetsId = text("creative_assets_id") /* null */ /* The catalog creative assets id in the merchant namespace */

    /**
     * Create an entity of type ItemResponse from the model
     */
    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean) = ItemResponse(
        catalogType = CatalogsTypes.createEntity(row, withReferences) /* CatalogsType */,
        itemId = row[itemId]  /* kotlin.String? */ /* The catalog item id in the merchant namespace */,
        pins = emptyList() /* kotlin.Array<Pin>? */ /* The pins mapped to the item */,
        attributes = CatalogsCreativeAssetsAttributess.createEntity(row, withReferences) /* CatalogsCreativeAssetsAttributes? */,
        hotelId = row[hotelId]  /* kotlin.String? */ /* The catalog hotel id in the merchant namespace */,
        creativeAssetsId = row[creativeAssetsId]  /* kotlin.String? */ /* The catalog creative assets id in the merchant namespace */,
        errors = emptyList() /* kotlin.Array<ItemValidationEvent>? */ /* Array with the errors for the item id requested */
    )

    /**
    * Assign all the columns from the entity of type ItemResponse to the DML expression.
    *
    * Usage:
    *
    * ```kotlin
    * let entity = ItemResponse()
    * database.update(ItemResponses, {
    *     assignFrom(entity)
    * })
    * ```
    * @return the builder with the columns for the update or insert.
    */
    fun AssignmentsBuilder.assignFrom(entity: ItemResponse) {
        this.apply {
            set(ItemResponses.catalogType, entity.catalogType)
            set(ItemResponses.itemId, entity.itemId)
            set(ItemResponses.attributes, entity.attributes)
            set(ItemResponses.hotelId, entity.hotelId)
            set(ItemResponses.creativeAssetsId, entity.creativeAssetsId)
        }
    }

}


object ItemResponsePin : BaseTable<Pair<kotlin.Long, kotlin.Long>>("ItemResponsePin") {
    val itemResponse = long("itemResponse")
    val pin = long("pin")

    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean): Pair<kotlin.Long, kotlin.Long> =
        Pair(row[itemResponse] ?: 0, row[pin] ?: 0)

    fun AssignmentsBuilder.assignFrom(entity: Pair<kotlin.Long, kotlin.Long>) {
        this.apply {
            set(ItemResponsePin.itemResponse, entity.first)
            set(ItemResponsePin.pin, entity.second)
        }
    }

}

object ItemResponseItemValidationEvent : BaseTable<Pair<kotlin.Long, kotlin.Long>>("ItemResponseItemValidationEvent") {
    val itemResponse = long("itemResponse")
    val itemValidationEvent = long("itemValidationEvent")

    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean): Pair<kotlin.Long, kotlin.Long> =
        Pair(row[itemResponse] ?: 0, row[itemValidationEvent] ?: 0)

    fun AssignmentsBuilder.assignFrom(entity: Pair<kotlin.Long, kotlin.Long>) {
        this.apply {
            set(ItemResponseItemValidationEvent.itemResponse, entity.first)
            set(ItemResponseItemValidationEvent.itemValidationEvent, entity.second)
        }
    }

}

