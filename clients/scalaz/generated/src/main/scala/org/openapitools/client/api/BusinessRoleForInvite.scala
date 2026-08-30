package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import BusinessRoleForInvite._

case class BusinessRoleForInvite (
  
object BusinessRoleForInvite {
  import DateTimeCodecs._

  implicit val BusinessRoleForInviteCodecJson: CodecJson[BusinessRoleForInvite] = CodecJson.derive[BusinessRoleForInvite]
  implicit val BusinessRoleForInviteDecoder: EntityDecoder[BusinessRoleForInvite] = jsonOf[BusinessRoleForInvite]
  implicit val BusinessRoleForInviteEncoder: EntityEncoder[BusinessRoleForInvite] = jsonEncoderOf[BusinessRoleForInvite]
}
