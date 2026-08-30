package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.IneligibleProductTagErrorItem
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
 * Details about ineligible product tags in the request.
 * @param productTags List of product tags that failed eligibility check.
 */
data class IneligibleProductTagsErrorDetails(

    @field:Valid
    @Schema(required = true, description = "List of product tags that failed eligibility check.")
    @param:JsonProperty("product_tags")
    @get:JsonProperty("product_tags", required = true) val productTags: kotlin.collections.List<IneligibleProductTagErrorItem>
) {

}

