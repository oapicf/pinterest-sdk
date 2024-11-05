package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import TargetingTemplateAudienceSizing._

case class TargetingTemplateAudienceSizing (
  reachEstimate: Option[TargetingTemplateAudienceSizingReachEstimate])

object TargetingTemplateAudienceSizing {
  import DateTimeCodecs._

  implicit val TargetingTemplateAudienceSizingCodecJson: CodecJson[TargetingTemplateAudienceSizing] = CodecJson.derive[TargetingTemplateAudienceSizing]
  implicit val TargetingTemplateAudienceSizingDecoder: EntityDecoder[TargetingTemplateAudienceSizing] = jsonOf[TargetingTemplateAudienceSizing]
  implicit val TargetingTemplateAudienceSizingEncoder: EntityEncoder[TargetingTemplateAudienceSizing] = jsonEncoderOf[TargetingTemplateAudienceSizing]
}
