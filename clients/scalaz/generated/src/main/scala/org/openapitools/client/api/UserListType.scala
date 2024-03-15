package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import UserListType._

case class UserListType (
  
object UserListType {
  import DateTimeCodecs._

  implicit val UserListTypeCodecJson: CodecJson[UserListType] = CodecJson.derive[UserListType]
  implicit val UserListTypeDecoder: EntityDecoder[UserListType] = jsonOf[UserListType]
  implicit val UserListTypeEncoder: EntityEncoder[UserListType] = jsonEncoderOf[UserListType]
}
