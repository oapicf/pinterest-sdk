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
 * @param leadsExportId ID for the leads export job
 */
object LeadsExportCreateResponses : BaseTable<LeadsExportCreateResponse>("LeadsExportCreateResponse") {
    val leadsExportId = text("leads_export_id") /* null */ /* ID for the leads export job */

    /**
     * Create an entity of type LeadsExportCreateResponse from the model
     */
    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean) = LeadsExportCreateResponse(
        leadsExportId = row[leadsExportId]  /* kotlin.String? */ /* ID for the leads export job */
    )

    /**
    * Assign all the columns from the entity of type LeadsExportCreateResponse to the DML expression.
    *
    * Usage:
    *
    * ```kotlin
    * let entity = LeadsExportCreateResponse()
    * database.update(LeadsExportCreateResponses, {
    *     assignFrom(entity)
    * })
    * ```
    * @return the builder with the columns for the update or insert.
    */
    fun AssignmentsBuilder.assignFrom(entity: LeadsExportCreateResponse) {
        this.apply {
            set(LeadsExportCreateResponses.leadsExportId, entity.leadsExportId)
        }
    }

}


