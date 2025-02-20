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
package org.openapitools.server.api.model


        
import com.google.gson.annotations.SerializedName
import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonInclude
/**
 * An object containing the permissions a business member has on the asset.
 * @param assetId Unique identifier of a business asset.
 * @param memberId Unique identifier of the business member with asset access.
 * @param permissions Permission levels member or partner has on an asset.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
data class UsersForIndividualAssetResponse (
    /* Unique identifier of a business asset. */
    val assetId: kotlin.String? = null,
    /* Unique identifier of the business member with asset access. */
    val memberId: kotlin.String? = null,
    /* Permission levels member or partner has on an asset. */
    val permissions: kotlin.Array<kotlin.String>? = null
) {

}

