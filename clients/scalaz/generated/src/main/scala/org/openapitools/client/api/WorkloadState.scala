package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import WorkloadState._

case class WorkloadState (
  
object WorkloadState {
  import DateTimeCodecs._

  implicit val WorkloadStateCodecJson: CodecJson[WorkloadState] = CodecJson.derive[WorkloadState]
  implicit val WorkloadStateDecoder: EntityDecoder[WorkloadState] = jsonOf[WorkloadState]
  implicit val WorkloadStateEncoder: EntityEncoder[WorkloadState] = jsonEncoderOf[WorkloadState]
}
