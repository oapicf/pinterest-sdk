package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import LabelUpdateRequestLabelsInner._

case class LabelUpdateRequestLabelsInner (
  /* Label ID. */
  id: String,
status: Option[LabelStatus],
/* Label name. 100-character limit. */
  value: Option[String])

object LabelUpdateRequestLabelsInner {
  import DateTimeCodecs._

  implicit val LabelUpdateRequestLabelsInnerCodecJson: CodecJson[LabelUpdateRequestLabelsInner] = CodecJson.derive[LabelUpdateRequestLabelsInner]
  implicit val LabelUpdateRequestLabelsInnerDecoder: EntityDecoder[LabelUpdateRequestLabelsInner] = jsonOf[LabelUpdateRequestLabelsInner]
  implicit val LabelUpdateRequestLabelsInnerEncoder: EntityEncoder[LabelUpdateRequestLabelsInner] = jsonEncoderOf[LabelUpdateRequestLabelsInner]
}
