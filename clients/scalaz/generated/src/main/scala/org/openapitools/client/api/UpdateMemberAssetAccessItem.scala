package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import UpdateMemberAssetAccessItem._

case class UpdateMemberAssetAccessItem (
  /* Id of the asset to update. */
  assetId: String,
/* Unique identifier of the member on which to perform the update */
  memberId: String,
/* A non-empty array of permissions to assign to the member. */
  permissions: List[Permissions])

object UpdateMemberAssetAccessItem {
  import DateTimeCodecs._

  implicit val UpdateMemberAssetAccessItemCodecJson: CodecJson[UpdateMemberAssetAccessItem] = CodecJson.derive[UpdateMemberAssetAccessItem]
  implicit val UpdateMemberAssetAccessItemDecoder: EntityDecoder[UpdateMemberAssetAccessItem] = jsonOf[UpdateMemberAssetAccessItem]
  implicit val UpdateMemberAssetAccessItemEncoder: EntityEncoder[UpdateMemberAssetAccessItem] = jsonEncoderOf[UpdateMemberAssetAccessItem]
}
