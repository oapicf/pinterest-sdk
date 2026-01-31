package model

import play.api.libs.json._

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
  * @param value Total value of the event. Accepted as a string in the request; it will be parsed into a double. For example, if there are two items in a checkout event, the value should be the total price. We recommend to use pre-tax, pre-shipping final value.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class ConversionEventsDataInnerCustomData(
  contentBrand: Option[String],
  contentCategory: Option[String],
  contentIds: Option[List[String]],
  contentName: Option[String],
  contents: Option[List[ConversionEventsDataInnerCustomDataContentsInner]],
  currency: Option[String],
  externalMeasurementId: Option[String],
  externalMeasurementVendorId: Option[Int],
  np: Option[String],
  numItems: Option[Long],
  optOutType: Option[String],
  orderId: Option[String],
  predictedLtv: Option[String],
  searchString: Option[String],
  value: Option[String]
)

object ConversionEventsDataInnerCustomData {
  implicit lazy val conversionEventsDataInnerCustomDataJsonFormat: Format[ConversionEventsDataInnerCustomData] = Json.format[ConversionEventsDataInnerCustomData]
}

