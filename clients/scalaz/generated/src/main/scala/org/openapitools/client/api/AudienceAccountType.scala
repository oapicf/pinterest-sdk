package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import AudienceAccountType._

case class AudienceAccountType (
  
object AudienceAccountType {
  import DateTimeCodecs._

  implicit val AudienceAccountTypeCodecJson: CodecJson[AudienceAccountType] = CodecJson.derive[AudienceAccountType]
  implicit val AudienceAccountTypeDecoder: EntityDecoder[AudienceAccountType] = jsonOf[AudienceAccountType]
  implicit val AudienceAccountTypeEncoder: EntityEncoder[AudienceAccountType] = jsonEncoderOf[AudienceAccountType]
}
