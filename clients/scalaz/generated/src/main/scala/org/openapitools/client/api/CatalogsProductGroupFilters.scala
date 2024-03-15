package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CatalogsProductGroupFilters._

case class CatalogsProductGroupFilters (
  anyOf: List[CatalogsProductGroupFilterKeys],
allOf: List[CatalogsProductGroupFilterKeys])

object CatalogsProductGroupFilters {
  import DateTimeCodecs._

  implicit val CatalogsProductGroupFiltersCodecJson: CodecJson[CatalogsProductGroupFilters] = CodecJson.derive[CatalogsProductGroupFilters]
  implicit val CatalogsProductGroupFiltersDecoder: EntityDecoder[CatalogsProductGroupFilters] = jsonOf[CatalogsProductGroupFilters]
  implicit val CatalogsProductGroupFiltersEncoder: EntityEncoder[CatalogsProductGroupFilters] = jsonEncoderOf[CatalogsProductGroupFilters]
}
