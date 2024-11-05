package model

import play.api.libs.json._

/**
  * Optional for VISITOR `audience_type`. With the Pinterest tag, you can use event data to capture event details from your website. This object lists all the available predefined event data fields in the Pinterest tag. You can include these event data fields as part of a VISITOR audience’ s `rule`; however, you **must** specify an `event` for the `event_data` fields to be evaluated. Besides what’s listed, you can also create your own set of `event_data` fields and define their usages or purposes according to your website needs. However, the benefit of using the predefined event data fields is that we can provide various metrics based on those fields' data.<br>Examples per `event` type:<br>`pagevisit`<br>\"event_data\": { \"page_name\": \"My online store 123 | view items | shoe\" }<br>`signup`<br>\"event_data\": { \"lead_type\": \"New release promotion\" }<br>`checkout`<br>\"event_data\": { \"value\": 116, \"order_quantity\": 2, \"currency\": \"USD\", \"line_items\": [ { \"product_name\": \"Pillows (Set of 2)\", \"product_id\": \"11\", \"product_price\": 48, \"product_quantity\": 1 }, { \"product_name\": \"Pillows, Large (Set of 2)\", \"product_id\": \"15\", \"product_price\": 68, \"product_quantity\": 1 } ] }<br>`addtocart`<br>\"event_data\": { \"value\": 499, \"order_quantity\": 1, \"currency\": \"USD\", \"line_items\": [ { \"product_name\": \"Red leather boots\", \"product_id\": \"3486\", \"product_category\": \"shoe\", \"product_variant_id\": \"JB11103000\", \"product_price\": 499, \"product_quantity\": \"1\" , \"product_brand\": \"My brand\" }]}<br>`watchvideo`<br>\"event_data\": { \"video_title\": \"My Product Video 01\" }<br>`lead`<br>\"event_data\": { \"lead_type\": \"Newsletter\" }
  * @param leadType Promotion code. For example, \"Newsletter\".
  * @param orderId Order ID. For example, \"X-151481\".
  * @param orderQuantity Order quantity. For example, 1.
  * @param pageName Page name. For example, \"Our Favorite Pins on Pinterest\".
  * @param promoCode Promotion code. For example, \"WINTER10\".
  * @param property Property. For example, \"Athleta\".
  * @param searchQuery Search query string. For example, \"boots\".
  * @param value Product value. For example, \"199.98\"
  * @param videoTitle Video title. For example, \"How to style your Parker Boots\".
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class PinterestTagEventData(
  currency: Option[Currency],
  leadType: Option[String],
  lineItems: Option[LineItem],
  orderId: Option[String],
  orderQuantity: Option[Int],
  pageName: Option[String],
  promoCode: Option[String],
  property: Option[String],
  searchQuery: Option[String],
  value: Option[String],
  videoTitle: Option[String]
)

object PinterestTagEventData {
  implicit lazy val pinterestTagEventDataJsonFormat: Format[PinterestTagEventData] = Json.format[PinterestTagEventData]
}

