package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CatalogsItemsDeleteDiscontinuedBatchRequest._

case class CatalogsItemsDeleteDiscontinuedBatchRequest (
  country: Country,
language: Language,
operation: BatchOperation,
/* Array with catalogs items */
  items: List[ItemDeleteDiscontinuedBatchRecord])

object CatalogsItemsDeleteDiscontinuedBatchRequest {
  import DateTimeCodecs._

  implicit val CatalogsItemsDeleteDiscontinuedBatchRequestCodecJson: CodecJson[CatalogsItemsDeleteDiscontinuedBatchRequest] = CodecJson.derive[CatalogsItemsDeleteDiscontinuedBatchRequest]
  implicit val CatalogsItemsDeleteDiscontinuedBatchRequestDecoder: EntityDecoder[CatalogsItemsDeleteDiscontinuedBatchRequest] = jsonOf[CatalogsItemsDeleteDiscontinuedBatchRequest]
  implicit val CatalogsItemsDeleteDiscontinuedBatchRequestEncoder: EntityEncoder[CatalogsItemsDeleteDiscontinuedBatchRequest] = jsonEncoderOf[CatalogsItemsDeleteDiscontinuedBatchRequest]
}
