package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import AudienceDefinition._

case class AudienceDefinition (
  /* Generation date */
  date: Option[String],
/* Generated audience type to request. */
  `type`: Option[String],
/* Generated audience scope to request. */
  scope: Option[String])

object AudienceDefinition {
  import DateTimeCodecs._

  implicit val AudienceDefinitionCodecJson: CodecJson[AudienceDefinition] = CodecJson.derive[AudienceDefinition]
  implicit val AudienceDefinitionDecoder: EntityDecoder[AudienceDefinition] = jsonOf[AudienceDefinition]
  implicit val AudienceDefinitionEncoder: EntityEncoder[AudienceDefinition] = jsonEncoderOf[AudienceDefinition]
}
