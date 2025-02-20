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

import org.openapitools.client.models.CatalogsHotelReportParameters
import org.openapitools.client.models.CatalogsHotelReportParametersReport
import org.openapitools.client.models.CatalogsRetailReportParameters
import org.openapitools.client.models.CatalogsType

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * Report parameters
 *
 * @param catalogType 
 * @param report 
 */


interface CatalogsReportParameters {

    @Json(name = "catalog_type")
    val catalogType: CatalogsType
    @Json(name = "report")
    val report: CatalogsHotelReportParametersReport

}

