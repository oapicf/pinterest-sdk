package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import KeywordMetrics._

case class KeywordMetrics (
  /* Average cost per click */
  avgCpcInMicroCurrency: Option[BigDecimal],
/* Keyword's search frequency. This value is based on keyword frequency in pepsi client response */
  keywordQueryVolume: Option[String])

object KeywordMetrics {
  import DateTimeCodecs._

  implicit val KeywordMetricsCodecJson: CodecJson[KeywordMetrics] = CodecJson.derive[KeywordMetrics]
  implicit val KeywordMetricsDecoder: EntityDecoder[KeywordMetrics] = jsonOf[KeywordMetrics]
  implicit val KeywordMetricsEncoder: EntityEncoder[KeywordMetrics] = jsonEncoderOf[KeywordMetrics]
}
