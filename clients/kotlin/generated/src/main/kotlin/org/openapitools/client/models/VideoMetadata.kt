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
 * @param itemType 
 * @param coverImageUrl 
 * @param videoUrl Video url (720p). </p><strong>Note:</strong> This field is limited and not available to all apps.
 * @param duration Duration (in milliseconds)
 * @param height Height (in pixels)
 * @param width Width (in pixels)
 */


data class VideoMetadata (

    @Json(name = "item_type")
    val itemType: kotlin.String? = null,

    @Json(name = "cover_image_url")
    val coverImageUrl: kotlin.String? = null,

    /* Video url (720p). </p><strong>Note:</strong> This field is limited and not available to all apps. */
    @Json(name = "video_url")
    val videoUrl: kotlin.String? = null,

    /* Duration (in milliseconds) */
    @Json(name = "duration")
    val duration: java.math.BigDecimal? = null,

    /* Height (in pixels) */
    @Json(name = "height")
    val height: kotlin.Int? = null,

    /* Width (in pixels) */
    @Json(name = "width")
    val width: kotlin.Int? = null

) {


}

