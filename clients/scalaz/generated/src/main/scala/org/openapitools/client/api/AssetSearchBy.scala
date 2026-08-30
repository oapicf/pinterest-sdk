package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import AssetSearchBy._

case class AssetSearchBy (
  
object AssetSearchBy {
  import DateTimeCodecs._

  implicit val AssetSearchByCodecJson: CodecJson[AssetSearchBy] = CodecJson.derive[AssetSearchBy]
  implicit val AssetSearchByDecoder: EntityDecoder[AssetSearchBy] = jsonOf[AssetSearchBy]
  implicit val AssetSearchByEncoder: EntityEncoder[AssetSearchBy] = jsonEncoderOf[AssetSearchBy]
}
