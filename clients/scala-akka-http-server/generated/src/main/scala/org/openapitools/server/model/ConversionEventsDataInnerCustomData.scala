package org.openapitools.server.model


/**
 * Object containing other custom data.
 *
 * @param currency The ISO-4217 currency code. If not provided, we will default to the advertiser's currency set during account creation. Your campaign performance needs this field to report right ROAS/CPA. for example: ''USD''
 * @param value Total value of the event. Accepted as a string in the request; it will be parsed into a double. For example, if there are two items in a checkout event, the value should be the total price. We recommend to use pre-tax, pre-shipping final value. for example: ''72.39''
 * @param contentIds List of products IDs. We recommend using this if you are a merchant for PageVisit, AddToCart and Checkouts. For detail, please check <a href=\"https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs\" target=\"_blank\">here</a> (Install the Pinterest tag section). for example: ''["red-pinterest-shirt-logo-1","purple-pinterest-shirt-logo-3"]''
 * @param contentName The name of the page or product associated with the event. for example: ''pinterest-themed-clothing''
 * @param contentCategory The category of the content associated with the event. for example: ''shirts''
 * @param contentBrand The brand of the content associated with the event. for example: ''pinterest-brand''
 * @param contents A list of objects containing information about products, such as price and quantity. We recommend using this if you are a merchant for PageVisit, AddToCart and Checkouts. For detail, please check <a href=\"https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs\" target=\"_blank\">here</a> (Install the Pinterest tag section). for example: ''null''
 * @param numItems Total number of products of the event. For example, the total number of items purchased in a checkout event. We recommend using this if you are a merchant for AddToCart and Checkouts. For detail, please check <a href=\"https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs\" target=\"_blank\">here</a> (Install the Pinterest tag section). for example: ''2''
 * @param orderId The order ID. We recommend sending order_id to help us deduplicate events when necessary. This also helps to run other measurement products at Pinterest. for example: ''my_order_id''
 * @param searchString The search string related to the user conversion event. for example: ''sample string''
 * @param optOutType Flags for different privacy rights laws to opt out users of sharing personal information. Values should be comma separated. Please follow the <a href=\"https://help.pinterest.com/en/business/article/limited-data-processing\" target=\"_blank\">Help Center</a> and <a href=\"https://developers.pinterest.com/docs/conversions/conversion-management/#Understanding%20Limited%20Data%20Processing\" target=\"_blank\">dev site</a> for specific opt_out_type set up. for example: ''LDP''
 * @param np Named partner. Not required, this is for Pinterest internal use only. Please do not use this unless specifically guided. for example: ''ss-company''
*/
final case class ConversionEventsDataInnerCustomData (
  currency: Option[String] = None,
  value: Option[String] = None,
  contentIds: Option[Seq[String]] = None,
  contentName: Option[String] = None,
  contentCategory: Option[String] = None,
  contentBrand: Option[String] = None,
  contents: Option[Seq[ConversionEventsDataInnerCustomDataContentsInner]] = None,
  numItems: Option[Long] = None,
  orderId: Option[String] = None,
  searchString: Option[String] = None,
  optOutType: Option[String] = None,
  np: Option[String] = None
)

