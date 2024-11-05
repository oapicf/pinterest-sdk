package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import RespondToInvitesResponseArray._

case class RespondToInvitesResponseArray (
  /* List of invite/request accept/decline status. If there is an error, an exception object will be returned. If the invite/request was successfully accepted/declined, an invite object will be returned. */
  items: Option[List[RespondToInvitesResponseArrayItemsInner]])

object RespondToInvitesResponseArray {
  import DateTimeCodecs._

  implicit val RespondToInvitesResponseArrayCodecJson: CodecJson[RespondToInvitesResponseArray] = CodecJson.derive[RespondToInvitesResponseArray]
  implicit val RespondToInvitesResponseArrayDecoder: EntityDecoder[RespondToInvitesResponseArray] = jsonOf[RespondToInvitesResponseArray]
  implicit val RespondToInvitesResponseArrayEncoder: EntityEncoder[RespondToInvitesResponseArray] = jsonEncoderOf[RespondToInvitesResponseArray]
}
