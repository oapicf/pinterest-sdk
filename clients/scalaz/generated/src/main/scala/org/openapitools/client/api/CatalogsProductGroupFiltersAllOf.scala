package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CatalogsProductGroupFiltersAllOf._

case class CatalogsProductGroupFiltersAllOf (
  allOf: List[CatalogsProductGroupFilterKeys])

object CatalogsProductGroupFiltersAllOf {
  import DateTimeCodecs._

  implicit val CatalogsProductGroupFiltersAllOfCodecJson: CodecJson[CatalogsProductGroupFiltersAllOf] = CodecJson.derive[CatalogsProductGroupFiltersAllOf]
  implicit val CatalogsProductGroupFiltersAllOfDecoder: EntityDecoder[CatalogsProductGroupFiltersAllOf] = jsonOf[CatalogsProductGroupFiltersAllOf]
  implicit val CatalogsProductGroupFiltersAllOfEncoder: EntityEncoder[CatalogsProductGroupFiltersAllOf] = jsonEncoderOf[CatalogsProductGroupFiltersAllOf]
}
