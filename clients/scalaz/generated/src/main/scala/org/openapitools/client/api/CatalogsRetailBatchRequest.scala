package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CatalogsRetailBatchRequest._

case class CatalogsRetailBatchRequest (
  catalogType: CatalogsType,
country: Country,
language: Language,
/* Array with catalogs item operations */
  items: List[CatalogsRetailBatchRequestItemsInner])

object CatalogsRetailBatchRequest {
  import DateTimeCodecs._

  implicit val CatalogsRetailBatchRequestCodecJson: CodecJson[CatalogsRetailBatchRequest] = CodecJson.derive[CatalogsRetailBatchRequest]
  implicit val CatalogsRetailBatchRequestDecoder: EntityDecoder[CatalogsRetailBatchRequest] = jsonOf[CatalogsRetailBatchRequest]
  implicit val CatalogsRetailBatchRequestEncoder: EntityEncoder[CatalogsRetailBatchRequest] = jsonEncoderOf[CatalogsRetailBatchRequest]
}
