package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import GetPartnerAssetsResponse._

case class GetPartnerAssetsResponse (
  /* Unique identifier of a business asset. */
  assetId: Option[String],
/* Type of asset. Currently we only support AD_ACCOUNT and PROFILE, and ASSET_GROUP. */
  assetType: Option[String],
/* The permissions you or your partner has on the asset. If partner_type=INTERNAL, the permission levels are for the access the partner has to your business asset.<br> If partner_type=EXTERNAL, the permission levels are for the access you have to the partner's business asset. */
  permissions: Option[List[String]],
assetGroupInfo: Option[AssetGroupBinding])

object GetPartnerAssetsResponse {
  import DateTimeCodecs._

  implicit val GetPartnerAssetsResponseCodecJson: CodecJson[GetPartnerAssetsResponse] = CodecJson.derive[GetPartnerAssetsResponse]
  implicit val GetPartnerAssetsResponseDecoder: EntityDecoder[GetPartnerAssetsResponse] = jsonOf[GetPartnerAssetsResponse]
  implicit val GetPartnerAssetsResponseEncoder: EntityEncoder[GetPartnerAssetsResponse] = jsonEncoderOf[GetPartnerAssetsResponse]
}
