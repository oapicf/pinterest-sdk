package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.ConversionDeletionRequestTargets
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
 * Resource create operation model.
 * @param deletionTargets Object containing the targets of the conversion deletion request. Users can be identified with user_emails, epiks, or both within the same request.
 */
data class ConversionDeletionRequestCreate(

    @field:Valid
    @Schema(required = true, description = "Object containing the targets of the conversion deletion request. Users can be identified with user_emails, epiks, or both within the same request.")
    @param:JsonProperty("deletion_targets")
    @get:JsonProperty("deletion_targets", required = true) val deletionTargets: ConversionDeletionRequestTargets
) {

}

