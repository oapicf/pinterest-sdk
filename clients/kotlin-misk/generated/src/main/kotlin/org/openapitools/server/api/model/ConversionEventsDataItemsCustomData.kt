package org.openapitools.server.api.model

import org.openapitools.server.api.model.ConversionEventsDataItemsCustomDataContentsItems
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ConversionEventsDataItemsCustomData(
    /** The brand of the content associated with the event. */
    val contentBrand: kotlin.String? = null,
    /** The category of the content associated with the event. */
    val contentCategory: kotlin.String? = null,
    /** List of products IDs. We recommend using this if you are a merchant for PageVisit, AddToCart and Checkouts. For detail, please check [here](https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs) (Install the Pinterest tag section). */
    val contentIds: kotlin.collections.List<kotlin.String>? = null,
    /** The name of the page or product associated with the event. */
    val contentName: kotlin.String? = null,
    /** A list of objects containing information about products, such as price and quantity. We recommend using this if you are a merchant for PageVisit, AddToCart and Checkouts. For detail, please check [here](https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs) (Install the Pinterest tag section). */
    val contents: kotlin.collections.List<ConversionEventsDataItemsCustomDataContentsItems>? = null,
    /** The ISO-4217 currency code. If not provided, we will default to the advertiser&#39;s currency set during account creation. Your campaign performance needs this field to report right ROAS/CPA. */
    val currency: kotlin.String? = null,
    /** Only use when instructed. */
    val externalMeasurementId: kotlin.String? = null,
    /** Only use when instructed. */
    val externalMeasurementVendorId: kotlin.Int? = null,
    /** Named partner. Not required, this is for Pinterest internal use only. Please do not use this unless specifically guided. */
    val np: kotlin.String? = null,
    /** Total number of products of the event. For example, the total number of items purchased in a checkout event. We recommend using this if you are a merchant for AddToCart and Checkouts. For detail, please check [here](https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs) (Install the Pinterest tag section). */
    val numItems: kotlin.Long? = null,
    /** Flags for different privacy rights laws to opt out users of sharing personal information. Separate values with commas. See the Help Center article about [limited data processing](https://help.pinterest.com/en/business/article/limited-data-processing) and the developer&#39;s guide for [tracking conversion events](/docs/track-conversions/track-conversions-in-the-api/#whether-the-user-has-opted-out-of-web-or-offline-conversion-events) for help with using this parameter. */
    val optOutType: kotlin.String? = null,
    /** The order ID. We recommend sending order_id to help us deduplicate events when necessary. This also helps to run other measurement products at Pinterest. */
    val orderId: kotlin.String? = null,
    /** Predicted lifetime value of user associated with the event. Accepted as a string in the request; it will be parsed into a double. */
    val predictedLtv: kotlin.String? = null,
    /** The search string related to the user conversion event. */
    val searchString: kotlin.String? = null,
    /** Total value of the event. Accepted as a string in the request; it will be parsed into a double. For example, if there are two items in a checkout event, the value should be the total price. We recommend to use pre-tax, pre-shipping final value. */
    val `value`: kotlin.String? = null
)
