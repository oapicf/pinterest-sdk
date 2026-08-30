package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSetter
import com.fasterxml.jackson.annotation.JsonValue
import com.fasterxml.jackson.annotation.Nulls
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
    @Schema(required = true, description = "")
    @param:JsonProperty("report_status")
    @get:JsonProperty("report_status", required = true) val reportStatus: BulkReportingJobStatus,

    @get:Size(max=18)
    @Schema(required = true, description = "Unique identifier of a template.")
    @param:JsonProperty("template_id")
    @get:JsonProperty("template_id", required = true) val templateId: kotlin.String,

    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("message")
    @get:JsonProperty("message") val message: kotlin.String? = null,

    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("token")
    @get:JsonProperty("token") val token: kotlin.String? = null
) {

}

