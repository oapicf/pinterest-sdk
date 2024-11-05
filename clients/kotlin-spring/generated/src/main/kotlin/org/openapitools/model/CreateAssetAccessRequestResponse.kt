package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.CreateAssetAccessRequestErrorMessageInner
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
 * @param exceptions A list of errors associated with the asset access requests. Will be returned if there is an error.
 * @param invites 
 */
data class CreateAssetAccessRequestResponse(

    @field:Valid
    @Schema(example = "null", description = "A list of errors associated with the asset access requests. Will be returned if there is an error.")
    @get:JsonProperty("exceptions") val exceptions: kotlin.collections.List<CreateAssetAccessRequestErrorMessageInner>? = null,

    @Schema(example = "{\"766456567741825556\":\"5349280584552211583\",\"733242520489967216\":\"5349280584552211845\"}", description = "")
    @get:JsonProperty("invites") val invites: kotlin.collections.Map<kotlin.String, kotlin.String>? = null
    ) {

}

