package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import RetailLocalInventoryItemAttributesOptional._

case class RetailLocalInventoryItemAttributesOptional (
  /* Ad link for the item */
  adLink: Option[String],
/* Availability status of the item */
  availability: Option[ItemAvailability],
/* The price of the product. It supports the following formats, \"49.99 USD\", \"49.99USD\" and \"49.99\". If the currency is not included, we default to US dollars. */
  price: Option[String],
/* The sale price of the product. It supports the following formats, \"24.99 USD\", \"24.99USD\" and \"24.99\". If the currency is not included, we default to US dollars. */
  salePrice: Option[String])

object RetailLocalInventoryItemAttributesOptional {
  import DateTimeCodecs._

  implicit val RetailLocalInventoryItemAttributesOptionalCodecJson: CodecJson[RetailLocalInventoryItemAttributesOptional] = CodecJson.derive[RetailLocalInventoryItemAttributesOptional]
  implicit val RetailLocalInventoryItemAttributesOptionalDecoder: EntityDecoder[RetailLocalInventoryItemAttributesOptional] = jsonOf[RetailLocalInventoryItemAttributesOptional]
  implicit val RetailLocalInventoryItemAttributesOptionalEncoder: EntityEncoder[RetailLocalInventoryItemAttributesOptional] = jsonEncoderOf[RetailLocalInventoryItemAttributesOptional]
}
