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

import org.openapitools.client.models.CatalogsProductGroupFilterKeys

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param anyOf 
 */


data class CatalogsProductGroupFiltersRequestAnyOf (

    @Json(name = "any_of")
    val anyOf: kotlin.collections.List<CatalogsProductGroupFilterKeys>

) {


}

