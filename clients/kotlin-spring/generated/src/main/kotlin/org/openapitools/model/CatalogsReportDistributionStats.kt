package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import javax.validation.constraints.DecimalMax
import javax.validation.constraints.DecimalMin
import javax.validation.constraints.Email
import javax.validation.constraints.Max
import javax.validation.constraints.Min
import javax.validation.constraints.NotNull
import javax.validation.constraints.Pattern
import javax.validation.constraints.Size
import javax.validation.Valid
import io.swagger.v3.oas.annotations.media.Schema

/**
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
data class CatalogsReportDistributionStats(

    @Schema(example = "null", description = "")
    @get:JsonProperty("report_type") val reportType: CatalogsReportDistributionStats.ReportType? = null,

    @get:Pattern(regexp="^\\d+$")
    @Schema(example = "null", description = "ID of the catalog entity.")
    @get:JsonProperty("catalog_id") val catalogId: kotlin.String? = null,

    @Schema(example = "null", description = "The event code that a diagnostics aggregated number references")
    @get:JsonProperty("code") val code: kotlin.Int? = null,

    @Schema(example = "SPAM", description = "A human-friendly label for the event code (e.g, 'SPAM')")
    @get:JsonProperty("code_label") val codeLabel: kotlin.String? = null,

    @Schema(example = "null", description = "Title message describing the diagnostic issue")
    @get:JsonProperty("message") val message: kotlin.String? = null,

    @Schema(example = "10", description = "Number of occurrences of the issue")
    @get:JsonProperty("occurrences") val occurrences: kotlin.Int? = null,

    @Schema(example = "true", description = "Indicates if issue makes items ineligible for ads distribution")
    @get:JsonProperty("ineligible_for_ads") val ineligibleForAds: kotlin.Boolean? = null,

    @Schema(example = "true", description = "Indicates if issue makes items ineligible for organic distribution")
    @get:JsonProperty("ineligible_for_organic") val ineligibleForOrganic: kotlin.Boolean? = null
    ) {

    /**
    * 
    * Values: DISTRIBUTION_ISSUES
    */
    enum class ReportType(@get:JsonValue val value: kotlin.String) {

        DISTRIBUTION_ISSUES("DISTRIBUTION_ISSUES");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): ReportType {
                return values().first{it -> it.value == value}
            }
        }
    }

}

