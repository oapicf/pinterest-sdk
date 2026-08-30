package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.ConversionDeletionRequestEPIKTargets
import org.openapitools.model.ConversionDeletionRequestUserEmailTargets
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
 * @param epiks Array of EPIKs (Encrypted Pinterest ID Keys). An EPIK is a user match type that utilizes 3P browser localStorage (similar to a third-party cookie).
 */
data class ConversionDeletionRequestTargets(

    @get:Size(min=1)
    @Schema(required = true, description = "Array of plain text user emails.")
    @param:JsonProperty("user_emails")
    @get:JsonProperty("user_emails", required = true) val userEmails: kotlin.collections.List<kotlin.String>,

    @get:Size(min=1)
    @Schema(required = true, description = "Array of EPIKs (Encrypted Pinterest ID Keys). An EPIK is a user match type that utilizes 3P browser localStorage (similar to a third-party cookie).")
    @param:JsonProperty("epiks")
    @get:JsonProperty("epiks", required = true) val epiks: kotlin.collections.List<kotlin.String>
) {

}

