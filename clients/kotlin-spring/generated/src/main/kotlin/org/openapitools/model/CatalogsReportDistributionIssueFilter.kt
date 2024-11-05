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
 * @param catalogId Unique identifier of a catalog. If not given, oldest catalog will be used
 */
data class CatalogsReportDistributionIssueFilter(

    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("report_type", required = true) val reportType: CatalogsReportDistributionIssueFilter.ReportType,

    @get:Pattern(regexp="^\\d+$")
    @Schema(example = "null", description = "Unique identifier of a catalog. If not given, oldest catalog will be used")
    @get:JsonProperty("catalog_id") val catalogId: kotlin.String? = null
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

