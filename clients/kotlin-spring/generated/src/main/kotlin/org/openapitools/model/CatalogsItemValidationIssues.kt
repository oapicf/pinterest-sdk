package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.CatalogsItemValidationErrors
import org.openapitools.model.CatalogsItemValidationWarnings
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
 * @param itemNumber Item number based on order of appearance in the Catalogs Feed. For example, '0' refers to first item found in a feed that was downloaded from a 'location' specified during feed creation.
 * @param itemId The merchant-created unique ID that represents the product.
 * @param errors 
 * @param warnings 
 */
data class CatalogsItemValidationIssues(

    @Schema(example = "0", required = true, description = "Item number based on order of appearance in the Catalogs Feed. For example, '0' refers to first item found in a feed that was downloaded from a 'location' specified during feed creation.")
    @get:JsonProperty("item_number", required = true) val itemNumber: kotlin.Int,

    @Schema(example = "DS0294-L", required = true, description = "The merchant-created unique ID that represents the product.")
    @get:JsonProperty("item_id", required = true) val itemId: kotlin.String?,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("errors", required = true) val errors: CatalogsItemValidationErrors,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("warnings", required = true) val warnings: CatalogsItemValidationWarnings
) {

}

