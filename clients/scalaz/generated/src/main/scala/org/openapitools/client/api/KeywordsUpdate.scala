package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import KeywordsUpdate._

case class KeywordsUpdate (
  /* Keywords */
  keywords: Option[List[KeywordUpdateItem]])

object KeywordsUpdate {
  import DateTimeCodecs._

  implicit val KeywordsUpdateCodecJson: CodecJson[KeywordsUpdate] = CodecJson.derive[KeywordsUpdate]
  implicit val KeywordsUpdateDecoder: EntityDecoder[KeywordsUpdate] = jsonOf[KeywordsUpdate]
  implicit val KeywordsUpdateEncoder: EntityEncoder[KeywordsUpdate] = jsonEncoderOf[KeywordsUpdate]
}
