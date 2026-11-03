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
 * @param message 
 * @param reportStatus 
 * @param propertySize 
 * @param status 
 * @param token 
 * @param url 
 */
data class MMMReport(

    @Schema(readOnly = true, description = "")
    @param:JsonProperty("message")
    @get:JsonProperty("message") val message: kotlin.String? = null,

    @field:Valid
    @Schema(readOnly = true, description = "")
    @param:JsonProperty("report_status")
    @get:JsonProperty("report_status") val reportStatus: BulkReportingJobStatus? = null,

    @Schema(readOnly = true, description = "")
    @param:JsonProperty("size")
    @get:JsonProperty("size") val propertySize: java.math.BigDecimal? = null,

    @Schema(example = "success", readOnly = true, description = "")
    @param:JsonProperty("status")
    @get:JsonProperty("status") val status: kotlin.String? = null,

    @Schema(readOnly = true, description = "")
    @param:JsonProperty("token")
    @get:JsonProperty("token") val token: kotlin.String? = null,

    @Schema(readOnly = true, description = "")
    @param:JsonProperty("url")
    @get:JsonProperty("url") val url: kotlin.String? = null
) {

}

