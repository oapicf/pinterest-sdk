package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CatalogsItemsCreateBatchRequest._

case class CatalogsItemsCreateBatchRequest (
  country: Country,
language: CatalogsItemsRequestLanguage,
operation: BatchOperation,
/* Array with catalogs items */
  items: List[ItemCreateBatchRecord])

object CatalogsItemsCreateBatchRequest {
  import DateTimeCodecs._

  implicit val CatalogsItemsCreateBatchRequestCodecJson: CodecJson[CatalogsItemsCreateBatchRequest] = CodecJson.derive[CatalogsItemsCreateBatchRequest]
  implicit val CatalogsItemsCreateBatchRequestDecoder: EntityDecoder[CatalogsItemsCreateBatchRequest] = jsonOf[CatalogsItemsCreateBatchRequest]
  implicit val CatalogsItemsCreateBatchRequestEncoder: EntityEncoder[CatalogsItemsCreateBatchRequest] = jsonEncoderOf[CatalogsItemsCreateBatchRequest]
}
