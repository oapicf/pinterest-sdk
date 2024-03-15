package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import AudienceType._

case class AudienceType (
  
object AudienceType {
  import DateTimeCodecs._

  implicit val AudienceTypeCodecJson: CodecJson[AudienceType] = CodecJson.derive[AudienceType]
  implicit val AudienceTypeDecoder: EntityDecoder[AudienceType] = jsonOf[AudienceType]
  implicit val AudienceTypeEncoder: EntityEncoder[AudienceType] = jsonEncoderOf[AudienceType]
}
