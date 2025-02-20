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
 * @param assetGroupName Asset Group name
 * @param assetGroupDescription Asset group description
 * @param assetGroupTypes Asset Group Types. Note: The asset group types are used for user reference and categorization purposes only and do not impact the functionality of the asset group.
 */
object CreateAssetGroupBodys : BaseTable<CreateAssetGroupBody>("CreateAssetGroupBody") {
    val assetGroupName = text("asset_group_name") /* Asset Group name */
    val assetGroupDescription = text("asset_group_description") /* Asset group description */

    /**
     * Create an entity of type CreateAssetGroupBody from the model
     */
    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean) = CreateAssetGroupBody(
        assetGroupName = row[assetGroupName] ?: "" /* kotlin.String */ /* Asset Group name */,
        assetGroupDescription = row[assetGroupDescription] ?: "" /* kotlin.String */ /* Asset group description */,
        assetGroupTypes = emptyList() /* kotlin.Array<AssetGroupType> */ /* Asset Group Types. Note: The asset group types are used for user reference and categorization purposes only and do not impact the functionality of the asset group. */
    )

    /**
    * Assign all the columns from the entity of type CreateAssetGroupBody to the DML expression.
    *
    * Usage:
    *
    * ```kotlin
    * let entity = CreateAssetGroupBody()
    * database.update(CreateAssetGroupBodys, {
    *     assignFrom(entity)
    * })
    * ```
    * @return the builder with the columns for the update or insert.
    */
    fun AssignmentsBuilder.assignFrom(entity: CreateAssetGroupBody) {
        this.apply {
            set(CreateAssetGroupBodys.assetGroupName, entity.assetGroupName)
            set(CreateAssetGroupBodys.assetGroupDescription, entity.assetGroupDescription)
        }
    }

}


object CreateAssetGroupBodyAssetGroupType : BaseTable<Pair<kotlin.Long, kotlin.Long>>("CreateAssetGroupBodyAssetGroupType") {
    val createAssetGroupBody = long("createAssetGroupBody")
    val assetGroupType = long("assetGroupType")

    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean): Pair<kotlin.Long, kotlin.Long> =
        Pair(row[createAssetGroupBody] ?: 0, row[assetGroupType] ?: 0)

    fun AssignmentsBuilder.assignFrom(entity: Pair<kotlin.Long, kotlin.Long>) {
        this.apply {
            set(CreateAssetGroupBodyAssetGroupType.createAssetGroupBody, entity.first)
            set(CreateAssetGroupBodyAssetGroupType.assetGroupType, entity.second)
        }
    }

}

