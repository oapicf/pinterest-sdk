package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import DeleteBusinessMembershipMember._

case class DeleteBusinessMembershipMember (
  businessRole: BusinessRoleForMembers,
/* Unique identifier of the member */
  memberId: String)

object DeleteBusinessMembershipMember {
  import DateTimeCodecs._

  implicit val DeleteBusinessMembershipMemberCodecJson: CodecJson[DeleteBusinessMembershipMember] = CodecJson.derive[DeleteBusinessMembershipMember]
  implicit val DeleteBusinessMembershipMemberDecoder: EntityDecoder[DeleteBusinessMembershipMember] = jsonOf[DeleteBusinessMembershipMember]
  implicit val DeleteBusinessMembershipMemberEncoder: EntityEncoder[DeleteBusinessMembershipMember] = jsonEncoderOf[DeleteBusinessMembershipMember]
}
