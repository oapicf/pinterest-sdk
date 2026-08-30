package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import BusinessMembershipMember._

case class BusinessMembershipMember (
  businessRole: BusinessRoleForMembers,
/* Unique identifier of the member. */
  memberId: String)

object BusinessMembershipMember {
  import DateTimeCodecs._

  implicit val BusinessMembershipMemberCodecJson: CodecJson[BusinessMembershipMember] = CodecJson.derive[BusinessMembershipMember]
  implicit val BusinessMembershipMemberDecoder: EntityDecoder[BusinessMembershipMember] = jsonOf[BusinessMembershipMember]
  implicit val BusinessMembershipMemberEncoder: EntityEncoder[BusinessMembershipMember] = jsonEncoderOf[BusinessMembershipMember]
}
