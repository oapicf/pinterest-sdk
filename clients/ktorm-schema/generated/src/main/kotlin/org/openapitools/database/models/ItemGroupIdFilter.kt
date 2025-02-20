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
 * @param ITEM_GROUP_ID 
 */
object ItemGroupIdFilters : BaseTable<ItemGroupIdFilter>("ItemGroupIdFilter") {
    val ITEM_GROUP_ID = long("ITEM_GROUP_ID")

    /**
     * Create an entity of type ItemGroupIdFilter from the model
     */
    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean) = ItemGroupIdFilter(
        ITEM_GROUP_ID = CatalogsProductGroupMultipleStringCriterias.createEntity(row, withReferences) /* CatalogsProductGroupMultipleStringCriteria */
    )

    /**
    * Assign all the columns from the entity of type ItemGroupIdFilter to the DML expression.
    *
    * Usage:
    *
    * ```kotlin
    * let entity = ItemGroupIdFilter()
    * database.update(ItemGroupIdFilters, {
    *     assignFrom(entity)
    * })
    * ```
    * @return the builder with the columns for the update or insert.
    */
    fun AssignmentsBuilder.assignFrom(entity: ItemGroupIdFilter) {
        this.apply {
            set(ItemGroupIdFilters.ITEM_GROUP_ID, entity.ITEM_GROUP_ID)
        }
    }

}


