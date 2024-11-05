package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.Currency
import org.openapitools.model.LineItem
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
 * Optional for VISITOR `audience_type`. With the Pinterest tag, you can use event data to capture event details from your website. This object lists all the available predefined event data fields in the Pinterest tag. You can include these event data fields as part of a VISITOR audience’ s `rule`; however, you **must** specify an `event` for the `event_data` fields to be evaluated. Besides what’s listed, you can also create your own set of `event_data` fields and define their usages or purposes according to your website needs. However, the benefit of using the predefined event data fields is that we can provide various metrics based on those fields' data.<br>Examples per `event` type:<br>`pagevisit`<br>\"event_data\": { \"page_name\": \"My online store 123 | view items | shoe\" }<br>`signup`<br>\"event_data\": { \"lead_type\": \"New release promotion\" }<br>`checkout`<br>\"event_data\": { \"value\": 116, \"order_quantity\": 2, \"currency\": \"USD\", \"line_items\": [ { \"product_name\": \"Pillows (Set of 2)\", \"product_id\": \"11\", \"product_price\": 48, \"product_quantity\": 1 }, { \"product_name\": \"Pillows, Large (Set of 2)\", \"product_id\": \"15\", \"product_price\": 68, \"product_quantity\": 1 } ] }<br>`addtocart`<br>\"event_data\": { \"value\": 499, \"order_quantity\": 1, \"currency\": \"USD\", \"line_items\": [ { \"product_name\": \"Red leather boots\", \"product_id\": \"3486\", \"product_category\": \"shoe\", \"product_variant_id\": \"JB11103000\", \"product_price\": 499, \"product_quantity\": \"1\" , \"product_brand\": \"My brand\" }]}<br>`watchvideo`<br>\"event_data\": { \"video_title\": \"My Product Video 01\" }<br>`lead`<br>\"event_data\": { \"lead_type\": \"Newsletter\" }
 * @param currency 
 * @param leadType Promotion code. For example, \"Newsletter\".
 * @param lineItems 
 * @param orderId Order ID. For example, \"X-151481\".
 * @param orderQuantity Order quantity. For example, 1.
 * @param pageName Page name. For example, \"Our Favorite Pins on Pinterest\".
 * @param promoCode Promotion code. For example, \"WINTER10\".
 * @param &#x60;property&#x60; Property. For example, \"Athleta\".
 * @param searchQuery Search query string. For example, \"boots\".
 * @param &#x60;value&#x60; Product value. For example, \"199.98\"
 * @param videoTitle Video title. For example, \"How to style your Parker Boots\".
 */
data class PinterestTagEventData(

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("currency") val currency: Currency? = null,

    @Schema(example = "Newsletter", description = "Promotion code. For example, \"Newsletter\".")
    @get:JsonProperty("lead_type") val leadType: kotlin.String? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("line_items") val lineItems: LineItem? = null,

    @Schema(example = "X-151481", description = "Order ID. For example, \"X-151481\".")
    @get:JsonProperty("order_id") val orderId: kotlin.String? = null,

    @Schema(example = "1", description = "Order quantity. For example, 1.")
    @get:JsonProperty("order_quantity") val orderQuantity: kotlin.Int? = null,

    @Schema(example = "Our Favorite Pins on Pinterest.", description = "Page name. For example, \"Our Favorite Pins on Pinterest\".")
    @get:JsonProperty("page_name") val pageName: kotlin.String? = null,

    @Schema(example = "WINTER10", description = "Promotion code. For example, \"WINTER10\".")
    @get:JsonProperty("promo_code") val promoCode: kotlin.String? = null,

    @Schema(example = "Athleta", description = "Property. For example, \"Athleta\".")
    @get:JsonProperty("property") val `property`: kotlin.String? = null,

    @Schema(example = "boots", description = "Search query string. For example, \"boots\".")
    @get:JsonProperty("search_query") val searchQuery: kotlin.String? = null,

    @Schema(example = "199.98", description = "Product value. For example, \"199.98\"")
    @get:JsonProperty("value") val `value`: kotlin.String? = null,

    @Schema(example = "How to style your Parker Boots", description = "Video title. For example, \"How to style your Parker Boots\".")
    @get:JsonProperty("video_title") val videoTitle: kotlin.String? = null
    ) {

}

