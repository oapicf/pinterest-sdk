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
 * 
 * @param username Username
 * @param type Always \"user\"
 */
object UserSummarys : BaseTable<UserSummary>("UserSummary") {
    val username = text("username") /* null */ /* Username */
    val type = text("type") /* null */ /* Always \"user\" */

    /**
     * Create an entity of type UserSummary from the model
     */
    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean) = UserSummary(
        username = row[username]  /* kotlin.String? */ /* Username */,
        type = row[type]  /* kotlin.String? */ /* Always \"user\" */
    )

    /**
    * Assign all the columns from the entity of type UserSummary to the DML expression.
    *
    * Usage:
    *
    * ```kotlin
    * let entity = UserSummary()
    * database.update(UserSummarys, {
    *     assignFrom(entity)
    * })
    * ```
    * @return the builder with the columns for the update or insert.
    */
    fun AssignmentsBuilder.assignFrom(entity: UserSummary) {
        this.apply {
            set(UserSummarys.username, entity.username)
            set(UserSummarys.type, entity.type)
        }
    }

}

