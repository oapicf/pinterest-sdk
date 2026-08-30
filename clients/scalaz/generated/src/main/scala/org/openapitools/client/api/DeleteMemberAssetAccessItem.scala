package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import DeleteMemberAssetAccessItem._

case class DeleteMemberAssetAccessItem (
  /* Id of the asset on which to remove member permissions. */
  assetId: String,
/* Unique identifier of the member on which to perform the asset permission removal */
  memberId: String)

object DeleteMemberAssetAccessItem {
  import DateTimeCodecs._

  implicit val DeleteMemberAssetAccessItemCodecJson: CodecJson[DeleteMemberAssetAccessItem] = CodecJson.derive[DeleteMemberAssetAccessItem]
  implicit val DeleteMemberAssetAccessItemDecoder: EntityDecoder[DeleteMemberAssetAccessItem] = jsonOf[DeleteMemberAssetAccessItem]
  implicit val DeleteMemberAssetAccessItemEncoder: EntityEncoder[DeleteMemberAssetAccessItem] = jsonEncoderOf[DeleteMemberAssetAccessItem]
}
