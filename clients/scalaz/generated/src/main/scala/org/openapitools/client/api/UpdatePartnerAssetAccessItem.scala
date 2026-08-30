package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import UpdatePartnerAssetAccessItem._

case class UpdatePartnerAssetAccessItem (
  /* Unique identifier of the business asset. */
  assetId: String,
/* Unique identifier of a business partner to update asset access to. */
  partnerId: String,
/* A non-empty array of permissions to assign to the partner. */
  permissions: List[Permissions])

object UpdatePartnerAssetAccessItem {
  import DateTimeCodecs._

  implicit val UpdatePartnerAssetAccessItemCodecJson: CodecJson[UpdatePartnerAssetAccessItem] = CodecJson.derive[UpdatePartnerAssetAccessItem]
  implicit val UpdatePartnerAssetAccessItemDecoder: EntityDecoder[UpdatePartnerAssetAccessItem] = jsonOf[UpdatePartnerAssetAccessItem]
  implicit val UpdatePartnerAssetAccessItemEncoder: EntityEncoder[UpdatePartnerAssetAccessItem] = jsonEncoderOf[UpdatePartnerAssetAccessItem]
}
