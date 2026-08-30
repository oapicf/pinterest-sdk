package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import IntegrationLogsRequestCreate._

case class IntegrationLogsRequestCreate (
  logs: List[IntegrationLog])

object IntegrationLogsRequestCreate {
  import DateTimeCodecs._

  implicit val IntegrationLogsRequestCreateCodecJson: CodecJson[IntegrationLogsRequestCreate] = CodecJson.derive[IntegrationLogsRequestCreate]
  implicit val IntegrationLogsRequestCreateDecoder: EntityDecoder[IntegrationLogsRequestCreate] = jsonOf[IntegrationLogsRequestCreate]
  implicit val IntegrationLogsRequestCreateEncoder: EntityEncoder[IntegrationLogsRequestCreate] = jsonEncoderOf[IntegrationLogsRequestCreate]
}
