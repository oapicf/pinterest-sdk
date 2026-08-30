package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import DeletePartnerAssetAccessResult._

case class DeletePartnerAssetAccessResult (
  /* Unique identifier of a business asset. */
  assetId: Option[String],
/* Type of asset. Currently we only support AD_ACCOUNT, PROFILE, ASSET_GROUP and CATALOG. */
  assetType: Option[String],
/* If is_shared_partner=FALSE, you terminated a partner's asset access to your business asset. If is_shared_partner=TRUE, you terminated your asset access to your partner's business asset. */
  isSharedPartner: Option[Boolean],
/* Unique identifier of a business partner. */
  partnerId: Option[String],
/* Permission levels member or partner has on an asset. */
  permissions: Option[List[String]])

object DeletePartnerAssetAccessResult {
  import DateTimeCodecs._

  implicit val DeletePartnerAssetAccessResultCodecJson: CodecJson[DeletePartnerAssetAccessResult] = CodecJson.derive[DeletePartnerAssetAccessResult]
  implicit val DeletePartnerAssetAccessResultDecoder: EntityDecoder[DeletePartnerAssetAccessResult] = jsonOf[DeletePartnerAssetAccessResult]
  implicit val DeletePartnerAssetAccessResultEncoder: EntityEncoder[DeletePartnerAssetAccessResult] = jsonEncoderOf[DeletePartnerAssetAccessResult]
}
