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
 * @param templateId Unique identifier of a template.
 * @param message 
 * @param token 
 */
data class TemplateBasedReport(

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("report_status", required = true) val reportStatus: BulkReportingJobStatus,

    @get:Size(max=18)
    @Schema(example = "null", required = true, description = "Unique identifier of a template.")
    @get:JsonProperty("template_id", required = true) val templateId: kotlin.String,

    @Schema(example = "null", description = "")
    @get:JsonProperty("message") val message: kotlin.String? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("token") val token: kotlin.String? = null
) {

}

