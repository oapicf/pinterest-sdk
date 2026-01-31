package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import LookbackPeriodOptions._

case class LookbackPeriodOptions (
  
object LookbackPeriodOptions {
  import DateTimeCodecs._

  implicit val LookbackPeriodOptionsCodecJson: CodecJson[LookbackPeriodOptions] = CodecJson.derive[LookbackPeriodOptions]
  implicit val LookbackPeriodOptionsDecoder: EntityDecoder[LookbackPeriodOptions] = jsonOf[LookbackPeriodOptions]
  implicit val LookbackPeriodOptionsEncoder: EntityEncoder[LookbackPeriodOptions] = jsonEncoderOf[LookbackPeriodOptions]
}
