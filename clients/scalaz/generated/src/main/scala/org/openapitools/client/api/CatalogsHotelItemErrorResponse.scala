package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CatalogsHotelItemErrorResponse._

case class CatalogsHotelItemErrorResponse (
  catalogType: CatalogsType,
/* The catalog hotel id in the merchant namespace */
  hotelId: Option[String],
/* Array with the errors for the item id requested */
  errors: Option[List[ItemValidationEvent]])

object CatalogsHotelItemErrorResponse {
  import DateTimeCodecs._

  implicit val CatalogsHotelItemErrorResponseCodecJson: CodecJson[CatalogsHotelItemErrorResponse] = CodecJson.derive[CatalogsHotelItemErrorResponse]
  implicit val CatalogsHotelItemErrorResponseDecoder: EntityDecoder[CatalogsHotelItemErrorResponse] = jsonOf[CatalogsHotelItemErrorResponse]
  implicit val CatalogsHotelItemErrorResponseEncoder: EntityEncoder[CatalogsHotelItemErrorResponse] = jsonEncoderOf[CatalogsHotelItemErrorResponse]
}
