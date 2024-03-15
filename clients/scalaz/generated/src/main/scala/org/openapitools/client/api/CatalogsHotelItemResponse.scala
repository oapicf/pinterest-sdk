package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CatalogsHotelItemResponse._

case class CatalogsHotelItemResponse (
  catalogType: CatalogsType,
/* The catalog hotel id in the merchant namespace */
  hotelId: Option[String],
/* The pins mapped to the item */
  pins: Option[List[Pin]],
attributes: Option[CatalogsHotelAttributes])

object CatalogsHotelItemResponse {
  import DateTimeCodecs._

  implicit val CatalogsHotelItemResponseCodecJson: CodecJson[CatalogsHotelItemResponse] = CodecJson.derive[CatalogsHotelItemResponse]
  implicit val CatalogsHotelItemResponseDecoder: EntityDecoder[CatalogsHotelItemResponse] = jsonOf[CatalogsHotelItemResponse]
  implicit val CatalogsHotelItemResponseEncoder: EntityEncoder[CatalogsHotelItemResponse] = jsonEncoderOf[CatalogsHotelItemResponse]
}
