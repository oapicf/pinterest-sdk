package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import TrendingProductCategory._

case class TrendingProductCategory (
  /* Engagement type */
  engagementType: ProductCategoriesEngagementType,
/* Month-over-month change percentage */
  pctChangeMom: Integer,
/* Relative volume percentage */
  percentRelativeVolume: Integer,
/* Product Category Name */
  productCategory: String,
/* Vertical name associated with the product category */
  verticals: Option[List[VerticalProductCategory]])

object TrendingProductCategory {
  import DateTimeCodecs._

  implicit val TrendingProductCategoryCodecJson: CodecJson[TrendingProductCategory] = CodecJson.derive[TrendingProductCategory]
  implicit val TrendingProductCategoryDecoder: EntityDecoder[TrendingProductCategory] = jsonOf[TrendingProductCategory]
  implicit val TrendingProductCategoryEncoder: EntityEncoder[TrendingProductCategory] = jsonEncoderOf[TrendingProductCategory]
}
