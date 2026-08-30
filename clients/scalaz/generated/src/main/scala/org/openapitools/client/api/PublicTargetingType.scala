package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import PublicTargetingType._

case class PublicTargetingType (
  
object PublicTargetingType {
  import DateTimeCodecs._

  implicit val PublicTargetingTypeCodecJson: CodecJson[PublicTargetingType] = CodecJson.derive[PublicTargetingType]
  implicit val PublicTargetingTypeDecoder: EntityDecoder[PublicTargetingType] = jsonOf[PublicTargetingType]
  implicit val PublicTargetingTypeEncoder: EntityEncoder[PublicTargetingType] = jsonEncoderOf[PublicTargetingType]
}
