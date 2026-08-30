package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import Label._

case class Label (
  /* Label ID. */
  id: String,
labelType: NullableLabelType,
status: Option[NullableLabelStatus],
/* Label name. 100-character limit. */
  value: String)

object Label {
  import DateTimeCodecs._

  implicit val LabelCodecJson: CodecJson[Label] = CodecJson.derive[Label]
  implicit val LabelDecoder: EntityDecoder[Label] = jsonOf[Label]
  implicit val LabelEncoder: EntityEncoder[Label] = jsonEncoderOf[Label]
}
