package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CatalogsCreativeAssetsProductMetadata._

case class CatalogsCreativeAssetsProductMetadata (
  /* The user-created unique ID that represents the creative assets item. */
  creativeAssetsId: String,
visibility: CreativeAssetsVisibilityType)

object CatalogsCreativeAssetsProductMetadata {
  import DateTimeCodecs._

  implicit val CatalogsCreativeAssetsProductMetadataCodecJson: CodecJson[CatalogsCreativeAssetsProductMetadata] = CodecJson.derive[CatalogsCreativeAssetsProductMetadata]
  implicit val CatalogsCreativeAssetsProductMetadataDecoder: EntityDecoder[CatalogsCreativeAssetsProductMetadata] = jsonOf[CatalogsCreativeAssetsProductMetadata]
  implicit val CatalogsCreativeAssetsProductMetadataEncoder: EntityEncoder[CatalogsCreativeAssetsProductMetadata] = jsonEncoderOf[CatalogsCreativeAssetsProductMetadata]
}
