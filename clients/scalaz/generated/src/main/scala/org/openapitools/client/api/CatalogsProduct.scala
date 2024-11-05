package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CatalogsProduct._

case class CatalogsProduct (
  catalogType: CatalogsType,
metadata: CatalogsCreativeAssetsProductMetadata,
pin: Pin)

object CatalogsProduct {
  import DateTimeCodecs._

  implicit val CatalogsProductCodecJson: CodecJson[CatalogsProduct] = CodecJson.derive[CatalogsProduct]
  implicit val CatalogsProductDecoder: EntityDecoder[CatalogsProduct] = jsonOf[CatalogsProduct]
  implicit val CatalogsProductEncoder: EntityEncoder[CatalogsProduct] = jsonEncoderOf[CatalogsProduct]
}
