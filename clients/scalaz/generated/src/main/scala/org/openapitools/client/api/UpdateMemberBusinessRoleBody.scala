package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import UpdateMemberBusinessRoleBody._

case class UpdateMemberBusinessRoleBody (
  businessRole: BusinessRoleForMembers,
/* Unique identifier of the member */
  memberId: String)

object UpdateMemberBusinessRoleBody {
  import DateTimeCodecs._

  implicit val UpdateMemberBusinessRoleBodyCodecJson: CodecJson[UpdateMemberBusinessRoleBody] = CodecJson.derive[UpdateMemberBusinessRoleBody]
  implicit val UpdateMemberBusinessRoleBodyDecoder: EntityDecoder[UpdateMemberBusinessRoleBody] = jsonOf[UpdateMemberBusinessRoleBody]
  implicit val UpdateMemberBusinessRoleBodyEncoder: EntityEncoder[UpdateMemberBusinessRoleBody] = jsonEncoderOf[UpdateMemberBusinessRoleBody]
}
