package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.DataOutputFormat
import org.openapitools.model.MetricsReportingLevel
import org.openapitools.model.ReportingColumnAsync
import javax.validation.constraints.DecimalMax
import javax.validation.constraints.DecimalMin
import javax.validation.constraints.Max
import javax.validation.constraints.Min
import javax.validation.constraints.NotNull
import javax.validation.constraints.Pattern
import javax.validation.constraints.Size
import javax.validation.Valid

/**
 * 
 * @param columns Metric and entity columns
 * @param level Level of the report
 * @param reportFormat Specification for formatting report data
 */
data class AdsAnalyticsCreateAsyncRequestAllOf1(

    @field:Valid
    @field:JsonProperty("columns", required = true) val columns: kotlin.collections.List<ReportingColumnAsync>,

    @field:Valid
    @field:JsonProperty("level", required = true) val level: MetricsReportingLevel,

    @field:Valid
    @field:JsonProperty("report_format") val reportFormat: DataOutputFormat? = "JSON"
) {

}

