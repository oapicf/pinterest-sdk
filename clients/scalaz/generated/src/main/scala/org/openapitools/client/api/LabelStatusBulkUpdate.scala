package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import LabelStatusBulkUpdate._

case class LabelStatusBulkUpdate (
  
object LabelStatusBulkUpdate {
  import DateTimeCodecs._

  implicit val LabelStatusBulkUpdateCodecJson: CodecJson[LabelStatusBulkUpdate] = CodecJson.derive[LabelStatusBulkUpdate]
  implicit val LabelStatusBulkUpdateDecoder: EntityDecoder[LabelStatusBulkUpdate] = jsonOf[LabelStatusBulkUpdate]
  implicit val LabelStatusBulkUpdateEncoder: EntityEncoder[LabelStatusBulkUpdate] = jsonEncoderOf[LabelStatusBulkUpdate]
}
