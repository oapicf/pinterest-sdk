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


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param id Subscription ID.
 * @param cryptographicKey Base64 encoded key for client to decrypt lead data.
 * @param cryptographicAlgorithm Lead data encryption algorithm.
 * @param createdTime Subscription creation time. Unix timestamp in milliseconds.
 */


data class AdAccountCreateSubscriptionResponse (

    /* Subscription ID. */
    @Json(name = "id")
    val id: kotlin.String? = null,

    /* Base64 encoded key for client to decrypt lead data. */
    @Json(name = "cryptographic_key")
    val cryptographicKey: kotlin.String? = null,

    /* Lead data encryption algorithm. */
    @Json(name = "cryptographic_algorithm")
    val cryptographicAlgorithm: kotlin.String? = null,

    /* Subscription creation time. Unix timestamp in milliseconds. */
    @Json(name = "created_time")
    val createdTime: kotlin.Int? = null

) {


}

