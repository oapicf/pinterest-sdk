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
 * @param reportStatus 
 * @param url 
 * @param propertySize 
 */


data class GetMMMReportResponseData (

    @Json(name = "report_status")
    val reportStatus: GetMMMReportResponseData.ReportStatus? = null,

    @Json(name = "url")
    val url: kotlin.String? = null,

    @Json(name = "size")
    val propertySize: java.math.BigDecimal? = null

) {

    /**
     * 
     *
     * Values: DOES_NOT_EXIST,FINISHED,IN_PROGRESS,EXPIRED,FAILED,CANCELLED
     */
    @JsonClass(generateAdapter = false)
    enum class ReportStatus(val value: kotlin.String) {
        @Json(name = "DOES_NOT_EXIST") DOES_NOT_EXIST("DOES_NOT_EXIST"),
        @Json(name = "FINISHED") FINISHED("FINISHED"),
        @Json(name = "IN_PROGRESS") IN_PROGRESS("IN_PROGRESS"),
        @Json(name = "EXPIRED") EXPIRED("EXPIRED"),
        @Json(name = "FAILED") FAILED("FAILED"),
        @Json(name = "CANCELLED") CANCELLED("CANCELLED");
    }

}

