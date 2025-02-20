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

import org.openapitools.client.models.BusinessAccessUserSummary

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * An invite object if the invite/request was successfully created. Will only be provided if the an invite/request is successfully created.
 *
 * @param id Unique identifier of the invite/request.
 * @param user Metadata for the member/partner that was sent the invite/request.
 */


data class CreateInvitesResultsResponseArrayItemsInnerInvite (

    /* Unique identifier of the invite/request. */
    @Json(name = "id")
    val id: kotlin.String? = null,

    /* Metadata for the member/partner that was sent the invite/request. */
    @Json(name = "user")
    val user: BusinessAccessUserSummary? = null

) {


}

