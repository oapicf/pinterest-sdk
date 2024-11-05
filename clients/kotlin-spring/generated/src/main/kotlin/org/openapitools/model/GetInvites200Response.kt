package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.InviteResponse
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
 * @param items List of invite and request data.
 * @param bookmark 
 */
data class GetInvites200Response(

    @field:Valid
    @Schema(example = "null", required = true, description = "List of invite and request data.")
    @get:JsonProperty("items", required = true) val items: kotlin.collections.List<InviteResponse>,

    @Schema(example = "null", description = "")
    @get:JsonProperty("bookmark") val bookmark: kotlin.String? = null
    ) {

}

