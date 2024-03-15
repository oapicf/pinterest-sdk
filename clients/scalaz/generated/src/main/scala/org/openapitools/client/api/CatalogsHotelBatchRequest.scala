package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CatalogsHotelBatchRequest._

case class CatalogsHotelBatchRequest (
  catalogType: CatalogsType,
country: Country,
language: Language,
/* Array with catalogs item operations */
  items: List[CatalogsHotelBatchItem],
/* Catalog id pertaining to the hotel item. If not provided, default to oldest hotel catalog */
  catalogId: Option[String])

object CatalogsHotelBatchRequest {
  import DateTimeCodecs._

  implicit val CatalogsHotelBatchRequestCodecJson: CodecJson[CatalogsHotelBatchRequest] = CodecJson.derive[CatalogsHotelBatchRequest]
  implicit val CatalogsHotelBatchRequestDecoder: EntityDecoder[CatalogsHotelBatchRequest] = jsonOf[CatalogsHotelBatchRequest]
  implicit val CatalogsHotelBatchRequestEncoder: EntityEncoder[CatalogsHotelBatchRequest] = jsonEncoderOf[CatalogsHotelBatchRequest]
}
