package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import ItemResponseAnyOf1._

case class ItemResponseAnyOf1 (
  catalogType: CatalogsType,
/* The catalog item id in the merchant namespace */
  itemId: Option[String],
/* Array with the errors for the item id requested */
  errors: Option[List[ItemValidationEvent]],
/* The catalog hotel id in the merchant namespace */
  hotelId: Option[String])

object ItemResponseAnyOf1 {
  import DateTimeCodecs._

  implicit val ItemResponseAnyOf1CodecJson: CodecJson[ItemResponseAnyOf1] = CodecJson.derive[ItemResponseAnyOf1]
  implicit val ItemResponseAnyOf1Decoder: EntityDecoder[ItemResponseAnyOf1] = jsonOf[ItemResponseAnyOf1]
  implicit val ItemResponseAnyOf1Encoder: EntityEncoder[ItemResponseAnyOf1] = jsonEncoderOf[ItemResponseAnyOf1]
}
