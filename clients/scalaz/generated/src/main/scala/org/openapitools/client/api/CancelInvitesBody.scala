package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CancelInvitesBody._

case class CancelInvitesBody (
  /* List of invite/request ids to be cancelled */
  inviteIds: List[String])

object CancelInvitesBody {
  import DateTimeCodecs._

  implicit val CancelInvitesBodyCodecJson: CodecJson[CancelInvitesBody] = CodecJson.derive[CancelInvitesBody]
  implicit val CancelInvitesBodyDecoder: EntityDecoder[CancelInvitesBody] = jsonOf[CancelInvitesBody]
  implicit val CancelInvitesBodyEncoder: EntityEncoder[CancelInvitesBody] = jsonEncoderOf[CancelInvitesBody]
}
