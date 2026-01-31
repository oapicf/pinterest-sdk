package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import BoardPrivacy._

case class BoardPrivacy (
  
object BoardPrivacy {
  import DateTimeCodecs._

  implicit val BoardPrivacyCodecJson: CodecJson[BoardPrivacy] = CodecJson.derive[BoardPrivacy]
  implicit val BoardPrivacyDecoder: EntityDecoder[BoardPrivacy] = jsonOf[BoardPrivacy]
  implicit val BoardPrivacyEncoder: EntityEncoder[BoardPrivacy] = jsonEncoderOf[BoardPrivacy]
}
