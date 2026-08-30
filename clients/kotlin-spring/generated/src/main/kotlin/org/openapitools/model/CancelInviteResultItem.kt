package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.CancelInviteException
import org.openapitools.model.CancelInviteResult
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
 * @param invite 
 */
data class CancelInviteResultItem(

    @field:Valid
    @Schema(description = "")
    @param:JsonProperty("exception")
    @get:JsonProperty("exception") val exception: CancelInviteException? = null,

    @field:Valid
    @Schema(description = "")
    @param:JsonProperty("invite")
    @get:JsonProperty("invite") val invite: CancelInviteResult? = null
) {

}

