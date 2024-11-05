package org.openapitools.server.model


/**
 * = PinterestTagEventData =
 *
 * Optional for VISITOR `audience_type`. With the Pinterest tag, you can use event data to capture event details from your website. This object lists all the available predefined event data fields in the Pinterest tag. You can include these event data fields as part of a VISITOR audience’ s `rule`; however, you **must** specify an `event` for the `event_data` fields to be evaluated. Besides what’s listed, you can also create your own set of `event_data` fields and define their usages or purposes according to your website needs. However, the benefit of using the predefined event data fields is that we can provide various metrics based on those fields' data.<br>Examples per `event` type:<br>`pagevisit`<br>\"event_data\": { \"page_name\": \"My online store 123 | view items | shoe\" }<br>`signup`<br>\"event_data\": { \"lead_type\": \"New release promotion\" }<br>`checkout`<br>\"event_data\": { \"value\": 116, \"order_quantity\": 2, \"currency\": \"USD\", \"line_items\": [ { \"product_name\": \"Pillows (Set of 2)\", \"product_id\": \"11\", \"product_price\": 48, \"product_quantity\": 1 }, { \"product_name\": \"Pillows, Large (Set of 2)\", \"product_id\": \"15\", \"product_price\": 68, \"product_quantity\": 1 } ] }<br>`addtocart`<br>\"event_data\": { \"value\": 499, \"order_quantity\": 1, \"currency\": \"USD\", \"line_items\": [ { \"product_name\": \"Red leather boots\", \"product_id\": \"3486\", \"product_category\": \"shoe\", \"product_variant_id\": \"JB11103000\", \"product_price\": 499, \"product_quantity\": \"1\" , \"product_brand\": \"My brand\" }]}<br>`watchvideo`<br>\"event_data\": { \"video_title\": \"My Product Video 01\" }<br>`lead`<br>\"event_data\": { \"lead_type\": \"Newsletter\" }
 *
 * @param currency  for example: ''null''
 * @param leadType Promotion code. For example, \"Newsletter\". for example: ''Newsletter''
 * @param lineItems  for example: ''null''
 * @param orderId Order ID. For example, \"X-151481\". for example: ''X-151481''
 * @param orderQuantity Order quantity. For example, 1. for example: ''1''
 * @param pageName Page name. For example, \"Our Favorite Pins on Pinterest\". for example: ''Our Favorite Pins on Pinterest.''
 * @param promoCode Promotion code. For example, \"WINTER10\". for example: ''WINTER10''
 * @param property Property. For example, \"Athleta\". for example: ''Athleta''
 * @param searchQuery Search query string. For example, \"boots\". for example: ''boots''
 * @param value Product value. For example, \"199.98\" for example: ''199.98''
 * @param videoTitle Video title. For example, \"How to style your Parker Boots\". for example: ''How to style your Parker Boots''
*/
final case class PinterestTagEventData (
  currency: Option[Currency] = None,
  leadType: Option[String] = None,
  lineItems: Option[LineItem] = None,
  orderId: Option[String] = None,
  orderQuantity: Option[Int] = None,
  pageName: Option[String] = None,
  promoCode: Option[String] = None,
  property: Option[String] = None,
  searchQuery: Option[String] = None,
  value: Option[String] = None,
  videoTitle: Option[String] = None
)

