package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CreateAssetGroupResponse._

case class CreateAssetGroupResponse (
  assetGroup: Option[AssetGroupBinding])

object CreateAssetGroupResponse {
  import DateTimeCodecs._

  implicit val CreateAssetGroupResponseCodecJson: CodecJson[CreateAssetGroupResponse] = CodecJson.derive[CreateAssetGroupResponse]
  implicit val CreateAssetGroupResponseDecoder: EntityDecoder[CreateAssetGroupResponse] = jsonOf[CreateAssetGroupResponse]
  implicit val CreateAssetGroupResponseEncoder: EntityEncoder[CreateAssetGroupResponse] = jsonEncoderOf[CreateAssetGroupResponse]
}
