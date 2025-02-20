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
 * @param audienceId Audience ID that was shared
 * @param permissions 
 */
object SharedAudienceResponseCommons : BaseTable<SharedAudienceResponseCommon>("SharedAudienceResponseCommon") {
    val audienceId = text("audience_id") /* null */ /* Audience ID that was shared */

    /**
     * Create an entity of type SharedAudienceResponseCommon from the model
     */
    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean) = SharedAudienceResponseCommon(
        audienceId = row[audienceId]  /* kotlin.String? */ /* Audience ID that was shared */,
        permissions = emptyList() /* kotlin.Array<Role>? */
    )

    /**
    * Assign all the columns from the entity of type SharedAudienceResponseCommon to the DML expression.
    *
    * Usage:
    *
    * ```kotlin
    * let entity = SharedAudienceResponseCommon()
    * database.update(SharedAudienceResponseCommons, {
    *     assignFrom(entity)
    * })
    * ```
    * @return the builder with the columns for the update or insert.
    */
    fun AssignmentsBuilder.assignFrom(entity: SharedAudienceResponseCommon) {
        this.apply {
            set(SharedAudienceResponseCommons.audienceId, entity.audienceId)
        }
    }

}


object SharedAudienceResponseCommonRole : BaseTable<Pair<kotlin.Long, kotlin.Long>>("SharedAudienceResponseCommonRole") {
    val sharedAudienceResponseCommon = long("sharedAudienceResponseCommon")
    val role = long("role")

    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean): Pair<kotlin.Long, kotlin.Long> =
        Pair(row[sharedAudienceResponseCommon] ?: 0, row[role] ?: 0)

    fun AssignmentsBuilder.assignFrom(entity: Pair<kotlin.Long, kotlin.Long>) {
        this.apply {
            set(SharedAudienceResponseCommonRole.sharedAudienceResponseCommon, entity.first)
            set(SharedAudienceResponseCommonRole.role, entity.second)
        }
    }

}

