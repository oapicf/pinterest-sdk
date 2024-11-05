package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import DeleteAssetGroupBody._

case class DeleteAssetGroupBody (
  /* List of ids of asset groups to be deleted */
  assetGroupsToDelete: List[String])

object DeleteAssetGroupBody {
  import DateTimeCodecs._

  implicit val DeleteAssetGroupBodyCodecJson: CodecJson[DeleteAssetGroupBody] = CodecJson.derive[DeleteAssetGroupBody]
  implicit val DeleteAssetGroupBodyDecoder: EntityDecoder[DeleteAssetGroupBody] = jsonOf[DeleteAssetGroupBody]
  implicit val DeleteAssetGroupBodyEncoder: EntityEncoder[DeleteAssetGroupBody] = jsonEncoderOf[DeleteAssetGroupBody]
}
