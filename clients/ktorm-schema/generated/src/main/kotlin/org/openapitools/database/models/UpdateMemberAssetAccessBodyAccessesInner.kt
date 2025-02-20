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
 * @param assetId Id of the asset to update.
 * @param memberId Unique identifier of the member on which to perform the update
 * @param permissions A non-empty array of permissions to assign to the member.
 */
object UpdateMemberAssetAccessBodyAccessesInners : BaseTable<UpdateMemberAssetAccessBodyAccessesInner>("UpdateMemberAssetAccessBody_accesses_inner") {
    val assetId = text("asset_id") /* Id of the asset to update. */
    val memberId = text("member_id") /* Unique identifier of the member on which to perform the update */

    /**
     * Create an entity of type UpdateMemberAssetAccessBodyAccessesInner from the model
     */
    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean) = UpdateMemberAssetAccessBodyAccessesInner(
        assetId = row[assetId] ?: "" /* kotlin.String */ /* Id of the asset to update. */,
        memberId = row[memberId] ?: "" /* kotlin.String */ /* Unique identifier of the member on which to perform the update */,
        permissions = emptyList() /* kotlin.Array<Permissions> */ /* A non-empty array of permissions to assign to the member. */
    )

    /**
    * Assign all the columns from the entity of type UpdateMemberAssetAccessBodyAccessesInner to the DML expression.
    *
    * Usage:
    *
    * ```kotlin
    * let entity = UpdateMemberAssetAccessBodyAccessesInner()
    * database.update(UpdateMemberAssetAccessBodyAccessesInners, {
    *     assignFrom(entity)
    * })
    * ```
    * @return the builder with the columns for the update or insert.
    */
    fun AssignmentsBuilder.assignFrom(entity: UpdateMemberAssetAccessBodyAccessesInner) {
        this.apply {
            set(UpdateMemberAssetAccessBodyAccessesInners.assetId, entity.assetId)
            set(UpdateMemberAssetAccessBodyAccessesInners.memberId, entity.memberId)
        }
    }

}


object UpdateMemberAssetAccessBodyAccessesInnerPermissions : BaseTable<Pair<kotlin.Long, kotlin.Long>>("UpdateMemberAssetAccessBodyAccessesInnerPermissions") {
    val updateMemberAssetAccessBodyAccessesInner = long("updateMemberAssetAccessBodyAccessesInner")
    val permissions = long("permissions")

    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean): Pair<kotlin.Long, kotlin.Long> =
        Pair(row[updateMemberAssetAccessBodyAccessesInner] ?: 0, row[permissions] ?: 0)

    fun AssignmentsBuilder.assignFrom(entity: Pair<kotlin.Long, kotlin.Long>) {
        this.apply {
            set(UpdateMemberAssetAccessBodyAccessesInnerPermissions.updateMemberAssetAccessBodyAccessesInner, entity.first)
            set(UpdateMemberAssetAccessBodyAccessesInnerPermissions.permissions, entity.second)
        }
    }

}

