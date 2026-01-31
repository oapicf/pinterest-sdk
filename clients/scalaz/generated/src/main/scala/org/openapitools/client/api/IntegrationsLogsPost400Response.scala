package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import IntegrationsLogsPost400Response._

case class IntegrationsLogsPost400Response (
  code: Integer,
message: String,
details: Any)

object IntegrationsLogsPost400Response {
  import DateTimeCodecs._

  implicit val IntegrationsLogsPost400ResponseCodecJson: CodecJson[IntegrationsLogsPost400Response] = CodecJson.derive[IntegrationsLogsPost400Response]
  implicit val IntegrationsLogsPost400ResponseDecoder: EntityDecoder[IntegrationsLogsPost400Response] = jsonOf[IntegrationsLogsPost400Response]
  implicit val IntegrationsLogsPost400ResponseEncoder: EntityEncoder[IntegrationsLogsPost400Response] = jsonEncoderOf[IntegrationsLogsPost400Response]
}
