package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import HotelIdFilter._

case class HotelIdFilter (
  HOTEL_ID: CatalogsProductGroupMultipleStringCriteria)

object HotelIdFilter {
  import DateTimeCodecs._

  implicit val HotelIdFilterCodecJson: CodecJson[HotelIdFilter] = CodecJson.derive[HotelIdFilter]
  implicit val HotelIdFilterDecoder: EntityDecoder[HotelIdFilter] = jsonOf[HotelIdFilter]
  implicit val HotelIdFilterEncoder: EntityEncoder[HotelIdFilter] = jsonEncoderOf[HotelIdFilter]
}
