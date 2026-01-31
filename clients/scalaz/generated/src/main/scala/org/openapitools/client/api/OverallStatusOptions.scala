package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import OverallStatusOptions._

case class OverallStatusOptions (
  
object OverallStatusOptions {
  import DateTimeCodecs._

  implicit val OverallStatusOptionsCodecJson: CodecJson[OverallStatusOptions] = CodecJson.derive[OverallStatusOptions]
  implicit val OverallStatusOptionsDecoder: EntityDecoder[OverallStatusOptions] = jsonOf[OverallStatusOptions]
  implicit val OverallStatusOptionsEncoder: EntityEncoder[OverallStatusOptions] = jsonEncoderOf[OverallStatusOptions]
}
