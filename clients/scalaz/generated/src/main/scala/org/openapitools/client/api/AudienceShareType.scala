package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import AudienceShareType._

case class AudienceShareType (
  
object AudienceShareType {
  import DateTimeCodecs._

  implicit val AudienceShareTypeCodecJson: CodecJson[AudienceShareType] = CodecJson.derive[AudienceShareType]
  implicit val AudienceShareTypeDecoder: EntityDecoder[AudienceShareType] = jsonOf[AudienceShareType]
  implicit val AudienceShareTypeEncoder: EntityEncoder[AudienceShareType] = jsonEncoderOf[AudienceShareType]
}
