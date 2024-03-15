package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import AudienceInsightType._

case class AudienceInsightType (
  
object AudienceInsightType {
  import DateTimeCodecs._

  implicit val AudienceInsightTypeCodecJson: CodecJson[AudienceInsightType] = CodecJson.derive[AudienceInsightType]
  implicit val AudienceInsightTypeDecoder: EntityDecoder[AudienceInsightType] = jsonOf[AudienceInsightType]
  implicit val AudienceInsightTypeEncoder: EntityEncoder[AudienceInsightType] = jsonEncoderOf[AudienceInsightType]
}
