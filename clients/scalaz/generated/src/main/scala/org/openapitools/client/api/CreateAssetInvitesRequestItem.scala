package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CreateAssetInvitesRequestItem._

case class CreateAssetInvitesRequestItem (
  /* Unique identifier of an invite. */
  inviteId: String,
inviteType: InviteType,
/* An object mapping asset ids to lists of business permissions. This can be used to setting/requesting permissions on various assets. If accepting an invite or request, this object would be used to grant asset permissions to the member or partner.  */
  assetIdToPermissions: Map[String, List[Permissions]])

object CreateAssetInvitesRequestItem {
  import DateTimeCodecs._

  implicit val CreateAssetInvitesRequestItemCodecJson: CodecJson[CreateAssetInvitesRequestItem] = CodecJson.derive[CreateAssetInvitesRequestItem]
  implicit val CreateAssetInvitesRequestItemDecoder: EntityDecoder[CreateAssetInvitesRequestItem] = jsonOf[CreateAssetInvitesRequestItem]
  implicit val CreateAssetInvitesRequestItemEncoder: EntityEncoder[CreateAssetInvitesRequestItem] = jsonEncoderOf[CreateAssetInvitesRequestItem]
}
