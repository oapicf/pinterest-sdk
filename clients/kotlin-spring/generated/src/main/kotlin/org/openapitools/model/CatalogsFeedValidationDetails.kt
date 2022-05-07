package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.CatalogsFeedValidationErrors
import org.openapitools.model.CatalogsFeedValidationWarnings
import javax.validation.constraints.DecimalMax
import javax.validation.constraints.DecimalMin
import javax.validation.constraints.Max
import javax.validation.constraints.Min
import javax.validation.constraints.NotNull
import javax.validation.constraints.Pattern
import javax.validation.constraints.Size
import javax.validation.Valid

/**
 * 
 * @param errors 
 * @param warnings 
 */
data class CatalogsFeedValidationDetails(

    @field:Valid
    @field:JsonProperty("errors", required = true) val errors: CatalogsFeedValidationErrors,

    @field:Valid
    @field:JsonProperty("warnings", required = true) val warnings: CatalogsFeedValidationWarnings
) {

}

