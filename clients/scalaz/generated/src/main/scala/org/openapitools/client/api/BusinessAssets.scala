package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import BusinessAssets._

case class BusinessAssets (
  /* An object containing all the information specific to the provided asset group. This field will be populated only if asset_type equals 'ASSET_GROUP'. */
  assetGroupInfo: Option[AssetGroupBinding],
/* Unique identifier of a business asset. */
  assetId: Option[String],
assetType: Option[AssetTypeResponse],
/* Permission levels the requesting business has on an asset. */
  permissions: Option[List[String]],
/* An object containing all the information specific to the provided catalog. This field will be populated only if asset_type equals 'CATALOG'. */
  catalogInfo: Option[CatalogBinding])

object BusinessAssets {
  import DateTimeCodecs._

  implicit val BusinessAssetsCodecJson: CodecJson[BusinessAssets] = CodecJson.derive[BusinessAssets]
  implicit val BusinessAssetsDecoder: EntityDecoder[BusinessAssets] = jsonOf[BusinessAssets]
  implicit val BusinessAssetsEncoder: EntityEncoder[BusinessAssets] = jsonEncoderOf[BusinessAssets]
}
