package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSetter
import com.fasterxml.jackson.annotation.Nulls
import org.openapitools.model.ProductGroupPromotionResponseItem
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
 * Wrapper model for ProductGroupPromotion.
 * @param items Response-only: created or updated product group promotions, or exceptions.
 */
data class ProductGroupPromotions(

    @field:Valid
    @Schema(readOnly = true, description = "Response-only: created or updated product group promotions, or exceptions.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("items")
    @get:JsonProperty("items") val items: kotlin.collections.List<ProductGroupPromotionResponseItem>? = null
) {

}

