package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import AssetIdPermissions._

case class AssetIdPermissions (
  /* An object containing all the information specific to the provided asset group. This field will be populated only if asset_type equals 'ASSET_GROUP'. */
  assetGroupInfo: Option[AssetGroupBinding],
/* Unique identifier of a business asset. */
  assetId: String,
assetType: AssetTypeResponse,
/* Permission levels member or partner has on an asset. */
  permissions: List[String])

object AssetIdPermissions {
  import DateTimeCodecs._

  implicit val AssetIdPermissionsCodecJson: CodecJson[AssetIdPermissions] = CodecJson.derive[AssetIdPermissions]
  implicit val AssetIdPermissionsDecoder: EntityDecoder[AssetIdPermissions] = jsonOf[AssetIdPermissions]
  implicit val AssetIdPermissionsEncoder: EntityEncoder[AssetIdPermissions] = jsonEncoderOf[AssetIdPermissions]
}
