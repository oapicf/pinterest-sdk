package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import FeaturedTrend._

case class FeaturedTrend (
  /* The main interest category */
  interest: InterestsEnum,
/* Market code (e.g., 'US', 'UK', etc.) */
  market: Option[ProductCategoryRegion],
/* List of trending topics within this interest category */
  trends: Option[List[TrendingTopic]])

object FeaturedTrend {
  import DateTimeCodecs._

  implicit val FeaturedTrendCodecJson: CodecJson[FeaturedTrend] = CodecJson.derive[FeaturedTrend]
  implicit val FeaturedTrendDecoder: EntityDecoder[FeaturedTrend] = jsonOf[FeaturedTrend]
  implicit val FeaturedTrendEncoder: EntityEncoder[FeaturedTrend] = jsonEncoderOf[FeaturedTrend]
}
