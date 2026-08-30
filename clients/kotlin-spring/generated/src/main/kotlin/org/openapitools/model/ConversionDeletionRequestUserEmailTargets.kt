package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
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
 * @param userEmails Array of plain text user emails.
 */
data class ConversionDeletionRequestUserEmailTargets(

    @get:Size(min=1)
    @Schema(required = true, description = "Array of plain text user emails.")
    @param:JsonProperty("user_emails")
    @get:JsonProperty("user_emails", required = true) val userEmails: kotlin.collections.List<kotlin.String>
) {

}

