package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSetter
import com.fasterxml.jackson.annotation.Nulls
import org.openapitools.model.AssetAccessRequestError
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
 * @param invites An object mapping each partner id to the asset access request id. Only one request id is returned per partner.
 */
data class CreateAssetAccessRequestResponse(

    @field:Valid
    @Schema(description = "A list of errors associated with the asset access requests. Will be returned if there is an error.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("exceptions")
    @get:JsonProperty("exceptions") val exceptions: kotlin.collections.List<AssetAccessRequestError>? = null,

    @Schema(example = "{\"766456567741825556\":\"5349280584552211583\",\"733242520489967216\":\"5349280584552211845\"}", description = "An object mapping each partner id to the asset access request id. Only one request id is returned per partner.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("invites")
    @get:JsonProperty("invites") val invites: kotlin.collections.Map<kotlin.String, kotlin.String>? = null
) {

}

