package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import AssetTypeResponse._

case class AssetTypeResponse (
  
object AssetTypeResponse {
  import DateTimeCodecs._

  implicit val AssetTypeResponseCodecJson: CodecJson[AssetTypeResponse] = CodecJson.derive[AssetTypeResponse]
  implicit val AssetTypeResponseDecoder: EntityDecoder[AssetTypeResponse] = jsonOf[AssetTypeResponse]
  implicit val AssetTypeResponseEncoder: EntityEncoder[AssetTypeResponse] = jsonEncoderOf[AssetTypeResponse]
}
