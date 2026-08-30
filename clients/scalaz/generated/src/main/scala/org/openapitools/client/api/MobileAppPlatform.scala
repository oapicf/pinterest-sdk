package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import MobileAppPlatform._

case class MobileAppPlatform (
  
object MobileAppPlatform {
  import DateTimeCodecs._

  implicit val MobileAppPlatformCodecJson: CodecJson[MobileAppPlatform] = CodecJson.derive[MobileAppPlatform]
  implicit val MobileAppPlatformDecoder: EntityDecoder[MobileAppPlatform] = jsonOf[MobileAppPlatform]
  implicit val MobileAppPlatformEncoder: EntityEncoder[MobileAppPlatform] = jsonEncoderOf[MobileAppPlatform]
}
