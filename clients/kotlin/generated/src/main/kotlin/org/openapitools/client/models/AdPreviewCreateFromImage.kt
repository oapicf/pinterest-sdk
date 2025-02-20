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
 * @param imageUrl Image URL.
 * @param title Title displayed below ad.
 */


data class AdPreviewCreateFromImage (

    /* Image URL. */
    @Json(name = "image_url")
    val imageUrl: kotlin.String,

    /* Title displayed below ad. */
    @Json(name = "title")
    val title: kotlin.String

) {


}

