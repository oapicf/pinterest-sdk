package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CatalogsCreativeAssetsProductGroupFiltersAllOf._

case class CatalogsCreativeAssetsProductGroupFiltersAllOf (
  allOf: List[CatalogsCreativeAssetsProductGroupFilterKeys])

object CatalogsCreativeAssetsProductGroupFiltersAllOf {
  import DateTimeCodecs._

  implicit val CatalogsCreativeAssetsProductGroupFiltersAllOfCodecJson: CodecJson[CatalogsCreativeAssetsProductGroupFiltersAllOf] = CodecJson.derive[CatalogsCreativeAssetsProductGroupFiltersAllOf]
  implicit val CatalogsCreativeAssetsProductGroupFiltersAllOfDecoder: EntityDecoder[CatalogsCreativeAssetsProductGroupFiltersAllOf] = jsonOf[CatalogsCreativeAssetsProductGroupFiltersAllOf]
  implicit val CatalogsCreativeAssetsProductGroupFiltersAllOfEncoder: EntityEncoder[CatalogsCreativeAssetsProductGroupFiltersAllOf] = jsonEncoderOf[CatalogsCreativeAssetsProductGroupFiltersAllOf]
}
