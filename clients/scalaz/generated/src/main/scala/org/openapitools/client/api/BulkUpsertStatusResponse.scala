package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import BulkUpsertStatusResponse._

case class BulkUpsertStatusResponse (
  status: Option[BulkUpsertStatus],
resultUrl: Option[String])

object BulkUpsertStatusResponse {
  import DateTimeCodecs._

  implicit val BulkUpsertStatusResponseCodecJson: CodecJson[BulkUpsertStatusResponse] = CodecJson.derive[BulkUpsertStatusResponse]
  implicit val BulkUpsertStatusResponseDecoder: EntityDecoder[BulkUpsertStatusResponse] = jsonOf[BulkUpsertStatusResponse]
  implicit val BulkUpsertStatusResponseEncoder: EntityEncoder[BulkUpsertStatusResponse] = jsonEncoderOf[BulkUpsertStatusResponse]
}
