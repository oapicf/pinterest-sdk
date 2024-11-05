package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import AssetGroupType._

case class AssetGroupType (
  
object AssetGroupType {
  import DateTimeCodecs._

  implicit val AssetGroupTypeCodecJson: CodecJson[AssetGroupType] = CodecJson.derive[AssetGroupType]
  implicit val AssetGroupTypeDecoder: EntityDecoder[AssetGroupType] = jsonOf[AssetGroupType]
  implicit val AssetGroupTypeEncoder: EntityEncoder[AssetGroupType] = jsonEncoderOf[AssetGroupType]
}
