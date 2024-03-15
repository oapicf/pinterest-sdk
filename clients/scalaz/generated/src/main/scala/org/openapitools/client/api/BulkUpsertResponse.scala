package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import BulkUpsertResponse._

case class BulkUpsertResponse (
  requestId: Option[String])

object BulkUpsertResponse {
  import DateTimeCodecs._

  implicit val BulkUpsertResponseCodecJson: CodecJson[BulkUpsertResponse] = CodecJson.derive[BulkUpsertResponse]
  implicit val BulkUpsertResponseDecoder: EntityDecoder[BulkUpsertResponse] = jsonOf[BulkUpsertResponse]
  implicit val BulkUpsertResponseEncoder: EntityEncoder[BulkUpsertResponse] = jsonEncoderOf[BulkUpsertResponse]
}
