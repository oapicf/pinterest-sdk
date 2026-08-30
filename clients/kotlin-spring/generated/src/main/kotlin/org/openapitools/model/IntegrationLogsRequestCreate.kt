package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.IntegrationLog
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
 * Resource create operation model.
 * @param logs 
 */
data class IntegrationLogsRequestCreate(

    @field:Valid
    @get:Size(min=1,max=250) 
    @Schema(required = true, description = "")
    @param:JsonProperty("logs")
    @get:JsonProperty("logs", required = true) val logs: kotlin.collections.List<IntegrationLog>
) {

}

