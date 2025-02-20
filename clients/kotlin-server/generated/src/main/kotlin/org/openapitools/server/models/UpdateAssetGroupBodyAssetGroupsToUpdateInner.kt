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
package org.openapitools.server.models

import org.openapitools.server.models.AssetGroupType

/**
 * 
 * @param assetGroupId Unique identifier of the asset group to update.
 * @param name Asset Group name
 * @param description Asset group description
 * @param assetGroupTypes Asset Group Types. Note: The asset group types are used for user reference and categorization purposes only and do not impact the functionality of the asset group.
 * @param assetsToAdd A list of asset ids to add to the asset group.
 * @param assetsToRemove A list of asset ids to remove from the asset group.
 */
data class UpdateAssetGroupBodyAssetGroupsToUpdateInner(
    /* Unique identifier of the asset group to update. */
    val assetGroupId: kotlin.String,
    /* Asset Group name */
    val name: kotlin.String? = null,
    /* Asset group description */
    val description: kotlin.String? = null,
    /* Asset Group Types. Note: The asset group types are used for user reference and categorization purposes only and do not impact the functionality of the asset group. */
    val assetGroupTypes: kotlin.collections.List<AssetGroupType>? = null,
    /* A list of asset ids to add to the asset group. */
    val assetsToAdd: kotlin.collections.List<kotlin.String>? = null,
    /* A list of asset ids to remove from the asset group. */
    val assetsToRemove: kotlin.collections.List<kotlin.String>? = null
) 

