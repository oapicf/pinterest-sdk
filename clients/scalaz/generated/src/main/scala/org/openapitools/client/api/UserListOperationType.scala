package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import UserListOperationType._

case class UserListOperationType (
  
object UserListOperationType {
  import DateTimeCodecs._

  implicit val UserListOperationTypeCodecJson: CodecJson[UserListOperationType] = CodecJson.derive[UserListOperationType]
  implicit val UserListOperationTypeDecoder: EntityDecoder[UserListOperationType] = jsonOf[UserListOperationType]
  implicit val UserListOperationTypeEncoder: EntityEncoder[UserListOperationType] = jsonEncoderOf[UserListOperationType]
}
