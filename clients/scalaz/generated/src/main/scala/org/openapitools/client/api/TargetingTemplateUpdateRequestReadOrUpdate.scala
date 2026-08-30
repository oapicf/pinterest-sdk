package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import TargetingTemplateUpdateRequestReadOrUpdate._

case class TargetingTemplateUpdateRequestReadOrUpdate (
  /* Targeting template ID */
  id: String,
operationType: AudienceUpdateOperationType,
/* targeting profile attributes */
  targetingAttributes: Option[TargetingSpecOptimal])

object TargetingTemplateUpdateRequestReadOrUpdate {
  import DateTimeCodecs._

  implicit val TargetingTemplateUpdateRequestReadOrUpdateCodecJson: CodecJson[TargetingTemplateUpdateRequestReadOrUpdate] = CodecJson.derive[TargetingTemplateUpdateRequestReadOrUpdate]
  implicit val TargetingTemplateUpdateRequestReadOrUpdateDecoder: EntityDecoder[TargetingTemplateUpdateRequestReadOrUpdate] = jsonOf[TargetingTemplateUpdateRequestReadOrUpdate]
  implicit val TargetingTemplateUpdateRequestReadOrUpdateEncoder: EntityEncoder[TargetingTemplateUpdateRequestReadOrUpdate] = jsonEncoderOf[TargetingTemplateUpdateRequestReadOrUpdate]
}
