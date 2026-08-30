package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import LabelUpdateItem._

case class LabelUpdateItem (
  /* Label ID. */
  id: String,
status: Option[LabelStatus],
/* Label name. 100-character limit. */
  value: Option[String])

object LabelUpdateItem {
  import DateTimeCodecs._

  implicit val LabelUpdateItemCodecJson: CodecJson[LabelUpdateItem] = CodecJson.derive[LabelUpdateItem]
  implicit val LabelUpdateItemDecoder: EntityDecoder[LabelUpdateItem] = jsonOf[LabelUpdateItem]
  implicit val LabelUpdateItemEncoder: EntityEncoder[LabelUpdateItem] = jsonEncoderOf[LabelUpdateItem]
}
