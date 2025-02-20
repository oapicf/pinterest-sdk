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
 * An object containing the permissions a business partner has on the asset.
 * @param assetId Unique identifier of a business asset.
 * @param assetType Type of asset. Currently we only support AD_ACCOUNT and PROFILE, and ASSET_GROUP.
 * @param partnerId Unique identifier of a business partner.
 * @param permissions Permission levels member or partner has on an asset.
 */
object UpdatePartnerAssetsResults : BaseTable<UpdatePartnerAssetsResult>("UpdatePartnerAssetsResult") {
    val assetId = text("asset_id") /* null */ /* Unique identifier of a business asset. */
    val assetType = text("asset_type") /* null */ /* Type of asset. Currently we only support AD_ACCOUNT and PROFILE, and ASSET_GROUP. */
    val partnerId = text("partner_id") /* null */ /* Unique identifier of a business partner. */

    /**
     * Create an entity of type UpdatePartnerAssetsResult from the model
     */
    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean) = UpdatePartnerAssetsResult(
        assetId = row[assetId]  /* kotlin.String? */ /* Unique identifier of a business asset. */,
        assetType = row[assetType]  /* kotlin.String? */ /* Type of asset. Currently we only support AD_ACCOUNT and PROFILE, and ASSET_GROUP. */,
        partnerId = row[partnerId]  /* kotlin.String? */ /* Unique identifier of a business partner. */,
        permissions = emptyList() /* kotlin.Array<kotlin.String>? */ /* Permission levels member or partner has on an asset. */
    )

    /**
    * Assign all the columns from the entity of type UpdatePartnerAssetsResult to the DML expression.
    *
    * Usage:
    *
    * ```kotlin
    * let entity = UpdatePartnerAssetsResult()
    * database.update(UpdatePartnerAssetsResults, {
    *     assignFrom(entity)
    * })
    * ```
    * @return the builder with the columns for the update or insert.
    */
    fun AssignmentsBuilder.assignFrom(entity: UpdatePartnerAssetsResult) {
        this.apply {
            set(UpdatePartnerAssetsResults.assetId, entity.assetId)
            set(UpdatePartnerAssetsResults.assetType, entity.assetType)
            set(UpdatePartnerAssetsResults.partnerId, entity.partnerId)
        }
    }

}


object UpdatePartnerAssetsResultPermissions : BaseTable<Pair<kotlin.Long, kotlin.String>>("UpdatePartnerAssetsResultPermissions") {
    val updatePartnerAssetsResult = long("updatePartnerAssetsResult")
    val permissions = text("permissions")

    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean): Pair<kotlin.Long, kotlin.String> =
        Pair(row[updatePartnerAssetsResult] ?: 0, row[permissions] ?: "")

    fun AssignmentsBuilder.assignFrom(entity: Pair<kotlin.Long, kotlin.String>) {
        this.apply {
            set(UpdatePartnerAssetsResultPermissions.updatePartnerAssetsResult, entity.first)
            set(UpdatePartnerAssetsResultPermissions.permissions, entity.second)
        }
    }

}

