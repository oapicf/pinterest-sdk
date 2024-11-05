package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import UpdatePartnerAssetsResult._

case class UpdatePartnerAssetsResult (
  /* Unique identifier of a business asset. */
  assetId: Option[String],
/* Type of asset. Currently we only support AD_ACCOUNT and PROFILE, and ASSET_GROUP. */
  assetType: Option[String],
/* Unique identifier of a business partner. */
  partnerId: Option[String],
/* Permission levels member or partner has on an asset. */
  permissions: Option[List[String]])

object UpdatePartnerAssetsResult {
  import DateTimeCodecs._

  implicit val UpdatePartnerAssetsResultCodecJson: CodecJson[UpdatePartnerAssetsResult] = CodecJson.derive[UpdatePartnerAssetsResult]
  implicit val UpdatePartnerAssetsResultDecoder: EntityDecoder[UpdatePartnerAssetsResult] = jsonOf[UpdatePartnerAssetsResult]
  implicit val UpdatePartnerAssetsResultEncoder: EntityEncoder[UpdatePartnerAssetsResult] = jsonEncoderOf[UpdatePartnerAssetsResult]
}
