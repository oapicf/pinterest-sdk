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

import org.openapitools.client.models.CatalogsItemValidationIssues

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param items 
 * @param bookmark 
 */


data class ItemsIssuesList200Response (

    @Json(name = "items")
    val items: kotlin.collections.List<CatalogsItemValidationIssues>,

    @Json(name = "bookmark")
    val bookmark: kotlin.String? = null

)
