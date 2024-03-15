package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import PinterestTagEventData._

case class PinterestTagEventData (
  currency: Option[Currency],
/* Promotion code. For example, \"Newsletter\". */
  leadType: Option[String],
lineItems: Option[LineItem],
/* Order ID. For example, \"X-151481\". */
  orderId: Option[String],
/* Order quantity. For example, 1. */
  orderQuantity: Option[Integer],
/* Page name. For example, \"Our Favorite Pins on Pinterest\". */
  pageName: Option[String],
/* Promotion code. For example, \"WINTER10\". */
  promoCode: Option[String],
/* Property. For example, \"Athleta\". */
  property: Option[String],
/* Search query string. For example, \"boots\". */
  searchQuery: Option[String],
/* Product value. For example, \"199.98\" */
  value: Option[String],
/* Video title. For example, \"How to style your Parker Boots\". */
  videoTitle: Option[String])

object PinterestTagEventData {
  import DateTimeCodecs._

  implicit val PinterestTagEventDataCodecJson: CodecJson[PinterestTagEventData] = CodecJson.derive[PinterestTagEventData]
  implicit val PinterestTagEventDataDecoder: EntityDecoder[PinterestTagEventData] = jsonOf[PinterestTagEventData]
  implicit val PinterestTagEventDataEncoder: EntityEncoder[PinterestTagEventData] = jsonEncoderOf[PinterestTagEventData]
}
