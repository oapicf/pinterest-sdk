package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import UserAccountType._

case class UserAccountType (
  
object UserAccountType {
  import DateTimeCodecs._

  implicit val UserAccountTypeCodecJson: CodecJson[UserAccountType] = CodecJson.derive[UserAccountType]
  implicit val UserAccountTypeDecoder: EntityDecoder[UserAccountType] = jsonOf[UserAccountType]
  implicit val UserAccountTypeEncoder: EntityEncoder[UserAccountType] = jsonEncoderOf[UserAccountType]
}
