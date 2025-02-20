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
 * @param assetGroupId Unique identifier of the asset group to update.
 * @param name Asset Group name
 * @param description Asset group description
 * @param assetGroupTypes Asset Group Types. Note: The asset group types are used for user reference and categorization purposes only and do not impact the functionality of the asset group.
 * @param assetsToAdd A list of asset ids to add to the asset group.
 * @param assetsToRemove A list of asset ids to remove from the asset group.
 */
object UpdateAssetGroupBodyAssetGroupsToUpdateInners : BaseTable<UpdateAssetGroupBodyAssetGroupsToUpdateInner>("UpdateAssetGroupBody_asset_groups_to_update_inner") {
    val assetGroupId = text("asset_group_id") /* Unique identifier of the asset group to update. */
    val name = text("name") /* null */ /* Asset Group name */
    val description = text("description") /* null */ /* Asset group description */

    /**
     * Create an entity of type UpdateAssetGroupBodyAssetGroupsToUpdateInner from the model
     */
    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean) = UpdateAssetGroupBodyAssetGroupsToUpdateInner(
        assetGroupId = row[assetGroupId] ?: "" /* kotlin.String */ /* Unique identifier of the asset group to update. */,
        name = row[name]  /* kotlin.String? */ /* Asset Group name */,
        description = row[description]  /* kotlin.String? */ /* Asset group description */,
        assetGroupTypes = emptyList() /* kotlin.Array<AssetGroupType>? */ /* Asset Group Types. Note: The asset group types are used for user reference and categorization purposes only and do not impact the functionality of the asset group. */,
        assetsToAdd = emptyList() /* kotlin.Array<kotlin.String>? */ /* A list of asset ids to add to the asset group. */,
        assetsToRemove = emptyList() /* kotlin.Array<kotlin.String>? */ /* A list of asset ids to remove from the asset group. */
    )

    /**
    * Assign all the columns from the entity of type UpdateAssetGroupBodyAssetGroupsToUpdateInner to the DML expression.
    *
    * Usage:
    *
    * ```kotlin
    * let entity = UpdateAssetGroupBodyAssetGroupsToUpdateInner()
    * database.update(UpdateAssetGroupBodyAssetGroupsToUpdateInners, {
    *     assignFrom(entity)
    * })
    * ```
    * @return the builder with the columns for the update or insert.
    */
    fun AssignmentsBuilder.assignFrom(entity: UpdateAssetGroupBodyAssetGroupsToUpdateInner) {
        this.apply {
            set(UpdateAssetGroupBodyAssetGroupsToUpdateInners.assetGroupId, entity.assetGroupId)
            set(UpdateAssetGroupBodyAssetGroupsToUpdateInners.name, entity.name)
            set(UpdateAssetGroupBodyAssetGroupsToUpdateInners.description, entity.description)
        }
    }

}


object UpdateAssetGroupBodyAssetGroupsToUpdateInnerAssetGroupType : BaseTable<Pair<kotlin.Long, kotlin.Long>>("UpdateAssetGroupBodyAssetGroupsToUpdateInnerAssetGroupType") {
    val updateAssetGroupBodyAssetGroupsToUpdateInner = long("updateAssetGroupBodyAssetGroupsToUpdateInner")
    val assetGroupType = long("assetGroupType")

    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean): Pair<kotlin.Long, kotlin.Long> =
        Pair(row[updateAssetGroupBodyAssetGroupsToUpdateInner] ?: 0, row[assetGroupType] ?: 0)

    fun AssignmentsBuilder.assignFrom(entity: Pair<kotlin.Long, kotlin.Long>) {
        this.apply {
            set(UpdateAssetGroupBodyAssetGroupsToUpdateInnerAssetGroupType.updateAssetGroupBodyAssetGroupsToUpdateInner, entity.first)
            set(UpdateAssetGroupBodyAssetGroupsToUpdateInnerAssetGroupType.assetGroupType, entity.second)
        }
    }

}

object UpdateAssetGroupBodyAssetGroupsToUpdateInnerAssetsToAdd : BaseTable<Pair<kotlin.Long, kotlin.String>>("UpdateAssetGroupBodyAssetGroupsToUpdateInnerAssetsToAdd") {
    val updateAssetGroupBodyAssetGroupsToUpdateInner = long("updateAssetGroupBodyAssetGroupsToUpdateInner")
    val assetsToAdd = text("assetsToAdd")

    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean): Pair<kotlin.Long, kotlin.String> =
        Pair(row[updateAssetGroupBodyAssetGroupsToUpdateInner] ?: 0, row[assetsToAdd] ?: "")

    fun AssignmentsBuilder.assignFrom(entity: Pair<kotlin.Long, kotlin.String>) {
        this.apply {
            set(UpdateAssetGroupBodyAssetGroupsToUpdateInnerAssetsToAdd.updateAssetGroupBodyAssetGroupsToUpdateInner, entity.first)
            set(UpdateAssetGroupBodyAssetGroupsToUpdateInnerAssetsToAdd.assetsToAdd, entity.second)
        }
    }

}

object UpdateAssetGroupBodyAssetGroupsToUpdateInnerAssetsToRemove : BaseTable<Pair<kotlin.Long, kotlin.String>>("UpdateAssetGroupBodyAssetGroupsToUpdateInnerAssetsToRemove") {
    val updateAssetGroupBodyAssetGroupsToUpdateInner = long("updateAssetGroupBodyAssetGroupsToUpdateInner")
    val assetsToRemove = text("assetsToRemove")

    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean): Pair<kotlin.Long, kotlin.String> =
        Pair(row[updateAssetGroupBodyAssetGroupsToUpdateInner] ?: 0, row[assetsToRemove] ?: "")

    fun AssignmentsBuilder.assignFrom(entity: Pair<kotlin.Long, kotlin.String>) {
        this.apply {
            set(UpdateAssetGroupBodyAssetGroupsToUpdateInnerAssetsToRemove.updateAssetGroupBodyAssetGroupsToUpdateInner, entity.first)
            set(UpdateAssetGroupBodyAssetGroupsToUpdateInnerAssetsToRemove.assetsToRemove, entity.second)
        }
    }

}

