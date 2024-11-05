package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import InviteExceptionResponse._

case class InviteExceptionResponse (
  /* Unique identifier of the invite/request. */
  inviteOrRequestId: Option[String],
/* Error code associated with the error in performing the action on the invite/request. */
  code: Option[Integer],
/* Error message associated with the error in performing the action on the invite/request. */
  message: Option[String],
/* A list of users' usernames or emails OR a list of partner ids that caused the error. */
  usersOrPartnerIds: Option[List[String]])

object InviteExceptionResponse {
  import DateTimeCodecs._

  implicit val InviteExceptionResponseCodecJson: CodecJson[InviteExceptionResponse] = CodecJson.derive[InviteExceptionResponse]
  implicit val InviteExceptionResponseDecoder: EntityDecoder[InviteExceptionResponse] = jsonOf[InviteExceptionResponse]
  implicit val InviteExceptionResponseEncoder: EntityEncoder[InviteExceptionResponse] = jsonEncoderOf[InviteExceptionResponse]
}
