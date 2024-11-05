package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSubTypes
import com.fasterxml.jackson.annotation.JsonTypeInfo
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.CatalogsReportDistributionStats
import org.openapitools.model.CatalogsReportFeedIngestionStats
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
 * Diagnostics aggregated numbers
 * @param reportType 
 * @param catalogId ID of the catalog entity.
 * @param code The event code that a diagnostics aggregated number references
 * @param codeLabel A human-friendly label for the event code (e.g, 'SPAM')
 * @param message Title message describing the diagnostic issue
 * @param occurrences Number of occurrences of the issue
 * @param severity An ERROR means that items have been dropped, while a WARN denotes that items have been ingested despite an issue
 * @param ineligibleForAds Indicates if issue makes items ineligible for ads distribution
 * @param ineligibleForOrganic Indicates if issue makes items ineligible for organic distribution
 */

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "report_type", visible = true)
@JsonSubTypes(
      JsonSubTypes.Type(value = CatalogsReportDistributionStats::class, name = "DISTRIBUTION_ISSUES"),
      JsonSubTypes.Type(value = CatalogsReportFeedIngestionStats::class, name = "FEED_INGESTION_ISSUES")
)

interface CatalogsReportStats{
                @get:Schema(example = "null", requiredMode = Schema.RequiredMode.REQUIRED, description = "")
        val reportType: CatalogsReportStats.ReportType

                @get:Schema(example = "null", description = "ID of the catalog entity.")
        val catalogId: kotlin.String? 

                @get:Schema(example = "null", description = "The event code that a diagnostics aggregated number references")
        val code: kotlin.Int? 

                @get:Schema(example = "SPAM", description = "A human-friendly label for the event code (e.g, 'SPAM')")
        val codeLabel: kotlin.String? 

                @get:Schema(example = "null", description = "Title message describing the diagnostic issue")
        val message: kotlin.String? 

                @get:Schema(example = "10", description = "Number of occurrences of the issue")
        val occurrences: kotlin.Int? 

                @get:Schema(example = "null", description = "An ERROR means that items have been dropped, while a WARN denotes that items have been ingested despite an issue")
        val severity: CatalogsReportStats.Severity? 

                @get:Schema(example = "true", description = "Indicates if issue makes items ineligible for ads distribution")
        val ineligibleForAds: kotlin.Boolean? 

                @get:Schema(example = "true", description = "Indicates if issue makes items ineligible for organic distribution")
        val ineligibleForOrganic: kotlin.Boolean? 


    /**
    * 
    * Values: FEED_INGESTION_ISSUES,DISTRIBUTION_ISSUES
    */
    enum class ReportType(@get:JsonValue val value: kotlin.String) {

        FEED_INGESTION_ISSUES("FEED_INGESTION_ISSUES"),
        DISTRIBUTION_ISSUES("DISTRIBUTION_ISSUES");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): ReportType {
                return values().first{it -> it.value == value}
            }
        }
    }

    /**
    * An ERROR means that items have been dropped, while a WARN denotes that items have been ingested despite an issue
    * Values: WARN,ERROR
    */
    enum class Severity(@get:JsonValue val value: kotlin.String) {

        WARN("WARN"),
        ERROR("ERROR");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): Severity {
                return values().first{it -> it.value == value}
            }
        }
    }

}

