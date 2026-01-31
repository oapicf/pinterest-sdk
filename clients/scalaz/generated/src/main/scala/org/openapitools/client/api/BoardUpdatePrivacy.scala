package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import BoardUpdatePrivacy._

case class BoardUpdatePrivacy (
  
object BoardUpdatePrivacy {
  import DateTimeCodecs._

  implicit val BoardUpdatePrivacyCodecJson: CodecJson[BoardUpdatePrivacy] = CodecJson.derive[BoardUpdatePrivacy]
  implicit val BoardUpdatePrivacyDecoder: EntityDecoder[BoardUpdatePrivacy] = jsonOf[BoardUpdatePrivacy]
  implicit val BoardUpdatePrivacyEncoder: EntityEncoder[BoardUpdatePrivacy] = jsonEncoderOf[BoardUpdatePrivacy]
}
