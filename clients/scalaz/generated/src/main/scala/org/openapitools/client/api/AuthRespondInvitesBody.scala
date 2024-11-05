package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import AuthRespondInvitesBody._

case class AuthRespondInvitesBody (
  invites: List[AuthRespondInvitesBodyInvitesInner])

object AuthRespondInvitesBody {
  import DateTimeCodecs._

  implicit val AuthRespondInvitesBodyCodecJson: CodecJson[AuthRespondInvitesBody] = CodecJson.derive[AuthRespondInvitesBody]
  implicit val AuthRespondInvitesBodyDecoder: EntityDecoder[AuthRespondInvitesBody] = jsonOf[AuthRespondInvitesBody]
  implicit val AuthRespondInvitesBodyEncoder: EntityEncoder[AuthRespondInvitesBody] = jsonEncoderOf[AuthRespondInvitesBody]
}
