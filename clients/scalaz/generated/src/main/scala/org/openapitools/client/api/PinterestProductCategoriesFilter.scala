package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import PinterestProductCategoriesFilter._

case class PinterestProductCategoriesFilter (
  PINTEREST_PRODUCT_CATEGORIES: CatalogsProductGroupMultiplePinterestProductCategoryCriteria)

object PinterestProductCategoriesFilter {
  import DateTimeCodecs._

  implicit val PinterestProductCategoriesFilterCodecJson: CodecJson[PinterestProductCategoriesFilter] = CodecJson.derive[PinterestProductCategoriesFilter]
  implicit val PinterestProductCategoriesFilterDecoder: EntityDecoder[PinterestProductCategoriesFilter] = jsonOf[PinterestProductCategoriesFilter]
  implicit val PinterestProductCategoriesFilterEncoder: EntityEncoder[PinterestProductCategoriesFilter] = jsonEncoderOf[PinterestProductCategoriesFilter]
}
