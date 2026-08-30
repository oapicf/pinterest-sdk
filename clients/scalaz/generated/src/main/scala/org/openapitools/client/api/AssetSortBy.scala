package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import AssetSortBy._

case class AssetSortBy (
  
object AssetSortBy {
  import DateTimeCodecs._

  implicit val AssetSortByCodecJson: CodecJson[AssetSortBy] = CodecJson.derive[AssetSortBy]
  implicit val AssetSortByDecoder: EntityDecoder[AssetSortBy] = jsonOf[AssetSortBy]
  implicit val AssetSortByEncoder: EntityEncoder[AssetSortBy] = jsonEncoderOf[AssetSortBy]
}
