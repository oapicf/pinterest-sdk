package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CatalogsItemsUpdateBatchRequest._

case class CatalogsItemsUpdateBatchRequest (
  country: Country,
language: CatalogsItemsRequestLanguage,
operation: BatchOperation,
/* Array with catalogs items */
  items: List[ItemUpdateBatchRecord])

object CatalogsItemsUpdateBatchRequest {
  import DateTimeCodecs._

  implicit val CatalogsItemsUpdateBatchRequestCodecJson: CodecJson[CatalogsItemsUpdateBatchRequest] = CodecJson.derive[CatalogsItemsUpdateBatchRequest]
  implicit val CatalogsItemsUpdateBatchRequestDecoder: EntityDecoder[CatalogsItemsUpdateBatchRequest] = jsonOf[CatalogsItemsUpdateBatchRequest]
  implicit val CatalogsItemsUpdateBatchRequestEncoder: EntityEncoder[CatalogsItemsUpdateBatchRequest] = jsonEncoderOf[CatalogsItemsUpdateBatchRequest]
}
