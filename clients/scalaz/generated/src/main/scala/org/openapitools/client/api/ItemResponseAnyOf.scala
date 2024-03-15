package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import ItemResponseAnyOf._

case class ItemResponseAnyOf (
  catalogType: CatalogsType,
/* The catalog retail item id in the merchant namespace */
  itemId: Option[String],
/* The pins mapped to the item */
  pins: Option[List[Pin]],
attributes: Option[CatalogsHotelAttributes],
/* The catalog hotel id in the merchant namespace */
  hotelId: Option[String])

object ItemResponseAnyOf {
  import DateTimeCodecs._

  implicit val ItemResponseAnyOfCodecJson: CodecJson[ItemResponseAnyOf] = CodecJson.derive[ItemResponseAnyOf]
  implicit val ItemResponseAnyOfDecoder: EntityDecoder[ItemResponseAnyOf] = jsonOf[ItemResponseAnyOf]
  implicit val ItemResponseAnyOfEncoder: EntityEncoder[ItemResponseAnyOf] = jsonEncoderOf[ItemResponseAnyOf]
}
