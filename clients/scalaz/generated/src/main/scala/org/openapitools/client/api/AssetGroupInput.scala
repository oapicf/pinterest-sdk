package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import AssetGroupInput._

case class AssetGroupInput (
  assetGroup: Option[AssetGroupBinding])

object AssetGroupInput {
  import DateTimeCodecs._

  implicit val AssetGroupInputCodecJson: CodecJson[AssetGroupInput] = CodecJson.derive[AssetGroupInput]
  implicit val AssetGroupInputDecoder: EntityDecoder[AssetGroupInput] = jsonOf[AssetGroupInput]
  implicit val AssetGroupInputEncoder: EntityEncoder[AssetGroupInput] = jsonEncoderOf[AssetGroupInput]
}
