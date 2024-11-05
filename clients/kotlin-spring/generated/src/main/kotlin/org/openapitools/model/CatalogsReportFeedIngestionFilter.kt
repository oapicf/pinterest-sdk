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
 * @param feedId ID of the feed entity.
 * @param processingResultId Unique identifier of a feed processing result. It can be acquired from the \"id\" field of the \"items\" array within the response of the [List processing results for a given feed](/docs/api/v5/#operation/feed_processing_results/list). If not provided, default to most recent completed processing result.
 */
data class CatalogsReportFeedIngestionFilter(

    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("report_type", required = true) val reportType: CatalogsReportFeedIngestionFilter.ReportType,

    @get:Pattern(regexp="^\\d+$")
    @Schema(example = "null", required = true, description = "ID of the feed entity.")
    @get:JsonProperty("feed_id", required = true) val feedId: kotlin.String,

    @get:Pattern(regexp="^\\d+$")
    @Schema(example = "null", description = "Unique identifier of a feed processing result. It can be acquired from the \"id\" field of the \"items\" array within the response of the [List processing results for a given feed](/docs/api/v5/#operation/feed_processing_results/list). If not provided, default to most recent completed processing result.")
    @get:JsonProperty("processing_result_id") val processingResultId: kotlin.String? = null
    ) {

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
                return values().first{it -> it.value == value}
            }
        }
    }

}

