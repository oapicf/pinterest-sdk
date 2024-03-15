package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.UpdatableItemAttributes
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
 * An item to be updated
 * @param itemId The catalog item id in the merchant namespace
 * @param operation 
 * @param attributes 
 * @param updateMask The list of product attributes to be updated. Attributes specified in the update mask without a value specified in the body will be deleted from the product item.
 */
data class CatalogsUpdateRetailItem(

    @Schema(example = "DS0294-M", required = true, description = "The catalog item id in the merchant namespace")
    @get:JsonProperty("item_id", required = true) val itemId: kotlin.String,

    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("operation", required = true) val operation: CatalogsUpdateRetailItem.Operation,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("attributes", required = true) val attributes: UpdatableItemAttributes,

    @field:Valid
    @Schema(example = "[\"ad_link\",\"adult\",\"age_group\",\"availability\",\"average_review_rating\",\"brand\",\"checkout_enabled\",\"color\",\"condition\",\"custom_label_0\",\"custom_label_1\",\"custom_label_2\",\"custom_label_3\",\"custom_label_4\",\"description\",\"free_shipping_label\",\"free_shipping_limit\",\"gender\",\"google_product_category\",\"gtin\",\"item_group_id\",\"last_updated_time\",\"link\",\"material\",\"min_ad_price\",\"mpn\",\"number_of_ratings\",\"number_of_reviews\",\"pattern\",\"price\",\"product_type\",\"sale_price\",\"shipping\",\"shipping_height\",\"shipping_weight\",\"shipping_width\",\"size\",\"size_system\",\"size_type\",\"tax\",\"title\",\"variant_names\",\"variant_values\"]", description = "The list of product attributes to be updated. Attributes specified in the update mask without a value specified in the body will be deleted from the product item.")
    @get:JsonProperty("update_mask") val updateMask: kotlin.collections.List<UpdateMaskFieldType>? = null
) {

    /**
    * 
    * Values: CREATE,UPDATE,UPSERT,DELETE
    */
    enum class Operation(val value: kotlin.String) {

        @JsonProperty("CREATE") CREATE("CREATE"),
        @JsonProperty("UPDATE") UPDATE("UPDATE"),
        @JsonProperty("UPSERT") UPSERT("UPSERT"),
        @JsonProperty("DELETE") DELETE("DELETE")
    }

}

