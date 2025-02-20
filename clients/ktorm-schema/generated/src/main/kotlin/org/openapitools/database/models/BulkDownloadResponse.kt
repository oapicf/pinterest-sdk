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
 * @param requestId ID of the bulk request.
 */
object BulkDownloadResponses : BaseTable<BulkDownloadResponse>("BulkDownloadResponse") {
    val requestId = text("request_id") /* null */ /* ID of the bulk request. */

    /**
     * Create an entity of type BulkDownloadResponse from the model
     */
    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean) = BulkDownloadResponse(
        requestId = row[requestId]  /* kotlin.String? */ /* ID of the bulk request. */
    )

    /**
    * Assign all the columns from the entity of type BulkDownloadResponse to the DML expression.
    *
    * Usage:
    *
    * ```kotlin
    * let entity = BulkDownloadResponse()
    * database.update(BulkDownloadResponses, {
    *     assignFrom(entity)
    * })
    * ```
    * @return the builder with the columns for the update or insert.
    */
    fun AssignmentsBuilder.assignFrom(entity: BulkDownloadResponse) {
        this.apply {
            set(BulkDownloadResponses.requestId, entity.requestId)
        }
    }

}


