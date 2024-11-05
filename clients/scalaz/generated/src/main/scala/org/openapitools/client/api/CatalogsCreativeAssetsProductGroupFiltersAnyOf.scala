package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CatalogsCreativeAssetsProductGroupFiltersAnyOf._

case class CatalogsCreativeAssetsProductGroupFiltersAnyOf (
  anyOf: List[CatalogsCreativeAssetsProductGroupFilterKeys])

object CatalogsCreativeAssetsProductGroupFiltersAnyOf {
  import DateTimeCodecs._

  implicit val CatalogsCreativeAssetsProductGroupFiltersAnyOfCodecJson: CodecJson[CatalogsCreativeAssetsProductGroupFiltersAnyOf] = CodecJson.derive[CatalogsCreativeAssetsProductGroupFiltersAnyOf]
  implicit val CatalogsCreativeAssetsProductGroupFiltersAnyOfDecoder: EntityDecoder[CatalogsCreativeAssetsProductGroupFiltersAnyOf] = jsonOf[CatalogsCreativeAssetsProductGroupFiltersAnyOf]
  implicit val CatalogsCreativeAssetsProductGroupFiltersAnyOfEncoder: EntityEncoder[CatalogsCreativeAssetsProductGroupFiltersAnyOf] = jsonEncoderOf[CatalogsCreativeAssetsProductGroupFiltersAnyOf]
}
