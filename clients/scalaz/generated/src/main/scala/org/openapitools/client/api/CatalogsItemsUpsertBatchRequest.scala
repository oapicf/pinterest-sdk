package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CatalogsItemsUpsertBatchRequest._

case class CatalogsItemsUpsertBatchRequest (
  country: Country,
language: Language,
operation: BatchOperation,
/* Array with catalogs items */
  items: List[ItemUpsertBatchRecord])

object CatalogsItemsUpsertBatchRequest {
  import DateTimeCodecs._

  implicit val CatalogsItemsUpsertBatchRequestCodecJson: CodecJson[CatalogsItemsUpsertBatchRequest] = CodecJson.derive[CatalogsItemsUpsertBatchRequest]
  implicit val CatalogsItemsUpsertBatchRequestDecoder: EntityDecoder[CatalogsItemsUpsertBatchRequest] = jsonOf[CatalogsItemsUpsertBatchRequest]
  implicit val CatalogsItemsUpsertBatchRequestEncoder: EntityEncoder[CatalogsItemsUpsertBatchRequest] = jsonEncoderOf[CatalogsItemsUpsertBatchRequest]
}
