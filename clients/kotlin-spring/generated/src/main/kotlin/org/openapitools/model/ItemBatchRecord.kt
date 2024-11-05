package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.ItemAttributesRequest
import org.openapitools.model.ItemCreateBatchRecord
import org.openapitools.model.ItemDeleteBatchRecord
import org.openapitools.model.ItemDeleteDiscontinuedBatchRecord
import org.openapitools.model.ItemUpdateBatchRecord
import org.openapitools.model.ItemUpsertBatchRecord
import org.openapitools.model.UpdateMaskFieldType
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
 * Object describing an item batch record
 * @param itemId The catalog item id in the merchant namespace
 * @param attributes 
 * @param updateMask The list of product attributes to be updated. Attributes specified in the update mask without a value specified in the body will be deleted from the product item.
 */
data class ItemBatchRecord(

    @Schema(example = "DS0294-M", description = "The catalog item id in the merchant namespace")
    @get:JsonProperty("item_id") val itemId: kotlin.String? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("attributes") val attributes: ItemAttributesRequest? = null,

    @field:Valid
    @Schema(example = "[ad_link, adult, age_group, availability, average_review_rating, brand, checkout_enabled, color, condition, custom_label_0, custom_label_1, custom_label_2, custom_label_3, custom_label_4, description, free_shipping_label, free_shipping_limit, gender, google_product_category, gtin, item_group_id, last_updated_time, link, material, min_ad_price, mpn, number_of_ratings, number_of_reviews, pattern, price, product_type, sale_price, shipping, shipping_height, shipping_weight, shipping_width, size, size_system, size_type, tax, title, variant_names, variant_values]", description = "The list of product attributes to be updated. Attributes specified in the update mask without a value specified in the body will be deleted from the product item.")
    @get:JsonProperty("update_mask") val updateMask: kotlin.collections.List<UpdateMaskFieldType>? = null
    ) {

}

