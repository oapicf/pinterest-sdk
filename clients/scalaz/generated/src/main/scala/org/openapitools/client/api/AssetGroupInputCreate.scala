package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import AssetGroupInputCreate._

case class AssetGroupInputCreate (
  assetGroup: Option[AssetGroupBinding],
/* Asset group description. */
  assetGroupDescription: String,
/* Asset Group name. */
  assetGroupName: String,
/* Asset Group Types. Note: The asset group types are used for user reference and categorization purposes only and do not impact the functionality of the asset group. */
  assetGroupTypes: List[AssetGroupType])

object AssetGroupInputCreate {
  import DateTimeCodecs._

  implicit val AssetGroupInputCreateCodecJson: CodecJson[AssetGroupInputCreate] = CodecJson.derive[AssetGroupInputCreate]
  implicit val AssetGroupInputCreateDecoder: EntityDecoder[AssetGroupInputCreate] = jsonOf[AssetGroupInputCreate]
  implicit val AssetGroupInputCreateEncoder: EntityEncoder[AssetGroupInputCreate] = jsonEncoderOf[AssetGroupInputCreate]
}
