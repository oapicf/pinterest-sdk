package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import LineItem._

case class LineItem (
  /* Product brand. For example, \"Parker\". */
  productBrand: Option[String],
/* Product category. For example, \"Shoes\". */
  productCategory: Option[String],
/* Product ID. For example, 1414. */
  productId: Option[Integer],
/* Product name. For example, \"Parker Boots\". */
  productName: Option[String],
/* Product price. For example, \"99.99\". */
  productPrice: Option[String],
/* Product quantity. For example, 2. */
  productQuantity: Option[Integer],
/* Product variant. For example, \"Red\". */
  productVariant: Option[String],
/* Product variant ID. For example, \"1414-34832\". */
  productVariantId: Option[String])

object LineItem {
  import DateTimeCodecs._

  implicit val LineItemCodecJson: CodecJson[LineItem] = CodecJson.derive[LineItem]
  implicit val LineItemDecoder: EntityDecoder[LineItem] = jsonOf[LineItem]
  implicit val LineItemEncoder: EntityEncoder[LineItem] = jsonEncoderOf[LineItem]
}
