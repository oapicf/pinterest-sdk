package model

import play.api.libs.json._

/**
  * Object containing other custom data.
  * @param currency The ISO-4217 currency code. If not provided, we will default to the advertiser's currency set during account creation. Your campaign performance needs this field to report right ROAS/CPA.
  * @param value Total value of the event. Accepted as a string in the request; it will be parsed into a double. For example, if there are two items in a checkout event, the value should be the total price. We recommend to use pre-tax, pre-shipping final value.
  * @param contentIds List of products IDs. We recommend using this if you are a merchant for PageVisit, AddToCart and Checkouts. For detail, please check <a href=\"https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs\" target=\"_blank\">here</a> (Install the Pinterest tag section).
  * @param contentName The name of the page or product associated with the event.
  * @param contentCategory The category of the content associated with the event.
  * @param contentBrand The brand of the content associated with the event.
  * @param contents A list of objects containing information about products, such as price and quantity. We recommend using this if you are a merchant for PageVisit, AddToCart and Checkouts. For detail, please check <a href=\"https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs\" target=\"_blank\">here</a> (Install the Pinterest tag section).
  * @param numItems Total number of products of the event. For example, the total number of items purchased in a checkout event. We recommend using this if you are a merchant for AddToCart and Checkouts. For detail, please check <a href=\"https://help.pinterest.com/en/business/article/before-you-get-started-with-catalogs\" target=\"_blank\">here</a> (Install the Pinterest tag section).
  * @param orderId The order ID. We recommend sending order_id to help us deduplicate events when necessary. This also helps to run other measurement products at Pinterest.
  * @param searchString The search string related to the user conversion event.
  * @param optOutType Flags for different privacy rights laws to opt out users of sharing personal information. Values should be comma separated. Please follow the <a href=\"https://help.pinterest.com/en/business/article/limited-data-processing\" target=\"_blank\">Help Center</a> and <a href=\"/docs/api-features/conversion-overview/\" target=\"_blank\">dev site</a> for specific opt_out_type set up.
  * @param np Named partner. Not required, this is for Pinterest internal use only. Please do not use this unless specifically guided.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class ConversionEventsDataInnerCustomData(
  currency: Option[String],
  value: Option[String],
  contentIds: Option[List[String]],
  contentName: Option[String],
  contentCategory: Option[String],
  contentBrand: Option[String],
  contents: Option[List[ConversionEventsDataInnerCustomDataContentsInner]],
  numItems: Option[Long],
  orderId: Option[String],
  searchString: Option[String],
  optOutType: Option[String],
  np: Option[String]
)

object ConversionEventsDataInnerCustomData {
  implicit lazy val conversionEventsDataInnerCustomDataJsonFormat: Format[ConversionEventsDataInnerCustomData] = Json.format[ConversionEventsDataInnerCustomData]
}

