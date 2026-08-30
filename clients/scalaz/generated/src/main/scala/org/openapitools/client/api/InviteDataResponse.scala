package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import InviteDataResponse._

case class InviteDataResponse (
  /* The date and time when the invite/request will expire. Returned in milliseconds. */
  inviteExpiration: Option[Integer],
/* The current status of the invite. The invite can be in one of the following states PENDING, ACCEPTED, DECLINED, CANCELLED, EXPIRED. */
  inviteStatus: Option[String],
/* The type of invite. - 'MEMBER_INVITE' is to invite a member to access your business assets. - 'PARTNER_INVITE' is to invite a partner to access your business assets. - 'PARTNER_REQUEST' is to request access a partner's business assets. */
  inviteType: Option[String],
/* The date and time the invite/request was last updated. Returned in milliseconds. */
  lastUpdatedTime: Option[Integer],
/* The date and time the invite/request was sent/created. Returned in milliseconds. */
  sentAt: Option[Integer])

object InviteDataResponse {
  import DateTimeCodecs._

  implicit val InviteDataResponseCodecJson: CodecJson[InviteDataResponse] = CodecJson.derive[InviteDataResponse]
  implicit val InviteDataResponseDecoder: EntityDecoder[InviteDataResponse] = jsonOf[InviteDataResponse]
  implicit val InviteDataResponseEncoder: EntityEncoder[InviteDataResponse] = jsonEncoderOf[InviteDataResponse]
}
