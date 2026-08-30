package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import AssetGroupModification._

case class AssetGroupModification (
  /* A list of errors associated with the asset groups. Will be returned if there is an error. */
  exceptions: Option[List[AssetGroupUpdateError]],
/* A list of successfully edited asset groups. */
  updatedAssetGroups: Option[List[AssetGroupBinding]])

object AssetGroupModification {
  import DateTimeCodecs._

  implicit val AssetGroupModificationCodecJson: CodecJson[AssetGroupModification] = CodecJson.derive[AssetGroupModification]
  implicit val AssetGroupModificationDecoder: EntityDecoder[AssetGroupModification] = jsonOf[AssetGroupModification]
  implicit val AssetGroupModificationEncoder: EntityEncoder[AssetGroupModification] = jsonEncoderOf[AssetGroupModification]
}
