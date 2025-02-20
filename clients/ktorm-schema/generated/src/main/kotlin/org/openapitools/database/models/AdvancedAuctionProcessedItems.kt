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
 * Response object containing the results of an operation on an item bid option
 * @param catalogId Catalog id pertaining to all items
 * @param items Array of advanced auction processed items
 */
object AdvancedAuctionProcessedItemss : BaseTable<AdvancedAuctionProcessedItems>("AdvancedAuctionProcessedItems") {
    val catalogId = text("catalog_id") /* null */ /* Catalog id pertaining to all items */

    /**
     * Create an entity of type AdvancedAuctionProcessedItems from the model
     */
    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean) = AdvancedAuctionProcessedItems(
        catalogId = row[catalogId]  /* kotlin.String? */ /* Catalog id pertaining to all items */,
        items = emptyList() /* kotlin.Array<AdvancedAuctionProcessedItem>? */ /* Array of advanced auction processed items */
    )

    /**
    * Assign all the columns from the entity of type AdvancedAuctionProcessedItems to the DML expression.
    *
    * Usage:
    *
    * ```kotlin
    * let entity = AdvancedAuctionProcessedItems()
    * database.update(AdvancedAuctionProcessedItemss, {
    *     assignFrom(entity)
    * })
    * ```
    * @return the builder with the columns for the update or insert.
    */
    fun AssignmentsBuilder.assignFrom(entity: AdvancedAuctionProcessedItems) {
        this.apply {
            set(AdvancedAuctionProcessedItemss.catalogId, entity.catalogId)
        }
    }

}


object AdvancedAuctionProcessedItemsAdvancedAuctionProcessedItem : BaseTable<Pair<kotlin.Long, kotlin.Long>>("AdvancedAuctionProcessedItemsAdvancedAuctionProcessedItem") {
    val advancedAuctionProcessedItems = long("advancedAuctionProcessedItems")
    val advancedAuctionProcessedItem = long("advancedAuctionProcessedItem")

    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean): Pair<kotlin.Long, kotlin.Long> =
        Pair(row[advancedAuctionProcessedItems] ?: 0, row[advancedAuctionProcessedItem] ?: 0)

    fun AssignmentsBuilder.assignFrom(entity: Pair<kotlin.Long, kotlin.Long>) {
        this.apply {
            set(AdvancedAuctionProcessedItemsAdvancedAuctionProcessedItem.advancedAuctionProcessedItems, entity.first)
            set(AdvancedAuctionProcessedItemsAdvancedAuctionProcessedItem.advancedAuctionProcessedItem, entity.second)
        }
    }

}

