package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import TargetingTemplateAudienceSizingReachEstimate._

case class TargetingTemplateAudienceSizingReachEstimate (
  estimate: Option[Long],
lowerBound: Option[Long],
upperBound: Option[Long])

object TargetingTemplateAudienceSizingReachEstimate {
  import DateTimeCodecs._

  implicit val TargetingTemplateAudienceSizingReachEstimateCodecJson: CodecJson[TargetingTemplateAudienceSizingReachEstimate] = CodecJson.derive[TargetingTemplateAudienceSizingReachEstimate]
  implicit val TargetingTemplateAudienceSizingReachEstimateDecoder: EntityDecoder[TargetingTemplateAudienceSizingReachEstimate] = jsonOf[TargetingTemplateAudienceSizingReachEstimate]
  implicit val TargetingTemplateAudienceSizingReachEstimateEncoder: EntityEncoder[TargetingTemplateAudienceSizingReachEstimate] = jsonEncoderOf[TargetingTemplateAudienceSizingReachEstimate]
}
