package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import AudienceInsightCategoryCommon._

case class AudienceInsightCategoryCommon (
  id: Option[String],
index: Option[BigDecimal],
key: Option[String],
name: Option[String],
ratio: Option[BigDecimal])

object AudienceInsightCategoryCommon {
  import DateTimeCodecs._

  implicit val AudienceInsightCategoryCommonCodecJson: CodecJson[AudienceInsightCategoryCommon] = CodecJson.derive[AudienceInsightCategoryCommon]
  implicit val AudienceInsightCategoryCommonDecoder: EntityDecoder[AudienceInsightCategoryCommon] = jsonOf[AudienceInsightCategoryCommon]
  implicit val AudienceInsightCategoryCommonEncoder: EntityEncoder[AudienceInsightCategoryCommon] = jsonEncoderOf[AudienceInsightCategoryCommon]
}
