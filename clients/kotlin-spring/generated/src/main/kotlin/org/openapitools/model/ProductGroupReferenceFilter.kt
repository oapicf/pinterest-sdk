package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.CatalogsProductGroupMultipleStringCriteria
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
 * @param PRODUCT_GROUP 
 */
data class ProductGroupReferenceFilter(

    @field:Valid
    @Schema(required = true, description = "")
    @param:JsonProperty("PRODUCT_GROUP")
    @get:JsonProperty("PRODUCT_GROUP", required = true) val PRODUCT_GROUP: CatalogsProductGroupMultipleStringCriteria
) {

}

