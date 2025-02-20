/**
 *
 * Please note:
 * This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * Do not edit this file manually.
 *
 */

@file:Suppress(
    "ArrayInDataClass",
    "EnumEntryName",
    "RemoveRedundantQualifierName",
    "UnusedImport"
)

package org.openapitools.client.models

import org.openapitools.client.models.GetPartnerAssetsResponse

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param items List assets on which you granted access to your partner or assets on which your partner has granted you access.
 * @param bookmark 
 */


data class BusinessPartnerAssetAccessGet200Response (

    /* List assets on which you granted access to your partner or assets on which your partner has granted you access. */
    @Json(name = "items")
    val items: kotlin.collections.List<GetPartnerAssetsResponse>,

    @Json(name = "bookmark")
    val bookmark: kotlin.String? = null

) {


}

