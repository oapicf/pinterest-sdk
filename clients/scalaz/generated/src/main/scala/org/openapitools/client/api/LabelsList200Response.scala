package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import LabelsList200Response._

case class LabelsList200Response (
  bookmark: Option[String],
items: List[LabelsResponse])

object LabelsList200Response {
  import DateTimeCodecs._

  implicit val LabelsList200ResponseCodecJson: CodecJson[LabelsList200Response] = CodecJson.derive[LabelsList200Response]
  implicit val LabelsList200ResponseDecoder: EntityDecoder[LabelsList200Response] = jsonOf[LabelsList200Response]
  implicit val LabelsList200ResponseEncoder: EntityEncoder[LabelsList200Response] = jsonEncoderOf[LabelsList200Response]
}
