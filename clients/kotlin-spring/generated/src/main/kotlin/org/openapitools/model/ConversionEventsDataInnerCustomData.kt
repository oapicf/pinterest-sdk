package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.ConversionEventsDataInnerCustomDataContentsInner
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
 * Object containing other custom data.
 * @param contentBrand The brand of the content associated with the event.
 * @param contentCategory The category of the content associated with the event.
 * @param contentIds List of products IDs. We recommend using this if you are a merchant for PageVisit, AddToCart and Checkouts. For detail, please check <a href=\"https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs\" target=\"_blank\">here</a> (Install the Pinterest tag section).
 * @param contentName The name of the page or product associated with the event.
 * @param contents A list of objects containing information about products, such as price and quantity. We recommend using this if you are a merchant for PageVisit, AddToCart and Checkouts. For detail, please check <a href=\"https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs\" target=\"_blank\">here</a> (Install the Pinterest tag section).
 * @param currency The ISO-4217 currency code. If not provided, we will default to the advertiser's currency set during account creation. Your campaign performance needs this field to report right ROAS/CPA.
 * @param externalMeasurementId Only use when instructed.
 * @param externalMeasurementVendorId Only use when instructed.
 * @param np Named partner. Not required, this is for Pinterest internal use only. Please do not use this unless specifically guided.
 * @param numItems Total number of products of the event. For example, the total number of items purchased in a checkout event. We recommend using this if you are a merchant for AddToCart and Checkouts. For detail, please check <a href=\"https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs\" target=\"_blank\">here</a> (Install the Pinterest tag section).
 * @param optOutType Flags for different privacy rights laws to opt out users of sharing personal information. Separate values with commas. See the Help Center article about <a href=\"https://help.pinterest.com/en/business/article/limited-data-processing\" target=\"_blank\">limited data processing</a> and the developer's guide for <a href=\"/docs/track-conversions/track-conversions-in-the-api/#whether-the-user-has-opted-out-of-web-or-offline-conversion-events\" target=\"_blank\">tracking conversion events</a> for help with using this parameter.
 * @param orderId The order ID. We recommend sending order_id to help us deduplicate events when necessary. This also helps to run other measurement products at Pinterest.
 * @param predictedLtv Predicted lifetime value of user associated with the event. Accepted as a string in the request; it will be parsed into a double.
 * @param searchString The search string related to the user conversion event.
 * @param &#x60;value&#x60; Total value of the event. Accepted as a string in the request; it will be parsed into a double. For example, if there are two items in a checkout event, the value should be the total price. We recommend to use pre-tax, pre-shipping final value.
 */
data class ConversionEventsDataInnerCustomData(

    @Schema(example = "pinterest-brand", description = "The brand of the content associated with the event.")
    @get:JsonProperty("content_brand") val contentBrand: kotlin.String? = null,

    @Schema(example = "shirts", description = "The category of the content associated with the event.")
    @get:JsonProperty("content_category") val contentCategory: kotlin.String? = null,

    @Schema(example = "[\"product-id-001\",\"product-id-002\"]", description = "List of products IDs. We recommend using this if you are a merchant for PageVisit, AddToCart and Checkouts. For detail, please check <a href=\"https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs\" target=\"_blank\">here</a> (Install the Pinterest tag section).")
    @get:JsonProperty("content_ids") val contentIds: kotlin.collections.List<kotlin.String>? = null,

    @Schema(example = "pinterest-themed-clothing", description = "The name of the page or product associated with the event.")
    @get:JsonProperty("content_name") val contentName: kotlin.String? = null,

    @field:Valid
    @Schema(example = "[{\"id\":\"product-id-001\",\"item_price\":\"14.99\",\"quantity\":3,\"item_name\":\"pinterest-shirt-girl\",\"item_category\":\"pinterest-clothing-shirts\",\"item_brand\":\"pinterest\"},{\"id\":\"product-id-002\",\"item_price\":\"13.71\",\"quantity\":2,\"item_name\":\"pinterest-shirt-men\",\"item_category\":\"pinterest-clothing-shirts\",\"item_brand\":\"pinterest\"}]", description = "A list of objects containing information about products, such as price and quantity. We recommend using this if you are a merchant for PageVisit, AddToCart and Checkouts. For detail, please check <a href=\"https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs\" target=\"_blank\">here</a> (Install the Pinterest tag section).")
    @get:JsonProperty("contents") val contents: kotlin.collections.List<ConversionEventsDataInnerCustomDataContentsInner>? = null,

    @Schema(example = "USD", description = "The ISO-4217 currency code. If not provided, we will default to the advertiser's currency set during account creation. Your campaign performance needs this field to report right ROAS/CPA.")
    @get:JsonProperty("currency") val currency: kotlin.String? = null,

    @Schema(example = "rbos-cb7a9e56-4988-4ca0-801b-05c79b29785f", description = "Only use when instructed.")
    @get:JsonProperty("external_measurement_id") val externalMeasurementId: kotlin.String? = null,

    @Schema(example = "1", description = "Only use when instructed.")
    @get:JsonProperty("external_measurement_vendor_id") val externalMeasurementVendorId: kotlin.Int? = null,

    @Schema(example = "ss-company", description = "Named partner. Not required, this is for Pinterest internal use only. Please do not use this unless specifically guided.")
    @get:JsonProperty("np") val np: kotlin.String? = null,

    @Schema(example = "5", description = "Total number of products of the event. For example, the total number of items purchased in a checkout event. We recommend using this if you are a merchant for AddToCart and Checkouts. For detail, please check <a href=\"https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs\" target=\"_blank\">here</a> (Install the Pinterest tag section).")
    @get:JsonProperty("num_items") val numItems: kotlin.Long? = null,

    @Schema(example = "LDP", description = "Flags for different privacy rights laws to opt out users of sharing personal information. Separate values with commas. See the Help Center article about <a href=\"https://help.pinterest.com/en/business/article/limited-data-processing\" target=\"_blank\">limited data processing</a> and the developer's guide for <a href=\"/docs/track-conversions/track-conversions-in-the-api/#whether-the-user-has-opted-out-of-web-or-offline-conversion-events\" target=\"_blank\">tracking conversion events</a> for help with using this parameter.")
    @get:JsonProperty("opt_out_type") val optOutType: kotlin.String? = null,

    @Schema(example = "my_order_id", description = "The order ID. We recommend sending order_id to help us deduplicate events when necessary. This also helps to run other measurement products at Pinterest.")
    @get:JsonProperty("order_id") val orderId: kotlin.String? = null,

    @Schema(example = "2794.82", description = "Predicted lifetime value of user associated with the event. Accepted as a string in the request; it will be parsed into a double.")
    @get:JsonProperty("predicted_ltv") val predictedLtv: kotlin.String? = null,

    @Schema(example = "sample string", description = "The search string related to the user conversion event.")
    @get:JsonProperty("search_string") val searchString: kotlin.String? = null,

    @Schema(example = "72.39", description = "Total value of the event. Accepted as a string in the request; it will be parsed into a double. For example, if there are two items in a checkout event, the value should be the total price. We recommend to use pre-tax, pre-shipping final value.")
    @get:JsonProperty("value") val `value`: kotlin.String? = null
) {

}

