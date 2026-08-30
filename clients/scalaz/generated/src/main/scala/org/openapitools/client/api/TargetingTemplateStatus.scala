package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import TargetingTemplateStatus._

case class TargetingTemplateStatus (
  
object TargetingTemplateStatus {
  import DateTimeCodecs._

  implicit val TargetingTemplateStatusCodecJson: CodecJson[TargetingTemplateStatus] = CodecJson.derive[TargetingTemplateStatus]
  implicit val TargetingTemplateStatusDecoder: EntityDecoder[TargetingTemplateStatus] = jsonOf[TargetingTemplateStatus]
  implicit val TargetingTemplateStatusEncoder: EntityEncoder[TargetingTemplateStatus] = jsonEncoderOf[TargetingTemplateStatus]
}
