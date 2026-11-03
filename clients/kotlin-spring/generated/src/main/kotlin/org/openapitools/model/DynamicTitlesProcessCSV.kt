package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.DynamicTitlesProcessCSVError
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
 * @param errors List of validation errors. Empty on success.
 * @param status Processing status. Present on success.
 */
data class DynamicTitlesProcessCSV(

    @field:Valid
    @Schema(readOnly = true, description = "List of validation errors. Empty on success.")
    @param:JsonProperty("errors")
    @get:JsonProperty("errors") val errors: kotlin.collections.List<DynamicTitlesProcessCSVError>? = null,

    @Schema(example = "SUCCESS", readOnly = true, description = "Processing status. Present on success.")
    @param:JsonProperty("status")
    @get:JsonProperty("status") val status: kotlin.String? = null
) {

}

