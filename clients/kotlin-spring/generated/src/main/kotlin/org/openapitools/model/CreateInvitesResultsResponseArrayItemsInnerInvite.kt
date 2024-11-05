package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.BusinessAccessUserSummary
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
 * An invite object if the invite/request was successfully created. Will only be provided if the an invite/request is successfully created.
 * @param id Unique identifier of the invite/request.
 * @param user Metadata for the member/partner that was sent the invite/request.
 */
data class CreateInvitesResultsResponseArrayItemsInnerInvite(

    @get:Pattern(regexp="^\\d+$")
    @Schema(example = "383791336903426391", description = "Unique identifier of the invite/request.")
    @get:JsonProperty("id") val id: kotlin.String? = null,

    @field:Valid
    @Schema(example = "null", description = "Metadata for the member/partner that was sent the invite/request.")
    @get:JsonProperty("user") val user: BusinessAccessUserSummary? = null
    ) {

}

