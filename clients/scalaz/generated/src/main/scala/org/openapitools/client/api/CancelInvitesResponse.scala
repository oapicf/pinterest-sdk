package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CancelInvitesResponse._

case class CancelInvitesResponse (
  items: Option[List[CancelInviteResultItem]])

object CancelInvitesResponse {
  import DateTimeCodecs._

  implicit val CancelInvitesResponseCodecJson: CodecJson[CancelInvitesResponse] = CodecJson.derive[CancelInvitesResponse]
  implicit val CancelInvitesResponseDecoder: EntityDecoder[CancelInvitesResponse] = jsonOf[CancelInvitesResponse]
  implicit val CancelInvitesResponseEncoder: EntityEncoder[CancelInvitesResponse] = jsonEncoderOf[CancelInvitesResponse]
}
