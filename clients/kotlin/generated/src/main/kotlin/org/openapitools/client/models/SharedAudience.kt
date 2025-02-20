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

import org.openapitools.client.models.OperationType

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param audienceId Unique identifier of an audience
 * @param operationType 
 * @param recipientAccountIds List of ad account IDs to share with or revoke from.
 */


data class SharedAudience (

    /* Unique identifier of an audience */
    @Json(name = "audience_id")
    val audienceId: kotlin.String,

    @Json(name = "operation_type")
    val operationType: OperationType,

    /* List of ad account IDs to share with or revoke from. */
    @Json(name = "recipient_account_ids")
    val recipientAccountIds: kotlin.collections.List<kotlin.String>

) {


}

