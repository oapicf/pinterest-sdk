package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import LabelCreateItem._

case class LabelCreateItem (
  labelType: LabelType,
/* Label name. 100-character limit. */
  value: String)

object LabelCreateItem {
  import DateTimeCodecs._

  implicit val LabelCreateItemCodecJson: CodecJson[LabelCreateItem] = CodecJson.derive[LabelCreateItem]
  implicit val LabelCreateItemDecoder: EntityDecoder[LabelCreateItem] = jsonOf[LabelCreateItem]
  implicit val LabelCreateItemEncoder: EntityEncoder[LabelCreateItem] = jsonEncoderOf[LabelCreateItem]
}
