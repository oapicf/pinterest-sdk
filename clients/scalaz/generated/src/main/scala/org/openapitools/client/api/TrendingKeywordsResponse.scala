package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import TrendingKeywordsResponse._

case class TrendingKeywordsResponse (
  /* The top trending keywords for the specified trend type in the requested region.<br /> Results are ordered, with the first element in the array representing the #1 top trend. */
  trends: Option[List[TrendingKeywordsResponseTrendsInner]])

object TrendingKeywordsResponse {
  import DateTimeCodecs._

  implicit val TrendingKeywordsResponseCodecJson: CodecJson[TrendingKeywordsResponse] = CodecJson.derive[TrendingKeywordsResponse]
  implicit val TrendingKeywordsResponseDecoder: EntityDecoder[TrendingKeywordsResponse] = jsonOf[TrendingKeywordsResponse]
  implicit val TrendingKeywordsResponseEncoder: EntityEncoder[TrendingKeywordsResponse] = jsonEncoderOf[TrendingKeywordsResponse]
}
