package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import ProductCategoriesMetricsHighlights._

case class ProductCategoriesMetricsHighlights (
  /* Engagement metric value */
  engagement: Option[InnerProductCategoriesMetricsHighlights],
/* Number of outbound clicks */
  outboundClicks: Option[InnerProductCategoriesMetricsHighlights],
/* Number of pin saves */
  pinSaves: Option[InnerProductCategoriesMetricsHighlights])

object ProductCategoriesMetricsHighlights {
  import DateTimeCodecs._

  implicit val ProductCategoriesMetricsHighlightsCodecJson: CodecJson[ProductCategoriesMetricsHighlights] = CodecJson.derive[ProductCategoriesMetricsHighlights]
  implicit val ProductCategoriesMetricsHighlightsDecoder: EntityDecoder[ProductCategoriesMetricsHighlights] = jsonOf[ProductCategoriesMetricsHighlights]
  implicit val ProductCategoriesMetricsHighlightsEncoder: EntityEncoder[ProductCategoriesMetricsHighlights] = jsonEncoderOf[ProductCategoriesMetricsHighlights]
}
