package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import LabelsResponse._

case class LabelsResponse (
  /* Labels that were not successfully applied. */
  errors: Option[List[LabelError]],
labels: Option[List[Label]])

object LabelsResponse {
  import DateTimeCodecs._

  implicit val LabelsResponseCodecJson: CodecJson[LabelsResponse] = CodecJson.derive[LabelsResponse]
  implicit val LabelsResponseDecoder: EntityDecoder[LabelsResponse] = jsonOf[LabelsResponse]
  implicit val LabelsResponseEncoder: EntityEncoder[LabelsResponse] = jsonEncoderOf[LabelsResponse]
}
