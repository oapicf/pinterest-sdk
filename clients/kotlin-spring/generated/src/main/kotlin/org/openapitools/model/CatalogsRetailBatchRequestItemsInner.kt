package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSubTypes
import com.fasterxml.jackson.annotation.JsonTypeInfo
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.CatalogsCreateRetailItem
import org.openapitools.model.CatalogsDeleteRetailItem
import org.openapitools.model.CatalogsUpdateRetailItem
import org.openapitools.model.CatalogsUpsertRetailItem
import org.openapitools.model.ItemAttributesRequest
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
 * 
 * @param itemId The catalog item id in the merchant namespace
 * @param operation 
 * @param attributes 
 * @param updateMask The list of product attributes to be updated. Attributes specified in the update mask without a value specified in the body will be deleted from the product item.
 */

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "operation", visible = true)
@JsonSubTypes(
      JsonSubTypes.Type(value = CatalogsCreateRetailItem::class, name = "CREATE"),
      JsonSubTypes.Type(value = CatalogsDeleteRetailItem::class, name = "DELETE"),
      JsonSubTypes.Type(value = CatalogsUpdateRetailItem::class, name = "UPDATE"),
      JsonSubTypes.Type(value = CatalogsUpsertRetailItem::class, name = "UPSERT")
)

interface CatalogsRetailBatchRequestItemsInner{
                @get:Schema(example = "DS0294-M", requiredMode = Schema.RequiredMode.REQUIRED, description = "The catalog item id in the merchant namespace")
        val itemId: kotlin.String

                @get:Schema(example = "null", requiredMode = Schema.RequiredMode.REQUIRED, description = "")
        val operation: CatalogsRetailBatchRequestItemsInner.Operation

                @get:Schema(example = "null", requiredMode = Schema.RequiredMode.REQUIRED, description = "")
        val attributes: ItemAttributesRequest

                @get:Schema(example = "[ad_link, adult, age_group, availability, average_review_rating, brand, checkout_enabled, color, condition, custom_label_0, custom_label_1, custom_label_2, custom_label_3, custom_label_4, description, free_shipping_label, free_shipping_limit, gender, google_product_category, gtin, item_group_id, last_updated_time, link, material, min_ad_price, mpn, number_of_ratings, number_of_reviews, pattern, price, product_type, sale_price, shipping, shipping_height, shipping_weight, shipping_width, size, size_system, size_type, tax, title, variant_names, variant_values]", description = "The list of product attributes to be updated. Attributes specified in the update mask without a value specified in the body will be deleted from the product item.")
        val updateMask: kotlin.collections.List<UpdateMaskFieldType>? 


    /**
    * 
    * Values: DELETE
    */
    enum class Operation(@get:JsonValue val value: kotlin.String) {

        DELETE("DELETE");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): Operation {
                return values().first{it -> it.value == value}
            }
        }
    }

}

