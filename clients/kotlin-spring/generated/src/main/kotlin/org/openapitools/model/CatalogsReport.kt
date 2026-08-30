package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSetter
import com.fasterxml.jackson.annotation.JsonValue
import com.fasterxml.jackson.annotation.Nulls
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
 * @param propertySize Size of the report in bytes
 * @param url URL to download the report
 */
data class CatalogsReport(

    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("report_status")
    @get:JsonProperty("report_status") val reportStatus: CatalogsReport.ReportStatus? = null,

    @Schema(description = "Size of the report in bytes")
    @param:JsonProperty("size")
    @get:JsonProperty("size") val propertySize: java.math.BigDecimal? = null,

    @Schema(description = "URL to download the report")
    @param:JsonProperty("url")
    @get:JsonProperty("url") val url: kotlin.String? = null
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
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'ReportStatus'")
            }
        }
    }

}

