package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import ItemResponseOneOf1._

case class ItemResponseOneOf1 (
  catalogType: CatalogsType,
errors: List[ItemValidationEvent],
/* The catalog item id in the merchant namespace */
  itemId: Option[String],
/* The catalog hotel id in the merchant namespace */
  hotelId: Option[String],
/* The catalog creative assets id in the merchant namespace */
  creativeAssetsId: Option[String])

object ItemResponseOneOf1 {
  import DateTimeCodecs._

  implicit val ItemResponseOneOf1CodecJson: CodecJson[ItemResponseOneOf1] = CodecJson.derive[ItemResponseOneOf1]
  implicit val ItemResponseOneOf1Decoder: EntityDecoder[ItemResponseOneOf1] = jsonOf[ItemResponseOneOf1]
  implicit val ItemResponseOneOf1Encoder: EntityEncoder[ItemResponseOneOf1] = jsonEncoderOf[ItemResponseOneOf1]
}
