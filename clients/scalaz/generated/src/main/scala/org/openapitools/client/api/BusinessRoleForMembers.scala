package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import BusinessRoleForMembers._

case class BusinessRoleForMembers (
  
object BusinessRoleForMembers {
  import DateTimeCodecs._

  implicit val BusinessRoleForMembersCodecJson: CodecJson[BusinessRoleForMembers] = CodecJson.derive[BusinessRoleForMembers]
  implicit val BusinessRoleForMembersDecoder: EntityDecoder[BusinessRoleForMembers] = jsonOf[BusinessRoleForMembers]
  implicit val BusinessRoleForMembersEncoder: EntityEncoder[BusinessRoleForMembers] = jsonEncoderOf[BusinessRoleForMembers]
}
