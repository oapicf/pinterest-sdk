package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import DeletePartnerAssetsResult._

case class DeletePartnerAssetsResult (
  /* Unique identifier of a business asset. */
  assetId: Option[String],
/* Type of asset. Currently we only support AD_ACCOUNT and PROFILE, and ASSET_GROUP. */
  assetType: Option[String],
/* Permission levels member or partner has on an asset. */
  permissions: Option[List[String]],
/* If is_shared_partner=FALSE, you terminated a partner's asset access to your business asset.<br> If is_shared_partner=TRUE, you terminated your asset access to your partner's business asset. */
  isSharedPartner: Option[Boolean],
/* Unique identifier of a business partner. */
  partnerId: Option[String])

object DeletePartnerAssetsResult {
  import DateTimeCodecs._

  implicit val DeletePartnerAssetsResultCodecJson: CodecJson[DeletePartnerAssetsResult] = CodecJson.derive[DeletePartnerAssetsResult]
  implicit val DeletePartnerAssetsResultDecoder: EntityDecoder[DeletePartnerAssetsResult] = jsonOf[DeletePartnerAssetsResult]
  implicit val DeletePartnerAssetsResultEncoder: EntityEncoder[DeletePartnerAssetsResult] = jsonEncoderOf[DeletePartnerAssetsResult]
}
