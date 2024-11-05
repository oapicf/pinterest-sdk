package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import UpdateAssetGroupBody._

case class UpdateAssetGroupBody (
  /* A list of asset groups and the data that will be used to update them. */
  assetGroupsToUpdate: Option[List[UpdateAssetGroupBodyAssetGroupsToUpdateInner]])

object UpdateAssetGroupBody {
  import DateTimeCodecs._

  implicit val UpdateAssetGroupBodyCodecJson: CodecJson[UpdateAssetGroupBody] = CodecJson.derive[UpdateAssetGroupBody]
  implicit val UpdateAssetGroupBodyDecoder: EntityDecoder[UpdateAssetGroupBody] = jsonOf[UpdateAssetGroupBody]
  implicit val UpdateAssetGroupBodyEncoder: EntityEncoder[UpdateAssetGroupBody] = jsonEncoderOf[UpdateAssetGroupBody]
}
