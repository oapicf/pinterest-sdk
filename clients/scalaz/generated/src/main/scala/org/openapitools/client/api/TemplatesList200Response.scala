package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import TemplatesList200Response._

case class TemplatesList200Response (
  items: List[TemplateResponse],
bookmark: Option[String])

object TemplatesList200Response {
  import DateTimeCodecs._

  implicit val TemplatesList200ResponseCodecJson: CodecJson[TemplatesList200Response] = CodecJson.derive[TemplatesList200Response]
  implicit val TemplatesList200ResponseDecoder: EntityDecoder[TemplatesList200Response] = jsonOf[TemplatesList200Response]
  implicit val TemplatesList200ResponseEncoder: EntityEncoder[TemplatesList200Response] = jsonEncoderOf[TemplatesList200Response]
}
