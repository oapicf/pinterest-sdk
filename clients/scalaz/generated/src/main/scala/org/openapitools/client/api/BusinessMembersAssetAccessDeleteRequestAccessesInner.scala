package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import BusinessMembersAssetAccessDeleteRequestAccessesInner._

case class BusinessMembersAssetAccessDeleteRequestAccessesInner (
  /* Id of the asset on which to remove member permissions. */
  assetId: String,
/* Unique identifier of the member on which to perform the asset permission removal */
  memberId: String)

object BusinessMembersAssetAccessDeleteRequestAccessesInner {
  import DateTimeCodecs._

  implicit val BusinessMembersAssetAccessDeleteRequestAccessesInnerCodecJson: CodecJson[BusinessMembersAssetAccessDeleteRequestAccessesInner] = CodecJson.derive[BusinessMembersAssetAccessDeleteRequestAccessesInner]
  implicit val BusinessMembersAssetAccessDeleteRequestAccessesInnerDecoder: EntityDecoder[BusinessMembersAssetAccessDeleteRequestAccessesInner] = jsonOf[BusinessMembersAssetAccessDeleteRequestAccessesInner]
  implicit val BusinessMembersAssetAccessDeleteRequestAccessesInnerEncoder: EntityEncoder[BusinessMembersAssetAccessDeleteRequestAccessesInner] = jsonEncoderOf[BusinessMembersAssetAccessDeleteRequestAccessesInner]
}
