package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import AudienceInsightCategoryArrayResponse._

case class AudienceInsightCategoryArrayResponse (
  items: Option[List[AudienceInsightCategoryCommon]])

object AudienceInsightCategoryArrayResponse {
  import DateTimeCodecs._

  implicit val AudienceInsightCategoryArrayResponseCodecJson: CodecJson[AudienceInsightCategoryArrayResponse] = CodecJson.derive[AudienceInsightCategoryArrayResponse]
  implicit val AudienceInsightCategoryArrayResponseDecoder: EntityDecoder[AudienceInsightCategoryArrayResponse] = jsonOf[AudienceInsightCategoryArrayResponse]
  implicit val AudienceInsightCategoryArrayResponseEncoder: EntityEncoder[AudienceInsightCategoryArrayResponse] = jsonEncoderOf[AudienceInsightCategoryArrayResponse]
}
