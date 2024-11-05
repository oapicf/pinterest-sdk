package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import MembersToDeleteBodyMembersInner._

case class MembersToDeleteBodyMembersInner (
  /* Unique identifier of the member */
  memberId: String,
businessRole: BusinessRoleForMembers)

object MembersToDeleteBodyMembersInner {
  import DateTimeCodecs._

  implicit val MembersToDeleteBodyMembersInnerCodecJson: CodecJson[MembersToDeleteBodyMembersInner] = CodecJson.derive[MembersToDeleteBodyMembersInner]
  implicit val MembersToDeleteBodyMembersInnerDecoder: EntityDecoder[MembersToDeleteBodyMembersInner] = jsonOf[MembersToDeleteBodyMembersInner]
  implicit val MembersToDeleteBodyMembersInnerEncoder: EntityEncoder[MembersToDeleteBodyMembersInner] = jsonEncoderOf[MembersToDeleteBodyMembersInner]
}
