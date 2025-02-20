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
 * Object describing an hotel item batch record
 * @param hotelId The catalog hotel item id in the merchant namespace
 * @param operation 
 * @param attributes 
 */
object CatalogsUpdateHotelItems : BaseTable<CatalogsUpdateHotelItem>("CatalogsUpdateHotelItem") {
    val hotelId = text("hotel_id") /* The catalog hotel item id in the merchant namespace */
    val operation = text("operation").transform({ CatalogsUpdateHotelItem.Operation.valueOf(it) }, { it.value })
    val attributes = long("attributes")

    /**
     * Create an entity of type CatalogsUpdateHotelItem from the model
     */
    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean) = CatalogsUpdateHotelItem(
        hotelId = row[hotelId] ?: "" /* kotlin.String */ /* The catalog hotel item id in the merchant namespace */,
        operation = row[operation] ?: CatalogsUpdateHotelItem.Operation.valueOf("") /* kotlin.String */,
        attributes = CatalogsUpdatableHotelAttributess.createEntity(row, withReferences) /* CatalogsUpdatableHotelAttributes */
    )

    /**
    * Assign all the columns from the entity of type CatalogsUpdateHotelItem to the DML expression.
    *
    * Usage:
    *
    * ```kotlin
    * let entity = CatalogsUpdateHotelItem()
    * database.update(CatalogsUpdateHotelItems, {
    *     assignFrom(entity)
    * })
    * ```
    * @return the builder with the columns for the update or insert.
    */
    fun AssignmentsBuilder.assignFrom(entity: CatalogsUpdateHotelItem) {
        this.apply {
            set(CatalogsUpdateHotelItems.hotelId, entity.hotelId)
            set(CatalogsUpdateHotelItems.operation, entity.operation)
            set(CatalogsUpdateHotelItems.attributes, entity.attributes)
        }
    }

}


