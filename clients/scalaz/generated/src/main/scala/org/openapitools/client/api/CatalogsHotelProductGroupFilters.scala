package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CatalogsHotelProductGroupFilters._

case class CatalogsHotelProductGroupFilters (
  anyOf: List[CatalogsHotelProductGroupFilterKeys],
allOf: List[CatalogsHotelProductGroupFilterKeys])

object CatalogsHotelProductGroupFilters {
  import DateTimeCodecs._

  implicit val CatalogsHotelProductGroupFiltersCodecJson: CodecJson[CatalogsHotelProductGroupFilters] = CodecJson.derive[CatalogsHotelProductGroupFilters]
  implicit val CatalogsHotelProductGroupFiltersDecoder: EntityDecoder[CatalogsHotelProductGroupFilters] = jsonOf[CatalogsHotelProductGroupFilters]
  implicit val CatalogsHotelProductGroupFiltersEncoder: EntityEncoder[CatalogsHotelProductGroupFilters] = jsonEncoderOf[CatalogsHotelProductGroupFilters]
}
