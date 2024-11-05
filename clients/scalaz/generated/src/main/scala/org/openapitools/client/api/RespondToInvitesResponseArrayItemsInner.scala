package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import RespondToInvitesResponseArrayItemsInner._

case class RespondToInvitesResponseArrayItemsInner (
  exception: Option[InviteExceptionResponse],
invite: Option[BaseInviteDataResponse])

object RespondToInvitesResponseArrayItemsInner {
  import DateTimeCodecs._

  implicit val RespondToInvitesResponseArrayItemsInnerCodecJson: CodecJson[RespondToInvitesResponseArrayItemsInner] = CodecJson.derive[RespondToInvitesResponseArrayItemsInner]
  implicit val RespondToInvitesResponseArrayItemsInnerDecoder: EntityDecoder[RespondToInvitesResponseArrayItemsInner] = jsonOf[RespondToInvitesResponseArrayItemsInner]
  implicit val RespondToInvitesResponseArrayItemsInnerEncoder: EntityEncoder[RespondToInvitesResponseArrayItemsInner] = jsonEncoderOf[RespondToInvitesResponseArrayItemsInner]
}
