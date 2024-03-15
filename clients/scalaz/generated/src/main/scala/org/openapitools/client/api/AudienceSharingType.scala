package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import AudienceSharingType._

case class AudienceSharingType (
  
object AudienceSharingType {
  import DateTimeCodecs._

  implicit val AudienceSharingTypeCodecJson: CodecJson[AudienceSharingType] = CodecJson.derive[AudienceSharingType]
  implicit val AudienceSharingTypeDecoder: EntityDecoder[AudienceSharingType] = jsonOf[AudienceSharingType]
  implicit val AudienceSharingTypeEncoder: EntityEncoder[AudienceSharingType] = jsonEncoderOf[AudienceSharingType]
}
