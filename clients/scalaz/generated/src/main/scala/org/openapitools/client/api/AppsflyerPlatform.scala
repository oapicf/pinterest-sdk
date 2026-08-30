package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import AppsflyerPlatform._

case class AppsflyerPlatform (
  
object AppsflyerPlatform {
  import DateTimeCodecs._

  implicit val AppsflyerPlatformCodecJson: CodecJson[AppsflyerPlatform] = CodecJson.derive[AppsflyerPlatform]
  implicit val AppsflyerPlatformDecoder: EntityDecoder[AppsflyerPlatform] = jsonOf[AppsflyerPlatform]
  implicit val AppsflyerPlatformEncoder: EntityEncoder[AppsflyerPlatform] = jsonEncoderOf[AppsflyerPlatform]
}
