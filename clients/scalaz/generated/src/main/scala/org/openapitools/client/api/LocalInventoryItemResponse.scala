package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import LocalInventoryItemResponse._

case class LocalInventoryItemResponse (
  /* Ad link for the item */
  adLink: Option[String],
/* Availability status of the item */
  availability: Option[ItemAvailability],
/* The millisecond timestamp when the local inventory item was created */
  createdAt: Long,
/* The catalog item id in the merchant namespace */
  itemId: String,
/* The millisecond timestamp when the local inventory item was lastly modified by the merchant. */
  lastUpdatedTime: Long,
/* The price of the product. It supports the following formats, \"49.99 USD\", \"49.99USD\" and \"49.99\". If the currency is not included, we default to US dollars. */
  price: Option[String],
/* The sale price of the product. It supports the following formats, \"24.99 USD\", \"24.99USD\" and \"24.99\". If the currency is not included, we default to US dollars. */
  salePrice: Option[String],
/* Store metadata for this local inventory item */
  storeMetadata: StoreMetadata)

object LocalInventoryItemResponse {
  import DateTimeCodecs._

  implicit val LocalInventoryItemResponseCodecJson: CodecJson[LocalInventoryItemResponse] = CodecJson.derive[LocalInventoryItemResponse]
  implicit val LocalInventoryItemResponseDecoder: EntityDecoder[LocalInventoryItemResponse] = jsonOf[LocalInventoryItemResponse]
  implicit val LocalInventoryItemResponseEncoder: EntityEncoder[LocalInventoryItemResponse] = jsonEncoderOf[LocalInventoryItemResponse]
}
