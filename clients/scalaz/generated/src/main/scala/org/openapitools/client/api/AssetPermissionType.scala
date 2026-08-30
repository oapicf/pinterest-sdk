package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import AssetPermissionType._

case class AssetPermissionType (
  
object AssetPermissionType {
  import DateTimeCodecs._

  implicit val AssetPermissionTypeCodecJson: CodecJson[AssetPermissionType] = CodecJson.derive[AssetPermissionType]
  implicit val AssetPermissionTypeDecoder: EntityDecoder[AssetPermissionType] = jsonOf[AssetPermissionType]
  implicit val AssetPermissionTypeEncoder: EntityEncoder[AssetPermissionType] = jsonEncoderOf[AssetPermissionType]
}
