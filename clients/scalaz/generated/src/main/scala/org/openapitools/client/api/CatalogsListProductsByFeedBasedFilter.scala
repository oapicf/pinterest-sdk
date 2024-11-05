package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CatalogsListProductsByFeedBasedFilter._

case class CatalogsListProductsByFeedBasedFilter (
  /* Catalog Feed id pertaining to the catalog product group filter. */
  feedId: String,
filters: CatalogsProductGroupFilters)

object CatalogsListProductsByFeedBasedFilter {
  import DateTimeCodecs._

  implicit val CatalogsListProductsByFeedBasedFilterCodecJson: CodecJson[CatalogsListProductsByFeedBasedFilter] = CodecJson.derive[CatalogsListProductsByFeedBasedFilter]
  implicit val CatalogsListProductsByFeedBasedFilterDecoder: EntityDecoder[CatalogsListProductsByFeedBasedFilter] = jsonOf[CatalogsListProductsByFeedBasedFilter]
  implicit val CatalogsListProductsByFeedBasedFilterEncoder: EntityEncoder[CatalogsListProductsByFeedBasedFilter] = jsonEncoderOf[CatalogsListProductsByFeedBasedFilter]
}
