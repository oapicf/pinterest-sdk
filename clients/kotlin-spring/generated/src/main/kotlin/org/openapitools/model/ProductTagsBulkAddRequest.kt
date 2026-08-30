package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.ProductTagItem
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
 * Request body for bulk adding product tags to a pin.
 * @param productTags List of product tags to add. Maximum 24 items allowed.
 */
data class ProductTagsBulkAddRequest(

    @field:Valid
    @get:Size(min=1,max=24) 
    @Schema(required = true, description = "List of product tags to add. Maximum 24 items allowed.")
    @param:JsonProperty("product_tags")
    @get:JsonProperty("product_tags", required = true) val productTags: kotlin.collections.List<ProductTagItem>
) {

}

