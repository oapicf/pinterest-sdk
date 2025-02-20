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

import org.openapitools.client.models.BusinessRoleForMembers

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param memberId Unique identifier of the member
 * @param businessRole 
 */


data class MembersToDeleteBodyMembersInner (

    /* Unique identifier of the member */
    @Json(name = "member_id")
    val memberId: kotlin.String,

    @Json(name = "business_role")
    val businessRole: BusinessRoleForMembers

) {


}

