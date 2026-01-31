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
 * Request to create test data for lead data test API.
 * @param answers Test lead answers. Should follow the creation order.
 */
data class LeadFormTestRequest(

    @Schema(example = "[\"John\",\"Doe\",\"abc@email.com\",\"987654321\"]", required = true, description = "Test lead answers. Should follow the creation order.")
    @get:JsonProperty("answers", required = true) val answers: kotlin.collections.List<kotlin.String>
) {

}

