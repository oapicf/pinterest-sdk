package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import EventProcessingStatus._

case class EventProcessingStatus (
  
object EventProcessingStatus {
  import DateTimeCodecs._

  implicit val EventProcessingStatusCodecJson: CodecJson[EventProcessingStatus] = CodecJson.derive[EventProcessingStatus]
  implicit val EventProcessingStatusDecoder: EntityDecoder[EventProcessingStatus] = jsonOf[EventProcessingStatus]
  implicit val EventProcessingStatusEncoder: EntityEncoder[EventProcessingStatus] = jsonEncoderOf[EventProcessingStatus]
}
