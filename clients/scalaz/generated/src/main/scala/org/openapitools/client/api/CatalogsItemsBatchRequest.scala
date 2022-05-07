package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CatalogsItemsBatchRequest._

case class CatalogsItemsBatchRequest (
  country: Option[Country],
language: Option[Language],
operation: Option[BatchOperation],
/* Array with catalogs items */
  items: Option[List[ItemBatchRecord]])

object CatalogsItemsBatchRequest {
  import DateTimeCodecs._

  implicit val CatalogsItemsBatchRequestCodecJson: CodecJson[CatalogsItemsBatchRequest] = CodecJson.derive[CatalogsItemsBatchRequest]
  implicit val CatalogsItemsBatchRequestDecoder: EntityDecoder[CatalogsItemsBatchRequest] = jsonOf[CatalogsItemsBatchRequest]
  implicit val CatalogsItemsBatchRequestEncoder: EntityEncoder[CatalogsItemsBatchRequest] = jsonEncoderOf[CatalogsItemsBatchRequest]
}
