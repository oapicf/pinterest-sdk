package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import RespondToInviteResultItem._

case class RespondToInviteResultItem (
  exception: Option[InviteExceptionResponse],
/* An invite object for the invite/request that was successfully accepted/declined. Will only be provided if the an invite/request is successfully created. */
  invite: Option[BaseInviteDataResponse])

object RespondToInviteResultItem {
  import DateTimeCodecs._

  implicit val RespondToInviteResultItemCodecJson: CodecJson[RespondToInviteResultItem] = CodecJson.derive[RespondToInviteResultItem]
  implicit val RespondToInviteResultItemDecoder: EntityDecoder[RespondToInviteResultItem] = jsonOf[RespondToInviteResultItem]
  implicit val RespondToInviteResultItemEncoder: EntityEncoder[RespondToInviteResultItem] = jsonEncoderOf[RespondToInviteResultItem]
}
