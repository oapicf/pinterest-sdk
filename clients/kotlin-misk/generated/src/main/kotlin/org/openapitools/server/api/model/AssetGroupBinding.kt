package org.openapitools.server.api.model

import org.openapitools.server.api.model.BusinessAccessUserSummary
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class AssetGroupBinding(
    /** A list of ad account IDs under the asset group */
    val adAccountsIds: kotlin.collections.List<kotlin.String>,
    /** Asset group description */
    val assetGroupDescription: kotlin.String,
    /** Asset Group name */
    val assetGroupName: kotlin.String,
    /** Asset group types */
    val assetGroupTypes: kotlin.collections.List<kotlin.String>,
    /** A list of catalog IDs under asset group */
    val catalogsIds: kotlin.collections.List<kotlin.String>,
    /** The data of the user that created the asset group. */
    val createdBy: BusinessAccessUserSummary,
    /** The creation time of the asset group */
    val createdTime: kotlin.Int,
    /** Asset Group ID. */
    val id: kotlin.String,
    /** The data of the business that owns the asset group. */
    val owner: BusinessAccessUserSummary,
    /** A list of profile IDs under asset group */
    val profilesIds: kotlin.collections.List<kotlin.String>,
    /** The last update time of the asset group */
    val updatedTime: kotlin.Int
)
