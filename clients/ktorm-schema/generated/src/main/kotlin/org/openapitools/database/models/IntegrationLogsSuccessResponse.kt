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
 * Response when logs are successfully processed.
 * @param message 
 */
object IntegrationLogsSuccessResponses : BaseTable<IntegrationLogsSuccessResponse>("IntegrationLogsSuccessResponse") {
    val message = text("message") /* null */

    /**
     * Create an entity of type IntegrationLogsSuccessResponse from the model
     */
    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean) = IntegrationLogsSuccessResponse(
        message = row[message]  /* kotlin.String? */
    )

    /**
    * Assign all the columns from the entity of type IntegrationLogsSuccessResponse to the DML expression.
    *
    * Usage:
    *
    * ```kotlin
    * let entity = IntegrationLogsSuccessResponse()
    * database.update(IntegrationLogsSuccessResponses, {
    *     assignFrom(entity)
    * })
    * ```
    * @return the builder with the columns for the update or insert.
    */
    fun AssignmentsBuilder.assignFrom(entity: IntegrationLogsSuccessResponse) {
        this.apply {
            set(IntegrationLogsSuccessResponses.message, entity.message)
        }
    }

}

