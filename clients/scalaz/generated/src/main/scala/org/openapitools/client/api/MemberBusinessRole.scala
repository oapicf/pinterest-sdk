package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import MemberBusinessRole._

case class MemberBusinessRole (
  
object MemberBusinessRole {
  import DateTimeCodecs._

  implicit val MemberBusinessRoleCodecJson: CodecJson[MemberBusinessRole] = CodecJson.derive[MemberBusinessRole]
  implicit val MemberBusinessRoleDecoder: EntityDecoder[MemberBusinessRole] = jsonOf[MemberBusinessRole]
  implicit val MemberBusinessRoleEncoder: EntityEncoder[MemberBusinessRole] = jsonEncoderOf[MemberBusinessRole]
}
