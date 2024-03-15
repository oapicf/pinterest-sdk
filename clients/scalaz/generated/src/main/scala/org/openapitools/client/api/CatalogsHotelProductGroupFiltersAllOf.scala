package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CatalogsHotelProductGroupFiltersAllOf._

case class CatalogsHotelProductGroupFiltersAllOf (
  allOf: List[CatalogsHotelProductGroupFilterKeys])

object CatalogsHotelProductGroupFiltersAllOf {
  import DateTimeCodecs._

  implicit val CatalogsHotelProductGroupFiltersAllOfCodecJson: CodecJson[CatalogsHotelProductGroupFiltersAllOf] = CodecJson.derive[CatalogsHotelProductGroupFiltersAllOf]
  implicit val CatalogsHotelProductGroupFiltersAllOfDecoder: EntityDecoder[CatalogsHotelProductGroupFiltersAllOf] = jsonOf[CatalogsHotelProductGroupFiltersAllOf]
  implicit val CatalogsHotelProductGroupFiltersAllOfEncoder: EntityEncoder[CatalogsHotelProductGroupFiltersAllOf] = jsonEncoderOf[CatalogsHotelProductGroupFiltersAllOf]
}
