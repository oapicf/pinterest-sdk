package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import BulkUpsertRequest._

case class BulkUpsertRequest (
  create: Option[BulkUpsertRequestCreate],
update: Option[BulkUpsertRequestUpdate])

object BulkUpsertRequest {
  import DateTimeCodecs._

  implicit val BulkUpsertRequestCodecJson: CodecJson[BulkUpsertRequest] = CodecJson.derive[BulkUpsertRequest]
  implicit val BulkUpsertRequestDecoder: EntityDecoder[BulkUpsertRequest] = jsonOf[BulkUpsertRequest]
  implicit val BulkUpsertRequestEncoder: EntityEncoder[BulkUpsertRequest] = jsonEncoderOf[BulkUpsertRequest]
}
