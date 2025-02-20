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

import org.openapitools.client.models.CatalogsHotelReportParametersReport

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * Parameters for hotel report
 *
 * @param catalogType 
 * @param report 
 */


data class CatalogsHotelReportParameters (

    @Json(name = "catalog_type")
    val catalogType: CatalogsHotelReportParameters.CatalogType,

    @Json(name = "report")
    val report: CatalogsHotelReportParametersReport

) {

    /**
     * 
     *
     * Values: HOTEL
     */
    @JsonClass(generateAdapter = false)
    enum class CatalogType(val value: kotlin.String) {
        @Json(name = "HOTEL") HOTEL("HOTEL");
    }

}

