package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import TargetingTemplateList200Response._

case class TargetingTemplateList200Response (
  items: List[TargetingTemplateResponseData],
bookmark: Option[String])

object TargetingTemplateList200Response {
  import DateTimeCodecs._

  implicit val TargetingTemplateList200ResponseCodecJson: CodecJson[TargetingTemplateList200Response] = CodecJson.derive[TargetingTemplateList200Response]
  implicit val TargetingTemplateList200ResponseDecoder: EntityDecoder[TargetingTemplateList200Response] = jsonOf[TargetingTemplateList200Response]
  implicit val TargetingTemplateList200ResponseEncoder: EntityEncoder[TargetingTemplateList200Response] = jsonEncoderOf[TargetingTemplateList200Response]
}
