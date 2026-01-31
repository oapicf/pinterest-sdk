package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import AudienceInsightsResponse._

case class AudienceInsightsResponse (
  /* Category interest distribution */
  categories: Option[List[AudienceCategory]],
/* Generation date */
  date: Option[String],
demographics: Option[AudienceDemographics],
/* Population count. */
  size: Option[Integer],
/* Indicates whether the audience size has been rounded up to the next highest upper boundary. */
  sizeIsUpperBound: Option[Boolean],
`type`: Option[AudienceInsightType])

object AudienceInsightsResponse {
  import DateTimeCodecs._

  implicit val AudienceInsightsResponseCodecJson: CodecJson[AudienceInsightsResponse] = CodecJson.derive[AudienceInsightsResponse]
  implicit val AudienceInsightsResponseDecoder: EntityDecoder[AudienceInsightsResponse] = jsonOf[AudienceInsightsResponse]
  implicit val AudienceInsightsResponseEncoder: EntityEncoder[AudienceInsightsResponse] = jsonEncoderOf[AudienceInsightsResponse]
}
