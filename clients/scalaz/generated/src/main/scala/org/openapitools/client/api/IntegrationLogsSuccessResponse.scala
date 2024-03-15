package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import IntegrationLogsSuccessResponse._

case class IntegrationLogsSuccessResponse (
  message: Option[String])

object IntegrationLogsSuccessResponse {
  import DateTimeCodecs._

  implicit val IntegrationLogsSuccessResponseCodecJson: CodecJson[IntegrationLogsSuccessResponse] = CodecJson.derive[IntegrationLogsSuccessResponse]
  implicit val IntegrationLogsSuccessResponseDecoder: EntityDecoder[IntegrationLogsSuccessResponse] = jsonOf[IntegrationLogsSuccessResponse]
  implicit val IntegrationLogsSuccessResponseEncoder: EntityEncoder[IntegrationLogsSuccessResponse] = jsonEncoderOf[IntegrationLogsSuccessResponse]
}
