package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import IntegrationLogLevel._

case class IntegrationLogLevel (
  
object IntegrationLogLevel {
  import DateTimeCodecs._

  implicit val IntegrationLogLevelCodecJson: CodecJson[IntegrationLogLevel] = CodecJson.derive[IntegrationLogLevel]
  implicit val IntegrationLogLevelDecoder: EntityDecoder[IntegrationLogLevel] = jsonOf[IntegrationLogLevel]
  implicit val IntegrationLogLevelEncoder: EntityEncoder[IntegrationLogLevel] = jsonEncoderOf[IntegrationLogLevel]
}
