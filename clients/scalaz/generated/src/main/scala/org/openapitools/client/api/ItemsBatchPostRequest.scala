package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import ItemsBatchPostRequest._

case class ItemsBatchPostRequest (
  catalogType: CatalogsType,
country: Country,
language: Language,
/* Array with catalogs items */
  items: List[ItemDeleteBatchRecord],
/* Catalog id pertaining to the hotel item. If not provided, default to oldest hotel catalog */
  catalogId: Option[String],
operation: BatchOperation)

object ItemsBatchPostRequest {
  import DateTimeCodecs._

  implicit val ItemsBatchPostRequestCodecJson: CodecJson[ItemsBatchPostRequest] = CodecJson.derive[ItemsBatchPostRequest]
  implicit val ItemsBatchPostRequestDecoder: EntityDecoder[ItemsBatchPostRequest] = jsonOf[ItemsBatchPostRequest]
  implicit val ItemsBatchPostRequestEncoder: EntityEncoder[ItemsBatchPostRequest] = jsonEncoderOf[ItemsBatchPostRequest]
}
