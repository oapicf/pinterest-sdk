package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import UpdateMemberAssetAccessBodyAccessesInner._

case class UpdateMemberAssetAccessBodyAccessesInner (
  /* Id of the asset to update. */
  assetId: String,
/* Unique identifier of the member on which to perform the update */
  memberId: String,
/* A non-empty array of permissions to assign to the member. */
  permissions: List[Permissions])

object UpdateMemberAssetAccessBodyAccessesInner {
  import DateTimeCodecs._

  implicit val UpdateMemberAssetAccessBodyAccessesInnerCodecJson: CodecJson[UpdateMemberAssetAccessBodyAccessesInner] = CodecJson.derive[UpdateMemberAssetAccessBodyAccessesInner]
  implicit val UpdateMemberAssetAccessBodyAccessesInnerDecoder: EntityDecoder[UpdateMemberAssetAccessBodyAccessesInner] = jsonOf[UpdateMemberAssetAccessBodyAccessesInner]
  implicit val UpdateMemberAssetAccessBodyAccessesInnerEncoder: EntityEncoder[UpdateMemberAssetAccessBodyAccessesInner] = jsonEncoderOf[UpdateMemberAssetAccessBodyAccessesInner]
}
