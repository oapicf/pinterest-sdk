package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import UpdateMemberResult._

case class UpdateMemberResult (
  /* The access level a member has to the business. Values are case-sensitive. <br> - EMPLOYEE: Can only view and access assets you assign to them. They cannot see details about other employees, partners, or other assets. <br> - BIZ_ADMIN: Have full control of roles and can add employees and partners as well as grant asset access. */
  businessRole: Option[String],
/* Unique identifier of the business member. */
  memberId: Option[String])

object UpdateMemberResult {
  import DateTimeCodecs._

  implicit val UpdateMemberResultCodecJson: CodecJson[UpdateMemberResult] = CodecJson.derive[UpdateMemberResult]
  implicit val UpdateMemberResultDecoder: EntityDecoder[UpdateMemberResult] = jsonOf[UpdateMemberResult]
  implicit val UpdateMemberResultEncoder: EntityEncoder[UpdateMemberResult] = jsonEncoderOf[UpdateMemberResult]
}
