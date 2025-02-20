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
 * @param catalogType 
 * @param itemIds 
 * @param catalogId Catalog id pertaining to the retail item. If not provided, default to oldest retail catalog
 */
object CatalogsRetailItemsPostFilters : BaseTable<CatalogsRetailItemsPostFilter>("CatalogsRetailItemsPostFilter") {
    val catalogType = text("catalog_type").transform({ CatalogsRetailItemsPostFilter.CatalogType.valueOf(it) }, { it.value })
    val catalogId = text("catalog_id") /* null */ /* Catalog id pertaining to the retail item. If not provided, default to oldest retail catalog */

    /**
     * Create an entity of type CatalogsRetailItemsPostFilter from the model
     */
    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean) = CatalogsRetailItemsPostFilter(
        catalogType = row[catalogType] ?: CatalogsRetailItemsPostFilter.CatalogType.valueOf("") /* kotlin.String */,
        itemIds = emptyList() /* kotlin.Array<kotlin.String> */,
        catalogId = row[catalogId]  /* kotlin.String? */ /* Catalog id pertaining to the retail item. If not provided, default to oldest retail catalog */
    )

    /**
    * Assign all the columns from the entity of type CatalogsRetailItemsPostFilter to the DML expression.
    *
    * Usage:
    *
    * ```kotlin
    * let entity = CatalogsRetailItemsPostFilter()
    * database.update(CatalogsRetailItemsPostFilters, {
    *     assignFrom(entity)
    * })
    * ```
    * @return the builder with the columns for the update or insert.
    */
    fun AssignmentsBuilder.assignFrom(entity: CatalogsRetailItemsPostFilter) {
        this.apply {
            set(CatalogsRetailItemsPostFilters.catalogType, entity.catalogType)
            set(CatalogsRetailItemsPostFilters.catalogId, entity.catalogId)
        }
    }

}


object CatalogsRetailItemsPostFilterItemIds : BaseTable<Pair<kotlin.Long, kotlin.String>>("CatalogsRetailItemsPostFilterItemIds") {
    val catalogsRetailItemsPostFilter = long("catalogsRetailItemsPostFilter")
    val itemIds = text("itemIds")

    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean): Pair<kotlin.Long, kotlin.String> =
        Pair(row[catalogsRetailItemsPostFilter] ?: 0, row[itemIds] ?: "")

    fun AssignmentsBuilder.assignFrom(entity: Pair<kotlin.Long, kotlin.String>) {
        this.apply {
            set(CatalogsRetailItemsPostFilterItemIds.catalogsRetailItemsPostFilter, entity.first)
            set(CatalogsRetailItemsPostFilterItemIds.itemIds, entity.second)
        }
    }

}

