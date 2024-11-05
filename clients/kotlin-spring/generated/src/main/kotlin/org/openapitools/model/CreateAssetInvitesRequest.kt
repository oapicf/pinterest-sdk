package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.CreateAssetInvitesRequestItem
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
 * Request body for updating asset roles for existing invites.
 * @param invites 
 */
data class CreateAssetInvitesRequest(

    @field:Valid
    @get:Size(min=1,max=50) 
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("invites", required = true) val invites: kotlin.collections.List<CreateAssetInvitesRequestItem>
    ) {

}

