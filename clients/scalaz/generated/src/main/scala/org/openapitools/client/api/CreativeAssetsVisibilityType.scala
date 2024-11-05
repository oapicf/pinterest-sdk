package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CreativeAssetsVisibilityType._

case class CreativeAssetsVisibilityType (
  
object CreativeAssetsVisibilityType {
  import DateTimeCodecs._

  implicit val CreativeAssetsVisibilityTypeCodecJson: CodecJson[CreativeAssetsVisibilityType] = CodecJson.derive[CreativeAssetsVisibilityType]
  implicit val CreativeAssetsVisibilityTypeDecoder: EntityDecoder[CreativeAssetsVisibilityType] = jsonOf[CreativeAssetsVisibilityType]
  implicit val CreativeAssetsVisibilityTypeEncoder: EntityEncoder[CreativeAssetsVisibilityType] = jsonEncoderOf[CreativeAssetsVisibilityType]
}
