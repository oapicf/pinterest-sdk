package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CatalogsItemsFilters._

case class CatalogsItemsFilters (
  catalogType: CatalogsType,
itemIds: List[String],
/* Catalog id pertaining to the creative assets item. If not provided, default to oldest creative assets catalog */
  catalogId: Option[String],
hotelIds: List[String],
creativeAssetsIds: List[String])

object CatalogsItemsFilters {
  import DateTimeCodecs._

  implicit val CatalogsItemsFiltersCodecJson: CodecJson[CatalogsItemsFilters] = CodecJson.derive[CatalogsItemsFilters]
  implicit val CatalogsItemsFiltersDecoder: EntityDecoder[CatalogsItemsFilters] = jsonOf[CatalogsItemsFilters]
  implicit val CatalogsItemsFiltersEncoder: EntityEncoder[CatalogsItemsFilters] = jsonEncoderOf[CatalogsItemsFilters]
}
