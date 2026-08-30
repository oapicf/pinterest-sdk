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
 * Resource create operation model.
 * @param audienceIds Audience IDs included in the customer segment.
 * @param name Customer segment name.
 */
data class CustomerSegmentCreate(

    @Schema(required = true, description = "Audience IDs included in the customer segment.")
    @param:JsonProperty("audience_ids")
    @get:JsonProperty("audience_ids", required = true) val audienceIds: kotlin.collections.List<kotlin.String>,

    @Schema(required = true, description = "Customer segment name.")
    @param:JsonProperty("name")
    @get:JsonProperty("name", required = true) val name: kotlin.String
) {

}

