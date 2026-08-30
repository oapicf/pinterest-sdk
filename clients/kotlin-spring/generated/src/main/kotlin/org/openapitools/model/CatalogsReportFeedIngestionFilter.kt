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
 * @param feedId ID of the feed entity.
 * @param reportType 
 * @param processingResultId Unique identifier of a feed processing result. It can be acquired from the \"id\" field of the \"items\" array within the response of the [List processing results for a given feed](/docs/api/v5/#operation/feed_processing_results/list). If not provided, default to most recent completed processing result.
 */
data class CatalogsReportFeedIngestionFilter(

    @get:Pattern(regexp="^\\d+$")
    @Schema(required = true, description = "ID of the feed entity.")
    @param:JsonProperty("feed_id")
    @get:JsonProperty("feed_id", required = true) val feedId: kotlin.String,

    @Schema(required = true, description = "")
    @param:JsonProperty("report_type")
    @get:JsonProperty("report_type", required = true) override val reportType: CatalogsReportFeedIngestionFilter.ReportType = kotlin.String.FEED_INGESTION_ISSUES,

    @get:Pattern(regexp="^\\d+$")
    @Schema(description = "Unique identifier of a feed processing result. It can be acquired from the \"id\" field of the \"items\" array within the response of the [List processing results for a given feed](/docs/api/v5/#operation/feed_processing_results/list). If not provided, default to most recent completed processing result.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("processing_result_id")
    @get:JsonProperty("processing_result_id") val processingResultId: kotlin.String? = null
) : CatalogsHotelReportParametersReport, CatalogsHotelReportStatsParametersReport, CatalogsRetailReportParametersReport, CatalogsRetailReportStatsParametersReport {

    /**
    * 
    * Values: FEED_INGESTION_ISSUES
    */
    enum class ReportType(@get:JsonValue val value: kotlin.String) {

        FEED_INGESTION_ISSUES("FEED_INGESTION_ISSUES");

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

