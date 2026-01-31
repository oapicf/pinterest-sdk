package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import InnerProductCategoriesMetricsHighlights._

case class InnerProductCategoriesMetricsHighlights (
  /* Month-over-month percentage change */
  pctChangeMom: BigDecimal)

object InnerProductCategoriesMetricsHighlights {
  import DateTimeCodecs._

  implicit val InnerProductCategoriesMetricsHighlightsCodecJson: CodecJson[InnerProductCategoriesMetricsHighlights] = CodecJson.derive[InnerProductCategoriesMetricsHighlights]
  implicit val InnerProductCategoriesMetricsHighlightsDecoder: EntityDecoder[InnerProductCategoriesMetricsHighlights] = jsonOf[InnerProductCategoriesMetricsHighlights]
  implicit val InnerProductCategoriesMetricsHighlightsEncoder: EntityEncoder[InnerProductCategoriesMetricsHighlights] = jsonEncoderOf[InnerProductCategoriesMetricsHighlights]
}
