package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CatalogsItemsBatchRequest._

case class CatalogsItemsBatchRequest (
  country: Country,
language: CatalogsItemsRequestLanguage,
operation: BatchOperation,
/* Array with catalogs items */
  items: List[ItemDeleteBatchRecord])

object CatalogsItemsBatchRequest {
  import DateTimeCodecs._

  implicit val CatalogsItemsBatchRequestCodecJson: CodecJson[CatalogsItemsBatchRequest] = CodecJson.derive[CatalogsItemsBatchRequest]
  implicit val CatalogsItemsBatchRequestDecoder: EntityDecoder[CatalogsItemsBatchRequest] = jsonOf[CatalogsItemsBatchRequest]
  implicit val CatalogsItemsBatchRequestEncoder: EntityEncoder[CatalogsItemsBatchRequest] = jsonEncoderOf[CatalogsItemsBatchRequest]
}
