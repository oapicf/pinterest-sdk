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

import org.openapitools.client.models.Country

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param propertyValues 
 * @param negated 
 */


data class CatalogsProductGroupMultipleCountriesCriteria (

    @Json(name = "values")
    val propertyValues: kotlin.collections.List<Country>,

    @Json(name = "negated")
    val negated: kotlin.Boolean? = false

)
