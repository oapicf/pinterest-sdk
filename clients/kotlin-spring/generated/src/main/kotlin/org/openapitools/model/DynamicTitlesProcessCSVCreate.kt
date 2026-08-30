package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
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
 * @param requestId The request_id returned from the GET uploads endpoint.
 */
data class DynamicTitlesProcessCSVCreate(

    @Schema(required = true, description = "The request_id returned from the GET uploads endpoint.")
    @param:JsonProperty("request_id")
    @get:JsonProperty("request_id", required = true) val requestId: kotlin.String
) {

}

