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
 * Object describing the catalogs creative assets items batch
 * @param catalogType 
 * @param batchId Id of the catalogs items batch
 * @param createdTime Date and time (UTC) of the batch creation: YYYY-MM-DD'T'hh:mm:ss
 * @param completedTime Date and time (UTC) of the batch completion: YYYY-MM-DD'T'hh:mm:ss
 * @param status 
 * @param items Array with the catalogs items processing records part of the catalogs items batch
 */
object CatalogsCreativeAssetsItemsBatchs : BaseTable<CatalogsCreativeAssetsItemsBatch>("CatalogsCreativeAssetsItemsBatch") {
    val catalogType = long("catalog_type")
    val batchId = text("batch_id") /* null */ /* Id of the catalogs items batch */
    val createdTime = datetime("created_time") /* null */ /* Date and time (UTC) of the batch creation: YYYY-MM-DD'T'hh:mm:ss */
    val completedTime = datetime("completed_time") /* null */ /* Date and time (UTC) of the batch completion: YYYY-MM-DD'T'hh:mm:ss */
    val status = long("status") /* null */

    /**
     * Create an entity of type CatalogsCreativeAssetsItemsBatch from the model
     */
    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean) = CatalogsCreativeAssetsItemsBatch(
        catalogType = CatalogsTypes.createEntity(row, withReferences) /* CatalogsType */,
        batchId = row[batchId]  /* kotlin.String? */ /* Id of the catalogs items batch */,
        createdTime = row[createdTime]  /* java.time.LocalDateTime? */ /* Date and time (UTC) of the batch creation: YYYY-MM-DD'T'hh:mm:ss */,
        completedTime = row[completedTime]  /* java.time.LocalDateTime? */ /* Date and time (UTC) of the batch completion: YYYY-MM-DD'T'hh:mm:ss */,
        status = BatchOperationStatuss.createEntity(row, withReferences) /* BatchOperationStatus? */,
        items = emptyList() /* kotlin.Array<CreativeAssetsProcessingRecord>? */ /* Array with the catalogs items processing records part of the catalogs items batch */
    )

    /**
    * Assign all the columns from the entity of type CatalogsCreativeAssetsItemsBatch to the DML expression.
    *
    * Usage:
    *
    * ```kotlin
    * let entity = CatalogsCreativeAssetsItemsBatch()
    * database.update(CatalogsCreativeAssetsItemsBatchs, {
    *     assignFrom(entity)
    * })
    * ```
    * @return the builder with the columns for the update or insert.
    */
    fun AssignmentsBuilder.assignFrom(entity: CatalogsCreativeAssetsItemsBatch) {
        this.apply {
            set(CatalogsCreativeAssetsItemsBatchs.catalogType, entity.catalogType)
            set(CatalogsCreativeAssetsItemsBatchs.batchId, entity.batchId)
            set(CatalogsCreativeAssetsItemsBatchs.createdTime, entity.createdTime)
            set(CatalogsCreativeAssetsItemsBatchs.completedTime, entity.completedTime)
            set(CatalogsCreativeAssetsItemsBatchs.status, entity.status)
        }
    }

}


object CatalogsCreativeAssetsItemsBatchCreativeAssetsProcessingRecord : BaseTable<Pair<kotlin.Long, kotlin.Long>>("CatalogsCreativeAssetsItemsBatchCreativeAssetsProcessingRecord") {
    val catalogsCreativeAssetsItemsBatch = long("catalogsCreativeAssetsItemsBatch")
    val creativeAssetsProcessingRecord = long("creativeAssetsProcessingRecord")

    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean): Pair<kotlin.Long, kotlin.Long> =
        Pair(row[catalogsCreativeAssetsItemsBatch] ?: 0, row[creativeAssetsProcessingRecord] ?: 0)

    fun AssignmentsBuilder.assignFrom(entity: Pair<kotlin.Long, kotlin.Long>) {
        this.apply {
            set(CatalogsCreativeAssetsItemsBatchCreativeAssetsProcessingRecord.catalogsCreativeAssetsItemsBatch, entity.first)
            set(CatalogsCreativeAssetsItemsBatchCreativeAssetsProcessingRecord.creativeAssetsProcessingRecord, entity.second)
        }
    }

}

