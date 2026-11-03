package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.BusinessAccessUserSummary
import org.openapitools.model.InviteDataResponse
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
 * Common invite/request data returned by the business access endpoints.
 * @param id Unique identifier of the invite/request.
 * @param inviteData 
 * @param isReceivedInvite Indicates whether the invite/request was received.
 * @param user Metadata for the member/partner that was sent the invite/request.
 */
data class BaseInviteDataResponse(

    @get:Pattern(regexp="^\\d+$")
    @Schema(example = "383791336903426391", description = "Unique identifier of the invite/request.")
    @param:JsonProperty("id")
    @get:JsonProperty("id") val id: kotlin.String? = null,

    @field:Valid
    @Schema(description = "")
    @param:JsonProperty("invite_data")
    @get:JsonProperty("invite_data") val inviteData: InviteDataResponse? = null,

    @Schema(description = "Indicates whether the invite/request was received.")
    @param:JsonProperty("is_received_invite")
    @get:JsonProperty("is_received_invite") val isReceivedInvite: kotlin.Boolean? = null,

    @field:Valid
    @Schema(description = "Metadata for the member/partner that was sent the invite/request.")
    @param:JsonProperty("user")
    @get:JsonProperty("user") val user: BusinessAccessUserSummary? = null
) {

}

