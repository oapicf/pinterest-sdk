package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import TrendsEditorial._

case class TrendsEditorial (
  /* URL of the editorial board */
  boardUrl: String,
/* Description of the editorial article */
  description: String,
/* List of interests related to the editorial article */
  interests: List[String],
/* URL of the pins related to the editorial article */
  pinsUrl: List[String],
/* List of keywords related to the editorial article */
  relatedKeywords: List[KeywordInfo],
/* Title of the editorial article */
  title: String)

object TrendsEditorial {
  import DateTimeCodecs._

  implicit val TrendsEditorialCodecJson: CodecJson[TrendsEditorial] = CodecJson.derive[TrendsEditorial]
  implicit val TrendsEditorialDecoder: EntityDecoder[TrendsEditorial] = jsonOf[TrendsEditorial]
  implicit val TrendsEditorialEncoder: EntityEncoder[TrendsEditorial] = jsonEncoderOf[TrendsEditorial]
}
