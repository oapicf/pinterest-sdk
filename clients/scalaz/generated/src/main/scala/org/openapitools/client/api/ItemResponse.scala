package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import ItemResponse._

case class ItemResponse (
  catalogType: CatalogsType,
/* The catalog item id in the merchant namespace */
  itemId: Option[String],
/* The pins mapped to the item */
  pins: Option[List[Pin]],
attributes: Option[CatalogsCreativeAssetsAttributes],
/* The catalog hotel id in the merchant namespace */
  hotelId: Option[String],
/* The catalog creative assets id in the merchant namespace */
  creativeAssetsId: Option[String],
/* Array with the errors for the item id requested */
  errors: Option[List[ItemValidationEvent]])

object ItemResponse {
  import DateTimeCodecs._

  implicit val ItemResponseCodecJson: CodecJson[ItemResponse] = CodecJson.derive[ItemResponse]
  implicit val ItemResponseDecoder: EntityDecoder[ItemResponse] = jsonOf[ItemResponse]
  implicit val ItemResponseEncoder: EntityEncoder[ItemResponse] = jsonEncoderOf[ItemResponse]
}
