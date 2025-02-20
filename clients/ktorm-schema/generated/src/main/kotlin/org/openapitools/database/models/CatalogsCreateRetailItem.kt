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
 * An item to be created
 * @param itemId The catalog item id in the merchant namespace
 * @param operation 
 * @param attributes 
 */
object CatalogsCreateRetailItems : BaseTable<CatalogsCreateRetailItem>("CatalogsCreateRetailItem") {
    val itemId = text("item_id") /* The catalog item id in the merchant namespace */
    val operation = text("operation").transform({ CatalogsCreateRetailItem.Operation.valueOf(it) }, { it.value })
    val attributes = long("attributes")

    /**
     * Create an entity of type CatalogsCreateRetailItem from the model
     */
    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean) = CatalogsCreateRetailItem(
        itemId = row[itemId] ?: "" /* kotlin.String */ /* The catalog item id in the merchant namespace */,
        operation = row[operation] ?: CatalogsCreateRetailItem.Operation.valueOf("") /* kotlin.String */,
        attributes = ItemAttributesRequests.createEntity(row, withReferences) /* ItemAttributesRequest */
    )

    /**
    * Assign all the columns from the entity of type CatalogsCreateRetailItem to the DML expression.
    *
    * Usage:
    *
    * ```kotlin
    * let entity = CatalogsCreateRetailItem()
    * database.update(CatalogsCreateRetailItems, {
    *     assignFrom(entity)
    * })
    * ```
    * @return the builder with the columns for the update or insert.
    */
    fun AssignmentsBuilder.assignFrom(entity: CatalogsCreateRetailItem) {
        this.apply {
            set(CatalogsCreateRetailItems.itemId, entity.itemId)
            set(CatalogsCreateRetailItems.operation, entity.operation)
            set(CatalogsCreateRetailItems.attributes, entity.attributes)
        }
    }

}


