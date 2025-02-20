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
 * @param code 
 * @param message 
 */
object Errors : BaseTable<Error>("Error") {
    val code = int("code")
    val message = text("message")

    /**
     * Create an entity of type Error from the model
     */
    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean) = Error(
        code = row[code] ?: 0 /* kotlin.Int */,
        message = row[message] ?: "" /* kotlin.String */
    )

    /**
    * Assign all the columns from the entity of type Error to the DML expression.
    *
    * Usage:
    *
    * ```kotlin
    * let entity = Error()
    * database.update(Errors, {
    *     assignFrom(entity)
    * })
    * ```
    * @return the builder with the columns for the update or insert.
    */
    fun AssignmentsBuilder.assignFrom(entity: Error) {
        this.apply {
            set(Errors.code, entity.code)
            set(Errors.message, entity.message)
        }
    }

}


