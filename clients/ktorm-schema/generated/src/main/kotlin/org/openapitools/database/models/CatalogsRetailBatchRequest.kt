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
 * A request object that can have multiple operations on a single retail batch
 * @param catalogType 
 * @param country 
 * @param language 
 * @param items Array with catalogs item operations
 */
object CatalogsRetailBatchRequests : BaseTable<CatalogsRetailBatchRequest>("CatalogsRetailBatchRequest") {
    val catalogType = long("catalog_type")
    val country = long("country")
    val language = long("language")

    /**
     * Create an entity of type CatalogsRetailBatchRequest from the model
     */
    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean) = CatalogsRetailBatchRequest(
        catalogType = CatalogsTypes.createEntity(row, withReferences) /* CatalogsType */,
        country = Countrys.createEntity(row, withReferences) /* Country */,
        language = Languages.createEntity(row, withReferences) /* Language */,
        items = emptyList() /* kotlin.Array<CatalogsRetailBatchRequestItemsInner> */ /* Array with catalogs item operations */
    )

    /**
    * Assign all the columns from the entity of type CatalogsRetailBatchRequest to the DML expression.
    *
    * Usage:
    *
    * ```kotlin
    * let entity = CatalogsRetailBatchRequest()
    * database.update(CatalogsRetailBatchRequests, {
    *     assignFrom(entity)
    * })
    * ```
    * @return the builder with the columns for the update or insert.
    */
    fun AssignmentsBuilder.assignFrom(entity: CatalogsRetailBatchRequest) {
        this.apply {
            set(CatalogsRetailBatchRequests.catalogType, entity.catalogType)
            set(CatalogsRetailBatchRequests.country, entity.country)
            set(CatalogsRetailBatchRequests.language, entity.language)
        }
    }

}


object CatalogsRetailBatchRequestCatalogsRetailBatchRequestItemsInner : BaseTable<Pair<kotlin.Long, kotlin.Long>>("CatalogsRetailBatchRequestCatalogsRetailBatchRequestItemsInner") {
    val catalogsRetailBatchRequest = long("catalogsRetailBatchRequest")
    val catalogsRetailBatchRequestItemsInner = long("catalogsRetailBatchRequestItemsInner")

    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean): Pair<kotlin.Long, kotlin.Long> =
        Pair(row[catalogsRetailBatchRequest] ?: 0, row[catalogsRetailBatchRequestItemsInner] ?: 0)

    fun AssignmentsBuilder.assignFrom(entity: Pair<kotlin.Long, kotlin.Long>) {
        this.apply {
            set(CatalogsRetailBatchRequestCatalogsRetailBatchRequestItemsInner.catalogsRetailBatchRequest, entity.first)
            set(CatalogsRetailBatchRequestCatalogsRetailBatchRequestItemsInner.catalogsRetailBatchRequestItemsInner, entity.second)
        }
    }

}
