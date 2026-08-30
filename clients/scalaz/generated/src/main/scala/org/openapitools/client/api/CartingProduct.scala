package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CartingProduct._

case class CartingProduct (
  /* the internal Pinterest carting product id (different from industry product id) */
  cartingProductId: String,
/* Whether to display only the preferred retailers for the carting product */
  displayPreferredRetailersOnly: Option[Boolean],
/* Whether to display the price for the carting product */
  displayProductPrice: Option[Boolean],
/* A sorted array of preferred retailers for the carting product */
  preferredRetailers: Option[List[CartingRetailer]],
/* Whether to randomize preferred retailers for the carting product */
  randomizePreferredRetailers: Option[Boolean])

object CartingProduct {
  import DateTimeCodecs._

  implicit val CartingProductCodecJson: CodecJson[CartingProduct] = CodecJson.derive[CartingProduct]
  implicit val CartingProductDecoder: EntityDecoder[CartingProduct] = jsonOf[CartingProduct]
  implicit val CartingProductEncoder: EntityEncoder[CartingProduct] = jsonEncoderOf[CartingProduct]
}
