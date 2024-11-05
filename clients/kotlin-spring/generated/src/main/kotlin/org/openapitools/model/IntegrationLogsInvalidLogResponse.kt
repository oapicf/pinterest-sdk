package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.IntegrationLogsInvalidLogResponseRejectedLogsInner
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
 * Schema describing the response when a log has invalid fields.
 * @param rejectedLogs 
 */
data class IntegrationLogsInvalidLogResponse(

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("rejected_logs") val rejectedLogs: kotlin.collections.List<IntegrationLogsInvalidLogResponseRejectedLogsInner>? = null
    ) {

}

