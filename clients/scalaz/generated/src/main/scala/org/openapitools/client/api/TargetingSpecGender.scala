package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import TargetingSpecGender._

case class TargetingSpecGender (
  
object TargetingSpecGender {
  import DateTimeCodecs._

  implicit val TargetingSpecGenderCodecJson: CodecJson[TargetingSpecGender] = CodecJson.derive[TargetingSpecGender]
  implicit val TargetingSpecGenderDecoder: EntityDecoder[TargetingSpecGender] = jsonOf[TargetingSpecGender]
  implicit val TargetingSpecGenderEncoder: EntityEncoder[TargetingSpecGender] = jsonEncoderOf[TargetingSpecGender]
}
