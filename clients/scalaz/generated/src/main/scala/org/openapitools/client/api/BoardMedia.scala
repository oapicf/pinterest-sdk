package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import BoardMedia._

case class BoardMedia (
  /* Board cover image. */
  imageCoverUrl: Option[String],
/* Board pin thumbnail urls. */
  pinThumbnailUrls: Option[List[String]])

object BoardMedia {
  import DateTimeCodecs._

  implicit val BoardMediaCodecJson: CodecJson[BoardMedia] = CodecJson.derive[BoardMedia]
  implicit val BoardMediaDecoder: EntityDecoder[BoardMedia] = jsonOf[BoardMedia]
  implicit val BoardMediaEncoder: EntityEncoder[BoardMedia] = jsonEncoderOf[BoardMedia]
}
