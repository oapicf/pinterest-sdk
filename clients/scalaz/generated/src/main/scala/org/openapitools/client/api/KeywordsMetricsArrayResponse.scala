package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import KeywordsMetricsArrayResponse._

case class KeywordsMetricsArrayResponse (
  data: Option[List[KeywordMetricsResponse]])

object KeywordsMetricsArrayResponse {
  import DateTimeCodecs._

  implicit val KeywordsMetricsArrayResponseCodecJson: CodecJson[KeywordsMetricsArrayResponse] = CodecJson.derive[KeywordsMetricsArrayResponse]
  implicit val KeywordsMetricsArrayResponseDecoder: EntityDecoder[KeywordsMetricsArrayResponse] = jsonOf[KeywordsMetricsArrayResponse]
  implicit val KeywordsMetricsArrayResponseEncoder: EntityEncoder[KeywordsMetricsArrayResponse] = jsonEncoderOf[KeywordsMetricsArrayResponse]
}
