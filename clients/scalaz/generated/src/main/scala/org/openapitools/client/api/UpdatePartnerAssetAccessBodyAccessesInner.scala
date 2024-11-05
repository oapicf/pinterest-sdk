package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import UpdatePartnerAssetAccessBodyAccessesInner._

case class UpdatePartnerAssetAccessBodyAccessesInner (
  /* Unique identifier of a business partner to update asset access to. */
  partnerId: String,
/* Unique identifier of the business asset. */
  assetId: String,
/* A non-empty array of permissions to assign to the partner. */
  permissions: List[Permissions])

object UpdatePartnerAssetAccessBodyAccessesInner {
  import DateTimeCodecs._

  implicit val UpdatePartnerAssetAccessBodyAccessesInnerCodecJson: CodecJson[UpdatePartnerAssetAccessBodyAccessesInner] = CodecJson.derive[UpdatePartnerAssetAccessBodyAccessesInner]
  implicit val UpdatePartnerAssetAccessBodyAccessesInnerDecoder: EntityDecoder[UpdatePartnerAssetAccessBodyAccessesInner] = jsonOf[UpdatePartnerAssetAccessBodyAccessesInner]
  implicit val UpdatePartnerAssetAccessBodyAccessesInnerEncoder: EntityEncoder[UpdatePartnerAssetAccessBodyAccessesInner] = jsonEncoderOf[UpdatePartnerAssetAccessBodyAccessesInner]
}
