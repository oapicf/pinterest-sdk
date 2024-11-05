package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.DeleteInvitesResultsResponseArrayItemsInner
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
 * Response to delete invites sent to Members or Partners, if there is an exception, return the exception mapped with the invite id
 * @param items List of invite/Request deletion status. If there is an error, an exception object will be returned. If the invite/request was successfully cancelled, an invite object will be returned for the invite that was cancelled.
 */
data class DeleteInvitesResultsResponseArray(

    @field:Valid
    @Schema(example = "null", description = "List of invite/Request deletion status. If there is an error, an exception object will be returned. If the invite/request was successfully cancelled, an invite object will be returned for the invite that was cancelled.")
    @get:JsonProperty("items") val items: kotlin.collections.List<DeleteInvitesResultsResponseArrayItemsInner>? = null
    ) {

}

