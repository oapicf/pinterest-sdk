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
 * Object describing an item batch record to update items
 * @param itemId The catalog item id in the merchant namespace
 * @param attributes 
 * @param updateMask The list of product attributes to be updated. Attributes specified in the update mask without a value specified in the body will be deleted from the product item.
 */
object ItemUpdateBatchRecords : BaseTable<ItemUpdateBatchRecord>("ItemUpdateBatchRecord") {
    val itemId = text("item_id") /* null */ /* The catalog item id in the merchant namespace */
    val attributes = long("attributes") /* null */

    /**
     * Create an entity of type ItemUpdateBatchRecord from the model
     */
    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean) = ItemUpdateBatchRecord(
        itemId = row[itemId]  /* kotlin.String? */ /* The catalog item id in the merchant namespace */,
        attributes = UpdatableItemAttributess.createEntity(row, withReferences) /* UpdatableItemAttributes? */,
        updateMask = emptyList() /* kotlin.Array<UpdateMaskFieldType>? */ /* The list of product attributes to be updated. Attributes specified in the update mask without a value specified in the body will be deleted from the product item. */
    )

    /**
    * Assign all the columns from the entity of type ItemUpdateBatchRecord to the DML expression.
    *
    * Usage:
    *
    * ```kotlin
    * let entity = ItemUpdateBatchRecord()
    * database.update(ItemUpdateBatchRecords, {
    *     assignFrom(entity)
    * })
    * ```
    * @return the builder with the columns for the update or insert.
    */
    fun AssignmentsBuilder.assignFrom(entity: ItemUpdateBatchRecord) {
        this.apply {
            set(ItemUpdateBatchRecords.itemId, entity.itemId)
            set(ItemUpdateBatchRecords.attributes, entity.attributes)
        }
    }

}


object ItemUpdateBatchRecordUpdateMaskFieldType : BaseTable<Pair<kotlin.Long, kotlin.Long>>("ItemUpdateBatchRecordUpdateMaskFieldType") {
    val itemUpdateBatchRecord = long("itemUpdateBatchRecord")
    val updateMaskFieldType = long("updateMaskFieldType")

    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean): Pair<kotlin.Long, kotlin.Long> =
        Pair(row[itemUpdateBatchRecord] ?: 0, row[updateMaskFieldType] ?: 0)

    fun AssignmentsBuilder.assignFrom(entity: Pair<kotlin.Long, kotlin.Long>) {
        this.apply {
            set(ItemUpdateBatchRecordUpdateMaskFieldType.itemUpdateBatchRecord, entity.first)
            set(ItemUpdateBatchRecordUpdateMaskFieldType.updateMaskFieldType, entity.second)
        }
    }

}

