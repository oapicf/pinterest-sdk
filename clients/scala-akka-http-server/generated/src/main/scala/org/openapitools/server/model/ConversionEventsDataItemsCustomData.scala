package org.openapitools.server.model


/**
 * Object containing other custom data.
 *
 * @param contentBrand The brand of the content associated with the event. for example: ''null''
 * @param contentCategory The category of the content associated with the event. for example: ''null''
 * @param contentIds List of products IDs. We recommend using this if you are a merchant for PageVisit, AddToCart and Checkouts. For detail, please check [here](https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs) (Install the Pinterest tag section). for example: ''null''
 * @param contentName The name of the page or product associated with the event. for example: ''null''
 * @param contents A list of objects containing information about products, such as price and quantity. We recommend using this if you are a merchant for PageVisit, AddToCart and Checkouts. For detail, please check [here](https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs) (Install the Pinterest tag section). for example: ''null''
 * @param currency The ISO-4217 currency code. If not provided, we will default to the advertiser's currency set during account creation. Your campaign performance needs this field to report right ROAS/CPA. for example: ''null''
 * @param externalMeasurementId Only use when instructed. for example: ''null''
 * @param externalMeasurementVendorId Only use when instructed. for example: ''null''
 * @param np Named partner. Not required, this is for Pinterest internal use only. Please do not use this unless specifically guided. for example: ''null''
 * @param numItems Total number of products of the event. For example, the total number of items purchased in a checkout event. We recommend using this if you are a merchant for AddToCart and Checkouts. For detail, please check [here](https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs) (Install the Pinterest tag section). for example: ''null''
 * @param optOutType Flags for different privacy rights laws to opt out users of sharing personal information. Separate values with commas. See the Help Center article about [limited data processing](https://help.pinterest.com/en/business/article/limited-data-processing) and the developer's guide for [tracking conversion events](/docs/track-conversions/track-conversions-in-the-api/#whether-the-user-has-opted-out-of-web-or-offline-conversion-events) for help with using this parameter. for example: ''null''
 * @param orderId The order ID. We recommend sending order_id to help us deduplicate events when necessary. This also helps to run other measurement products at Pinterest. for example: ''null''
 * @param predictedLtv Predicted lifetime value of user associated with the event. Accepted as a string in the request; it will be parsed into a double. for example: ''null''
 * @param searchString The search string related to the user conversion event. for example: ''null''
 * @param value Total value of the event. Accepted as a string in the request; it will be parsed into a double. For example, if there are two items in a checkout event, the value should be the total price. We recommend to use pre-tax, pre-shipping final value. for example: ''null''
*/
final case class ConversionEventsDataItemsCustomData (
  contentBrand: Option[String] = None,
  contentCategory: Option[String] = None,
  contentIds: Option[Seq[String]] = None,
  contentName: Option[String] = None,
  contents: Option[Seq[ConversionEventsDataItemsCustomDataContentsItems]] = None,
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

