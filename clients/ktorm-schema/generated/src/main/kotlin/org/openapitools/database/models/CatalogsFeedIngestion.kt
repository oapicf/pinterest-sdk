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
 * @param id 
 * @param feedId 
 * @param createdAt 
 * @param status 
 */
object CatalogsFeedIngestions : BaseTable<CatalogsFeedIngestion>("CatalogsFeedIngestion") {
    val id = text("id")
    val feedId = text("feed_id")
    val createdAt = datetime("created_at")
    val status = long("status")

    /**
     * Create an entity of type CatalogsFeedIngestion from the model
     */
    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean) = CatalogsFeedIngestion(
        id = row[id] ?: "" /* kotlin.String */,
        feedId = row[feedId] ?: "" /* kotlin.String */,
        createdAt = row[createdAt] /* java.time.LocalDateTime */,
        status = CatalogsFeedProcessingStatuss.createEntity(row, withReferences) /* CatalogsFeedProcessingStatus */
    )

    /**
    * Assign all the columns from the entity of type CatalogsFeedIngestion to the DML expression.
    *
    * Usage:
    *
    * ```kotlin
    * let entity = CatalogsFeedIngestion()
    * database.update(CatalogsFeedIngestions, {
    *     assignFrom(entity)
    * })
    * ```
    * @return the builder with the columns for the update or insert.
    */
    fun AssignmentsBuilder.assignFrom(entity: CatalogsFeedIngestion) {
        this.apply {
            set(CatalogsFeedIngestions.id, entity.id)
            set(CatalogsFeedIngestions.feedId, entity.feedId)
            set(CatalogsFeedIngestions.createdAt, entity.createdAt)
            set(CatalogsFeedIngestions.status, entity.status)
        }
    }

}


