package org.openapitools.server.model


/**
 * Object containing other custom data.
 *
 * @param contentBrand The brand of the content associated with the event. for example: ''pinterest-brand''
 * @param contentCategory The category of the content associated with the event. for example: ''shirts''
 * @param contentIds List of products IDs. We recommend using this if you are a merchant for PageVisit, AddToCart and Checkouts. For detail, please check <a href=\"https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs\" target=\"_blank\">here</a> (Install the Pinterest tag section). for example: ''["product-id-001","product-id-002"]''
 * @param contentName The name of the page or product associated with the event. for example: ''pinterest-themed-clothing''
 * @param contents A list of objects containing information about products, such as price and quantity. We recommend using this if you are a merchant for PageVisit, AddToCart and Checkouts. For detail, please check <a href=\"https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs\" target=\"_blank\">here</a> (Install the Pinterest tag section). for example: ''[{"id":"product-id-001","item_price":"14.99","quantity":3,"item_name":"pinterest-shirt-girl","item_category":"pinterest-clothing-shirts","item_brand":"pinterest"},{"id":"product-id-002","item_price":"13.71","quantity":2,"item_name":"pinterest-shirt-men","item_category":"pinterest-clothing-shirts","item_brand":"pinterest"}]''
 * @param currency The ISO-4217 currency code. If not provided, we will default to the advertiser's currency set during account creation. Your campaign performance needs this field to report right ROAS/CPA. for example: ''USD''
 * @param externalMeasurementId Only use when instructed. for example: ''rbos-cb7a9e56-4988-4ca0-801b-05c79b29785f''
 * @param externalMeasurementVendorId Only use when instructed. for example: ''1''
 * @param np Named partner. Not required, this is for Pinterest internal use only. Please do not use this unless specifically guided. for example: ''ss-company''
 * @param numItems Total number of products of the event. For example, the total number of items purchased in a checkout event. We recommend using this if you are a merchant for AddToCart and Checkouts. For detail, please check <a href=\"https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs\" target=\"_blank\">here</a> (Install the Pinterest tag section). for example: ''5''
 * @param optOutType Flags for different privacy rights laws to opt out users of sharing personal information. Separate values with commas. See the Help Center article about <a href=\"https://help.pinterest.com/en/business/article/limited-data-processing\" target=\"_blank\">limited data processing</a> and the developer's guide for <a href=\"/docs/track-conversions/track-conversions-in-the-api/#whether-the-user-has-opted-out-of-web-or-offline-conversion-events\" target=\"_blank\">tracking conversion events</a> for help with using this parameter. for example: ''LDP''
 * @param orderId The order ID. We recommend sending order_id to help us deduplicate events when necessary. This also helps to run other measurement products at Pinterest. for example: ''my_order_id''
 * @param predictedLtv Predicted lifetime value of user associated with the event. Accepted as a string in the request; it will be parsed into a double. for example: ''2794.82''
 * @param searchString The search string related to the user conversion event. for example: ''sample string''
 * @param value Total value of the event. Accepted as a string in the request; it will be parsed into a double. For example, if there are two items in a checkout event, the value should be the total price. We recommend to use pre-tax, pre-shipping final value. for example: ''72.39''
*/
final case class ConversionEventsDataInnerCustomData (
  contentBrand: Option[String] = None,
  contentCategory: Option[String] = None,
  contentIds: Option[Seq[String]] = None,
  contentName: Option[String] = None,
  contents: Option[Seq[ConversionEventsDataInnerCustomDataContentsInner]] = None,
  currency: Option[String] = None,
  externalMeasurementId: Option[String] = None,
  externalMeasurementVendorId: Option[Int] = None,
  np: Option[String] = None,
  numItems: Option[Long] = None,
  optOutType: Option[String] = None,
  orderId: Option[String] = None,
  predictedLtv: Option[String] = None,
  searchString: Option[String] = None,
  value: Option[String] = None
)

