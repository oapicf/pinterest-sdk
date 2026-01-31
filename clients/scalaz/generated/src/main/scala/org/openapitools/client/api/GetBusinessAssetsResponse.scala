package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import GetBusinessAssetsResponse._

case class GetBusinessAssetsResponse (
  assetGroupInfo: Option[AssetGroupBinding],
/* Unique identifier of a business asset. */
  assetId: Option[String],
/* Type of asset. Currently we only support AD_ACCOUNT, PROFILE, ASSET_GROUP and CATALOG. */
  assetType: Option[String],
catalogInfo: Option[GetBusinessAssetsResponseCatalogInfo])

object GetBusinessAssetsResponse {
  import DateTimeCodecs._

  implicit val GetBusinessAssetsResponseCodecJson: CodecJson[GetBusinessAssetsResponse] = CodecJson.derive[GetBusinessAssetsResponse]
  implicit val GetBusinessAssetsResponseDecoder: EntityDecoder[GetBusinessAssetsResponse] = jsonOf[GetBusinessAssetsResponse]
  implicit val GetBusinessAssetsResponseEncoder: EntityEncoder[GetBusinessAssetsResponse] = jsonEncoderOf[GetBusinessAssetsResponse]
}
