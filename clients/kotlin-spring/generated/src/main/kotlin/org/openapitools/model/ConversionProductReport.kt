package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.BulkReportingJobStatus
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
 * @param message Message returned from the create report request
 * @param reportStatus Async report status
 * @param propertySize Size of the report in bytes
 * @param token Token returned from the create report request
 * @param url URL of the report
 */
data class ConversionProductReport(

    @Schema(readOnly = true, description = "Message returned from the create report request")
    @param:JsonProperty("message")
    @get:JsonProperty("message") val message: kotlin.String? = null,

    @field:Valid
    @Schema(readOnly = true, description = "Async report status")
    @param:JsonProperty("report_status")
    @get:JsonProperty("report_status") val reportStatus: BulkReportingJobStatus? = null,

    @Schema(readOnly = true, description = "Size of the report in bytes")
    @param:JsonProperty("size")
    @get:JsonProperty("size") val propertySize: java.math.BigDecimal? = null,

    @Schema(readOnly = true, description = "Token returned from the create report request")
    @param:JsonProperty("token")
    @get:JsonProperty("token") val token: kotlin.String? = null,

    @Schema(readOnly = true, description = "URL of the report")
    @param:JsonProperty("url")
    @get:JsonProperty("url") val url: kotlin.String? = null
) {

}

