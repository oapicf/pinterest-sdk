package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import RetailLocalInventoryItemAttributes._

case class RetailLocalInventoryItemAttributes (
  /* Ad link for the item */
  adLink: Option[String],
/* Availability status of the item */
  availability: ItemAvailability,
/* The price of the product. It supports the following formats, \"49.99 USD\", \"49.99USD\" and \"49.99\". If the currency is not included, we default to US dollars. */
  price: String,
/* The sale price of the product. It supports the following formats, \"24.99 USD\", \"24.99USD\" and \"24.99\". If the currency is not included, we default to US dollars. */
  salePrice: Option[String])

object RetailLocalInventoryItemAttributes {
  import DateTimeCodecs._

  implicit val RetailLocalInventoryItemAttributesCodecJson: CodecJson[RetailLocalInventoryItemAttributes] = CodecJson.derive[RetailLocalInventoryItemAttributes]
  implicit val RetailLocalInventoryItemAttributesDecoder: EntityDecoder[RetailLocalInventoryItemAttributes] = jsonOf[RetailLocalInventoryItemAttributes]
  implicit val RetailLocalInventoryItemAttributesEncoder: EntityEncoder[RetailLocalInventoryItemAttributes] = jsonEncoderOf[RetailLocalInventoryItemAttributes]
}
