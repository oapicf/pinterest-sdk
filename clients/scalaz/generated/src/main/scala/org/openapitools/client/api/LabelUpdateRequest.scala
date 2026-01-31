package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import LabelUpdateRequest._

case class LabelUpdateRequest (
  /* Labels that you are applying to the campaign. */
  labels: List[LabelUpdateRequestLabelsInner])

object LabelUpdateRequest {
  import DateTimeCodecs._

  implicit val LabelUpdateRequestCodecJson: CodecJson[LabelUpdateRequest] = CodecJson.derive[LabelUpdateRequest]
  implicit val LabelUpdateRequestDecoder: EntityDecoder[LabelUpdateRequest] = jsonOf[LabelUpdateRequest]
  implicit val LabelUpdateRequestEncoder: EntityEncoder[LabelUpdateRequest] = jsonEncoderOf[LabelUpdateRequest]
}
