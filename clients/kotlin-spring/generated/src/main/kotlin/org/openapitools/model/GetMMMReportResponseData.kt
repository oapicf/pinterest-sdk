package org.openapitools.model

import java.util.Objects
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
 * @param reportStatus 
 * @param url 
 * @param propertySize 
 */
data class GetMMMReportResponseData(

    @Schema(example = "null", description = "")
    @get:JsonProperty("report_status") val reportStatus: GetMMMReportResponseData.ReportStatus? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("url") val url: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("size") val propertySize: java.math.BigDecimal? = null
) {

    /**
    * 
    * Values: DOES_NOT_EXIST,FINISHED,IN_PROGRESS,EXPIRED,FAILED,CANCELLED
    */
    enum class ReportStatus(val value: kotlin.String) {

        @JsonProperty("DOES_NOT_EXIST") DOES_NOT_EXIST("DOES_NOT_EXIST"),
        @JsonProperty("FINISHED") FINISHED("FINISHED"),
        @JsonProperty("IN_PROGRESS") IN_PROGRESS("IN_PROGRESS"),
        @JsonProperty("EXPIRED") EXPIRED("EXPIRED"),
        @JsonProperty("FAILED") FAILED("FAILED"),
        @JsonProperty("CANCELLED") CANCELLED("CANCELLED")
    }

}

