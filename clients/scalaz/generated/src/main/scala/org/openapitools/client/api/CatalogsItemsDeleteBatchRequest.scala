package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CatalogsItemsDeleteBatchRequest._

case class CatalogsItemsDeleteBatchRequest (
  country: Country,
language: Language,
operation: BatchOperation,
/* Array with catalogs items */
  items: List[ItemDeleteBatchRecord])

object CatalogsItemsDeleteBatchRequest {
  import DateTimeCodecs._

  implicit val CatalogsItemsDeleteBatchRequestCodecJson: CodecJson[CatalogsItemsDeleteBatchRequest] = CodecJson.derive[CatalogsItemsDeleteBatchRequest]
  implicit val CatalogsItemsDeleteBatchRequestDecoder: EntityDecoder[CatalogsItemsDeleteBatchRequest] = jsonOf[CatalogsItemsDeleteBatchRequest]
  implicit val CatalogsItemsDeleteBatchRequestEncoder: EntityEncoder[CatalogsItemsDeleteBatchRequest] = jsonEncoderOf[CatalogsItemsDeleteBatchRequest]
}
