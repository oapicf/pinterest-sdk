package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CatalogsVerticalBatchRequest._

case class CatalogsVerticalBatchRequest (
  catalogType: CatalogsType,
country: Country,
language: Language,
/* Array with catalogs item operations */
  items: List[CatalogsHotelBatchItem],
/* Catalog id pertaining to the hotel item. If not provided, default to oldest hotel catalog */
  catalogId: Option[String])

object CatalogsVerticalBatchRequest {
  import DateTimeCodecs._

  implicit val CatalogsVerticalBatchRequestCodecJson: CodecJson[CatalogsVerticalBatchRequest] = CodecJson.derive[CatalogsVerticalBatchRequest]
  implicit val CatalogsVerticalBatchRequestDecoder: EntityDecoder[CatalogsVerticalBatchRequest] = jsonOf[CatalogsVerticalBatchRequest]
  implicit val CatalogsVerticalBatchRequestEncoder: EntityEncoder[CatalogsVerticalBatchRequest] = jsonEncoderOf[CatalogsVerticalBatchRequest]
}
