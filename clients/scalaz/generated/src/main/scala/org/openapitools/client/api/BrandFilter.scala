package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import BrandFilter._

case class BrandFilter (
  BRAND: CatalogsProductGroupMultipleStringCriteria)

object BrandFilter {
  import DateTimeCodecs._

  implicit val BrandFilterCodecJson: CodecJson[BrandFilter] = CodecJson.derive[BrandFilter]
  implicit val BrandFilterDecoder: EntityDecoder[BrandFilter] = jsonOf[BrandFilter]
  implicit val BrandFilterEncoder: EntityEncoder[BrandFilter] = jsonEncoderOf[BrandFilter]
}
