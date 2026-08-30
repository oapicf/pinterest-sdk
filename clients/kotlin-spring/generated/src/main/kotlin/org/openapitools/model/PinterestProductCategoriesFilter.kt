package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.CatalogsProductGroupMultiplePinterestProductCategoryCriteria
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
 * @param PINTEREST_PRODUCT_CATEGORIES 
 */
data class PinterestProductCategoriesFilter(

    @field:Valid
    @Schema(required = true, description = "")
    @param:JsonProperty("PINTEREST_PRODUCT_CATEGORIES")
    @get:JsonProperty("PINTEREST_PRODUCT_CATEGORIES", required = true) val PINTEREST_PRODUCT_CATEGORIES: CatalogsProductGroupMultiplePinterestProductCategoryCriteria
) {

}

