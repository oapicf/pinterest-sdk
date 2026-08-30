package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.BaseInviteDataResponse
import org.openapitools.model.InviteExceptionResponse
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
 * @param exception 
 * @param invite An invite object for the invite/request that was successfully accepted/declined. Will only be provided if the an invite/request is successfully created.
 */
data class RespondToInviteResultItem(

    @field:Valid
    @Schema(description = "")
    @param:JsonProperty("exception")
    @get:JsonProperty("exception") val exception: InviteExceptionResponse? = null,

    @field:Valid
    @Schema(description = "An invite object for the invite/request that was successfully accepted/declined. Will only be provided if the an invite/request is successfully created.")
    @param:JsonProperty("invite")
    @get:JsonProperty("invite") val invite: BaseInviteDataResponse? = null
) {

}

