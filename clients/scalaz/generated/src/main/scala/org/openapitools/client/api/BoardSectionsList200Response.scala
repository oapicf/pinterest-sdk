package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import BoardSectionsList200Response._

case class BoardSectionsList200Response (
  /* Board sections */
  items: List[BoardSection],
bookmark: Option[String])

object BoardSectionsList200Response {
  import DateTimeCodecs._

  implicit val BoardSectionsList200ResponseCodecJson: CodecJson[BoardSectionsList200Response] = CodecJson.derive[BoardSectionsList200Response]
  implicit val BoardSectionsList200ResponseDecoder: EntityDecoder[BoardSectionsList200Response] = jsonOf[BoardSectionsList200Response]
  implicit val BoardSectionsList200ResponseEncoder: EntityEncoder[BoardSectionsList200Response] = jsonEncoderOf[BoardSectionsList200Response]
}
