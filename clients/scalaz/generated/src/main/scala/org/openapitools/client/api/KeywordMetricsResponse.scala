package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import KeywordMetricsResponse._

case class KeywordMetricsResponse (
  /* Keyword name, e.g., \"keyword\":\"fashion outfits\" */
  keyword: Option[String],
metrics: Option[KeywordMetrics])

object KeywordMetricsResponse {
  import DateTimeCodecs._

  implicit val KeywordMetricsResponseCodecJson: CodecJson[KeywordMetricsResponse] = CodecJson.derive[KeywordMetricsResponse]
  implicit val KeywordMetricsResponseDecoder: EntityDecoder[KeywordMetricsResponse] = jsonOf[KeywordMetricsResponse]
  implicit val KeywordMetricsResponseEncoder: EntityEncoder[KeywordMetricsResponse] = jsonEncoderOf[KeywordMetricsResponse]
}
