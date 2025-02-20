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
 * The terminated asset access.
 * @param assetId Unique identifier of the business asset.
 * @param memberId Unique identifier of the business member.
 */
object DeleteMemberAccessResults : BaseTable<DeleteMemberAccessResult>("DeleteMemberAccessResult") {
    val assetId = text("asset_id") /* null */ /* Unique identifier of the business asset. */
    val memberId = text("member_id") /* null */ /* Unique identifier of the business member. */

    /**
     * Create an entity of type DeleteMemberAccessResult from the model
     */
    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean) = DeleteMemberAccessResult(
        assetId = row[assetId]  /* kotlin.String? */ /* Unique identifier of the business asset. */,
        memberId = row[memberId]  /* kotlin.String? */ /* Unique identifier of the business member. */
    )

    /**
    * Assign all the columns from the entity of type DeleteMemberAccessResult to the DML expression.
    *
    * Usage:
    *
    * ```kotlin
    * let entity = DeleteMemberAccessResult()
    * database.update(DeleteMemberAccessResults, {
    *     assignFrom(entity)
    * })
    * ```
    * @return the builder with the columns for the update or insert.
    */
    fun AssignmentsBuilder.assignFrom(entity: DeleteMemberAccessResult) {
        this.apply {
            set(DeleteMemberAccessResults.assetId, entity.assetId)
            set(DeleteMemberAccessResults.memberId, entity.memberId)
        }
    }

}


