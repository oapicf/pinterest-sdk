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
 * @param reportStatus 
 * @param url URL to download the report
 * @param propertySize Size of the report in bytes
 */
data class CatalogsReport(

    @Schema(example = "null", description = "")
    @get:JsonProperty("report_status") val reportStatus: CatalogsReport.ReportStatus? = null,

    @Schema(example = "null", description = "URL to download the report")
    @get:JsonProperty("url") val url: kotlin.String? = null,

    @Schema(example = "null", description = "Size of the report in bytes")
    @get:JsonProperty("size") val propertySize: java.math.BigDecimal? = null
    ) {

    /**
    * 
    * Values: FINISHED,IN_PROGRESS
    */
    enum class ReportStatus(@get:JsonValue val value: kotlin.String) {

        FINISHED("FINISHED"),
        IN_PROGRESS("IN_PROGRESS");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): ReportStatus {
                return values().first{it -> it.value == value}
            }
        }
    }

}

