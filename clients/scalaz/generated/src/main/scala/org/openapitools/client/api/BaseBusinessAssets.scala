package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import BaseBusinessAssets._

case class BaseBusinessAssets (
  /* An object containing all the information specific to the provided asset group. This field will be populated only if asset_type equals 'ASSET_GROUP'. */
  assetGroupInfo: Option[AssetGroupBinding],
/* Unique identifier of a business asset. */
  assetId: Option[String],
assetType: Option[AssetTypeResponse],
/* Permission levels the requesting business has on an asset. */
  permissions: Option[List[String]])

object BaseBusinessAssets {
  import DateTimeCodecs._

  implicit val BaseBusinessAssetsCodecJson: CodecJson[BaseBusinessAssets] = CodecJson.derive[BaseBusinessAssets]
  implicit val BaseBusinessAssetsDecoder: EntityDecoder[BaseBusinessAssets] = jsonOf[BaseBusinessAssets]
  implicit val BaseBusinessAssetsEncoder: EntityEncoder[BaseBusinessAssets] = jsonEncoderOf[BaseBusinessAssets]
}
