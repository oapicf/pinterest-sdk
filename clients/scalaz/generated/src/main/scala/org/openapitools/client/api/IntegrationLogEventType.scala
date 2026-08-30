package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import IntegrationLogEventType._

case class IntegrationLogEventType (
  
object IntegrationLogEventType {
  import DateTimeCodecs._

  implicit val IntegrationLogEventTypeCodecJson: CodecJson[IntegrationLogEventType] = CodecJson.derive[IntegrationLogEventType]
  implicit val IntegrationLogEventTypeDecoder: EntityDecoder[IntegrationLogEventType] = jsonOf[IntegrationLogEventType]
  implicit val IntegrationLogEventTypeEncoder: EntityEncoder[IntegrationLogEventType] = jsonEncoderOf[IntegrationLogEventType]
}
