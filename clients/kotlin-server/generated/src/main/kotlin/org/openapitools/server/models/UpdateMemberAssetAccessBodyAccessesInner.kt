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

import org.openapitools.server.models.Permissions

/**
 * 
 * @param assetId Id of the asset to update.
 * @param memberId Unique identifier of the member on which to perform the update
 * @param permissions A non-empty array of permissions to assign to the member.
 */
data class UpdateMemberAssetAccessBodyAccessesInner(
    /* Id of the asset to update. */
    val assetId: kotlin.String,
    /* Unique identifier of the member on which to perform the update */
    val memberId: kotlin.String,
    /* A non-empty array of permissions to assign to the member. */
    val permissions: kotlin.collections.List<Permissions>
) 

