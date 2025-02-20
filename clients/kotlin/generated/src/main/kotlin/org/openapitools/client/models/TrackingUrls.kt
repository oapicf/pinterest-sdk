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
 * Third-party tracking URLs. Up to three tracking URLs - with a max length of 2,000 - are supported for each event type. Tracking URLs set at the ad group or ad level can override those set at the campaign level. For more information, see <a href=\"https://help.pinterest.com/en/business/article/third-party-and-dynamic-tracking\" target=\"_blank\">Third-party and dynamic tracking</a>.
 *
 * @param impression 
 * @param click 
 * @param engagement 
 * @param buyableButton 
 * @param audienceVerification 
 */


data class TrackingUrls (

    @Json(name = "impression")
    val impression: kotlin.collections.List<kotlin.String>? = null,

    @Json(name = "click")
    val click: kotlin.collections.List<kotlin.String>? = null,

    @Json(name = "engagement")
    val engagement: kotlin.collections.List<kotlin.String>? = null,

    @Json(name = "buyable_button")
    val buyableButton: kotlin.collections.List<kotlin.String>? = null,

    @Json(name = "audience_verification")
    val audienceVerification: kotlin.collections.List<kotlin.String>? = null

) {


}

