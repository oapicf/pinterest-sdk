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
 * @param reportStatus 
 * @param token 
 * @param message 
 */
data class AdsAnalyticsCreateAsyncResponse(

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("report_status") val reportStatus: BulkReportingJobStatus? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("token") val token: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("message") val message: kotlin.String? = null
    ) {

}

