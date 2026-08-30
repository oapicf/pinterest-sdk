package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import AudienceStatus._

case class AudienceStatus (
  
object AudienceStatus {
  import DateTimeCodecs._

  implicit val AudienceStatusCodecJson: CodecJson[AudienceStatus] = CodecJson.derive[AudienceStatus]
  implicit val AudienceStatusDecoder: EntityDecoder[AudienceStatus] = jsonOf[AudienceStatus]
  implicit val AudienceStatusEncoder: EntityEncoder[AudienceStatus] = jsonEncoderOf[AudienceStatus]
}
