package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import BaseInviteDataResponse._

case class BaseInviteDataResponse (
  /* Unique identifier of the invite/request. */
  id: Option[String],
inviteData: Option[BaseInviteDataResponseInviteData],
/* Indicates whether the invite/request was received. */
  isReceivedInvite: Option[Boolean],
/* Metadata for the member/partner that was sent the invite/request. */
  user: Option[BusinessAccessUserSummary])

object BaseInviteDataResponse {
  import DateTimeCodecs._

  implicit val BaseInviteDataResponseCodecJson: CodecJson[BaseInviteDataResponse] = CodecJson.derive[BaseInviteDataResponse]
  implicit val BaseInviteDataResponseDecoder: EntityDecoder[BaseInviteDataResponse] = jsonOf[BaseInviteDataResponse]
  implicit val BaseInviteDataResponseEncoder: EntityEncoder[BaseInviteDataResponse] = jsonEncoderOf[BaseInviteDataResponse]
}
