package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import AssetIdPermissions._

case class AssetIdPermissions (
  /* Unique identifier of a business asset. */
  assetId: Option[String],
/* Type of asset. Currently we only support AD_ACCOUNT and PROFILE, and ASSET_GROUP. */
  assetType: Option[String],
/* Permission levels member or partner has on an asset. */
  permissions: Option[List[String]],
assetGroupInfo: Option[AssetGroupBinding])

object AssetIdPermissions {
  import DateTimeCodecs._

  implicit val AssetIdPermissionsCodecJson: CodecJson[AssetIdPermissions] = CodecJson.derive[AssetIdPermissions]
  implicit val AssetIdPermissionsDecoder: EntityDecoder[AssetIdPermissions] = jsonOf[AssetIdPermissions]
  implicit val AssetIdPermissionsEncoder: EntityEncoder[AssetIdPermissions] = jsonEncoderOf[AssetIdPermissions]
}
