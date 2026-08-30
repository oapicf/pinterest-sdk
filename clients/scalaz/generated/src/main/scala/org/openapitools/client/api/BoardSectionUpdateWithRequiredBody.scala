package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import BoardSectionUpdateWithRequiredBody._

case class BoardSectionUpdateWithRequiredBody (
  id: Option[String],
name: String)

object BoardSectionUpdateWithRequiredBody {
  import DateTimeCodecs._

  implicit val BoardSectionUpdateWithRequiredBodyCodecJson: CodecJson[BoardSectionUpdateWithRequiredBody] = CodecJson.derive[BoardSectionUpdateWithRequiredBody]
  implicit val BoardSectionUpdateWithRequiredBodyDecoder: EntityDecoder[BoardSectionUpdateWithRequiredBody] = jsonOf[BoardSectionUpdateWithRequiredBody]
  implicit val BoardSectionUpdateWithRequiredBodyEncoder: EntityEncoder[BoardSectionUpdateWithRequiredBody] = jsonEncoderOf[BoardSectionUpdateWithRequiredBody]
}
