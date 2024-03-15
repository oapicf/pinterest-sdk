package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import KeywordsResponse._

case class KeywordsResponse (
  errors: Option[List[KeywordError]],
keywords: Option[List[Keyword]])

object KeywordsResponse {
  import DateTimeCodecs._

  implicit val KeywordsResponseCodecJson: CodecJson[KeywordsResponse] = CodecJson.derive[KeywordsResponse]
  implicit val KeywordsResponseDecoder: EntityDecoder[KeywordsResponse] = jsonOf[KeywordsResponse]
  implicit val KeywordsResponseEncoder: EntityEncoder[KeywordsResponse] = jsonEncoderOf[KeywordsResponse]
}
