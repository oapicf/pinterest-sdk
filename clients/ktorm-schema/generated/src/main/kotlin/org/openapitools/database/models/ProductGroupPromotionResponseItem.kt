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
 * @param exceptions 
 */
object ProductGroupPromotionResponseItems : BaseTable<ProductGroupPromotionResponseItem>("ProductGroupPromotionResponseItem") {
    val data = long("data") /* null */

    /**
     * Create an entity of type ProductGroupPromotionResponseItem from the model
     */
    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean) = ProductGroupPromotionResponseItem(
        data = ProductGroupPromotionResponseElements.createEntity(row, withReferences) /* ProductGroupPromotionResponseElement? */,
        exceptions = emptyList() /* kotlin.Array<Exception>? */
    )

    /**
    * Assign all the columns from the entity of type ProductGroupPromotionResponseItem to the DML expression.
    *
    * Usage:
    *
    * ```kotlin
    * let entity = ProductGroupPromotionResponseItem()
    * database.update(ProductGroupPromotionResponseItems, {
    *     assignFrom(entity)
    * })
    * ```
    * @return the builder with the columns for the update or insert.
    */
    fun AssignmentsBuilder.assignFrom(entity: ProductGroupPromotionResponseItem) {
        this.apply {
            set(ProductGroupPromotionResponseItems.data, entity.data)
        }
    }

}


object ProductGroupPromotionResponseItemException : BaseTable<Pair<kotlin.Long, kotlin.Long>>("ProductGroupPromotionResponseItemException") {
    val productGroupPromotionResponseItem = long("productGroupPromotionResponseItem")
    val exception = long("exception")

    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean): Pair<kotlin.Long, kotlin.Long> =
        Pair(row[productGroupPromotionResponseItem] ?: 0, row[exception] ?: 0)

    fun AssignmentsBuilder.assignFrom(entity: Pair<kotlin.Long, kotlin.Long>) {
        this.apply {
            set(ProductGroupPromotionResponseItemException.productGroupPromotionResponseItem, entity.first)
            set(ProductGroupPromotionResponseItemException.exception, entity.second)
        }
    }

}

