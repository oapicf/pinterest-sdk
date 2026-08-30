package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.NullableCatalogsItemFieldType
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
 * @param attributeName Attribute that has a validation issue.
 * @param providedValue Provided value that caused the validation issue.
 */
data class CatalogsItemValidationDetails(

    @field:Valid
    @Schema(required = true, description = "Attribute that has a validation issue.")
    @param:JsonProperty("attribute_name")
    @get:JsonProperty("attribute_name", required = true) val attributeName: NullableCatalogsItemFieldType?,

    @Schema(required = true, description = "Provided value that caused the validation issue.")
    @param:JsonProperty("provided_value")
    @get:JsonProperty("provided_value", required = true) val providedValue: kotlin.String?
) {

}

