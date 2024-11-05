package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.ProductGroupPromotion
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
 * @param adGroupId ID of the ad group the product group belongs to.
 * @param productGroupPromotion 
 */
data class ProductGroupPromotionUpdateRequest(

    @get:Pattern(regexp="^(AG)?\\d+$")
    @Schema(example = "2680059592705", required = true, description = "ID of the ad group the product group belongs to.")
    @get:JsonProperty("ad_group_id", required = true) val adGroupId: kotlin.String,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("product_group_promotion", required = true) val productGroupPromotion: kotlin.collections.List<ProductGroupPromotion>
    ) {

}

