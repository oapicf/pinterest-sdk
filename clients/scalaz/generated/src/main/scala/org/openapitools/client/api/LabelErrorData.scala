package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import LabelErrorData._

case class LabelErrorData (
  /* Label ID. */
  id: Option[String],
labelType: Option[NullableLabelType],
status: Option[NullableLabelStatus],
/* Label name. 100-character limit. */
  value: Option[String])

object LabelErrorData {
  import DateTimeCodecs._

  implicit val LabelErrorDataCodecJson: CodecJson[LabelErrorData] = CodecJson.derive[LabelErrorData]
  implicit val LabelErrorDataDecoder: EntityDecoder[LabelErrorData] = jsonOf[LabelErrorData]
  implicit val LabelErrorDataEncoder: EntityEncoder[LabelErrorData] = jsonEncoderOf[LabelErrorData]
}
