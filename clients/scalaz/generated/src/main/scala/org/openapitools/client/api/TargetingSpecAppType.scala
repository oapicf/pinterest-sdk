package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import TargetingSpecAppType._

case class TargetingSpecAppType (
  
object TargetingSpecAppType {
  import DateTimeCodecs._

  implicit val TargetingSpecAppTypeCodecJson: CodecJson[TargetingSpecAppType] = CodecJson.derive[TargetingSpecAppType]
  implicit val TargetingSpecAppTypeDecoder: EntityDecoder[TargetingSpecAppType] = jsonOf[TargetingSpecAppType]
  implicit val TargetingSpecAppTypeEncoder: EntityEncoder[TargetingSpecAppType] = jsonEncoderOf[TargetingSpecAppType]
}
