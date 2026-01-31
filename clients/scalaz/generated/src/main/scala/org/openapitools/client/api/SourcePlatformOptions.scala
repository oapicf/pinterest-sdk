package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import SourcePlatformOptions._

case class SourcePlatformOptions (
  
object SourcePlatformOptions {
  import DateTimeCodecs._

  implicit val SourcePlatformOptionsCodecJson: CodecJson[SourcePlatformOptions] = CodecJson.derive[SourcePlatformOptions]
  implicit val SourcePlatformOptionsDecoder: EntityDecoder[SourcePlatformOptions] = jsonOf[SourcePlatformOptions]
  implicit val SourcePlatformOptionsEncoder: EntityEncoder[SourcePlatformOptions] = jsonEncoderOf[SourcePlatformOptions]
}
