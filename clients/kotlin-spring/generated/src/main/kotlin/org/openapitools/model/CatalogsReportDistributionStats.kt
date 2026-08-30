package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSetter
import com.fasterxml.jackson.annotation.JsonValue
import com.fasterxml.jackson.annotation.Nulls
import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonSubTypes
import com.fasterxml.jackson.annotation.JsonTypeInfo
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
 * @param ineligibleForAds Indicates if issue makes items ineligible for ads distribution
 * @param ineligibleForOrganic Indicates if issue makes items ineligible for organic distribution
 * @param message Title message describing the diagnostic issue
 * @param occurrences Number of occurrences of the issue
 */
data class CatalogsReportDistributionStats(

    @Schema(required = true, description = "")
    @param:JsonProperty("report_type")
    @get:JsonProperty("report_type", required = true) override val reportType: CatalogsReportDistributionStats.ReportType = kotlin.String.DISTRIBUTION_ISSUES,

    @get:Pattern(regexp="^\\d+$")
    @Schema(description = "ID of the catalog entity.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("catalog_id")
    @get:JsonProperty("catalog_id") val catalogId: kotlin.String? = null,

    @Schema(description = "The event code that a diagnostics aggregated number references")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("code")
    @get:JsonProperty("code") val code: kotlin.Int? = null,

    @Schema(example = "SPAM", description = "A human-friendly label for the event code (e.g, 'SPAM')")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("code_label")
    @get:JsonProperty("code_label") val codeLabel: kotlin.String? = null,

    @Schema(example = "true", description = "Indicates if issue makes items ineligible for ads distribution")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("ineligible_for_ads")
    @get:JsonProperty("ineligible_for_ads") val ineligibleForAds: kotlin.Boolean? = null,

    @Schema(example = "true", description = "Indicates if issue makes items ineligible for organic distribution")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("ineligible_for_organic")
    @get:JsonProperty("ineligible_for_organic") val ineligibleForOrganic: kotlin.Boolean? = null,

    @Schema(description = "Title message describing the diagnostic issue")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("message")
    @get:JsonProperty("message") val message: kotlin.String? = null,

    @Schema(example = "10", description = "Number of occurrences of the issue")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("occurrences")
    @get:JsonProperty("occurrences") val occurrences: kotlin.Int? = null
) : CatalogsReportStats {

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
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'ReportType'")
            }
        }
    }

}

