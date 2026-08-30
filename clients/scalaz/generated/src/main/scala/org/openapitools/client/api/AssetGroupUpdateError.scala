package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import AssetGroupUpdateError._

case class AssetGroupUpdateError (
  assetGroupId: Option[String],
code: Option[Integer],
message: Option[String])

object AssetGroupUpdateError {
  import DateTimeCodecs._

  implicit val AssetGroupUpdateErrorCodecJson: CodecJson[AssetGroupUpdateError] = CodecJson.derive[AssetGroupUpdateError]
  implicit val AssetGroupUpdateErrorDecoder: EntityDecoder[AssetGroupUpdateError] = jsonOf[AssetGroupUpdateError]
  implicit val AssetGroupUpdateErrorEncoder: EntityEncoder[AssetGroupUpdateError] = jsonEncoderOf[AssetGroupUpdateError]
}
