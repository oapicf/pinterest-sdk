package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CreateAssetInvitesRequest._

case class CreateAssetInvitesRequest (
  invites: List[CreateAssetInvitesRequestItem])

object CreateAssetInvitesRequest {
  import DateTimeCodecs._

  implicit val CreateAssetInvitesRequestCodecJson: CodecJson[CreateAssetInvitesRequest] = CodecJson.derive[CreateAssetInvitesRequest]
  implicit val CreateAssetInvitesRequestDecoder: EntityDecoder[CreateAssetInvitesRequest] = jsonOf[CreateAssetInvitesRequest]
  implicit val CreateAssetInvitesRequestEncoder: EntityEncoder[CreateAssetInvitesRequest] = jsonEncoderOf[CreateAssetInvitesRequest]
}
