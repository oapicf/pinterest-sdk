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
 * @param catalogId Unique identifier of a catalog. If not given, oldest catalog will be used
 */
data class CatalogsReportDistributionIssueFilter(

    @Schema(required = true, description = "")
    @param:JsonProperty("report_type")
    @get:JsonProperty("report_type", required = true) override val reportType: CatalogsReportDistributionIssueFilter.ReportType = kotlin.String.DISTRIBUTION_ISSUES,

    @get:Pattern(regexp="^\\d+$")
    @Schema(description = "Unique identifier of a catalog. If not given, oldest catalog will be used")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("catalog_id")
    @get:JsonProperty("catalog_id") val catalogId: kotlin.String? = null
) : CatalogsHotelReportParametersReport, CatalogsHotelReportStatsParametersReport, CatalogsRetailReportParametersReport, CatalogsRetailReportStatsParametersReport {

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

