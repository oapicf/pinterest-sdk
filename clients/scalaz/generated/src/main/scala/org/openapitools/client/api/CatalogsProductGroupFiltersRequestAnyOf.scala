package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CatalogsProductGroupFiltersRequestAnyOf._

case class CatalogsProductGroupFiltersRequestAnyOf (
  anyOf: List[CatalogsProductGroupFilterKeys])

object CatalogsProductGroupFiltersRequestAnyOf {
  import DateTimeCodecs._

  implicit val CatalogsProductGroupFiltersRequestAnyOfCodecJson: CodecJson[CatalogsProductGroupFiltersRequestAnyOf] = CodecJson.derive[CatalogsProductGroupFiltersRequestAnyOf]
  implicit val CatalogsProductGroupFiltersRequestAnyOfDecoder: EntityDecoder[CatalogsProductGroupFiltersRequestAnyOf] = jsonOf[CatalogsProductGroupFiltersRequestAnyOf]
  implicit val CatalogsProductGroupFiltersRequestAnyOfEncoder: EntityEncoder[CatalogsProductGroupFiltersRequestAnyOf] = jsonEncoderOf[CatalogsProductGroupFiltersRequestAnyOf]
}
