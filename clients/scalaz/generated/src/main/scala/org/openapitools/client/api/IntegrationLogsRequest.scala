package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import IntegrationLogsRequest._

case class IntegrationLogsRequest (
  logs: List[IntegrationLog])

object IntegrationLogsRequest {
  import DateTimeCodecs._

  implicit val IntegrationLogsRequestCodecJson: CodecJson[IntegrationLogsRequest] = CodecJson.derive[IntegrationLogsRequest]
  implicit val IntegrationLogsRequestDecoder: EntityDecoder[IntegrationLogsRequest] = jsonOf[IntegrationLogsRequest]
  implicit val IntegrationLogsRequestEncoder: EntityEncoder[IntegrationLogsRequest] = jsonEncoderOf[IntegrationLogsRequest]
}
