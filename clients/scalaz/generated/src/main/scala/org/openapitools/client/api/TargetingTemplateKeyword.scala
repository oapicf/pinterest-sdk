package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import TargetingTemplateKeyword._

case class TargetingTemplateKeyword (
  matchType: Option[MatchType],
/* The keyword targeting (120 chars max). */
  value: Option[String])

object TargetingTemplateKeyword {
  import DateTimeCodecs._

  implicit val TargetingTemplateKeywordCodecJson: CodecJson[TargetingTemplateKeyword] = CodecJson.derive[TargetingTemplateKeyword]
  implicit val TargetingTemplateKeywordDecoder: EntityDecoder[TargetingTemplateKeyword] = jsonOf[TargetingTemplateKeyword]
  implicit val TargetingTemplateKeywordEncoder: EntityEncoder[TargetingTemplateKeyword] = jsonEncoderOf[TargetingTemplateKeyword]
}
