package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import AssetIdWithPermissions._

case class AssetIdWithPermissions (
  /* Unique identifier of a business asset. */
  id: Option[String],
/* Permission levels member or partner has on an asset. */
  permissions: Option[List[String]])

object AssetIdWithPermissions {
  import DateTimeCodecs._

  implicit val AssetIdWithPermissionsCodecJson: CodecJson[AssetIdWithPermissions] = CodecJson.derive[AssetIdWithPermissions]
  implicit val AssetIdWithPermissionsDecoder: EntityDecoder[AssetIdWithPermissions] = jsonOf[AssetIdWithPermissions]
  implicit val AssetIdWithPermissionsEncoder: EntityEncoder[AssetIdWithPermissions] = jsonEncoderOf[AssetIdWithPermissions]
}
