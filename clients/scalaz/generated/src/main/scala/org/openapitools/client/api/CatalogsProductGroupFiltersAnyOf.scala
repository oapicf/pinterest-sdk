package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CatalogsProductGroupFiltersAnyOf._

case class CatalogsProductGroupFiltersAnyOf (
  anyOf: Option[List[CatalogsProductGroupFilterKeys]])

object CatalogsProductGroupFiltersAnyOf {
  import DateTimeCodecs._

  implicit val CatalogsProductGroupFiltersAnyOfCodecJson: CodecJson[CatalogsProductGroupFiltersAnyOf] = CodecJson.derive[CatalogsProductGroupFiltersAnyOf]
  implicit val CatalogsProductGroupFiltersAnyOfDecoder: EntityDecoder[CatalogsProductGroupFiltersAnyOf] = jsonOf[CatalogsProductGroupFiltersAnyOf]
  implicit val CatalogsProductGroupFiltersAnyOfEncoder: EntityEncoder[CatalogsProductGroupFiltersAnyOf] = jsonEncoderOf[CatalogsProductGroupFiltersAnyOf]
}
