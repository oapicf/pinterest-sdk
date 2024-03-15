package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import MediaList200Response._

case class MediaList200Response (
  /* Media */
  items: List[MediaUploadDetails],
bookmark: Option[String])

object MediaList200Response {
  import DateTimeCodecs._

  implicit val MediaList200ResponseCodecJson: CodecJson[MediaList200Response] = CodecJson.derive[MediaList200Response]
  implicit val MediaList200ResponseDecoder: EntityDecoder[MediaList200Response] = jsonOf[MediaList200Response]
  implicit val MediaList200ResponseEncoder: EntityEncoder[MediaList200Response] = jsonEncoderOf[MediaList200Response]
}
