package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSubTypes
import com.fasterxml.jackson.annotation.JsonTypeInfo
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.CatalogsReportDistributionIssueFilter
import org.openapitools.model.CatalogsReportFeedIngestionFilter
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
 * @param catalogId Unique identifier of a catalog. If not given, oldest catalog will be used
 */

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "report_type", visible = true)
@JsonSubTypes(
      JsonSubTypes.Type(value = CatalogsReportDistributionIssueFilter::class, name = "DISTRIBUTION_ISSUES"),
      JsonSubTypes.Type(value = CatalogsReportFeedIngestionFilter::class, name = "FEED_INGESTION_ISSUES")
)

interface CatalogsHotelReportParametersReport{
                @get:Schema(example = "null", requiredMode = Schema.RequiredMode.REQUIRED, description = "")
        val reportType: CatalogsHotelReportParametersReport.ReportType

                @get:Schema(example = "null", requiredMode = Schema.RequiredMode.REQUIRED, description = "ID of the feed entity.")
        val feedId: kotlin.String

                @get:Schema(example = "null", description = "")
        val reportType: CatalogsHotelReportParametersReport.ReportType? 

                @get:Schema(example = "null", description = "Unique identifier of a feed processing result. It can be acquired from the \"id\" field of the \"items\" array within the response of the [List processing results for a given feed](/docs/api/v5/#operation/feed_processing_results/list). If not provided, default to most recent completed processing result.")
        val processingResultId: kotlin.String? 

                @get:Schema(example = "null", description = "Unique identifier of a catalog. If not given, oldest catalog will be used")
        val catalogId: kotlin.String? 


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

}

