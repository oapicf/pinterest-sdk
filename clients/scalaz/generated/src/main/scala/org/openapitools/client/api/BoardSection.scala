package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import BoardSection._

case class BoardSection (
  id: Option[String],
name: String)

object BoardSection {
  import DateTimeCodecs._

  implicit val BoardSectionCodecJson: CodecJson[BoardSection] = CodecJson.derive[BoardSection]
  implicit val BoardSectionDecoder: EntityDecoder[BoardSection] = jsonOf[BoardSection]
  implicit val BoardSectionEncoder: EntityEncoder[BoardSection] = jsonEncoderOf[BoardSection]
}
