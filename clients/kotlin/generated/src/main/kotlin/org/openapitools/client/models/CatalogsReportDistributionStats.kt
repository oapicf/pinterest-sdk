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
 * @param reportType 
 * @param catalogId ID of the catalog entity.
 * @param code The event code that a diagnostics aggregated number references
 * @param codeLabel A human-friendly label for the event code (e.g, 'SPAM')
 * @param message Title message describing the diagnostic issue
 * @param occurrences Number of occurrences of the issue
 * @param ineligibleForAds Indicates if issue makes items ineligible for ads distribution
 * @param ineligibleForOrganic Indicates if issue makes items ineligible for organic distribution
 */


data class CatalogsReportDistributionStats (

    @Json(name = "report_type")
    val reportType: CatalogsReportDistributionStats.ReportType? = null,

    /* ID of the catalog entity. */
    @Json(name = "catalog_id")
    val catalogId: kotlin.String? = null,

    /* The event code that a diagnostics aggregated number references */
    @Json(name = "code")
    val code: kotlin.Int? = null,

    /* A human-friendly label for the event code (e.g, 'SPAM') */
    @Json(name = "code_label")
    val codeLabel: kotlin.String? = null,

    /* Title message describing the diagnostic issue */
    @Json(name = "message")
    val message: kotlin.String? = null,

    /* Number of occurrences of the issue */
    @Json(name = "occurrences")
    val occurrences: kotlin.Int? = null,

    /* Indicates if issue makes items ineligible for ads distribution */
    @Json(name = "ineligible_for_ads")
    val ineligibleForAds: kotlin.Boolean? = null,

    /* Indicates if issue makes items ineligible for organic distribution */
    @Json(name = "ineligible_for_organic")
    val ineligibleForOrganic: kotlin.Boolean? = null

) {

    /**
     * 
     *
     * Values: DISTRIBUTION_ISSUES
     */
    @JsonClass(generateAdapter = false)
    enum class ReportType(val value: kotlin.String) {
        @Json(name = "DISTRIBUTION_ISSUES") DISTRIBUTION_ISSUES("DISTRIBUTION_ISSUES");
    }

}

