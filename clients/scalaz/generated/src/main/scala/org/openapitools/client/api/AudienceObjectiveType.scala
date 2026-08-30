package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import AudienceObjectiveType._

case class AudienceObjectiveType (
  
object AudienceObjectiveType {
  import DateTimeCodecs._

  implicit val AudienceObjectiveTypeCodecJson: CodecJson[AudienceObjectiveType] = CodecJson.derive[AudienceObjectiveType]
  implicit val AudienceObjectiveTypeDecoder: EntityDecoder[AudienceObjectiveType] = jsonOf[AudienceObjectiveType]
  implicit val AudienceObjectiveTypeEncoder: EntityEncoder[AudienceObjectiveType] = jsonEncoderOf[AudienceObjectiveType]
}
