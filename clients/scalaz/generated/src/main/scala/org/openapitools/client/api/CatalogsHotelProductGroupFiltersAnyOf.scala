package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CatalogsHotelProductGroupFiltersAnyOf._

case class CatalogsHotelProductGroupFiltersAnyOf (
  anyOf: List[CatalogsHotelProductGroupFilterKeys])

object CatalogsHotelProductGroupFiltersAnyOf {
  import DateTimeCodecs._

  implicit val CatalogsHotelProductGroupFiltersAnyOfCodecJson: CodecJson[CatalogsHotelProductGroupFiltersAnyOf] = CodecJson.derive[CatalogsHotelProductGroupFiltersAnyOf]
  implicit val CatalogsHotelProductGroupFiltersAnyOfDecoder: EntityDecoder[CatalogsHotelProductGroupFiltersAnyOf] = jsonOf[CatalogsHotelProductGroupFiltersAnyOf]
  implicit val CatalogsHotelProductGroupFiltersAnyOfEncoder: EntityEncoder[CatalogsHotelProductGroupFiltersAnyOf] = jsonEncoderOf[CatalogsHotelProductGroupFiltersAnyOf]
}
