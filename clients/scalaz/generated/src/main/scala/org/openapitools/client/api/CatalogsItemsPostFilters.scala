package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CatalogsItemsPostFilters._

case class CatalogsItemsPostFilters (
  catalogType: CatalogsType,
itemIds: List[String],
/* Catalog id pertaining to the creative assets item. If not provided, default to oldest creative assets catalog */
  catalogId: Option[String],
hotelIds: List[String],
creativeAssetsIds: List[String])

object CatalogsItemsPostFilters {
  import DateTimeCodecs._

  implicit val CatalogsItemsPostFiltersCodecJson: CodecJson[CatalogsItemsPostFilters] = CodecJson.derive[CatalogsItemsPostFilters]
  implicit val CatalogsItemsPostFiltersDecoder: EntityDecoder[CatalogsItemsPostFilters] = jsonOf[CatalogsItemsPostFilters]
  implicit val CatalogsItemsPostFiltersEncoder: EntityEncoder[CatalogsItemsPostFilters] = jsonEncoderOf[CatalogsItemsPostFilters]
}
