package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import LabelCreateRequestLabelsInner._

case class LabelCreateRequestLabelsInner (
  labelType: LabelType,
/* Label name. 100-character limit. */
  value: String)

object LabelCreateRequestLabelsInner {
  import DateTimeCodecs._

  implicit val LabelCreateRequestLabelsInnerCodecJson: CodecJson[LabelCreateRequestLabelsInner] = CodecJson.derive[LabelCreateRequestLabelsInner]
  implicit val LabelCreateRequestLabelsInnerDecoder: EntityDecoder[LabelCreateRequestLabelsInner] = jsonOf[LabelCreateRequestLabelsInner]
  implicit val LabelCreateRequestLabelsInnerEncoder: EntityEncoder[LabelCreateRequestLabelsInner] = jsonEncoderOf[LabelCreateRequestLabelsInner]
}
