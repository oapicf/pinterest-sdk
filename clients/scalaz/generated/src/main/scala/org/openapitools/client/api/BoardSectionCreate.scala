package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import BoardSectionCreate._

case class BoardSectionCreate (
  id: Option[String],
name: String)

object BoardSectionCreate {
  import DateTimeCodecs._

  implicit val BoardSectionCreateCodecJson: CodecJson[BoardSectionCreate] = CodecJson.derive[BoardSectionCreate]
  implicit val BoardSectionCreateDecoder: EntityDecoder[BoardSectionCreate] = jsonOf[BoardSectionCreate]
  implicit val BoardSectionCreateEncoder: EntityEncoder[BoardSectionCreate] = jsonEncoderOf[BoardSectionCreate]
}
