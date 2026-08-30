package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import KeywordsCreate._

case class KeywordsCreate (
  /* Keywords */
  keywords: List[KeywordCreateItem],
/* Keyword data */
  parentId: String)

object KeywordsCreate {
  import DateTimeCodecs._

  implicit val KeywordsCreateCodecJson: CodecJson[KeywordsCreate] = CodecJson.derive[KeywordsCreate]
  implicit val KeywordsCreateDecoder: EntityDecoder[KeywordsCreate] = jsonOf[KeywordsCreate]
  implicit val KeywordsCreateEncoder: EntityEncoder[KeywordsCreate] = jsonEncoderOf[KeywordsCreate]
}
