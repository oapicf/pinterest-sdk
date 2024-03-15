package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import BulkUpsertStatus._

case class BulkUpsertStatus (
  
object BulkUpsertStatus {
  import DateTimeCodecs._

  implicit val BulkUpsertStatusCodecJson: CodecJson[BulkUpsertStatus] = CodecJson.derive[BulkUpsertStatus]
  implicit val BulkUpsertStatusDecoder: EntityDecoder[BulkUpsertStatus] = jsonOf[BulkUpsertStatus]
  implicit val BulkUpsertStatusEncoder: EntityEncoder[BulkUpsertStatus] = jsonEncoderOf[BulkUpsertStatus]
}
