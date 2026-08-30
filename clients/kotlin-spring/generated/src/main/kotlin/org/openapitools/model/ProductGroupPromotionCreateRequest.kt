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
 * @param adGroupId ID of the Ad Group the Product Group Promotion belongs to.
 * @param productGroupPromotion 
 */
data class ProductGroupPromotionCreateRequest(

    @get:Pattern(regexp="^(AG)?\\d+$")
    @Schema(required = true, description = "ID of the Ad Group the Product Group Promotion belongs to.")
    @param:JsonProperty("ad_group_id")
    @get:JsonProperty("ad_group_id", required = true) val adGroupId: kotlin.String,

    @field:Valid
    @Schema(required = true, description = "")
    @param:JsonProperty("product_group_promotion")
    @get:JsonProperty("product_group_promotion", required = true) val productGroupPromotion: kotlin.collections.List<ProductGroupPromotion>
) {

}

