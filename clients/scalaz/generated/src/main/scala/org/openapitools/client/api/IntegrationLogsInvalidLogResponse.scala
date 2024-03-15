package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import IntegrationLogsInvalidLogResponse._

case class IntegrationLogsInvalidLogResponse (
  rejectedLogs: Option[List[IntegrationLogsInvalidLogResponseRejectedLogsInner]])

object IntegrationLogsInvalidLogResponse {
  import DateTimeCodecs._

  implicit val IntegrationLogsInvalidLogResponseCodecJson: CodecJson[IntegrationLogsInvalidLogResponse] = CodecJson.derive[IntegrationLogsInvalidLogResponse]
  implicit val IntegrationLogsInvalidLogResponseDecoder: EntityDecoder[IntegrationLogsInvalidLogResponse] = jsonOf[IntegrationLogsInvalidLogResponse]
  implicit val IntegrationLogsInvalidLogResponseEncoder: EntityEncoder[IntegrationLogsInvalidLogResponse] = jsonEncoderOf[IntegrationLogsInvalidLogResponse]
}
